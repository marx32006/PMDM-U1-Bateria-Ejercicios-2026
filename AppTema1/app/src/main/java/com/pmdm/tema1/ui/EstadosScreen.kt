package com.pmdm.tema1.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel

// EJ24 · PASO 2: completa este ViewModel con un contador:
//     var cuenta by mutableIntStateOf(0)
//         private set
//     fun sumar() { cuenta++ }
class ContadorViewModel : ViewModel()

// Pestaña "Estados": tres contadores que guardan su valor de tres formas distintas
@Composable
fun EstadosScreen() {
    var conRemember by remember { mutableIntStateOf(0) }
    // EJ24 · PASO 1: cambia remember por rememberSaveable en este segundo contador
    //   (import androidx.compose.runtime.saveable.rememberSaveable)
    var conSaveable by remember { mutableIntStateOf(0) }
    // EJ24 · PASO 3: borra este tercer contador y usa el del ViewModel:
    //   recibe el ViewModel como parámetro  fun EstadosScreen(vm: ContadorViewModel = viewModel())
    //   (import androidx.lifecycle.viewmodel.compose.viewModel) y usa vm.cuenta y vm.sumar()
    var conViewModel by remember { mutableIntStateOf(0) }

    Column(Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text("Pulsa los tres botones varias veces y después gira el móvil.", style = MaterialTheme.typography.titleMedium)
        FilaContador("remember", conRemember) { conRemember++ }
        FilaContador("rememberSaveable", conSaveable) { conSaveable++ }
        FilaContador("ViewModel", conViewModel) { conViewModel++ }
    }
}

@Composable
private fun FilaContador(titulo: String, valor: Int, alPulsar: () -> Unit) {
    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Text("$titulo: $valor", Modifier.weight(1f), style = MaterialTheme.typography.titleLarge)
        Button(onClick = alPulsar) { Text("+1") }
    }
}
