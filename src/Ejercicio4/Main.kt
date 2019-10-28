package Ejercicio4

fun main(){
   var lista :ArrayList<Empleado> = arrayListOf<Empleado>(Empleado("Javier", 2000F),Empleado("Jordi", 1999F),Empleado("Moises", 1999F))
    var suma = 0F;
    for(i in lista){
        suma+= i.sueldo;
        println(i.toString());
    }
    println("Gasto total de sueldos: $suma");
    lista.add(Empleado("Juan",1200F))

    println("------------------------------------------");
    println("------------------------------------------");
    println("He añadido un nuevo empleado");
    println("------------------------------------------");
    println("------------------------------------------");
    suma = 0F;
    for(i in lista){
        suma += i.sueldo;
        println(i.toString());
    }
    println("Gasto total de sueldos: $suma");
}