package com.pmdm.tema1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import com.pmdm.tema1.ui.AppTema1

// La Activity es la pantalla raíz: Android la crea, la pausa y la destruye (apartado 6 del tema)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // EJ23 · PASO 1: escribe en el log que se ha llamado a onCreate:
        //     Log.d(TAG, "onCreate")        (import android.util.Log)

        // EJ30 · PASO 2: anota cada arranque en el fichero interno de la app:
        //     Registro.anotar(this, "onCreate")

        setContent {
            MaterialTheme {
                AppTema1()
            }
        }
    }

    // EJ23 · PASO 2: sobrescribe onStart, onResume, onPause, onStop, onRestart y onDestroy.
    //   En cada uno llama primero a super y después escribe en el log. Ejemplo:
    //     override fun onStart() {
    //         super.onStart()
    //         Log.d(TAG, "onStart")
    //     }

    // EJ23 · PASO 3: la etiqueta para filtrar en Logcat:
    //     companion object { const val TAG = "CICLO" }
}
