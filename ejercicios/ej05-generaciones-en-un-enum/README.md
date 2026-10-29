# Ej05 · Las generaciones en un `enum` 🟣

**Apartado 1 · Evolución de las redes móviles** · ⏱️ 35 min

> 🎯 Repasar las **generaciones de redes móviles** (de 0G a 6G) guardándolas en un **`enum class`** con propiedades, y calcular cuánto se tardaría en descargar una película de **2 GB** con cada una.

| Generación | Año | Velocidad aproximada | Novedad |
|---|---|---|---|
| 0G | años 40 | — | Radio convencional (walkie-talkie, PTT) |
| 1G | 1977 | — (solo voz) | Analógica |
| 2G | 1991 | 9,6 kbps = 0,0096 Mbps | Digital: SMS y tarjeta SIM (GSM) |
| 3G | 2001 | 2 Mbps | Internet cómodo en el móvil (UMTS) |
| 4G | 2010 | 60 Mbps | Banda ancha y vídeo (LTE) |
| 4G+ | 2016 | 300 Mbps | LTE Advanced |
| 5G | 2017 | 1 000 Mbps (1 Gbps) | IoT, realidad aumentada, baja latencia |
| 6G | futuro | 100 000 Mbps (100 Gbps) | Satélites y cobertura global |

> 🧮 2 GB = 16 000 megabits (1 byte = 8 bits). Tiempo en segundos = `16000 / velocidadMbps`.

## Pasos

Completa [`Generaciones.kt`](Generaciones.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej05-generaciones-en-un-enum/Generaciones.kt
```

## ✅ Comprueba

```text
0G   1940    Radio convencional (walkie-talkie)  -> solo voz
1G   1977    Analógica, solo voz                 -> solo voz
2G   1991    Digital: SMS y tarjeta SIM          -> 19 días
3G   2001    Internet en el móvil (UMTS)         -> 2 h
4G   2010    Banda ancha y vídeo (LTE)           -> 4 min
4G+  2016    LTE Advanced                        -> 53 s
5G   2017    IoT y baja latencia                 -> 16 s
6G   futuro  Satélites, cobertura global         -> menos de 1 s
La más rápida: 6G
Con datos: 6 de 8 generaciones
```
