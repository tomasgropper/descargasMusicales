package descargasMusicales

import scala.collection.mutable.ListBuffer

object GrupoTres extends Grupo {
  def puedeAgregar(descActuales: ListBuffer[Descuento]): Boolean =
    if (descActuales.exists(d => d == Explorador || d == Fiestero)) false else true
}