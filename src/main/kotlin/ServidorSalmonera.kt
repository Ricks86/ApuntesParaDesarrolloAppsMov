package org.example

import kotlinx.coroutines.delay

object ServidorSalmonera {
    suspend fun consultarProduccion(){
        println("Consultando producción total...")
        delay(5000)
        GestorCentros.centros.forEach { println("Producción de centro ${it.nombre}: ${it.produccionToneladas}") }
    }
}