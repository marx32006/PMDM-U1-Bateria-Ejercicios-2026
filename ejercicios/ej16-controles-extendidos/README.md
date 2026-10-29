# Ej16 · Los controles extendidos del emulador 🤖

**Apartado 4 · Emuladores: sensores y batería** · ⏱️ 35 min

> 🎯 Leer el **nivel de batería** desde la app (pidiéndoselo a un **servicio del sistema**) y usar los **controles extendidos** del emulador para **simular** batería, ubicación, rotación y red.

## Pasos

**PASO 1.** Completa `leerBateria` en `app/src/main/java/com/pmdm/tema1/util/Bateria.kt` (busca **`EJ16 · PASO 1`**).

**PASO 2.** Ejecuta la app. En el panel debe salir la batería del emulador (normalmente **100 %**).

**PASO 3. Simula la batería.** En la barra lateral del emulador pulsa **⋯ (Extended controls) → Battery**. Pon **Charge level** al **15 %** y **Charger connection** en **None**. Vuelve a la app y **gírala** (para que se vuelva a crear y relea la batería).

**PASO 4. Simula otras cosas** desde *Extended controls* y anota qué ves:
- **Location**: escribe una latitud y longitud (por ejemplo, el instituto) y pulsa **Set location**. Abre Google Maps en el emulador.
- **Cellular**: cambia **Network type** a **GSM** (2G) y abre el navegador del emulador: ¿cuánto tarda en cargar una página?
- **Virtual sensors**: mueve el dispositivo y mira cómo cambian el acelerómetro y el giroscopio.

**PASO 5.** Contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

Después del PASO 3, la fila **Batería** del panel dice **15 %**.
