import java.util.Scanner

//data class para almacenar datos
//? = puede tener valor o nulo
data class Estudiante(
    val nombre: String,
    val alias: String?,
    val puntaje: Int,
    val activo: Boolean,
)




fun main() {
    println("====VAL VAR====")

    while (true) {
        println("Ingrese una opcion")
        println("3 > clase 3 when")
        println("2 > clase 2, ciclos,fun, diccionarios, reglas varias")
        println("1 >Comprobar si es par")
        println("0 >Salir")
        print("Ingrese una opcion: ")
        var input = readLine()!!
        when (input) {
            "0" -> break
            "1" -> par()
            "2" -> clase2()
            "3" -> clase3()
         }
    }
}


fun par() {
    print("Ingrese un valor: ")
    var num = Scanner(System.`in`).nextInt()
    if (num % 2 == 0) {
        println("El numero es par")
    } else {
        println("El numero es impar")
    }
}

fun clase2(){

    //Funcion clasica, nombre (argumento: tipodato):tipordato return{
    fun esMayoredad(edad: Int): Boolean{
        return edad >= 18
    }

    //Funcion rapida, estructura similar, solo que en el tipo de dato
    //viene incluida la instrución del return
    fun doble(numero: Int) = numero * 2

    //For
    for(i in 1..100){
        println("intento: $i")
    }

    val edades = listOf(18,43,17,22,88)
    for (edad in edades){
        println("Edad: $edad")
    }

    var i = 0
    while(i< edades.size){
        println("posición: $i ${edades[i]}")
        i++
    }

    //For each= por cada uno
    edades.forEach { edad -> println("Edad: $edad") }

    val nombres = listOf(
        "Diana",
        "Frieren",
        "Diana"
    )
    println("Lista de nombres Original: $nombres")

    val nombresUnicos = nombres.toSet()
    println("Lista de nombres Original: $nombresUnicos")

    val cursos = mapOf(
        "Frieren" to 1,
        "Diana" to 2,
        "Mao-Mao" to 3,
    )
    println(cursos)

    println("Cursos de Frieren: ${cursos["Frieren"]}")

    //Filter = genera una nueva lista solamente con los elementos que cumplan la condición
    val mayores = edades.filter { edad -> edad >=18 }
    println("mayores de edad, de la lista de edades: $mayores")
}

fun clase3() {

    //if como expresion
    val años = 20
    //if puede entregar directamente un valor
    val estado = if (años >= 18) "Adulto" else " es menor de edad"
    println("Edad: $años")
    println("Estado: $estado")

    //When = cuando
    val puntaje = 85

    //permite evaluar multiples condiciones
    val nivel = when {
        puntaje >= 90 -> "Experto"
        puntaje >= 70 -> "Intermedio"
        puntaje >= 50 -> "Principiante"
        else -> "pollito"
    }
    println("Puntaje: $puntaje")
    println("Nivel: $nivel")

    val opcion = 2

    //comparar opción con when

    val lenguaje = when (opcion) {
        1 -> "Java"
        2 -> "Kotlin"
        3 -> "Python"
        4 -> "JavaScript"
        else -> "Abandona"
    }
    println("Lenguaje seleccionado: $lenguaje")

    //Null safety
    //String? puede tener un valor como que no
    var usuario: String? = null
    println("Usuario: $usuario")

    usuario = "Xx_Pepitogamer777omgflo_xX"
    println("Usuario: $usuario")

    //Safe call
    var nombreUsuario: String? = null
    println("Cantidad de letrar: ${nombreUsuario?.length}")

    //Elvis ?: = encuentra un valor alternaitvo si es null
    var nickName: String? = null
    val nombreVisible = nickName ?: "Usuario sin nombre"
    println("Nombre: $nombreVisible")

    //Smar cast
    val dato: Any = 600
    if (dato is String) {
        println("Dato: $dato")
        println("Cantidad de caracteres: ${dato.length}")
    }

    //data class
    val estudents = Estudiante(
        nombre = "carlos",
        alias = null,
        puntaje = 35,
        activo = true,
    )
    //aceder directamente a las propiedades del objeto
    println("nombre ${estudents.nombre}")
    println("Puntaje: ${estudents.puntaje}")
    println("Estado: ${estudents.activo}")

    //NullSafety + Data Class
    val aliasVisible = estudents.alias ?: "Desconocido"
    println("Alias: ${estudents.alias}")

    //When + DataClass
    val nivelEstudiante =when {
        estudents.puntaje >=90 ->"Maestro"
        estudents.puntaje >=70 ->"Experto"
        estudents.puntaje >=50 ->"Intermedio"
        estudents.puntaje >=30 ->"Aprendiz"
        estudents.puntaje >=10 ->"Novato"
        else -> "Pendejo"
    }
    println("Nivel estudiante: $nivelEstudiante")

    //detector de perfil
    val mensaje = when {
        estudents.puntaje >=90 ->
            "\uD83E\uDD2F${estudents.puntaje} Kotlin master"
        estudents.puntaje >=50 ->
            "${estudents.puntaje} Sigue así!"
        estudents.puntaje >=15 ->
            "${estudents.puntaje} Mucho potencial!"
        else ->
            "${estudents.puntaje} Kys"
    }
    println("Mensaje: $mensaje")

    println("Alias: ${estudents.alias ?: "Desconocido"}")
    println("Puntaje: ${estudents.puntaje}/100")
    println("Nivel: ${nivelEstudiante}!")

    //if tambien puede utilizarse dentro de un string
    println(
        if(estudents.activo)
        "Estudiante activo"
        else
        "Estudiante inactivo"
    )
}
