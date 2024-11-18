class BebidaAzucarada(id: Int, litros: Double, precio: Double, marca: String,
                      val porcentajeAzucar: Double, val promocion: Boolean):
    Bebida(id, litros, precio, marca) {
    init{
        if(promocion){
           this.precio *= 0.9
        }
    }
        override fun mostrarBebida() {
        super.mostrarBebida()
        println("Porcentaje de Azúcar: $porcentajeAzucar, Promoción: ${if(promocion)"Si" else "No"}")
    }
}