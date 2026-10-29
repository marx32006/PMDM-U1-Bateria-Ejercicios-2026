// Ej04 · ¿Móvil, plegable o tablet?

data class Pantalla(val nombre: String, val anchoPx: Int, val dpi: Int)

// PASO 1: escribe pxADp(px: Int, dpi: Int): Int que aplique  px * 160 / dpi
//         (con enteros, la división ya redondea hacia abajo).


// PASO 2: escribe claseDeVentana(anchoDp: Int): String con un when sin argumento:
//         menos de 600 -> "Compacta", menos de 840 -> "Mediana", si no -> "Expandida"


// PASO 3: escribe columnas(clase: String): Int que devuelva 1, 2 o 3 según la clase.
//         Usa when(clase) { "Compacta" -> 1 ... }


fun main() {
    val pantallas = listOf(
        Pantalla("Pixel 9 vertical", 1080, 420),
        Pantalla("Pixel 9 horizontal", 2424, 420),
        Pantalla("Galaxy Z Fold 6 abierto", 1856, 374),
        Pantalla("Tablet 11\" horizontal", 2560, 320),
        Pantalla("Reloj Wear OS", 450, 320),
    )
    // PASO 4: para cada pantalla, calcula los dp, la clase y las columnas, y muestra:
    //   Pixel 9 vertical          1080 px a 420 dpi = 411 dp -> Compacta (1 columnas)
    // Pista: p.nombre.padEnd(26)

}
