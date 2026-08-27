package org.example

data class CentroCulivo(
    val id: Int,
    val nombre: String,
    val ubicacion: String,
    var produccionToneladas: Double,
    var Encargado: String? = null
)
