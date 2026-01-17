class Estudiante(nombre: String) {

    private val nombre: String
    private var nota: Double = 0.0
        set(value) {
            require (value in 0.0..10.0) {"La nota debe ir desde el 0 hasta el 10"}
            field = value
        }

    init {
        this.nombre = nombre
    }

    fun colocarNota (nota: Double) {
        this.nota = nota
    }

    override fun toString(): String {
        return "Estudiante: $nombre, Nota $nota"
    }
}

fun main() {
    val alumno1 = Estudiante("Antonio")
    val alumno2 = Estudiante("Juan")

    try {
        alumno1.colocarNota(4.5)
        println(alumno1)

        alumno2.colocarNota(12.0)
        println(alumno2)
    }
    catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}