package Ejercicio3

//Crear una lista inmutable de 100 elementos enteros con valores aleatorios comprendidos entre 0 y 20.
// contar cuantos hay comprendidos entre 1 y 4, 5 y 8 y cuantos entre 10 y 13.
// Imprimir si el valor 20 está presente en la lista.
fun main(){

    var list: List<Int> = listOf();

    for(i in 1..100){
        list = list.plus((Math.random()*21).toInt())
    }
    var countBtwn1and4 :Int =0;
    var countBtwn5and8 :Int =0;
    var countBtwn10and13 :Int =0;
    for (i in list){
        if(i>=1 && i<=4){countBtwn1and4++}
        if(i>=5 && i<=8){countBtwn5and8++}
        if(i>=10 && i<=13){countBtwn10and13++}
    }
    println("Cantidad de valores entre 1 y 4 $countBtwn1and4");
    println("Cantidad de valores entre 5 y 8 $countBtwn5and8");
    println("Cantidad de valores entre 10 y 13 $countBtwn10and13");

    println("¿Hay un 20 en la lista?")
    println(list.contains(20));





}

