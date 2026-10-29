package com.pmdm.tema1.util

import android.content.Context

// EJ16 · PASO 1: devuelve el porcentaje de batería usando el servicio del sistema BatteryManager:
//     val gestor = context.getSystemService(Context.BATTERY_SERVICE) as BatteryManager
//     return gestor.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY)
//   (import android.os.BatteryManager)
fun leerBateria(context: Context): Int {
    return -1
}
