package descargasMusicales

import scala.collection.mutable.ListBuffer

case class Cancion(var cantDescargas: Int, duracion: Double, nacional: Boolean, nombre: String) extends Item {

  def descargar = cantDescargas = cantDescargas + 1

  def esHit: Boolean = cantDescargas > 1000

  def precio: Double = if (this.esHit) 10 else if (duracion > 3) 4 else 3
  
  def cantPalabras: Int = nombre.filter(c => c == ' ').size + 1
}