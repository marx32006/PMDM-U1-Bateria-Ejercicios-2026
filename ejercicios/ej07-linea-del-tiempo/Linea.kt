// Ej07 · La línea del tiempo

data class Hito(val año: Int, val texto: String)

fun main() {
    // Están DESORDENADOS a propósito
    val hitos = listOf(
        Hito(2017, "Presentación del 5G en el Mobile World Congress"),
        Hito(2007, "Android, de la Open Handset Alliance (Google)"),
        Hito(1977, "Primera red celular 1G en Chicago"),
        Hito(2016, "Kotlin 1.0, de JetBrains"),
        Hito(2010, "Se empieza a desplegar el 4G"),
        Hito(2019, "HarmonyOS, de Huawei"),
        Hito(2001, "3G en Japón"),
        Hito(2014, "Android Studio sustituye a Eclipse"),
        Hito(2007, "iPhone OS (hoy iOS), de Apple"),
        Hito(2018, "Flutter 1.0, de Google"),
        Hito(2016, "4G+ (LTE Advanced)"),
        Hito(2010, "Windows Phone, de Microsoft"),
    )

    // PASO 1: muestra "LÍNEA DEL TIEMPO" y los hitos ordenados por año (sortedBy { it.año }),
    //         con el formato  "2001  3G en Japón"
    //   ⚠ Si dos hitos tienen el mismo año, sortedBy mantiene el orden en que estaban.
    //     Para que salga como en el README ordena por año y después por texto:
    //     sortedWith(compareBy({ it.año }, { it.texto }))


    // PASO 2: muestra "POR DÉCADAS" y cuántos hitos hay en cada década.
    //   La década de un año es  año / 10 * 10  (división entera: 2016 / 10 * 10 = 2010).
    //   Usa groupBy { it.año / 10 * 10 } sobre la lista ORDENADA y muestra  "2010s: 8 hitos"


    // PASO 3: cuenta los hitos cuyo texto contiene "Google":  count { "Google" in it.texto }

}
