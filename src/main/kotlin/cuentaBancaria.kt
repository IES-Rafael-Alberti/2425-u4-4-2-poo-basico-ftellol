class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0
        private set

    fun ingresar(ingresar: Double) {
        require(ingresar > 0) {"La cantidad de dinero a ingresar debe ser mayor a 0"}
        saldo = ingresar + saldo
    }

    fun retirar(retirar: Double) {
        require(retirar > 0) {"La cantidad de dinero a retirar debe ser mayor que 0"}
        if (retirar > saldo) {
            throw Exception("Saldo insuficiente")
        }
        else{
            saldo = saldo - retirar
        }
    }
}

fun main() {
    val cuenta = CuentaBancaria("Juan")

    cuenta.ingresar(100.0)
    cuenta.retirar(50.0)

    try {
        cuenta.retirar(120.0)
    }
    catch(e: Exception) {
        println("Error: ${e.message}")
    }
    println ("El saldo restante es ${cuenta.saldo}")
}