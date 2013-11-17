package descargasMusicales

import scala.collection.mutable.ListBuffer
import descargasMusicales._

object descargasWorkSheet {

  val manejador = Manejador                       //> manejador  : descargasMusicales.Manejador.type = descargasMusicales.Manejado
                                                  //| r$@5df7b6e1

  val cancion1 = new Cancion(10, 1, false, "Love me do")
                                                  //> cancion1  : descargasMusicales.Cancion = Cancion(10,1.0,false,Love me do)
  val cancion2 = new Cancion(10000, 1, true, "Rezo por vos")
                                                  //> cancion2  : descargasMusicales.Cancion = Cancion(10000,1.0,true,Rezo por vos
                                                  //| )
  val cancion3 = new Cancion(10, 6, false, "Yesterday")
                                                  //> cancion3  : descargasMusicales.Cancion = Cancion(10,6.0,false,Yesterday)

  val compilado = new Compilado(100000, ListBuffer(cancion1, cancion2, cancion3))
                                                  //> compilado  : descargasMusicales.Compilado = Compilado(100000,ListBuffer(Canc
                                                  //| ion(10,1.0,false,Love me do), Cancion(10000,1.0,true,Rezo por vos), Cancion(
                                                  //| 10,6.0,false,Yesterday)))

  val cliente = new Cliente                       //> cliente  : descargasMusicales.Cliente = descargasMusicales.Cliente@372688e8
                                                  //| 

  cliente.realizarDescarga(cancion1)
  cancion1.cantDescargas                          //> res0: Int = 11

  cliente.realizarDescarga(cancion2)
  cancion2.cantDescargas                          //> res1: Int = 10001

  cliente.realizarDescarga(cancion3)
  cancion3.cantDescargas                          //> res2: Int = 11

  cliente.facturar                                //> res3: Double = 17.0

  cliente.realizarDescarga(compilado)
  compilado.cantDescargas                         //> res4: Int = 100001

  cliente.facturar                                //> res5: Double = 77.0

  val cancion4 = new Cancion(1, 1, true, "ad")    //> cancion4  : descargasMusicales.Cancion = Cancion(1,1.0,true,ad)

  manejador.procesarDescargas(cliente, cancion4)
  manejador.procesarFacturacion(cliente)          //> res6: Double = 80.0

  val clienteDesc = new Cliente                   //> clienteDesc  : descargasMusicales.Cliente = descargasMusicales.Cliente@5d000
                                                  //| 5fa

  val cancionFF = new Cancion(10001, 3, false, "Hello Goodbye")
                                                  //> cancionFF  : descargasMusicales.Cancion = Cancion(10001,3.0,false,Hello Good
                                                  //| bye)
  clienteDesc.agregarDescuento(Fiestero)          //> res7: Any = ListBuffer(descargasMusicales.Fiestero$@79c5c3fe)
  clienteDesc.agregarDescuento(Fogonero)          //> res8: Any = ListBuffer(descargasMusicales.Fiestero$@79c5c3fe, descargasMusi
                                                  //| cales.Fogonero$@3efd2905)

  clienteDesc.agregarDescuento(Fiestero)          //> Ya existe un descuento con este grupo para este cliente
                                                  //| res9: Any = ()

  val cancionFF2 = new Cancion(10001, 2, false, "Hey You")
                                                  //> cancionFF2  : descargasMusicales.Cancion = Cancion(10001,2.0,false,Hey You)
                                                  //| 
  val compiladoFF = new Compilado(1000000, ListBuffer(cancionFF, cancionFF2))
                                                  //> compiladoFF  : descargasMusicales.Compilado = Compilado(1000000,ListBuffer(
                                                  //| Cancion(10001,3.0,false,Hello Goodbye), Cancion(10001,2.0,false,Hey You)))
                                                  //| 
 // manejador.procesarDescargas(clienteDesc, cancionFF)

  manejador.procesarFacturacion(clienteDesc)      //> res10: Double = 0.0
  
    manejador.procesarDescargas(clienteDesc, compiladoFF)

  manejador.procesarFacturacion(clienteDesc)      //> res11: Double = 12.0

}