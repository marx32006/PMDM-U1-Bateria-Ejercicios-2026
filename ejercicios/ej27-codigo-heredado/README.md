# Ej27 · Heredas una app: pruebas y refactor 🤖 🧪

**Apartado 8 · Modificación de aplicaciones existentes** · ⏱️ 60 min

> 🎯 Aplicar la **guía de trabajo** del tema para tocar código que no has escrito sin provocar **regresiones**: primero **pruebas**, después **refactor**.

En `app/src/main/java/com/pmdm/tema1/legacy/CalculadoraTarifa.kt` hay una función heredada, `calc`, que calcula la factura mensual de una tarifa móvil. Este es el **requisito** que debería cumplir:

- **Tarifa básica** (`t = 1`): 10 € de cuota + **2 €/GB** los 10 primeros GB y **1 €/GB** a partir del GB 11.
- **Tarifa ilimitada** (`t = 2`): 30 € gastes lo que gastes.
- **Itinerancia** fuera de la UE (`r = true`): +5 €.
- **Estudiante** (`e = true`): 20 % de descuento sobre el **total final**.

## Pasos

**PASO 1. Levanta el proyecto y cartografía.** Lee `calc` y, en [`RESPUESTAS.md`](RESPUESTAS.md), explica qué hace cada línea. **No la cambies todavía.**

**PASO 2. Añade pruebas.** En `app/src/test/java/com/pmdm/tema1/CalculadoraTarifaTest.kt` ya hay una prueba de ejemplo. Escribe **una prueba por fila** de esta tabla (calcula tú el resultado **según el requisito**):

| Tarifa | GB | Itinerancia | Estudiante | Debe costar |
|---|---|---|---|---|
| Básica | 3 | no | no | 16 € (ya hecha) |
| Ilimitada | 50 | no | no | ? |
| Básica | 2 | sí | no | ? |
| Ilimitada | 0 | no | sí | ? |
| Básica | 15 | no | no | ? |
| Básica | 15 | no | sí | ? |

Ejecútalas: clic derecho sobre la clase `CalculadoraTarifaTest` → **Run 'CalculadoraTarifaTest'** (no hace falta emulador). **Una fallará.**

**PASO 3. Arregla y refactoriza** ya con la red de seguridad de las pruebas:
- Cambia los nombres `g`, `t`, `r`, `e`, `x` por nombres claros.
- Cambia los números sueltos por **constantes con nombre** (`CUOTA_BASICA`, `PRECIO_GB`…).
- Cambia el `1`/`2` de la tarifa por un `enum class Tarifa { BASICA, ILIMITADA }`.
- Corrige el fallo.

Después de **cada** cambio, vuelve a ejecutar las pruebas: deben seguir en verde.

**PASO 4. Inspecciona el código:** menú **Code → Inspect Code…** (en versiones antiguas, *Analyze → Inspect Code*) sobre el fichero. Anota dos avisos que te dé.

## ✅ Comprueba

Al final, todas las pruebas pasan en verde ✅ (6 o más).
