package com.pmdm.tema1.ui

import android.os.Build
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.pmdm.tema1.util.claseDeVentana
import com.pmdm.tema1.util.leerBateria

// Pestaña "Panel": lo que la app sabe del dispositivo en el que se ejecuta
@Composable
fun PanelDispositivo() {
    val context = LocalContext.current
    val configuracion = LocalConfiguration.current
    val anchoDp = configuracion.screenWidthDp
    val bateria = remember { leerBateria(context) }
    val versionApp = context.packageManager.getPackageInfo(context.packageName, 0).versionName

    Column(
        Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        // EJ12 · PASO 4: cambia el saludo por "¡Hola, <tu nombre>! Esta es mi primera app"
        Text("Hola, Android", style = MaterialTheme.typography.headlineSmall)

        Fila("Modelo", "${Build.MANUFACTURER} ${Build.MODEL}")
        Fila("Android", "${Build.VERSION.RELEASE} (API ${Build.VERSION.SDK_INT})")
        Fila("Versión de la app", versionApp ?: "?")
        Fila("Pantalla", "$anchoDp x ${configuracion.screenHeightDp} dp")
        Fila("Clase de ventana", claseDeVentana(anchoDp))
        // EJ15 · PASO 2: añade una fila "Orientación" que diga "Horizontal" o "Vertical":
        //     configuracion.orientation == Configuration.ORIENTATION_LANDSCAPE
        //   (import android.content.res.Configuration)

        Fila("Batería", if (bateria >= 0) "$bateria %" else "sin leer")
        // EJ30 · PASO 3: añade una fila "Permiso de ubicación" con "concedido" o "denegado":
        //     ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) ==
        //         PackageManager.PERMISSION_GRANTED
        //   (imports: android.Manifest, android.content.pm.PackageManager, androidx.core.content.ContextCompat)
    }
}

@Composable
private fun Fila(etiqueta: String, valor: String) {
    Row(Modifier.fillMaxWidth()) {
        Text(etiqueta, Modifier.weight(1f), fontWeight = FontWeight.Bold)
        Text(valor)
    }
}
