fun main() {
    val almacen = Almacen()

    val aguaMineral = AguaMineral(1, 1.5, 1.0, "Bezoya", "Segovia")
    val aguaMineral2 = AguaMineral(3, 3.0, 2.0, "Bezoya", "Segovia")
    val bebidaAzucaradaUno = BebidaAzucarada(2, 10.0, 2.0, "CocaCola", 10.0, false)
    val bebidaAzucaradaDos = BebidaAzucarada(4, 10.0, 2.0, "Pepsi", 10.0, true)
    val aguaMineral3 = AguaMineral(3, 3.0, 2.0, "Bezoya", "Segovia")

    almacen.agregarBebida(aguaMineral)
    almacen.agregarBebida(aguaMineral2)
    almacen.agregarBebida(aguaMineral3)
    almacen.agregarBebida(bebidaAzucaradaDos)
    almacen.agregarBebida(bebidaAzucaradaUno)

    almacen.mostrarBebida()
    almacen.calcularPrecioTotal()
    almacen.calcularPrecioMarca("Bezoya")
    almacen.calcularPrecioColumna(1)


}
