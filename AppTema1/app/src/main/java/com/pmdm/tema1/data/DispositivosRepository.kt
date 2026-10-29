package com.pmdm.tema1.data

// Capa de datos: decide DE DÓNDE vienen los dispositivos.
// Hoy es una lista fija; mañana podría ser una API REST o una base de datos.
class DispositivosRepository {
    fun obtenerTodos(): List<Dispositivo> = listOf(
        Dispositivo("Pixel 9", "Smartphone", 6.3),
        Dispositivo("iPad Air", "Tablet", 11.0),
        Dispositivo("Galaxy Watch 7", "Wearable", 1.5),
        Dispositivo("Kindle Paperwhite", "eBook", 7.0),
        Dispositivo("Galaxy Z Fold 6", "Plegable", 7.6),
        Dispositivo("Galaxy S25", "Smartphone", 6.2),
    )
}
