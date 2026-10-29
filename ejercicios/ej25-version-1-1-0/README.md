# Ej25 · Publica la versión 1.1.0 🤖

**Apartado 7 · Ciclo de vida: instalación y actualización** · ⏱️ 35 min

> 🎯 Preparar una **actualización** de la app: subir el `versionCode` y el `versionName` siguiendo SemVer, generar el **APK** y comprobar con ADB que el sistema ve la versión nueva.

## Pasos

**PASO 1.** Ejecuta la app y mira la fila **Versión de la app** del panel: `1.0.0`.

**PASO 2.** En `app/build.gradle.kts` busca **`EJ25`**. Desde la versión 1.0.0 has añadido funcionalidades nuevas compatibles (los ejercicios 15, 16 y 20), así que según **SemVer** toca subir la **MENOR**:
- `versionCode = 2`
- `versionName = "1.1.0"`

Pulsa **Sync Now** (arriba a la derecha).

**PASO 3. Genera el APK:** menú **Build → Generate App Bundles or APKs → Generate APKs**. Al terminar, pulsa **locate**: el fichero está en `app/build/outputs/apk/debug/app-debug.apk`.

**PASO 4. Instálalo como actualización** desde la terminal de Android Studio (en la carpeta `AppTema1`):

```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
adb shell dumpsys package com.pmdm.tema1 | findstr version
```

> 🐧 En Linux/macOS cambia `findstr` por `grep`.

**PASO 5.** Abre la app: el panel muestra **1.1.0**. Contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

`dumpsys` muestra `versionCode=2` y `versionName=1.1.0`.
