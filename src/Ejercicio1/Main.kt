package Ejercicio1

fun main(){

    var array :Array<Articulo> = arrayOf(Articulo(520,"Reloj de pulsera",250.99F),
        Articulo(123,"Chupachups",500.99F),Articulo(452,"Boligrafo",1500.99F),
        Articulo(52,"Estuche",8000F),Articulo(852,"Gorro de invierno",50000.99F));
    showItems(array);
    inflaPrecios(array);
    println("----------------------------------------------");
    println("----------------------------------------------");
    println("----------------------------------------------");
    showItems(array);
}

fun showItems(a:Array<Articulo>){
    for (i in a){

        println(
            "Codigo: " + i.codigo+ " Descripcion: " + i.descripcion + "Precio: " + i.precio
        );
    }

}

fun inflaPrecios(a : Array<Articulo>){
    for(i in a){
        i.precio = (i.precio*110)/100;
    }
}
