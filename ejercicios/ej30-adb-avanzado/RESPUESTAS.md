# Ej30 · Respuestas

| Orden | ¿Qué ha pasado? |
|---|---|
| `pm grant … ACCESS_FINE_LOCATION` | |
| `pm revoke …` | |
| `run-as … cat files/registro.txt` | |
| `push` y `pull` | |
| `dumpsys battery set level 7` | |

1. ¿Qué le pasó a la app al hacer `pm revoke` mientras estaba abierta? ¿Por qué crees que Android hace eso?

   >

2. Intenta `adb shell cat /data/data/com.pmdm.tema1/files/registro.txt` (sin `run-as`). ¿Qué pasa? ¿Qué es el **sandbox** de una app?

   >

3. ¿Qué pasa con `registro.txt` si desinstalas la app? Relaciónalo con la fase de **borrado** del ciclo de vida.

   >
