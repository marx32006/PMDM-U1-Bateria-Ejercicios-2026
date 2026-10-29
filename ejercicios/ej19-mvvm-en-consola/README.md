# Ej19 · MVVM en consola 🟣

**Apartado 5 · Estructura y jerarquía de clases** · ⏱️ 40 min

> 🎯 Entender la **jerarquía típica de una app con MVVM** sin el lío de Android: la «pantalla» será la consola, pero las clases son las mismas que usarás en la app.

```text
 "Pantalla" (pintarPantalla)  →  HomeViewModel  →  ItemsRepository  →  datos
   solo PINTA el estado          guarda el ESTADO     decide DE DÓNDE      (lista, API REST,
   y avisa de lo que hace        y la lógica          vienen los datos     base de datos…)
   el usuario
```

## Pasos

Completa [`Mvvm.kt`](Mvvm.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej19-mvvm-en-consola/Mvvm.kt
```

Después contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

```text
=== Home (filtro: todos) ===
  #1 Pixel 9 [Smartphone]
  #2 iPad Air [Tablet]
  #3 Galaxy Watch 7 [Wearable]
  #4 Galaxy S25 [Smartphone]
=== Home (filtro: Smartphone) ===
  #1 Pixel 9 [Smartphone]
  #4 Galaxy S25 [Smartphone]
=== Home (filtro: Plegable) ===
  (no hay resultados)
```
