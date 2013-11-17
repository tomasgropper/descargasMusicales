package descargasMusicales
import descargasMusicales._
import scala.collection.mutable.ListBuffer

object worksheep {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(154); 
  val cancion1 = new Cancion(10, 1);System.out.println("""cancion1  : descargasMusicales.Cancion = """ + $show(cancion1 ));$skip(39); 
  val cancion2 = new Cancion(10000, 1);System.out.println("""cancion2  : descargasMusicales.Cancion = """ + $show(cancion2 ));$skip(36); 
  val cancion3 = new Cancion(10, 6);System.out.println("""cancion3  : descargasMusicales.Cancion = """ + $show(cancion3 ));$skip(84); 

  val compilado = new Compilado(100000, ListBuffer(cancion1, cancion2, cancion3));System.out.println("""compilado  : descargasMusicales.Compilado = """ + $show(compilado ));$skip(30); 

  val cliente = new Cliente;System.out.println("""cliente  : descargasMusicales.Cliente = """ + $show(cliente ));$skip(37); 
  cliente.realizarDescarga(cancion1);$skip(25); val res$0 = 
  cancion1.cantDescargas;System.out.println("""res0: Int = """ + $show(res$0));$skip(37); 
  cliente.realizarDescarga(cancion2);$skip(37); 
  cliente.realizarDescarga(cancion3);$skip(21); val res$1 = 

  cliente.facturar;System.out.println("""res1: Double = """ + $show(res$1));$skip(40); 

  cliente.realizarDescarga(compilado);$skip(21); val res$2 = 

  cliente.facturar;System.out.println("""res2: Double = """ + $show(res$2))}
}
