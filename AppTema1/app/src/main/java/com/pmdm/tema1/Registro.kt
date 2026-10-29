package com.pmdm.tema1

import android.content.Context

// Guarda una línea por evento en un fichero PRIVADO de la app (carpeta files/ de su sandbox)
object Registro {
    const val FICHERO = "registro.txt"

    fun anotar(context: Context, evento: String) {
        // EJ30 · PASO 2: añade al final del fichero una línea con la hora y el evento:
        //     val hora = SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Date())
        //     File(context.filesDir, FICHERO).appendText("$hora $evento\n")
        //   Imports: java.io.File, java.text.SimpleDateFormat, java.util.Date, java.util.Locale
    }
}
