// Ej22 · Máquina de estados de una app

enum class Estado { ACTIVO, PAUSADO, DESTRUIDO }

enum class Evento(val texto: String) {
    ABRIR("El usuario abre la app"),
    OTRA_APP_DELANTE("Entra una llamada"),
    VOLVER("Vuelve a la app"),
    BLOQUEAR("Bloquea la pantalla"),
    CERRAR("La cierra desde Recientes"),
    SIN_MEMORIA("El sistema necesita memoria"),
}

class App {
    // null significa "la app todavía no existe"
    var estado: Estado? = null
        private set

    fun recibir(evento: Evento) {
        // PASO 1: decide el nuevo estado y los métodos con  when (estado to evento) { ... }
        //   Cada rama es una pareja (estado actual, evento) y devuelve otra pareja (nuevo estado, texto):
        //       null to Evento.ABRIR -> Estado.ACTIVO to "onCreate() → onStart() → onResume()"
        //   Si en una rama valen dos eventos, sepáralos con coma:
        //       Estado.ACTIVO to Evento.OTRA_APP_DELANTE, Estado.ACTIVO to Evento.BLOQUEAR -> ...
        //   Usa la tabla del README. Para lo que no tenga sentido:  else -> null to ""
        //
        //   val (nuevo, metodos) = when (estado to evento) { ... }


        // PASO 2: si nuevo es null, muestra  "Vuelve a la app: ⛔ no tiene sentido en estado ACTIVO"
        //         y termina (return). Si no, muestra
        //         "Entra una llamada: ACTIVO -> PAUSADO · onPause() → onStop() · guarda el estado"
        //         (si el estado anterior es null escribe "no existe") y actualiza estado = nuevo.

    }
}

fun main() {
    val app = App()
    val eventos = listOf(
        Evento.ABRIR, Evento.OTRA_APP_DELANTE, Evento.VOLVER, Evento.BLOQUEAR,
        Evento.SIN_MEMORIA, Evento.ABRIR, Evento.VOLVER, Evento.CERRAR,
    )
    for (e in eventos) app.recibir(e)
}
