# Ej01 · Respuestas

1. ¿Qué tres características comunes tienen todos los dispositivos del catálogo?

   >Todos los dispositivos son electrónicos y portátiles, tienen una pantalla para mostrar información y utilizan una batería para funcionar sin estar conectados continuamente a la corriente eléctrica.

2. ¿Por qué el Kindle tiene tanta batería para su tamaño de pantalla? *(Pista: tinta electrónica.)*

   >Porque utiliza una pantalla de tinta electrónica (e-ink), que consume muy poca energía. Principalmente necesita energía cuando cambia el contenido de la pantalla. Por eso puede durar mucho más tiempo que otros dispositivos con pantallas tradicionales.

3. ¿Qué ventaja te da usar `data class` en lugar de una `class` normal? Prueba a hacer `println(catalogo[0])` con las dos.

   >La principal ventaja es que data class genera automáticamente funciones útiles para trabajar con datos, como toString(), equals() y copy().

Por ejemplo, al ejecutar println(catalogo[0]) con una data class, Kotlin muestra las propiedades del dispositivo y sus valores.

Con una class normal, sin modificar toString(), generalmente aparece el nombre de la clase acompañado de un identificador, en lugar de mostrar sus propiedades.

4. Las PDA están «en declive». ¿Qué dispositivo hace hoy su función?

   >Actualmente, los smartphones han sustituido a las PDA porque permiten realizar sus principales funciones, como gestionar contactos, calendarios, notas y correos electrónicos. Además, incluyen conexión a Internet, GPS y muchas aplicaciones.
