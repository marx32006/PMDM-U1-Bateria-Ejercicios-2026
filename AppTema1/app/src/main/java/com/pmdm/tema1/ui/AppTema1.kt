package com.pmdm.tema1.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

// Pantalla principal: una fila de pestañas y, debajo, la pantalla de la pestaña elegida
@Composable
fun AppTema1() {
    val pestanas = buildList {
        add("Panel")
        add("Estados")
        add("Dispositivos")
        // EJ28 · PASO 3: añade la pestaña "Novedades" SOLO si FeatureFlags.PANTALLA_NOVEDADES es true
    }
    var seleccionada by rememberSaveable { mutableIntStateOf(0) }

    Column(Modifier.fillMaxSize().safeDrawingPadding()) {
        TabRow(selectedTabIndex = seleccionada) {
            pestanas.forEachIndexed { i, titulo ->
                Tab(selected = i == seleccionada, onClick = { seleccionada = i }, text = { Text(titulo) })
            }
        }
        when (pestanas[seleccionada]) {
            "Panel" -> PanelDispositivo()
            "Estados" -> EstadosScreen()
            "Dispositivos" -> DispositivosScreen()
            // EJ28 · PASO 4: "Novedades" -> NovedadesScreen()
        }
    }
}
