# Ej18 · Mapa del proyecto 🤖

**Apartado 5 · Estructura de una aplicación** · ⏱️ 35 min

> 🎯 Conocer la **estructura de un proyecto Android** y saber **qué fichero tocar** para cada cosa.

```text
AppTema1/
├─ settings.gradle.kts          ← qué módulos tiene el proyecto
├─ build.gradle.kts             ← plugins del proyecto
└─ app/
   ├─ build.gradle.kts          ← cómo se construye la app: SDK, versión, dependencias
   └─ src/main/
      ├─ AndroidManifest.xml    ← "carné" de la app: nombre, icono, actividades, permisos
      ├─ java/com/pmdm/tema1/   ← el código Kotlin
      └─ res/                   ← recursos: values (textos), mipmap (icono), drawable…
```

## Pasos

**PASO 1.** En Android Studio, en el panel **Project** (izquierda), cambia la vista de **Android** a **Project** (desplegable de arriba) y compara lo que ves con el árbol de arriba.

**PASO 2.** Busca en el proyecto la respuesta a cada fila de la tabla de [`RESPUESTAS.md`](RESPUESTAS.md): **qué fichero** y **qué línea**.

**PASO 3.** Cambia el **nombre de la app** que se ve debajo del icono por `Mi Tema 1` (busca **`EJ18`**). Ejecuta, sal al escritorio del emulador y comprueba el nombre del icono.

**PASO 4.** Contesta las preguntas.

## ✅ Comprueba

En el cajón de aplicaciones del emulador, el icono de la app se llama **Mi Tema 1**.
