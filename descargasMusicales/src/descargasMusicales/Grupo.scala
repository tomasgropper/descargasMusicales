package descargasMusicales

import scala.collection.mutable.ListBuffer

abstract class Grupo {
  def puedeAgregar(descActuales: ListBuffer[Descuento]): Boolean
}