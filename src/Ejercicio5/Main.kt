package Ejercicio5

//Cargar por teclado y almacenar en una lista inmutable las alturas de 5 personas (valores Float)
// Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio y cuántas más bajas
fun main(){
    var veces = 5;
    var lista: List<Float> = listOf();
    while(veces!=0){
        println("Indicanos tu altura");
        var altura :Float = readLine()!!.toFloat();
        lista = lista.plus(altura)
        veces--;
    }
    println("Ya tenemos la lista llena");
    var suma = 0.0F
    for (i in lista){
        suma+=i;
    }
    var promedio = suma/5;
    var countHiger=0;
    var countLower=0;
    for(i in lista){
        if(i<promedio){countHiger++}
        if(i>promedio){countLower++}
    }
    println("Hay $countHiger pesonas mas altas que el promedio y $countLower mas bajas")
    println("El promedio es $promedio");
}