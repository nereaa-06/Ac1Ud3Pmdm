import kotlin.math.*
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val entero: Int = 12
    val double: Double = 6.6
    val boolean: Boolean = true
    val char: Char = 'N'
    val string: String = "Buenas"

    println("entero -- $entero, double -- $double, boolean -- $boolean, char -- $char , string -- $string ")

    act2()
    act3()
    act4()
    act5()
    act6()
    act7()
    act8()
    act9()
    act10()

}

fun act2() {

    val numero: Double = 9.9

    println("La raiz cuadrada es:" + sqrt(numero))

    println("El valor absoluto es:" + abs(numero))

    println("La potencia al cubo es:" + numero.pow(2))

    println ("El valor redondeado es: " + round(numero))

}

fun act3() {

    var edad = 67

    if (edad == 18 ) {
        println("eres mayor de edad")
    } else if (edad < 18) {
        println("eres menor de edad")
    } else if (edad >= 65) {
        println("eres un jubilado")
    }



}

fun act4() {

    var codigo = 6

    when (codigo) {
        1 -> println ("Laborable")
        2 -> println ("Laborable")
        3 -> println ("Laborable")
        4 -> println ("Laborable")
        5 -> println ("Laborable")
        6 -> println ("Fin de semana")
        7 -> println ("Fin de semana")
        else -> println ("invalido")
    }



}

fun act5() {

    val n = 15

    var suma = 0
    var i = 1

    while (i < n) {
        if (i % 2 != 0) {
            suma += i
        }
        i++
    }
    println("La suma de los números impares desde 1 hasta $n es: $suma")
}


fun act6() {
    val notas = arrayOf(5, 8, 9, 6, 7)

    val notaMedia = notas.average()
    val notaMaxima = notas.maxOrNull()
    val countMayorIgual7 = notas.count { it >= 7 }
    println("Notas: ${notas.joinToString(", ")}")
    println("Nota media: $notaMedia")
    println("Nota máxima: $notaMaxima")

}


fun act7(){
    var dato: Any = 42
    println("Dato como entero: $dato")
    dato = "Hola Mundo"
    println("Dato como texto: $dato")
    dato = 3.14
    println("Dato como decimal: $dato")

    var datoNulo: Any? = null
    println("Dato nulo: $datoNulo")

}



fun act8() {
    fun esPar(numero: Int): Boolean {
        return numero % 2 == 0
    }

    val numerosParaProbar = listOf(4, 7, 10, 13, 16)
    for (num in numerosParaProbar) {
        println("¿El número $num es par? ${esPar(num)}")
    }
}



fun act9() {
    class Vehiculo(val marca: String, var velocidad: Int) {
        fun acelerar(cantidad: Int) {
            velocidad += cantidad
            if (velocidad > 200) {
                velocidad = 200
            }
        }
    }

    val miCoche = Vehiculo("Toyota", 50)
    miCoche.acelerar(100)
    println("Velocidad después de acelerar: ${miCoche.velocidad} km/h")
    miCoche.acelerar(100)
    println("Velocidad después de acelerar nuevamente: ${miCoche.velocidad} km/h")

}



fun act10() {
    class Persona(val nombre: String, val edad: Int) {
        constructor() : this("Desconocido", 0)

        override fun toString(): String {
            return "Nombre: $nombre, Edad: $edad"
        }
    }

    val persona1 = Persona("Ana", 30)
    val persona2 = Persona()

    println(persona1)
    println(persona2)
}
    