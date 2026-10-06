object Depurar {
    fun leerDouble (mensaje:String): Double {
        val ROJO = "\u001B[31m"
        val RESET = "\u001B[0m"
        var n : Double? = 0.0;
        do {
            print(mensaje);
             n= readln().toDoubleOrNull();
            if (n!=null){
                return n;
            }else{
                println("$ROJO No se puede dividir entre 0 $RESET")
            }
        }while (n==null)


    }

}