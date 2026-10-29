// Ej21 · ¿Qué componente uso?

enum class Componente(val descripcion: String) {
    ACTIVITY("pantalla raíz con la que interactúa el usuario"),
    FRAGMENT_O_COMPOSABLE("parte reutilizable de una pantalla"),
    VIEWMODEL("guarda el estado y la lógica de presentación; sobrevive al girar el móvil"),
    REPOSITORY("decide de dónde vienen los datos: red o base de datos"),
    SERVICE("trabajo en segundo plano, aunque no se vea ninguna pantalla"),
    BROADCAST_RECEIVER("reacciona a avisos del sistema o de otras apps"),
    CONTENT_PROVIDER("comparte datos de la app con otras apps"),
}

// PASO 2: cambia cada Componente.ACTIVITY por el componente correcto (cada uno se usa una vez)
val respuestas = mapOf(
    "La pantalla de inicio de sesión de la app" to Componente.ACTIVITY,
    "Seguir reproduciendo música con la pantalla apagada" to Componente.ACTIVITY,
    "Enterarse de que la batería está baja" to Componente.ACTIVITY,
    "Dejar que otras apps lean tus contactos" to Componente.ACTIVITY,
    "Que la lista no se pierda al girar el móvil" to Componente.ACTIVITY,
    "Elegir entre descargar los datos o leerlos de la base de datos" to Componente.ACTIVITY,
    "Una tarjeta de producto que se repite en varias pantallas" to Componente.ACTIVITY,
)

fun main() {
    // PASO 3: muestra cada caso con su componente y la descripción:
    //   "La pantalla de inicio... -> ACTIVITY (pantalla raíz con la que interactúa el usuario)"
    //   Pista: for ((caso, componente) in respuestas)


    // PASO 4: muestra cuántos componentes DISTINTOS has usado:
    //   "Componentes distintos usados: ${respuestas.values.toSet().size} de ${Componente.entries.size}"

}
