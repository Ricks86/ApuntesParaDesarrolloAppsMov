import kotlin.math.roundToInt
import kotlin.math.roundToLong
import kotlin.math.withSign

fun main() {
    //paso 1
    val notas = listOf(6.5, 7.0, 2.2, 3.9, 5.1)
    //paso2
    notas.forEachIndexed { index, notas -> println("Nota °${index + 1}: $notas") }
    //paso 3
    val aprobadas = notas.filter { nota -> nota >= 4.0 }
    println("Notas aprobadas: $aprobadas")
    //paso 4
    val promedio = notas.average()
    val promedio2 = String.format("%.2f", promedio)
    println("El promedio de notas es: $promedio2")
    //paso 5
    fun estaAprobado(num: Double): Boolean {
        if (num >= 4.0)
            return true
        else
            return false
    }
    //paso 6
    notas.forEachIndexed { index, notas ->
        if(estaAprobado(notas))
            println("La nota número ${index + 1} está aprobado: $notas")
        else
            println("La nota número ${index+1} está reprobado aprobado: $notas")
    }
}