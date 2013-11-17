package descargasMusicales

import scala.collection.mutable.ListBuffer

case class Compilado(var cantDescargas: Int, canciones: ListBuffer[Cancion]) extends Item {

  def descargar = {
    cantDescargas = cantDescargas + 1
    canciones.map(x => x.cantDescargas = x.cantDescargas + 1)
  }

  def esHit: Boolean = cantDescargas > 10000

  def precio: Double = if (this.esHit) 60 else 40

}