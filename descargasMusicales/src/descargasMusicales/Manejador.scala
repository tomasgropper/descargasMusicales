package descargasMusicales

object Manejador {

  def procesarDescargas(cliente: Cliente, �tem: Item) = cliente.realizarDescarga(�tem)

  def procesarFacturacion(cliente: Cliente): Double = cliente.facturar
}