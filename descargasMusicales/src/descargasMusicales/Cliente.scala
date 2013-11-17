package descargasMusicales

import scala.collection.mutable.ListBuffer

class Cliente {
  val items: ListBuffer[Item] = ListBuffer()
  val descuentos: ListBuffer[Descuento] = ListBuffer()

  def realizarDescarga(item: Item) = {
    items += item
    item.descargar
  }

  def facturar: Double = items.foldLeft(0: Double)((acum, item) => item.precioFinal(descuentos) + acum)

  def agregarDescuento(descuento: Descuento) = try this.agregarDesc(descuento)
  catch { case e: IllegalArgumentException => println("Ya existe un descuento con este grupo para este cliente") }

  def agregarDesc(descuento: Descuento) = if (descuento.grupo.puedeAgregar(descuentos)) descuentos += descuento
  else throw new IllegalArgumentException("No se pudo agregar")
}