import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    
    println("Calculadora en Kotlin")
    println("Ingrese el primer número:")
    val num1 = scanner.nextDouble()
    
    println("Ingrese el operador (+, -, *, /):")
    val operador = scanner.next()[0]
    
    println("Ingrese el segundo número:")
    val num2 = scanner.nextDouble()
    
    val resultado = when (operador) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> if (num2 != 0.0) num1 / num2 else "Error: División por cero"
        else -> "Operador no válido"
    }
    
    println("El resultado es: $resultado")
}
