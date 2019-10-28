package Ejercicio2
//Declarar una clase Dado que tenga como propiedad su valor y dos métodos que permitan tirar el dado e imprimir su valor.
// En la main definir un Array con 5 objetos de tipo Dado. Tirar los 5 dados e imprimir los valores de cada uno.
class Dado (var valor:Int){
    //random() devuelve un valor entre 0 y 0.99999999
    fun tirarDado(){
        var tirada = (Math.random()*6).toInt()+1;
        this.valor =tirada;
    }
    fun imrpmeDado(){
        println("Valor del dado: " + this.valor);
    }
}