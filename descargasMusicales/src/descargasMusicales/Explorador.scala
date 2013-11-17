package descargasMusicales

object Explorador extends Descuento (GrupoTres){
  def aplicar(item: Item, montoParcial: Double): Double = item match {
    case Compilado(_, canciones) => if (canciones.forall(cancion => this.cumple(cancion))) montoParcial * 0.45 else 0
    case Cancion(a, b, c, d) => if (this.cumple(Cancion(a, b, c, d))) montoParcial * 0.45 else 0
  }
  def cumple(cancion: Cancion): Boolean = cancion.duracion > 10 && !cancion.esHit && cancion.cantPalabras > 8
}