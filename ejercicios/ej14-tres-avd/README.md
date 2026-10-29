# Ej14 · Tres AVD, tres perfiles 🤖

**Apartado 4 · Emuladores: configuraciones y perfiles** · ⏱️ 40 min

> 🎯 Crear **tres dispositivos virtuales (AVD)** con los **perfiles útiles** del tema y saber **dónde guarda Android Studio su configuración**.

| Perfil | Dispositivo para elegir | Imagen del sistema | RAM |
|---|---|---|---|
| **Gama baja** | *Phone* pequeño (por ejemplo **Pixel 4a** o *Small Phone*) | API 33 (n−2) | 2 GB |
| **Gama media** | **Pixel 9** | API 35 (actual) | 4 GB |
| **Tablet** | **Pixel Tablet** o *Medium Tablet* | API 35 | 4 GB |

## Pasos

**PASO 1.** **Tools → Device Manager → ➕ Create Virtual Device**. Crea los tres AVD de la tabla. En la última pantalla del asistente pulsa **Show Advanced Settings** (o *Additional settings*) para poner la **RAM**. Llámalos `GamaBaja`, `GamaMedia` y `Tablet`.

**PASO 2.** Busca la carpeta donde se guardan los AVD:
- Windows: `C:\Users\<tu usuario>\.android\avd\`
- Linux/macOS: `~/.android/avd/`

Dentro hay una carpeta por AVD (`GamaBaja.avd`…). Abre su **`config.ini`** con un editor de texto.

**PASO 3.** Rellena la tabla de [`RESPUESTAS.md`](RESPUESTAS.md) buscando en cada `config.ini` estas claves: `hw.ramSize`, `hw.lcd.width`, `hw.lcd.height`, `hw.lcd.density`, `abi.type` e `image.sysdir.1`.

**PASO 4.** Arranca el de **gama baja** y ejecuta AppTema1 en él (elígelo en la lista de dispositivos y ▶️).

## ✅ Comprueba

- En el Device Manager aparecen tus tres AVD.
- AppTema1 funciona en el de gama baja (en la fila **Android** sale API 33).
