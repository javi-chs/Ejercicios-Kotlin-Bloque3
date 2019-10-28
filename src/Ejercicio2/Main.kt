package Ejercicio2
fun main() {
    val lista: Array<Dado> = arrayOf(Dado(0), Dado(0), Dado(0), Dado(0), Dado(0));
    for(i in lista){
        i.tirarDado();
        i.imrpmeDado(); }

}