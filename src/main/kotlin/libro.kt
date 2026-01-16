class Libro(val titulo: String, val autor: String, val numPaginas: Int, var leido: Boolean) {
    init {
        require(titulo.isNotBlank()) {"El titulo no puede estar vacio"}
        require(autor.isNotBlank()) {"El autor no puede estar vacio"}
        require(numPaginas in 1..5000) {"El número de páginas debe ser positivo y no superior a 5000"}
    }

    constructor(titulo: String, autor: String) : this(titulo, autor, 100, false)

    override fun toString(): String {
        val leidoStr = if (leido) "Sí" else "No"
        return "Libro: $titulo por $autor, Páginas: $numPaginas, Leído: $leidoStr"
    }
}

fun main() {
    try {
        val libro1 = Libro("Harry Potter", "J. K. Rowling", 543, true)
        val libro2 = Libro("El Quijote", "Miguel de Cervantes")

        println(libro1)
        println(libro2)

        val libro3 = Libro("", "Autor Desconocido")
    }
    catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}