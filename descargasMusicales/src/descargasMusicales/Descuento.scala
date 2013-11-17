package descargasMusicales

abstract class Descuento(val grupo: Grupo) {
	def aplicar(item: Item, montoParcial: Double): Double
	def cumple(cancion: Cancion): Boolean
}