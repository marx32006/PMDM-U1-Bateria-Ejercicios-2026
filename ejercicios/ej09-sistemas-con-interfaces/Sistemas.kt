// Ej09 · Android, iOS y HarmonyOS con interfaces

// La interfaz es el "contrato": todo sistema operativo móvil debe tener estas propiedades.
interface SistemaOperativoMovil {
    val nombre: String
    val empresa: String
    val año: Int
    val capas: List<String>            // de arriba abajo
    val lenguajesNativos: List<String>

    // Las interfaces pueden traer métodos ya hechos:
    fun describir(): String =
        "$nombre ($empresa, $año): ${capas.size} capas · lenguajes nativos: ${lenguajesNativos.joinToString()}"
}

// PASO 1: ya está hecha la de Android. Léela:
class Android : SistemaOperativoMovil {
    override val nombre = "Android"
    override val empresa = "Open Handset Alliance / Google"
    override val año = 2007
    override val capas = listOf(
        "Apps del sistema", "Framework de API Java", "Bibliotecas C/C++ nativas",
        "Android Runtime", "HAL", "Kernel de Linux",
    )
    override val lenguajesNativos = listOf("Kotlin", "Java")
}

// PASO 2: crea la clase IOS (Apple, 2007) con sus 4 capas y los lenguajes Swift y Objective-C.


// PASO 3: crea la clase HarmonyOS (Huawei, 2019) con 3 capas
//         ("Aplicaciones", "Framework de aplicaciones", "Kernel") y el lenguaje ArkTS.


fun main() {
    // PASO 4: crea una lista de SistemaOperativoMovil con los tres:  listOf(Android(), IOS(), HarmonyOS())
    //         y, para cada uno, muestra describir() y en otra línea:
    //         "  de arriba abajo: " + capas unidas con " > "   (joinToString(" > "))


    // PASO 5: muestra cuál tiene más capas (maxBy) y cuáles usan Kotlin
    //         (filter { "Kotlin" in it.lenguajesNativos }).

}
