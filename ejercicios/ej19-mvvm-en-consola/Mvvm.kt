// Ej19 · MVVM en consola

// ---------- Capa de DATOS (ya hecha) ----------
data class Item(val id: Int, val nombre: String, val tipo: String)

class ItemsRepository {
    // En una app real, aquí se llamaría a una API REST o a una base de datos (SQLite / Room)
    private val datos = listOf(
        Item(1, "Pixel 9", "Smartphone"),
        Item(2, "iPad Air", "Tablet"),
        Item(3, "Galaxy Watch 7", "Wearable"),
        Item(4, "Galaxy S25", "Smartphone"),
    )

    fun obtenerTodos(): List<Item> = datos
}

// ---------- Capa de PRESENTACIÓN ----------

// PASO 1: crea la clase HomeViewModel que reciba el repositorio en el constructor:
//     class HomeViewModel(private val repositorio: ItemsRepository) { ... }
//   Dentro:
//   a) var filtro: String? = null  con  private set  (la "pantalla" no lo cambia directamente)
//   b) una propiedad calculada con los items que se deben ver:
//          val estado: List<Item>
//              get() = repositorio.obtenerTodos().filter { filtro == null || it.tipo == filtro }
//   c) un método cambiarFiltro(nuevo: String?) que cambie el filtro.


// ---------- Capa de UI (la "pantalla") ----------

// PASO 2: escribe pintarPantalla(vm: HomeViewModel) que muestre:
//   "=== Home (filtro: todos) ==="   (si el filtro es null escribe "todos": usa ?: )
//   y una línea "  #1 Pixel 9 [Smartphone]" por item, o "  (no hay resultados)" si la lista está vacía.
//   ⚠ La UI NO llama al repositorio: solo lee vm.estado.


fun main() {
    // PASO 3: crea el repositorio y el ViewModel, y simula lo que hace el usuario:
    //   pintar → cambiarFiltro("Smartphone") → pintar → cambiarFiltro("Plegable") → pintar

}
