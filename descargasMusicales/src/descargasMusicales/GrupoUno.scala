package descargasMusicales

import scala.collection.mutable.ListBuffer

object GrupoUno extends Grupo {
  def puedeAgregar(descActuales: ListBuffer[Descuento]): Boolean =
    if (descActuales.exists(d => d == Fogonero || d == Innovador)) false else true
}