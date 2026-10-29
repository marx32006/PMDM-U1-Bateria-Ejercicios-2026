# Ej22 · Máquina de estados de una app 🟣

**Apartado 6 · Modelo de estados de una aplicación móvil** · ⏱️ 45 min

> 🎯 Una app está siempre en uno de estos estados: **activa**, **pausada** (en segundo plano) o **destruida**. Vas a programar una **máquina de estados** que, según lo que pase (llega una llamada, vuelves, el sistema necesita memoria…), cambie de estado e indique **qué métodos del ciclo de vida** llamaría Android.

```text
            ABRIR                      OTRA_APP_DELANTE / BLOQUEAR
 (no existe) ─────▶  ACTIVO  ─────────────────────────────────▶  PAUSADO
                       ▲    ◀───────────── VOLVER ───────────────    │
                       │                                             │ CERRAR / SIN_MEMORIA
              ABRIR    │   CERRAR                                    ▼
          DESTRUIDO ◀──┴──────────────────────────────────────  DESTRUIDO
```

| Transición | Métodos de la Activity |
|---|---|
| (no existe) → ACTIVO | `onCreate() → onStart() → onResume()` |
| ACTIVO → PAUSADO | `onPause() → onStop()` · hay que **guardar el estado** |
| PAUSADO → ACTIVO | `onRestart() → onStart() → onResume()` |
| ACTIVO → DESTRUIDO (cerrar) | `onPause() → onStop() → onDestroy()` |
| PAUSADO → DESTRUIDO (cerrar) | `onDestroy()` |
| PAUSADO → DESTRUIDO (sin memoria) | El sistema mata el proceso: `onDestroy()` **no siempre** se llama |
| DESTRUIDO → ACTIVO | `onCreate(savedInstanceState) → onStart() → onResume()` · **restaura** el estado |

## Pasos

Completa [`Estados.kt`](Estados.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej22-maquina-de-estados/Estados.kt
```

## ✅ Comprueba

```text
El usuario abre la app: no existe -> ACTIVO · onCreate() → onStart() → onResume()
Entra una llamada: ACTIVO -> PAUSADO · onPause() → onStop() · guarda el estado
Vuelve a la app: PAUSADO -> ACTIVO · onRestart() → onStart() → onResume()
Bloquea la pantalla: ACTIVO -> PAUSADO · onPause() → onStop() · guarda el estado
El sistema necesita memoria: PAUSADO -> DESTRUIDO · el sistema mata el proceso (onDestroy() no siempre se llama)
El usuario abre la app: DESTRUIDO -> ACTIVO · onCreate(savedInstanceState) → onStart() → onResume() · restaura el estado
Vuelve a la app: ⛔ no tiene sentido en estado ACTIVO
La cierra desde Recientes: ACTIVO -> DESTRUIDO · onPause() → onStop() → onDestroy()
```
