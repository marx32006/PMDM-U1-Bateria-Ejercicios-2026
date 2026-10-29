# Ej29 · ADB: instalar, lanzar y leer logs 🤖 💻

**Apartado 9 · Entorno de ejecución del administrador de aplicaciones** · ⏱️ 40 min

> 🎯 Gestionar AppTema1 **desde la línea de órdenes** con **ADB** (*Android Debug Bridge*), la herramienta oficial para instalar, lanzar, depurar y gestionar apps.

> 💡 Abre la **Terminal** de Android Studio (abajo). Si `adb` no se reconoce, en Windows usa `%LOCALAPPDATA%\Android\Sdk\platform-tools\adb.exe` o añade esa carpeta al PATH. Ten un emulador **arrancado**.

## Pasos

Ejecuta cada orden **en la carpeta `AppTema1`**, mira qué pasa en el emulador y anota el resultado en la tabla de [`RESPUESTAS.md`](RESPUESTAS.md).

```bash
adb devices
adb uninstall com.pmdm.tema1
adb install app/build/outputs/apk/debug/app-debug.apk
adb shell pm list packages pmdm
adb shell am start -n com.pmdm.tema1/.MainActivity
adb shell am force-stop com.pmdm.tema1
adb logcat -d -s CICLO
adb logcat -d *:E | more
adb shell dumpsys activity processes | findstr tema1
```

> 🐧 En Linux/macOS cambia `findstr` por `grep` y `| more` por `| tail -20`.
> Si no tienes el APK, genéralo como en el ejercicio 25 (**Build → Generate APKs**).

## ✅ Comprueba

- `adb devices` muestra tu emulador como `emulator-5554  device`.
- Después de `am start`, la app se abre sola en el emulador.
- `logcat -s CICLO` muestra los mensajes del ejercicio 23.
