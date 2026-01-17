class Producto(nombre: String, precio: Double, stock: Int) {

    private val nombre: String
    private var precio: Double
    private var stock: Int


    init {
        require (precio >= 0) {"El precio debe ser mayor o igual a 0"}
        require (stock >= 0) {"El stock debe ser mayor o igual a 0"}

        this.nombre = nombre
        this.precio = precio
        this.stock = stock
    }

    fun vender(cantidad: Int) {
        if (cantidad > stock) {
            throw IllegalArgumentException("La cantidad no puede ser mayor al stock")
        }
        stock = stock - cantidad

    }

    fun reabastecer(cantidad: Int) {
        stock = stock + cantidad
    }

    override fun toString(): String {
        return ("Producto: $nombre, Precio: $precio€, Stock: $stock")
    }
}

fun main() {

    try{
        val producto1 = Producto("manzana", 2.50, 20)
        val producto2 = Producto("tomate", 1.10, 15)

        producto1.vender(3)
        producto2.reabastecer(1)

        println(producto1)
        println(producto2)

        producto1.vender(30)
    }
    catch(e: IllegalArgumentException){
        println("Error: ${e.message}")
    }
}