// Ej26 · Versionado semántico en Kotlin

enum class Cambio { CORRECCION, FUNCIONALIDAD, INCOMPATIBLE }

// PASO 1: crea  data class Version(val mayor: Int, val menor: Int, val parche: Int) : Comparable<Version>
//   Dentro:
//   a) override fun toString() = "$mayor.$menor.$parche"
//   b) val versionCode: Int  get() = mayor * 10000 + menor * 100 + parche
//   c) override fun compareTo(other: Version): Int =
//          compareValuesBy(this, other, { it.mayor }, { it.menor }, { it.parche })
//   d) fun siguiente(cambio: Cambio): Version = when (cambio) { ... }   (mira la tabla del README;
//      usa copy:  Cambio.CORRECCION -> copy(parche = parche + 1) )
//   e) un companion object con  fun desde(texto: String): Version  que convierta "1.4.2":
//          val (a, b, c) = texto.split(".").map { it.toInt() }
//          return Version(a, b, c)


fun main() {
    val cambios = listOf(
        "Arregla el cierre al girar" to Cambio.CORRECCION,
        "Modo oscuro" to Cambio.FUNCIONALIDAD,
        "Corrige un texto" to Cambio.CORRECCION,
        "Nueva base de datos incompatible" to Cambio.INCOMPATIBLE,
        "Widget en la pantalla de inicio" to Cambio.FUNCIONALIDAD,
    )
    val publicadas = listOf("1.10.0", "1.2.0", "1.9.3", "2.0.0", "1.2.10")

    // PASO 2: empieza con  var version = Version.desde("1.0.0")  y muéstrala con su versionCode.
    //         Para cada cambio, sube la versión y muestra:
    //         "Modo oscuro [FUNCIONALIDAD] -> 1.1.0 (versionCode 10100)"


    // PASO 3: muestra las versiones publicadas ordenadas como texto (publicadas.sorted())
    //         y ordenadas como versiones (publicadas.map { Version.desde(it) }.sorted()).

}
