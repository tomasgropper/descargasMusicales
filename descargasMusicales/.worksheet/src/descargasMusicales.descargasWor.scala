package descargasMusicales

import scala.collection.mutable.ListBuffer
import descargasMusicales._

object descargasWor kSheet {
 
  val manejador = Manejador

  val cancion1 = new Cancion(10, 1)
  val cancion2 = new Cancion(10000, 1)
  val cancion3 = new Cancion(10, 6)

  val compilado = new Compilado(100000, ListBuffer(cancion1, cancion2, cancion3))

  val cliente = new Cliente
  cliente.realizarDescarga(cancion1)
  cancion1.cantDescargas

  cliente.realizarDescarga(cancion2)
  cancion2.cantDescargas

  cliente.realizarDescarga(cancion3)
  cancion3.cantDescargas

  cliente.facturar

  cliente.realizarDescarga(compilado)
  compilado.cantDescargas

  cliente.facturar

  val cancion4 = new Cancion(1, 1)

  manejador.procesarDescargas(cliente, cancion4)
  cliente.facturar

}
