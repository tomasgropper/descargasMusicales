package descargasMusicales

import scala.collection.mutable.ListBuffer

object GrupoDos extends Grupo {
  def puedeAgregar(descActuales: ListBuffer[Descuento]): Boolean =
    if (descActuales.exists(d => d == NacPop || d == Outsider)) false else true
}