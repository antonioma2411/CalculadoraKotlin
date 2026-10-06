import java.awt.Color

object Calculadora {
    fun menuPrincipal () {
        var salirValido : Boolean = false;
        var num1 : Double = 0.0;
        var num2 : Double = 0.0;
        var res : Double = 0.0;
        val ROJO = "\u001B[31m"
        val RESET = "\u001B[0m"

        val mensaje1 = "Introduzca el primer número";
        val mensaje2 = "Introduzca el segundo numero";

        while (!salirValido) {
            pintarMenu();
            val opcion = readln();
            when (opcion) {
                "1" ->{
                    //Sumar
                    num1=Depurar.leerDouble(mensaje1);

                    num2 =Depurar.leerDouble(mensaje2);

                    res= sumar(num1, num2);

                    println("El resultado de la suma es: $res")


                }

                "2" -> {
                    //restar

                    num1=Depurar.leerDouble(mensaje1);

                    num2 =Depurar.leerDouble(mensaje2);

                    res= restar(num1, num2);

                    println("El resultado de la resta es: $res")

                }

                "3" ->{
                    //multiplicar
                    num1=Depurar.leerDouble(mensaje1);

                    num2 =Depurar.leerDouble(mensaje2);

                    res= multiplicar(num1, num2);

                    println("El resultado de la multiplicacion es: $res")

                }

                "4"->{
                    //dividir

                    num1=Depurar.leerDouble(mensaje1);

                    do {
                        num2 = Depurar.leerDouble(mensaje2);

                        if (num2==0.0){
                            println("$ROJO No se puede dividir entre 0 $RESET")
                        }
                    }while(num2==0.0)

                    res= dividir(num1, num2);

                    println("El resultado de la division es: $res")

                }

                "5"->{
                    //calcularResto

                    num1=Depurar.leerDouble(mensaje1);

                    do {
                        num2 = Depurar.leerDouble(mensaje2);

                        if (num2==0.0){
                            println("$ROJO No se puede dividir entre 0 $RESET")
                        }
                    }while(num2==0.0)

                    res= resto(num1, num2);


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

    fun resto(num1 : Double, num2 : Double) : Double {
        var res: Double = num1 % num2;
        return res;
    }

}
