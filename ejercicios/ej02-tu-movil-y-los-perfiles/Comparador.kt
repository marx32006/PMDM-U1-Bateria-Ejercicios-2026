// Ej02 · Tu móvil frente a los perfiles

data class Perfil(val nombre: String, val ramGb: Int, val pulgadas: Double, val api: Int)

// Perfiles de referencia para probar apps (diapositiva "Perfiles útiles" del apartado 4)
val perfiles = listOf(
    Perfil("Gama baja", 2, 5.0, 33),
    Perfil("Gama media", 4, 6.3, 35),
    Perfil("Gama alta", 12, 6.7, 35),
)

// PASO 1: escribe la función gama(p: Perfil): String que devuelva:
//   "gama baja" si tiene menos de 3 GB de RAM, "gama media" si tiene menos de 6 GB
//   y "gama alta" en otro caso. Usa when sin argumento:  when { p.ramGb < 3 -> ... }


// PASO 2: escribe la función diferencia(mio: Perfil, otro: Perfil): String que devuelva:
//   "+6 GB de RAM, +1.5\" de pantalla, API 1 más moderna"
// - RAM:      val dRam = mio.ramGb - otro.ramGb  y muestra el signo + si es positiva
//             (pista: if (dRam >= 0) "+$dRam" else "$dRam")
// - Pantalla: redondea a 1 decimal con  Math.round((mio.pulgadas - otro.pulgadas) * 10) / 10.0
// - API:      "API N más moderna", "API N más antigua" o "misma API"


fun main() {
    // PASO 3: cambia estos valores por los de TU móvil (mira mi_movil.md)
    val miMovil = Perfil("Mi móvil", 8, 6.5, 34)

    // PASO 4: muestra  Mi móvil: 8 GB RAM · 6.5" · API 34 -> gama alta
    //         y después, para cada perfil, una línea "  frente a <nombre>: <diferencia>"

}
