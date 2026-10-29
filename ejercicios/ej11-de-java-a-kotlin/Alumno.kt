// Ej11 · Alumno.kt · La misma clase en Kotlin

// PASO 1: escribe la data class Alumno con nombre (String), nota (Double) y email.
//   ⚠ El email puede faltar: su tipo debe ser  String?  (con interrogación = "puede ser null")
//     y dale el valor por defecto null:   val email: String? = null
//   La data class ya trae equals, hashCode, toString y copy: ¡no hay que escribirlos!
//   Dentro, añade el método:   fun aprobado() = nota >= 5


fun main() {
    // PASO 2: quita las // cuando tengas la clase
    // val ana = Alumno("Ana", 8.5, "ana@iesrafaelalberti.es")
    // val luis = Alumno("Luis", 4.0)              // sin email: usa el valor por defecto
    // val marta = Alumno("Marta", 6.0, "marta@iesrafaelalberti.es")

    // PASO 3: para cada alumno muestra:  "Ana: 8.5 (aprobado) · ana@iesrafaelalberti.es"
    //   Para el email usa el operador Elvis ?: que da un valor si es null:
    //       alumno.email ?: "(sin email)"


    // PASO 4: crea la versión de Luis con un 5.5 usando copy (no cambia el original):
    //         val luisRecuperado = luis.copy(nota = 5.5)   y muéstralo con println.


    // PASO 5: compara ana con ana.copy() usando ==  (compara el CONTENIDO).


    // PASO 6: muestra cuántas letras tiene el email de Luis SIN que pueda fallar:
    //         luis.email?.length ?: 0
    //   Prueba a escribir  luis.email.length  y mira qué dice el compilador. Después bórralo.

}
