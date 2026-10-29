# Ej12 · Primera ejecución de AppTema1 🤖

**Apartado 3 · Android Studio** · ⏱️ 45 min (la primera vez Gradle descarga muchas cosas)

> 🎯 Abrir un proyecto Android en **Android Studio**, esperar al *Gradle sync*, crear un **emulador** y ejecutar la app. Es la base de todos los ejercicios 🤖.

## Pasos

**PASO 1. Abre el proyecto.** En Android Studio: **File → Open** y elige la carpeta **`AppTema1`** de tu copia del repositorio (no la carpeta raíz). Si pregunta *Trust project*, pulsa **Trust Project**.

**PASO 2. Espera al Gradle sync.** Abajo a la derecha verás una barra de progreso. La primera vez tarda (descarga Gradle, el plugin de Android y las librerías). Cuando acabe, en la pestaña **Build** debe poner *BUILD SUCCESSFUL* o *Sync finished*.

**PASO 3. Crea un emulador** (si no tienes ninguno): **Tools → Device Manager → ➕ → Create Virtual Device** → elige **Pixel 9** (o cualquier *Phone*) → imagen del sistema con **API 35** (descárgala con el icono ⬇) → **Finish**.

**PASO 4. Personaliza el saludo.** Abre `app/src/main/java/com/pmdm/tema1/ui/PanelDispositivo.kt` y busca el comentario **`// EJ12 · PASO 4`**. Cambia `"Hola, Android"` por `"¡Hola, <tu nombre>! Esta es mi primera app"`.

> 💡 Para buscar un comentario en todo el proyecto: **`Ctrl + Mayús + F`** y escribe `EJ12`.

**PASO 5. Ejecuta.** Arriba, elige el emulador en la lista de dispositivos y pulsa ▶️ **Run 'app'** (`Mayús + F10`).

**PASO 6.** Haz una **captura** de la app funcionando (botón 📷 de la barra lateral del emulador), guárdala en esta carpeta como `captura.png` y contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

- La app arranca con tres pestañas: **Panel**, **Estados** y **Dispositivos**.
- En **Panel** sale tu saludo, el modelo del emulador (por ejemplo `Google sdk_gphone64_x86_64`), la versión de Android y **«Clase de ventana: ?»**. Ese `?` lo arreglarás en el ejercicio 15.
