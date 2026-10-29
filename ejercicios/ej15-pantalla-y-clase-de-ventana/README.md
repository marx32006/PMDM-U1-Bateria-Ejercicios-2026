# Ej15 · La app sabe en qué pantalla está 🤖

**Apartados 2 y 4 · Pantallas distintas y emuladores** · ⏱️ 35 min

> 🎯 Hacer que AppTema1 muestre la **clase de ventana** (compacta, mediana o expandida) y la **orientación**, y comprobar que cambian al **girar** el emulador o al ejecutarla en la **tablet**.

## Pasos

**PASO 1.** Abre `app/src/main/java/com/pmdm/tema1/util/Pantalla.kt` y completa `claseDeVentana` (busca **`EJ15 · PASO 1`**). Es la misma función del ejercicio 04.

**PASO 2.** En `ui/PanelDispositivo.kt` busca **`EJ15 · PASO 2`** y añade la fila **Orientación**.

**PASO 3.** Ejecuta en el AVD **GamaMedia** (o el Pixel del ejercicio 12). Gira el emulador con los botones ⟲ ⟳ de su barra lateral y mira cómo cambian las filas.

> ⚠️ Si al girar la imagen no cambia, en el emulador baja la barra de notificaciones y activa **Girar automáticamente**.

**PASO 4.** Ejecuta en el AVD **Tablet** y gíralo también.

**PASO 5.** Rellena la tabla de [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

En un Pixel 9: en vertical sale **Compacta** y **Vertical**; en horizontal, **Expandida** y **Horizontal**.
