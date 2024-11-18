
open class Bebida(
        val id: Int,
        val litros: Double,
        var precio: Double,
        val marca: String,
    ) {
    open fun mostrarBebida() {
        println("Id: $id, Litros: $litros, Precio: $precio, Marca: $marca")
    }
}
