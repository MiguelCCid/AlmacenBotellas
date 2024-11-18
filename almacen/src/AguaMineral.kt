class AguaMineral(id: Int, litros: Double, precio: Double, marca: String, val origen: String): Bebida(id, litros,  precio, marca) {
    override fun mostrarBebida() {
        super.mostrarBebida()
        println("Origen: $origen")
    }
}