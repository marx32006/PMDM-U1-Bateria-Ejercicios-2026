# 📱 Batería de ejercicios · Tema 1 · PMDM

**Programación Multimedia y Dispositivos Móviles · 2º DAM** · IES Rafael Alberti · Curso 2026-27

> 🎯 **Para qué sirve:** son **30 ejercicios para aprender y repasar** el tema 1, *Análisis de tecnologías para dispositivos móviles*. **No cuentan para nota.** Son tu entrenamiento para las prácticas y el examen.
>
> 📚 **Teoría:** las diapositivas del tema 1 (apartados 1 a 9) en Moodle.

Hay **dos tipos** de ejercicios:

| Tipo | Qué es | Dónde se hace |
|---|---|---|
| 🟣 **Kotlin** | Un programa de consola (`fun main()`) en un único fichero `.kt`, con los pasos comentados (`// PASO 1`, `// PASO 2`…) | Codespaces, Android Studio o [play.kotlinlang.org](https://play.kotlinlang.org) |
| 🤖 **Android** | Cambios en la app **[AppTema1](AppTema1)**, buscando los comentarios `// EJ15 · PASO 1`… | **Android Studio** con un emulador o tu móvil |

Cada ejercicio tiene su carpeta en `ejercicios/` con un **`README.md`** que explica lo que hay que hacer **paso a paso** y la salida que debes obtener para comprobarlo. Algunos tienen además un **`RESPUESTAS.md`** para contestar con tus palabras.

---

## 🚀 Cómo empezar

### Paso 1 · Haz tu copia (solo la primera vez)

Esta página es la **plantilla**: aquí no puedes guardar nada.

1. Entra en GitHub con **tu cuenta**.
2. Arriba a la derecha pulsa **`Use this template` → `Create a new repository`**.
3. En *Owner* deja **tu usuario**, llámalo `PMDM-U1-Bateria-Ejercicios` y pulsa **`Create repository`**.

Trabaja **siempre en tu copia**.

### Paso 2 · Ábrela

- **Ejercicios Android (🤖):** en Android Studio, **File → New → Project from Version Control**, pega la URL de tu copia y, cuando se clone, abre la carpeta **`AppTema1`** (*File → Open → AppTema1*). Espera a que termine el *Gradle sync*.
- **Ejercicios Kotlin (🟣)**, elige una opción:
  - **Codespaces** (recomendada): en tu copia, **`<> Code` → `Codespaces` → `Create codespace on main`**. Ya trae Java y `kotlinc`. Ejecuta cada ejercicio con:
    ```bash
    ./ejecutar.sh ejercicios/ej01-catalogo-de-dispositivos/Catalogo.kt
    ```
  - **Android Studio**: abre el `.kt` del ejercicio y pulsa el ▶️ verde que aparece junto a `fun main()`. Si no aparece, usa **File → New → Scratch File → Kotlin**, pega el código y ejecútalo.
  - **Navegador**: copia el código en [play.kotlinlang.org](https://play.kotlinlang.org), complétalo allí y pégalo de vuelta en tu fichero.

---

## 📌 La regla de los commits

- **Un commit al terminar cada ejercicio**, con el número delante: `Ej15: clase de ventana en el panel`.
- **`git push` al final de cada clase.** En Android Studio: **Git → Commit** (`Ctrl + K`) y **Git → Push** (`Ctrl + Mayús + K`).

---

## 🗺️ Índice de ejercicios

| Nº | Ejercicio | Tipo | Apartado |
|---|---|---|---|
| **1** | **Dispositivos móviles: evolución, tipos y características** | | |
| 01 | [Catálogo de dispositivos](ejercicios/ej01-catalogo-de-dispositivos) | 🟣 Kotlin | 1 |
| 02 | [Tu móvil frente a los perfiles](ejercicios/ej02-tu-movil-y-los-perfiles) | 🟣 Kotlin + 📱 | 1 |
| 03 | [Batería y modo ahorro](ejercicios/ej03-bateria-y-modo-ahorro) | 🟣 Kotlin | 1-2 |
| 04 | [¿Móvil, plegable o tablet?](ejercicios/ej04-clases-de-ventana) | 🟣 Kotlin | 1-2 |
| **1** | **Evolución de las redes móviles** | | |
| 05 | [Las generaciones en un `enum`](ejercicios/ej05-generaciones-en-un-enum) | 🟣 Kotlin | 1 |
| 06 | [¿Qué red es?](ejercicios/ej06-que-red-es) | 🟣 Kotlin | 1 |
| 07 | [La línea del tiempo](ejercicios/ej07-linea-del-tiempo) | 🟣 Kotlin | 1-3 |
| **3** | **Sistemas operativos y tecnologías de desarrollo** | | |
| 08 | [Viaje por las capas de Android](ejercicios/ej08-capas-de-android) | 🟣 Kotlin | 3 |
| 09 | [Android, iOS y HarmonyOS con interfaces](ejercicios/ej09-sistemas-con-interfaces) | 🟣 Kotlin | 3 |
| 10 | [¿Nativo o multiplataforma?](ejercicios/ej10-nativo-o-multiplataforma) | 🟣 Kotlin | 3 |
| 11 | [De Java a Kotlin](ejercicios/ej11-de-java-a-kotlin) | 🟣 Kotlin | 3 |
| 12 | [Primera ejecución de AppTema1](ejercicios/ej12-primera-ejecucion) | 🤖 Android | 3 |
| 13 | [Cinco «Hola mundo» multiplataforma](ejercicios/ej13-cinco-hola-mundo) | 📝 Análisis | 3 |
| **4** | **Emuladores** | | |
| 14 | [Tres AVD, tres perfiles](ejercicios/ej14-tres-avd) | 🤖 Android | 4 |
| 15 | [La app sabe en qué pantalla está](ejercicios/ej15-pantalla-y-clase-de-ventana) | 🤖 Android | 4 |
| 16 | [Los controles extendidos del emulador](ejercicios/ej16-controles-extendidos) | 🤖 Android | 4 |
| 17 | [En tu móvil de verdad](ejercicios/ej17-en-tu-movil) | 🤖 Android | 4 |
| **5** | **Estructura y jerarquía de clases** | | |
| 18 | [Mapa del proyecto](ejercicios/ej18-mapa-del-proyecto) | 🤖 Android | 5 |
| 19 | [MVVM en consola](ejercicios/ej19-mvvm-en-consola) | 🟣 Kotlin | 5 |
| 20 | [MVVM en AppTema1](ejercicios/ej20-mvvm-en-la-app) | 🤖 Android | 5 |
| 21 | [¿Qué componente uso?](ejercicios/ej21-que-componente) | 🟣 Kotlin | 5 |
| **6** | **Modelo de estados** | | |
| 22 | [Máquina de estados de una app](ejercicios/ej22-maquina-de-estados) | 🟣 Kotlin | 6 |
| 23 | [Espía el ciclo de vida con Logcat](ejercicios/ej23-ciclo-de-vida-en-logcat) | 🤖 Android | 6 |
| 24 | [Que no se pierda el estado](ejercicios/ej24-que-no-se-pierda-el-estado) | 🤖 Android | 6 |
| **7** | **Ciclo de vida de una aplicación** | | |
| 25 | [Publica la versión 1.1.0](ejercicios/ej25-version-1-1-0) | 🤖 Android | 7 |
| 26 | [Versionado semántico en Kotlin](ejercicios/ej26-semver) | 🟣 Kotlin | 7 |
| **8** | **Modificación de aplicaciones existentes** | | |
| 27 | [Heredas una app: pruebas y refactor](ejercicios/ej27-codigo-heredado) | 🤖 Android | 8 |
| 28 | [Feature flags](ejercicios/ej28-feature-flags) | 🤖 Android | 8 |
| **9** | **Entorno de ejecución: ADB** | | |
| 29 | [ADB: instalar, lanzar y leer logs](ejercicios/ej29-adb-basico) | 🤖 Android | 9 |
| 30 | [ADB: permisos, ficheros y batería](ejercicios/ej30-adb-avanzado) | 🤖 Android | 9 |

---

## 🆘 Si te atascas

1. Vuelve a leer el paso: casi siempre la pista está en el comentario.
2. Lee el **error entero**. En Android Studio, mira la pestaña **Build** (errores de compilación) o **Logcat** (errores al ejecutar).
3. Repasa el apartado de teoría que aparece en el índice.
4. Pregunta a tu compañero o compañera y, después, al profesor.
