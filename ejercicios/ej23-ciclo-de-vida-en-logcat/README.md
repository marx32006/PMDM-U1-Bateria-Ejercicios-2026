# Ej23 · Espía el ciclo de vida con Logcat 🤖

**Apartado 6 · Estados de una Activity** · ⏱️ 45 min

> 🎯 Ver **en directo** qué métodos del ciclo de vida llama Android a tu Activity (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`…) en cada situación, escribiendo mensajes en **Logcat**.

## Pasos

**PASO 1, 2 y 3.** En `MainActivity.kt` sigue los comentarios **`EJ23`**: un `Log.d` en `onCreate`, sobrescribe los demás métodos y crea la constante `TAG = "CICLO"`.

**PASO 4.** Ejecuta la app y abre la ventana **Logcat** (abajo, o **View → Tool Windows → Logcat**). En el cuadro de filtro escribe:

```text
tag:CICLO
```

**PASO 5.** Haz cada acción de la tabla de [`RESPUESTAS.md`](RESPUESTAS.md) y **copia los mensajes** que aparecen. Usa el botón 🗑 de Logcat para limpiar entre una prueba y otra.

## ✅ Comprueba

Al abrir la app sale:

```text
D  onCreate
D  onStart
D  onResume
```
