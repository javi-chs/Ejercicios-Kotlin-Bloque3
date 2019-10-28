package Ejercicio4

fun main(){
   var lista :ArrayList<Empleado> = arrayListOf<Empleado>(Empleado("Javier", 2000F),Empleado("Jordi", 1999F),Empleado("Moises", 1999F))

    for(i in lista){
        println(i.toString());
    }
    lista.add(Empleado("Juan",1200F))

    println("------------------------------------------");
    println("------------------------------------------");
    println("He añadido un nuevo empleado");
    println("------------------------------------------");
    println("------------------------------------------");
    for(i in lista){
        println(i.toString());
    }

}