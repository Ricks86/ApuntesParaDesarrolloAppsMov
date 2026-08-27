package org.example

import kotlinx.coroutines.runBlocking

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()= runBlocking {
    val centro1 = CentroCulivo(
        101,
        "Centro CAL",
        "Calbuco",
        4.9
    )
    val centro2 = CentroCulivo(
        id = 102,
        "Centro PUL",
        "Puluqui",
        produccionToneladas = 7.2
    )
    GestorCentros.agregarCentro(centro1)
    GestorCentros.agregarCentro(centro2)
    val centro3 = CentroCulivo(
        103,
        "Centro Puerto",
        "Puerto Montt",
        14.9
    )

    do {
        println("**MENU PRINCIPAL**")
        println("1.- agregar centro")
        println("2.- listar centros")
        println("3.- buscar centro por ID")
        println("4.- Consultar producción")
        println("5.- Salir")
        println("> Ingrese Opcion: ")

        val opcion = readln()
        val menu = when (opcion) {
            "1" -> GestorCentros.agregarCentro(centro3.apply { Encargado = "Juan" })
            "2" -> GestorCentros.listarCentro()
            "3" -> {
                println("Ingrese un ID: ")
                var busca: Int = readln().toInt()
                GestorCentros.buscarCentroPorId(busca)
            }
            "4" -> ServidorSalmonera.consultarProduccion()
            "5" -> break
            else -> {println("Eliga una opcion valida")}
        }
    } while (opcion !="5")
}