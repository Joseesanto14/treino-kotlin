package aulalab.aulaabstrato


fun main() {
    val Forma: Forma

    var lista = mutableListOf<Forma>()

    lista.add(Quadrado(0,0,2))
    lista.add(Circulo(0,0,4))
    lista.add(Quadrado(2,2,9))
    lista.add(Circulo(3,3,11))
    lista.add(Quadrado(20,20,20))
    lista.add(Circulo(33,10,24))
    lista.add(Quadrado(12,12,39))
    lista.add(Circulo(35,43,110))
    lista.add(Quadrado(0,0,1))
    lista.add(Circulo(0,0,1))
    lista.add(Quadrado(2,2,3))
    lista.add(Circulo(3,3,7))
    lista.add(Quadrado(20,20,7))
    lista.add(Circulo(33,10,3))
    lista.add(Quadrado(12,12,3))
    lista.add(Circulo(35,43,4))

    lista.sort()
    lista.reversed().forEach { println(it.calcularArea()) }
}