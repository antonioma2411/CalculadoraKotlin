//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    menuPrincipal();

}

fun menuPrincipal () {
    var salirValido : Boolean = false;
    var num1 : Double = 0.0;
    var num2 : Double = 0.0;
    var res : Double = 0.0;

    while (!salirValido) {
        pintarMenu();
        val opcion = readln();
        when (opcion) {
            "1" ->{
                //Sumar
                print("Introduzca el primer numero")
                num1= readln().toDouble();
                print("Introduzca el segundo numero")
                num2 = readln().toDouble();

                res= sumar(num1, num2);

                println("El resultado de la suma es: $res")


            }

            "2" -> {
                //restar

                print("Introduzca el primer numero")
                num1= readln().toDouble();
                print("Introduzca el segundo numero")
                num2 = readln().toDouble();

                res= restar(num1, num2);

                println("El resultado de la resta es: $res")

            }

            "3" ->{
                //multiplicar
                print("Introduzca el primer numero")
                num1= readln().toDouble();
                print("Introduzca el segundo numero")
                num2 = readln().toDouble();

                res= multiplicar(num1, num2);

                println("El resultado de la multiplicacion es: $res")

            }

            "4"->{
                //dividir

                print("Introduzca el primer numero")
                num1= readln().toDouble();

                do {
                    print("Introduzca el segundo numero")
                    num2 = readln().toDouble();
                    if (num2==0.0){
                        error("El numero no puede ser 0")
                    }
                }while (num2==0.0);

                res= dividir(num1, num2);

                println("El resultado de la multiplicacion es: $res")

            }

            "5"->{
                //calcularResto

            }

            "6" ->{
                salirValido=true;
            }
            else -> println("Opción no válida")
        }
    }

}

fun pintarMenu () {
    println("===== CALCULADORA BÁSICA =====\n" +
            "1. Sumar\n" +
            "2. Restar\n" +
            "3. Multiplicar\n" +
            "4. Dividir\n" +
            "5. Calcular resto\n" +
            "6. Salir\n" +
            "Seleccione una opción:")
}

fun sumar(num1 : Double, num2 : Double) : Double {
    var res : Double = num1 + num2;
    return res;
}

fun restar(num1 : Double, num2 : Double) : Double {
    var res: Double = num1 - num2;
    return res;
}

fun multiplicar(num1 : Double, num2 : Double) : Double {
    var res: Double = num1 * num2;
    return res;
}

fun dividir(num1 : Double, num2 : Double) : Double {
    var res: Double = num1 / num2;
    return res;
}
