# Ej10 · ¿Nativo o multiplataforma? 🟣

**Apartado 3 · Tecnologías de desarrollo** · ⏱️ 35 min

> 🎯 Antes de programar hay que **decidir la tecnología**. Vas a escribir una función que, según las necesidades de un proyecto, **recomiende** desarrollo nativo o multiplataforma, aplicando las ventajas e inconvenientes del tema.

| Tecnología | Ventaja principal | Inconveniente principal |
|---|---|---|
| **Nativo** (Kotlin, Swift) | Máximo rendimiento y acceso a todo el dispositivo | Hay que hacer una app por plataforma: más tiempo |
| **Multiplataforma compilado** (Flutter, Kotlin Multiplatform, Xamarin) | Un solo código, rendimiento casi nativo | Depende del framework para lo más nuevo del sistema |
| **Multiplataforma web/HTML5** (Ionic, Cordova) | Aprovecha lo que el equipo sabe de web | Menos rendimiento que una app nativa |

## Reglas de decisión (en este orden)

1. Si necesita **el máximo rendimiento** → **Nativo (Kotlin / Swift)**.
2. Si es **solo para Android** → **Nativo Android (Kotlin + Compose)**.
3. Si el equipo **ya sabe desarrollo web** → **Multiplataforma web (Ionic)**.
4. Si el **presupuesto es bajo** → **Multiplataforma compilado (Flutter / Kotlin Multiplatform)**.
5. En otro caso → **Nativo en cada plataforma**.

## Pasos

Completa [`Decision.kt`](Decision.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej10-nativo-o-multiplataforma/Decision.kt
```

Después contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

```text
App del comedor del instituto -> Multiplataforma compilado (Flutter / Kotlin Multiplatform)
Juego de carreras 3D -> Nativo (Kotlin / Swift)
App interna de la empresa -> Nativo Android (Kotlin + Compose)
Tienda que ya tiene web en Angular -> Multiplataforma web (Ionic)
Banco con mucho presupuesto -> Nativo en cada plataforma
```
