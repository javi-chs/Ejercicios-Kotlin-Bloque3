package Ejercicio6

//Confeccionar una agenda. Utilizar un MutableMap cuya clave sea de la clase Fecha:
//data class Fecha(val dia: Int, val mes: Int, val año: Int)
//Como valor en el mapa almacenar un String. Implementar las siguientes funciones:
//
//Carga de datos en la agenda.
//Listado completo de la agenda.
//Consulta de una fecha.

//put mete un elemento en el map
// remove quita un elemento del map

class Agenda{
    val agenda :MutableMap<Fecha,String> = mutableMapOf();

    fun añadeEntrada(){
        println("Indicanos el dia");
        var dia = readLine()!!.toInt();
        println("Indicanos el mes");
        var mes = readLine()!!.toInt();
        println("Indicanos el año");
        var anyo = readLine()!!.toInt();
        var fecha:Fecha = Fecha(dia,mes,anyo);
        println("Indicanos el valor de la entrada");
        var valor = readLine()!!;
        this.agenda.put(fecha,valor);
    }
    fun imprimeLista(){
        for(i in agenda){
            println(
                "El dia "+ i.key + " hay programado " + i.value
            );
        }
    }
    fun consultaFecha(fecha:Fecha):String{
        val  valor :String= this.agenda.get(fecha)!!;
    return valor;
    }
    fun preguntaFecha(){
        println("Indicanos el dia");
        var dia = readLine()!!.toInt();
        println("Indicanos el mes");
        var mes = readLine()!!.toInt();
        println("Indicanos el año");
        var anyo = readLine()!!.toInt();
        var fecha = Fecha(dia,mes, anyo);
        println( "El dia que nos has indicado tienes: "+consultaFecha(fecha));
    }
}