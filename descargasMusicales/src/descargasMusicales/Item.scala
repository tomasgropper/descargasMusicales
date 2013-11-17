package descargasMusicales

import scala.collection.mutable.ListBuffer

abstract class Item {
  def descargar
  def precio: Double
  def precioFinal(descuentos: ListBuffer[Descuento]): Double = descuentos.foldLeft(this.precio)((mp,desc)=> mp - desc.aplicar(this,mp))
}