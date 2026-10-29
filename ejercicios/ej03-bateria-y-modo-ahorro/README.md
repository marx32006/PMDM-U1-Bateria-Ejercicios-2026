# Ej03 · Batería y modo ahorro 🟣

**Apartados 1 y 2 · Limitaciones del hardware móvil** · ⏱️ 30 min

> 🎯 La **batería** es la gran limitación de un móvil. Vas a simular un día de uso con una **clase con estado**: la batería baja con cada tarea, se activa el **modo ahorro** al llegar al 20 % y, si se agota, la app debería haber **guardado su estado** (resiliencia).

## Pasos

Completa [`Bateria.kt`](Bateria.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej03-bateria-y-modo-ahorro/Bateria.kt
```

## ✅ Comprueba

```text
Vídeo 4K: -30% -> 70%
GPS navegando: -25% -> 45%
Redes sociales: -20% -> 25%
Juego 3D: -20% -> 5%
⚠ Modo ahorro activado
Música: -5% -> 0%
🔌 Batería agotada: la app debe haber guardado su estado
```

Fíjate: la música gastaba un 10 %, pero en modo ahorro solo gasta **la mitad**.

Después contesta en [`RESPUESTAS.md`](RESPUESTAS.md).
