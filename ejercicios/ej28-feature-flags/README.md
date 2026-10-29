# Ej28 · Feature flags 🤖

**Apartado 8 · Modificación de aplicaciones: feature flags** · ⏱️ 35 min

> 🎯 Añadir una **pantalla nueva** a la app que se pueda **encender y apagar** con un interruptor (*feature flag*), sin borrar código. Así se puede publicar código a medias, o activar una función solo para algunos usuarios.

## Pasos

**PASO 1.** Lee `FeatureFlags.kt` (busca **`EJ28`**). De momento, `PANTALLA_NOVEDADES = false`.

**PASO 2.** Crea el fichero `ui/NovedadesScreen.kt` con un `@Composable fun NovedadesScreen()` que muestre un título «Novedades de la versión 1.1.0» y una lista de 3 novedades (usa `Column` y `Text`).

> 💡 Clic derecho en el paquete `ui` → **New → Kotlin Class/File → File**.

**PASO 3 y 4.** En `ui/AppTema1.kt` sigue los comentarios **`EJ28`**: añade la pestaña **solo si** el flag está activo y muestra `NovedadesScreen()` cuando se elija.

**PASO 5.** Ejecuta con el flag a `false`: **no** aparece la pestaña. Cámbialo a `true` y ejecuta: **sí** aparece.

**PASO 6.** Contesta en [`RESPUESTAS.md`](RESPUESTAS.md).

## ✅ Comprueba

Con `PANTALLA_NOVEDADES = true` hay **4 pestañas**: Panel, Estados, Dispositivos y Novedades.
