package com.pmdm.tema1

import com.pmdm.tema1.legacy.calc
import org.junit.Assert.assertEquals
import org.junit.Test

// EJ27 · Pruebas unitarias de la calculadora heredada.
// Se ejecutan en tu ordenador (no necesitan emulador): clic derecho en la clase → Run.
class CalculadoraTarifaTest {

    // Ejemplo hecho: básica con 3 GB = 10 € + 3 × 2 € = 16 €
    @Test
    fun basica_3GB_cuesta_16() {
        assertEquals(16.0, calc(3.0, 1, false, false), 0.001)
    }

    // EJ27 · PASO 2: escribe una prueba por cada fila de la tabla del README del ejercicio 27.
}
