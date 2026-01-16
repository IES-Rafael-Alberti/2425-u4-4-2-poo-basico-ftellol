class Vehiculo(var marca: String, var modelo: String) {
    var kilometraje: Double = 0.0
        private set

    fun registrarViaje(kilometros: Double) {
        kilometraje = kilometraje + kilometros
    }

    fun detalles(): String {
        return "Vehículo: $marca $modelo, Kilometraje: $kilometraje km"
    }
}

fun main() {
    val coche = Vehiculo("Ferrari", "Roma")
    coche.registrarViaje(100.0)

    println(coche.detalles())
}