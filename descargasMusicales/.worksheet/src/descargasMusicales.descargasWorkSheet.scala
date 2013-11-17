package descargasMusicales

import scala.collection.mutable.ListBuffer
import descargasMusicales._

object descargasWorkSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(159); 

  val manejador = Manejador;System.out.println("""manejador  : descargasMusicales.Manejador.type = """ + $show(manejador ));$skip(59); 

  val cancion1 = new Cancion(10, 1, false, "Love me do");System.out.println("""cancion1  : descargasMusicales.Cancion = """ + $show(cancion1 ));$skip(61); 
  val cancion2 = new Cancion(10000, 1, true, "Rezo por vos");System.out.println("""cancion2  : descargasMusicales.Cancion = """ + $show(cancion2 ));$skip(56); 
  val cancion3 = new Cancion(10, 6, false, "Yesterday");System.out.println("""cancion3  : descargasMusicales.Cancion = """ + $show(cancion3 ));$skip(84); 

  val compilado = new Compilado(100000, ListBuffer(cancion1, cancion2, cancion3));System.out.println("""compilado  : descargasMusicales.Compilado = """ + $show(compilado ));$skip(30); 

  val cliente = new Cliente;System.out.println("""cliente  : descargasMusicales.Cliente = """ + $show(cliente ));$skip(39); 

  cliente.realizarDescarga(cancion1);$skip(25); val res$0 = 
  cancion1.cantDescargas;System.out.println("""res0: Int = """ + $show(res$0));$skip(39); 

  cliente.realizarDescarga(cancion2);$skip(25); val res$1 = 
  cancion2.cantDescargas;System.out.println("""res1: Int = """ + $show(res$1));$skip(39); 

  cliente.realizarDescarga(cancion3);$skip(25); val res$2 = 
  cancion3.cantDescargas;System.out.println("""res2: Int = """ + $show(res$2));$skip(21); val res$3 = 

  cliente.facturar;System.out.println("""res3: Double = """ + $show(res$3));$skip(40); 

  cliente.realizarDescarga(compilado);$skip(26); val res$4 = 
  compilado.cantDescargas;System.out.println("""res4: Int = """ + $show(res$4));$skip(21); val res$5 = 

  cliente.facturar;System.out.println("""res5: Double = """ + $show(res$5));$skip(49); 

  val cancion4 = new Cancion(1, 1, true, "ad");System.out.println("""cancion4  : descargasMusicales.Cancion = """ + $show(cancion4 ));$skip(51); 

  manejador.procesarDescargas(cliente, cancion4);$skip(41); val res$6 = 
  manejador.procesarFacturacion(cliente);System.out.println("""res6: Double = """ + $show(res$6));$skip(34); 

  val clienteDesc = new Cliente;System.out.println("""clienteDesc  : descargasMusicales.Cliente = """ + $show(clienteDesc ));$skip(66); 

  val cancionFF = new Cancion(10001, 3, false, "Hello Goodbye");System.out.println("""cancionFF  : descargasMusicales.Cancion = """ + $show(cancionFF ));$skip(41); val res$7 = 
  clienteDesc.agregarDescuento(Fiestero);System.out.println("""res7: Any = """ + $show(res$7));$skip(41); val res$8 = 
  clienteDesc.agregarDescuento(Fogonero);System.out.println("""res8: Any = """ + $show(res$8));$skip(43); val res$9 = 

  clienteDesc.agregarDescuento(Fiestero);System.out.println("""res9: Any = """ + $show(res$9));$skip(61); 

  val cancionFF2 = new Cancion(10001, 2, false, "Hey You");System.out.println("""cancionFF2  : descargasMusicales.Cancion = """ + $show(cancionFF2 ));$skip(78); 
  val compiladoFF = new Compilado(1000000, ListBuffer(cancionFF, cancionFF2));System.out.println("""compiladoFF  : descargasMusicales.Compilado = """ + $show(compiladoFF ));$skip(103); val res$10 = 
 // manejador.procesarDescargas(clienteDesc, cancionFF)

  manejador.procesarFacturacion(clienteDesc);System.out.println("""res10: Double = """ + $show(res$10));$skip(61); 
  
    manejador.procesarDescargas(clienteDesc, compiladoFF);$skip(46); val res$11 = 

  manejador.procesarFacturacion(clienteDesc);System.out.println("""res11: Double = """ + $show(res$11))}

}
