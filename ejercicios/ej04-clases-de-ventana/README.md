# Ej04 · ¿Móvil, plegable o tablet? 🟣

**Apartados 1 y 2 · Diversidad de pantallas** · ⏱️ 30 min

> 🎯 Hay pantallas de todos los tamaños, así que las apps se diseñan **responsive**. Android las agrupa en **clases de tamaño de ventana** según el **ancho en dp** (píxeles independientes de la densidad). Vas a calcularlo.

| Clase de ventana | Ancho | Ejemplo | Columnas de una lista |
|---|---|---|---|
| **Compacta** | menos de 600 dp | móvil en vertical | 1 |
| **Mediana** | de 600 a 839 dp | plegable abierto, tablet en vertical | 2 |
| **Expandida** | 840 dp o más | tablet en horizontal, móvil en horizontal | 3 |

Para pasar de **píxeles reales** a **dp**: `dp = px × 160 / dpi`.

## Pasos

Completa [`Ventanas.kt`](Ventanas.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej04-clases-de-ventana/Ventanas.kt
```

> 📌 En el ejercicio 15 usarás esta misma función **dentro de la app** AppTema1.

## ✅ Comprueba

```text
Pixel 9 vertical          1080 px a 420 dpi = 411 dp -> Compacta (1 columnas)
Pixel 9 horizontal        2424 px a 420 dpi = 923 dp -> Expandida (3 columnas)
Galaxy Z Fold 6 abierto   1856 px a 374 dpi = 794 dp -> Mediana (2 columnas)
Tablet 11" horizontal     2560 px a 320 dpi = 1280 dp -> Expandida (3 columnas)
Reloj Wear OS             450 px a 320 dpi = 225 dp -> Compacta (1 columnas)
```
