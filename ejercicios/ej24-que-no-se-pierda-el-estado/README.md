# Ej24 · Que no se pierda el estado 🤖

**Apartado 6 · Guardar y restaurar el estado** · ⏱️ 40 min

> 🎯 Comparar **tres formas de guardar un dato** en una pantalla de Compose y ver cuál **sobrevive** al girar el móvil y cuál a que el **sistema mate** la app.

| Forma | Dónde vive el dato |
|---|---|
| `remember` | En la composición: desaparece si se destruye la Activity |
| `rememberSaveable` | Se guarda en el `Bundle` del estado de la instancia (`onSaveInstanceState`) |
| `ViewModel` | En un objeto que Android conserva mientras la pantalla siga existiendo |

## Pasos

**PASO 1, 2 y 3.** En `ui/EstadosScreen.kt` sigue los comentarios **`EJ24`**: el segundo contador pasa a `rememberSaveable` y el tercero al `ContadorViewModel`.

**PASO 4. Prueba 1, girar.** Ejecuta, ve a la pestaña **Estados**, pulsa cada botón **3 veces** y **gira** el móvil. Anota los valores.

**PASO 5. Prueba 2, el sistema mata la app.** Pon otra vez los tres contadores a 3. Pulsa 🏠 (la app pasa a segundo plano) y en la terminal de Android Studio (**View → Tool Windows → Terminal**) ejecuta:

```bash
adb shell am kill com.pmdm.tema1
```

Vuelve a la app desde **Recientes** y anota los valores.

**PASO 6. Prueba 3, cerrar del todo.** Ciérrala deslizándola fuera de **Recientes** y ábrela de nuevo.

**PASO 7.** Rellena [`RESPUESTAS.md`](RESPUESTAS.md).

> 💡 Si `adb` no se reconoce, usa la ruta completa: `%LOCALAPPDATA%\Android\Sdk\platform-tools\adb` (Windows).
