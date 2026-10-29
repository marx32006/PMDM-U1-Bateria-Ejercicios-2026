// Ej10 · ¿Nativo o multiplataforma?

data class Proyecto(
    val nombre: String,
    val plataformas: Set<String>,
    val presupuestoBajo: Boolean,
    val maximoRendimiento: Boolean,
    val equipoSabeWeb: Boolean,
)

// PASO 1: escribe recomendar(p: Proyecto): String aplicando las 5 reglas del README EN ORDEN
//         con un when sin argumento. Para "solo Android":  p.plataformas == setOf("Android")


fun main() {
    val proyectos = listOf(
        Proyecto("App del comedor del instituto", setOf("Android", "iOS"), true, false, false),
        Proyecto("Juego de carreras 3D", setOf("Android", "iOS"), false, true, false),
        Proyecto("App interna de la empresa", setOf("Android"), true, false, false),
        Proyecto("Tienda que ya tiene web en Angular", setOf("Android", "iOS", "Web"), false, false, true),
        Proyecto("Banco con mucho presupuesto", setOf("Android", "iOS"), false, false, false),
    )
    // PASO 2: muestra cada proyecto con su recomendación:  "Juego de carreras 3D -> Nativo (Kotlin / Swift)"

}
