package com.pmdm.tema1.legacy

// Código HEREDADO de la versión 0.9 de la app. «Funciona», pero nadie se atreve a tocarlo.
// EJ27: NO lo cambies hasta tener pruebas que te avisen si lo rompes.
//
// Calcula la factura mensual de una tarifa móvil:
//   g = GB gastados · t = tipo de tarifa (1 = básica, 2 = ilimitada)
//   r = itinerancia fuera de la UE · e = descuento de estudiante
fun calc(g: Double, t: Int, r: Boolean, e: Boolean): Double {
    var x = 0.0
    if (t == 1) {
        x = 10 + g * 2
    }
    if (t == 2) {
        x = 30.0
    }
    if (r == true) x = x + 5
    if (e == true) x = x - x * 0.2
    if (t == 1 && g > 10) x = x - (g - 10)
    return Math.round(x * 100) / 100.0
}
