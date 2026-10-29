# Ej30 · ADB: permisos, ficheros y batería 🤖 💻

**Apartado 9 · Entorno de ejecución del administrador de aplicaciones** · ⏱️ 50 min

> 🎯 Usar ADB para **conceder y quitar permisos**, **leer los ficheros privados** de la app, **pasar ficheros** entre el PC y el móvil y **simular la batería**, viendo el efecto en AppTema1.

## Pasos

**PASO 1.** En `AndroidManifest.xml` declara el permiso de ubicación (busca **`EJ30 · PASO 1`**).

**PASO 2.** En `MainActivity.kt` y `Registro.kt` sigue **`EJ30 · PASO 2`**: cada vez que se crea la Activity, la app añade una línea a su fichero privado `registro.txt`.

**PASO 3.** En `ui/PanelDispositivo.kt` sigue **`EJ30 · PASO 3`**: muestra si el permiso de ubicación está concedido.

**PASO 4.** Ejecuta la app (▶️). El panel dice **Permiso de ubicación: denegado**.

**PASO 5. Permisos.** En la terminal:

```bash
adb shell pm grant com.pmdm.tema1 android.permission.ACCESS_FINE_LOCATION
```
Gira el móvil para que el panel se actualice: **concedido**. Ahora quítalo con `pm revoke` (misma orden cambiando `grant` por `revoke`). ¿Qué le pasa a la app?

**PASO 6. Ficheros privados** (solo funciona con apps *debug*, como la tuya):

```bash
adb shell run-as com.pmdm.tema1 ls files
adb shell run-as com.pmdm.tema1 cat files/registro.txt
```

**PASO 7. Pasar ficheros** entre el PC y el móvil:

```bash
echo Hola desde el PC > saludo.txt
adb push saludo.txt /sdcard/Download/
adb shell ls /sdcard/Download
adb pull /sdcard/Download/saludo.txt copia.txt
```

**PASO 8. Batería simulada:**

```bash
adb shell dumpsys battery set level 7
```
Gira la app: el panel dice **7 %**. Deja la batería como estaba con `adb shell dumpsys battery reset`.

**PASO 9.** Rellena [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

- Con `pm grant` el panel muestra **concedido**, y con `pm revoke`, **denegado**.
- `cat files/registro.txt` muestra una línea `HH:MM:SS onCreate` por cada vez que se ha creado la Activity.
