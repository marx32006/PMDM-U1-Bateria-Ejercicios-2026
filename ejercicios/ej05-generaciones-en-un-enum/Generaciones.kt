// Ej05 · Las generaciones en un enum
import kotlin.math.roundToInt

// PASO 1: completa el enum. Cada constante lleva: etiqueta, año (Int? porque la 6G no tiene),
//         velocidad en Mbps y la novedad. Ya están las dos primeras: añade el resto con la
//         tabla del README (la 6G lleva null como año).
enum class Generacion(val etiqueta: String, val año: Int?, val mbps: Double, val novedad: String) {
    CERO("0G", 1940, 0.0, "Radio convencional (walkie-talkie)"),
    PRIMERA("1G", 1977, 0.0, "Analógica, solo voz"),
    // SEGUNDA("2G", 1991, 0.0096, "Digital: SMS y tarjeta SIM"),
    // ...
}

// PASO 2: escribe tiempoDescarga(mbps: Double): String:
//   - si mbps es 0.0 devuelve "solo voz"
//   - calcula los segundos: val s = 16000 / mbps
//   - when sin argumento:
//       s < 1      -> "menos de 1 s"
//       s < 60     -> "${s.roundToInt()} s"
//       s < 3600   -> minutos  (s / 60)
//       s < 86400  -> horas    (s / 3600)
//       si no      -> días     (s / 86400)


fun main() {
    // PASO 3: recorre Generacion.entries y muestra una línea por generación:
    //   2G   1991    Digital: SMS y tarjeta SIM          -> 19 días
    // Pistas: g.etiqueta.padEnd(5); para el año usa  (g.año?.toString() ?: "futuro").padEnd(8)
    //         y g.novedad.padEnd(36)


    // PASO 4: muestra la más rápida (maxBy { it.mbps }) y cuántas tienen datos (count { it.mbps > 0 }).

}
