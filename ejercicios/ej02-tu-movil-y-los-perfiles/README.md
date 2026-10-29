# Ej02 · Tu móvil frente a los perfiles 🟣 📱

**Apartado 1 · Características de los dispositivos** · ⏱️ 30 min

> 🎯 Conocer **las características reales de tu propio móvil** y compararlas con los perfiles de **gama baja, media y alta** que se usan para probar apps.

## Pasos

**PASO 1. Investiga tu móvil.** En el teléfono, ve a **Ajustes → Acerca del teléfono** (o *Información del dispositivo*). Si te falta algún dato, busca tu modelo en [gsmarena.com](https://www.gsmarena.com). Rellena la tabla de [`mi_movil.md`](mi_movil.md).

> 📵 ¿No tienes móvil Android o no quieres usarlo? Usa los datos de un modelo que te guste de gsmarena.

**PASO 2.** Completa [`Comparador.kt`](Comparador.kt) **con los datos de tu móvil** y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej02-tu-movil-y-los-perfiles/Comparador.kt
```

**PASO 3.** Contesta las preguntas de `mi_movil.md`.

## ✅ Comprueba

Con un móvil de ejemplo (8 GB de RAM, 6.5", Android 14 = API 34) sale:

```text
Mi móvil: 8 GB RAM · 6.5" · API 34 -> gama alta
  frente a Gama baja: +6 GB de RAM, +1.5" de pantalla, API 1 más moderna
  frente a Gama media: +4 GB de RAM, +0.2" de pantalla, API 1 más antigua
  frente a Gama alta: -4 GB de RAM, -0.2" de pantalla, API 1 más antigua
```
(Tus números serán los de tu móvil.)
