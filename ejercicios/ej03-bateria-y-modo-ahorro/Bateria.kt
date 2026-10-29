// Ej03 · Batería y modo ahorro

class Bateria {
    // PASO 1: crea dos propiedades que puedan cambiar (var):
    //   nivel = 100        (porcentaje de batería)
    //   modoAhorro = false
    // Hazlas "private set" si quieres que solo la clase pueda cambiarlas:
    //   var nivel = 100
    //       private set


    // PASO 2: escribe el método consumir(tarea: String, porcentaje: Int):
    //   a) Si el nivel ya es 0, no hagas nada (return).
    //   b) Si está en modo ahorro, el gasto real es la MITAD (porcentaje / 2).
    //   c) Resta el gasto al nivel sin bajar de 0:  nivel = (nivel - gasto).coerceAtLeast(0)
    //   d) Muestra:  Vídeo 4K: -30% -> 70%
    //   e) Si el nivel es 20 o menos y no estaba en modo ahorro, actívalo y muestra:
    //        ⚠ Modo ahorro activado
    //   f) Si el nivel llega a 0, muestra:
    //        🔌 Batería agotada: la app debe haber guardado su estado

}

fun main() {
    val bateria = Bateria()
    val tareas = listOf(
        "Vídeo 4K" to 30,
        "GPS navegando" to 25,
        "Redes sociales" to 20,
        "Juego 3D" to 20,
        "Música" to 10,
    )
    // PASO 3: recorre las tareas y consume cada una:
    //   for ((tarea, gasto) in tareas) bateria.consumir(tarea, gasto)

}
