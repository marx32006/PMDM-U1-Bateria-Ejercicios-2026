# Ej08 · Viaje por las capas de Android 🟣

**Apartado 3 · Sistemas operativos móviles** · ⏱️ 30 min

> 🎯 Entender que Android está organizado **en capas**: cuando tu app pide algo al hardware (hacer una foto), la petición **baja** capa a capa hasta el kernel y la respuesta **sube** de vuelta. Lo simularás recorriendo una lista hacia abajo y hacia arriba.

```text
 Apps del sistema / tu app            ← capa más alta
 Framework de API Java
 Bibliotecas C/C++ nativas y Android Runtime (ART)
 Capa de abstracción de hardware (HAL)
 Kernel de Linux                      ← capa más baja (drivers)
```

## Pasos

Completa [`Capas.kt`](Capas.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej08-capas-de-android/Capas.kt
```

Después contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

```text
Petición: hacer una foto
↓ Apps del sistema / tu app
  ↓ Framework de API Java
    ↓ Bibliotecas C/C++ nativas y Android Runtime (ART)
      ↓ Capa de abstracción de hardware (HAL)
        ↓ Kernel de Linux
          ⚙ Hardware: cámara
        ↑ Kernel de Linux
      ↑ Capa de abstracción de hardware (HAL)
    ↑ Bibliotecas C/C++ nativas y Android Runtime (ART)
  ↑ Framework de API Java
↑ Apps del sistema / tu app
Resultado: foto entregada a la app (5 capas)
```
