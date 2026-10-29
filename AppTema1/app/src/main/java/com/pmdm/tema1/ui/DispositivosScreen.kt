package com.pmdm.tema1.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Pestaña "Dispositivos": la UI solo PINTA lo que le da el ViewModel
@Composable
fun DispositivosScreen() {
    // EJ20 · PASO 2: recibe el ViewModel:  fun DispositivosScreen(vm: DispositivosViewModel = viewModel())
    // EJ20 · PASO 3: dibuja
    //   - una fila (Row con horizontalScroll) de FilterChip: "Todos" y uno por cada tipo de vm.tipos;
    //     al pulsar, llama a vm.cambiarFiltro(...)
    //   - debajo, una LazyColumn con items(vm.dispositivos) y un ListItem por dispositivo:
    //     headlineContent = el nombre, supportingContent = "Tipo · 6.3\""
    Text("Ejercicio 20: aquí irá la lista de dispositivos", Modifier.fillMaxSize().padding(16.dp))
}
