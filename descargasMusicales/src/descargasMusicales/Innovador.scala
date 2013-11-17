package descargasMusicales

object Innovador extends Descuento (GrupoUno){
  def aplicar(item: Item, montoParcial: Double): Double = item match {
    case Compilado(_, canciones) => if (canciones.forall(cancion => this.cumple(cancion))) montoParcial * 0.7 else 0
    case Cancion(a, b, c, d) => if (this.cumple(Cancion(a, b, c, d))) montoParcial * 0.7 else 0
  }
  def cumple(cancion: Cancion): Boolean = !cancion.esHit
}