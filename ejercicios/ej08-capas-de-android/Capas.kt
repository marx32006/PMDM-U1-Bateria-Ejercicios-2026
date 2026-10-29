// Ej08 · Viaje por las capas de Android

val capasAndroid = listOf(
    "Apps del sistema / tu app",
    "Framework de API Java",
    "Bibliotecas C/C++ nativas y Android Runtime (ART)",
    "Capa de abstracción de hardware (HAL)",
    "Kernel de Linux",
)

// PASO 1: escribe viaje(peticion: String, hardware: String, resultado: String):
//   a) Muestra  "Petición: $peticion"
//   b) BAJADA: recorre las capas con su índice  (for ((i, capa) in capasAndroid.withIndex()))
//      y muestra cada una con 2 espacios por nivel:  "  ".repeat(i) + "↓ " + capa
//   c) Muestra el hardware con 2 espacios por capa:  "  ".repeat(capasAndroid.size) + "⚙ Hardware: $hardware"
//   d) SUBIDA: recorre las capas AL REVÉS. Pista: (capasAndroid.size - 1 downTo 0)
//      y muestra  "  ".repeat(i) + "↑ " + capasAndroid[i]
//   e) Muestra  "Resultado: $resultado (5 capas)"  usando capasAndroid.size


fun main() {
    // PASO 2: llama a viaje con "hacer una foto", "cámara" y "foto entregada a la app".
    // PASO 3 (opcional): prueba con "saber dónde estoy", "GPS" y "ubicación entregada a la app".

}
