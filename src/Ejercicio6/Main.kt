package Ejercicio6

fun main(){
    var fin = false;
    var agenda : Agenda = Agenda();
    while(!fin){
        println("            Menu\n"
            +   "-----------------------------\n"+
                "Opción 1 --> Insertar nueva entrada\n"+
                "Opción 2 --> Listado completo\n"+
                "Opción 3 --> Consulta de una fecha\n"+
                "Opción >=4 --> Salir\n");
        val op = readLine()!!.toInt();
        when(op){

            1->{agenda.añadeEntrada()};
            2->{agenda.imprimeLista()};
            3->{agenda.preguntaFecha()};
            else-> fin=true;

        }
    }
}