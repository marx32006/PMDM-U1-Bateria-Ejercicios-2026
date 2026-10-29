// Ej06 · ¿Qué red es?

// PASO 1: escribe generacionDe(protocolo: String): String con  when (protocolo.uppercase()) { ... }
//   Cada rama puede tener VARIOS valores separados por comas:
//       "AMPS", "NMT" -> "1G"
//   Completa con la tabla del README y termina con  else -> "Desconocido"


// PASO 2: escribe generacionPorVelocidad(mbps: Double): String con when SIN argumento:
//   menos de 1 -> "2G", menos de 10 -> "3G", menos de 100 -> "4G",
//   menos de 1000 -> "4G+", si no -> "5G"


fun main() {
    val protocolos = listOf("GSM", "edge", "LTE-A", "HSDPA", "nmt", "Bluetooth")
    val velocidades = listOf(0.05, 7.2, 45.0, 280.0, 1500.0)

    // PASO 3: muestra cada protocolo con su generación:   GSM -> 2G
    // PASO 4: muestra cada velocidad con su generación:   7.2 Mbps -> 3G

}
