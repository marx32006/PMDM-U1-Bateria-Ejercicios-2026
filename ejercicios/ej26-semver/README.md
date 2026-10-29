# Ej26 · Versionado semántico en Kotlin 🟣

**Apartado 7 · Ciclo de vida: buenas prácticas** · ⏱️ 40 min

> 🎯 Una de las buenas prácticas del ciclo de vida es **mantener el versionado (SemVer)**: `MAYOR.MENOR.PARCHE`. Vas a programar una clase `Version` que sepa **subir de versión** según el tipo de cambio y **ordenar** versiones correctamente.

| Tipo de cambio | Qué sube | Ejemplo desde 1.4.2 |
|---|---|---|
| **Corrección** de un fallo | PARCHE | 1.4.**3** |
| **Funcionalidad** nueva compatible | MENOR (y el parche vuelve a 0) | 1.**5**.0 |
| Cambio **incompatible** (rompe algo) | MAYOR (y lo demás vuelve a 0) | **2**.0.0 |

En Android, además del `versionName` (`"1.4.2"`) hay un **`versionCode`** entero que debe crecer siempre. Usaremos `mayor * 10000 + menor * 100 + parche`.

## Pasos

Completa [`Semver.kt`](Semver.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej26-semver/Semver.kt
```

Después contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

```text
Versión inicial: 1.0.0 (versionCode 10000)
Arregla el cierre al girar [CORRECCION] -> 1.0.1 (versionCode 10001)
Modo oscuro [FUNCIONALIDAD] -> 1.1.0 (versionCode 10100)
Corrige un texto [CORRECCION] -> 1.1.1 (versionCode 10101)
Nueva base de datos incompatible [INCOMPATIBLE] -> 2.0.0 (versionCode 20000)
Widget en la pantalla de inicio [FUNCIONALIDAD] -> 2.1.0 (versionCode 20100)
Orden alfabético: [1.10.0, 1.2.0, 1.2.10, 1.9.3, 2.0.0]
Orden de versiones: [1.2.0, 1.2.10, 1.9.3, 1.10.0, 2.0.0]
```
