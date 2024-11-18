class Almacen {
    private val estanteria: Array<Array<Bebida?>> = Array(5) {Array(5){null} }

    fun agregarBebida(bebida: Bebida): Boolean {

        for (i in estanteria.indices) {
            for (j in estanteria[i].indices) {
                val bebidaExistente = estanteria[i][j]
                if (bebidaExistente != null && bebidaExistente.id == bebida.id) {
                    println("No se puede agregar la bebida. Ya existe una bebida con el ID ${bebida.id}")
                    return false
                }
            }
        }

        for (i in estanteria.indices) {
            for (j in estanteria[i].indices) {
                if (estanteria[i][j] == null) {
                    estanteria[i][j] = bebida
                    println("Bebida añadida al almacén en posición [$i][$j]")
                    return true
                }
            }
        }

        println("No hay espacio disponible en el almacén")
        return false
    }

    fun eliminarBebida(id: Int): Boolean{
        for (i in estanteria.indices){
            for(j in estanteria[i].indices){
                if (estanteria[i][j]?.id == id){
                    estanteria[i][j] = null
                    println("La bebida $id ha sido eliminada")
                    return true
                }
            }
        }
        println("La bebida no se ha encontrado")
        return false
    }

    fun mostrarBebida(){
        var bebidasEncontradas = false
        for (i in estanteria.indices){
            for(j in estanteria[i].indices){
               val bebida = estanteria[i][j]
                if (bebida != null){
                    bebida.mostrarBebida()
                    println("-------------------")
                    bebidasEncontradas = true
                }
            }
            if (!bebidasEncontradas) {
                println("No se encontraron bebidas en la estantería.")
            }
        }
    }

    fun calcularPrecioTotal(): Double{
        var precioTotal= 0.0
        for (i in estanteria.indices){
            for(j in estanteria[i].indices){
                val bebida = estanteria[i][j]
                if (bebida != null){
                    precioTotal += bebida.precio
                }
            }
        }
        println("El precio total es: $precioTotal")
        return precioTotal
    }

    fun calcularPrecioMarca(marca: String): Double{
        var precioTotal= 0.0
        for (i in estanteria.indices){
            for(j in estanteria[i].indices){
                val bebida = estanteria[i][j]
                if (bebida != null && bebida.marca == marca){
                    precioTotal += bebida.precio
                }
            }
        }
        println("El precio total de la marca es: $precioTotal")
        return precioTotal
    }

    fun calcularPrecioColumna(columna: Int): Double{
        var precioTotal= 0.0
        for (i in estanteria.indices) {
            val bebida = estanteria[i][columna-1]
            if (bebida != null) {
                precioTotal += bebida.precio
            }
        }
        println("El precio total de la columna $columna es: $precioTotal")
        return precioTotal

    }

 }