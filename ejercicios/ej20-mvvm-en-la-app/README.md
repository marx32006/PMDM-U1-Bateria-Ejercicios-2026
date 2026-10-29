# Ej20 · MVVM en AppTema1 🤖

**Apartado 5 · Jerarquía de clases y patrón MVVM** · ⏱️ 50 min

> 🎯 Llevar el **MVVM del ejercicio 19** a una app de verdad: la pestaña **Dispositivos** mostrará una lista con **filtros**, siguiendo la jerarquía del tema:

```text
MainActivity → AppTema1 (pestañas) → DispositivosScreen → DispositivosViewModel → DispositivosRepository → datos
                                       UI: solo pinta      estado y lógica          de dónde salen
```

`data/Dispositivo.kt` y `data/DispositivosRepository.kt` **ya están hechos**: léelos.

## Pasos

**PASO 1.** Completa `ui/DispositivosViewModel.kt` (busca **`EJ20 · PASO 1`**).

**PASO 2 y 3.** Completa `ui/DispositivosScreen.kt` (busca **`EJ20`**): recibe el ViewModel y dibuja los filtros y la lista.

> 💡 Si Android Studio subraya algo en rojo, pon el cursor encima y pulsa **`Alt + Intro`** para añadir el `import` que falta.

**PASO 4.** Ejecuta y prueba los filtros. Elige uno, **gira** el móvil y comprueba que el filtro **no se pierde**.

**PASO 5.** Contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

- Arriba salen los chips **Todos · Smartphone · Tablet · Wearable · eBook · Plegable**.
- Con **Smartphone** solo se ven *Pixel 9* y *Galaxy S25*.
- Al girar el móvil, el filtro elegido se mantiene.
