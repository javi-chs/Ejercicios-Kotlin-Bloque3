package Ejercicio4
// Confeccionar una clase que represente un Empleado.
// Definir como propiedades su nombre y su sueldo.
// Definir una lista mutable con tres empleados.
// Imprimir los datos de los empleados.
// Calcular cuanto gasta la empresa en sueldos.
// Agregar un nuevo empleado a la lista y calcular nuevamente el gasto en sueldos.
class Empleado (val nombre :String="", val sueldo :Float = 0.0F){
    override  fun toString():String{
        var str ="Nombre: " + this.nombre + " Sueldo: "+ this.sueldo+ "\n";
            return str;
    }
}