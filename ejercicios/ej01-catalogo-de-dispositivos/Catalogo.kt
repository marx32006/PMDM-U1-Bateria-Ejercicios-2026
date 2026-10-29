// Ej01 · Catálogo de dispositivos

// PASO 1: crea una data class DispositivoMovil con estas propiedades (val):
//   nombre: String, tipo: String, pulgadas: Double, tieneGps: Boolean, bateriaMah: Int
// Pista:  data class DispositivoMovil(val nombre: String, ...)

data class DispositivoMovil(
    val nombre: String,
    val tipo: String,
    val pulgadas: Double,
    val tieneGps: Boolean,
    val bateriaMah: Int
)



fun main() {
    // PASO 2: cuando tengas la clase, quita las // de esta lista:
     val catalogo = listOf(
         DispositivoMovil("Pixel 9", "Smartphone", 6.3, true, 4700),
         DispositivoMovil("iPad Air", "Tablet", 11.0, false, 7600),
         DispositivoMovil("Galaxy Watch 7", "Wearable", 1.5, true, 425),
         DispositivoMovil("Kindle Paperwhite", "eBook", 7.0, false, 1700),
         DispositivoMovil("Galaxy Z Fold 6", "Plegable", 7.6, true, 4400),
         DispositivoMovil("Palm Tungsten T5", "PDA", 3.5, false, 900),
    )

    // PASO 3: muestra el título  CATÁLOGO (6 dispositivos)  usando catalogo.size

    println("CATÁLOGO (${catalogo.size} dispositivos)")

    // PASO 4: recorre el catálogo con un for y muestra una línea por dispositivo:
    //   Pixel 9             Smartphone  6.3"  GPS: sí  4700 mAh
    // Pistas: d.nombre.padEnd(20) rellena con espacios hasta 20 caracteres;
    //         para las comillas de las pulgadas escribe \"  ;
    //         if (d.tieneGps) "sí" else "no"  es una expresión que devuelve un texto.

    for (d in catalogo) {
        val gps = if (d.tieneGps) "sí" else "no"

        println(
            "${d.nombre.padEnd(20)} " +
                    "${d.tipo.padEnd(11)} " +
                    "${d.pulgadas}\"  " +
                    "GPS: $gps  " +
                    "${d.bateriaMah} mAh"
        )
    }

    // PASO 5: con filter y map, obtén los NOMBRES de los que tienen GPS y muéstralos
    //         separados por comas con joinToString().

    val conGps = catalogo
        .filter { it.tieneGps }
        .map { it.nombre }

    println("Con GPS: ${conGps.joinToString(", ")}")

    // PASO 6: con maxBy { it.bateriaMah } busca el de más batería y muéstralo.

    val masBateria = catalogo.maxBy { it.bateriaMah }

    println("Más batería: ${masBateria.nombre} (${masBateria.bateriaMah} mAh)")

    // PASO 7: con groupBy { it.tipo } agrupa por tipo y cuenta cuántos hay de cada uno:
    //         catalogo.groupBy { it.tipo }.mapValues { it.value.size }

    val porTipo = catalogo.groupBy { it.tipo }
    val cantidadPorTipo = porTipo.mapValues { it.value.size }
    println("Por tipo: $cantidadPorTipo")


}
