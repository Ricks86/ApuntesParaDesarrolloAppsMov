package org.example

import kotlinx.coroutines.delay

object GestorCentros {
    val centros = mutableListOf<CentroCulivo>()

    suspend fun agregarCentro(centro: CentroCulivo){
        try {
            centros.add(centro)
            println("Centro ${centro.nombre} agregado con exito!")
            delay(2000)
        } catch (error: IllegalArgumentException){
            println("Error: debe ingresar texto")
        } catch (error: NullPointerException){
            println("Error: no puede ingresar un nombre vacio")
        }
    }

    suspend fun listarCentro(){
        println("**Centros registrados**")
        centros.forEach {
            println("=============")
            println("Nombre:  ${it.nombre}")
            println("Ubicacion: ${it.ubicacion}")
            println("Encargado: ${it.Encargado}")
            println("=============")
            delay(2000)
        }

    }

    fun buscarCentroPorId(idb: Int): CentroCulivo? {
        try {
            var busca = centros.find { it.id == idb }
            if (busca != null){
                println("Centro encontrado!")
                println("Nombre: ${busca.nombre}")
                println("Ubicacion: ${busca.ubicacion}")
                println("Encargado: ${busca.Encargado ?: "Sin Encargado"}")
                return busca
            } else {
                println("Centro no enconrado!")
                return busca
            }
        } catch (error: IllegalArgumentException){
            println("Ingresa un argumento valido")
            return null
        }
    }

}