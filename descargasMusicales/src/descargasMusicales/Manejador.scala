package descargasMusicales

object Manejador {

  def procesarDescargas(cliente: Cliente, ítem: Item) = cliente.realizarDescarga(ítem)

  def procesarFacturacion(cliente: Cliente): Double = cliente.facturar
}