package com.pmdm.tema1.ui

import androidx.lifecycle.ViewModel

// EJ20 · PASO 1: este ViewModel debe guardar el ESTADO de la pantalla de dispositivos.
//   class DispositivosViewModel(
//       private val repositorio: DispositivosRepository = DispositivosRepository()
//   ) : ViewModel() {
//       var filtro by mutableStateOf<String?>(null)      // null = todos
//           private set
//       val tipos: List<String> = repositorio.obtenerTodos().map { it.tipo }.distinct()
//       val dispositivos: List<Dispositivo>
//           get() = repositorio.obtenerTodos().filter { filtro == null || it.tipo == filtro }
//       fun cambiarFiltro(nuevo: String?) { filtro = nuevo }
//   }
//   Imports: androidx.compose.runtime.getValue / setValue / mutableStateOf
//            com.pmdm.tema1.data.Dispositivo y com.pmdm.tema1.data.DispositivosRepository
class DispositivosViewModel : ViewModel()
