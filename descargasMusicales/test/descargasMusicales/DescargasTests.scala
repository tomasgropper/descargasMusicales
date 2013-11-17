package descargasMusicales

import scala.collection.mutable.ListBuffer

import org.scalatest.FunSuite

class DescargasTests extends FunSuite {

  trait TestSets {
    val manejador = Manejador

    val cancion1 = new Cancion(10, 1, false, "Love me do")
    val cancion2 = new Cancion(10000, 1, true, "Rezo por vos")
    val cancion3 = new Cancion(10, 6, false, "Yesterday")

    val compilado = new Compilado(100000, ListBuffer(cancion1, cancion2, cancion3))

    val cliente = new Cliente

    //Cliente descuentos
    val clienteDesc = new Cliente
    val cancionFF = new Cancion(10001, 3, false, "Hello Goodbye")
    val cancionFF2 = new Cancion(10001, 2, false, "Hey You")
    val compiladoFF = new Compilado(1000000, ListBuffer(cancionFF, cancionFF2))

    clienteDesc.agregarDescuento(Fiestero)
    clienteDesc.agregarDescuento(Fogonero)
  }

  test("descargar una cancion") {
    new TestSets {
      manejador.procesarDescargas(cliente, cancion1)
      assert(cancion1.cantDescargas === 11)
    }
  }

  test("descargar un compilado - cantDescargas compilado") {
    new TestSets {
      manejador.procesarDescargas(cliente, compilado)
      assert(compilado.cantDescargas === 100001)
    }
  }

  test("descargar un compilado - cantDescargas canciones") {
    new TestSets {
      manejador.procesarDescargas(cliente, compilado)
      assert(cancion1.cantDescargas === 11)
      assert(cancion2.cantDescargas === 10001)
      assert(cancion3.cantDescargas === 11)
    }
  }

  test("facturar - cancion normal") {
    new TestSets {
      manejador.procesarDescargas(cliente, cancion1)
      assert(manejador.procesarFacturacion(cliente) === 3)
    }
  }
  test("facturar - cancion Hit") {
    new TestSets {
      manejador.procesarDescargas(cliente, cancion2)
      assert(manejador.procesarFacturacion(cliente) === 10)
    }
  }
  test("facturar - cancion duracion mayor a 5") {
    new TestSets {
      manejador.procesarDescargas(cliente, cancion3)
      assert(manejador.procesarFacturacion(cliente) === 4)
    }
  }

  test("facturar - compilado") {
    new TestSets {
      manejador.procesarDescargas(cliente, compilado)
      assert(manejador.procesarFacturacion(cliente) === 60)
    }
  }

  test("facturar") {
    new TestSets {
      manejador.procesarDescargas(cliente, cancion1)
      manejador.procesarDescargas(cliente, cancion2)
      manejador.procesarDescargas(cliente, cancion3)
      manejador.procesarDescargas(cliente, compilado)
      assert(manejador.procesarFacturacion(cliente) === 77)
    }
  }

  test("facturar cancion Fiestero y Fogonero") {
    new TestSets {
      manejador.procesarDescargas(clienteDesc, cancionFF)
      assert(manejador.procesarFacturacion(clienteDesc) === 2)
    }
  }

  test("facturar compilado Fiestero y Fogonero") {
    new TestSets {
      manejador.procesarDescargas(clienteDesc, compiladoFF)
      assert(manejador.procesarFacturacion(clienteDesc) === 12)
    }
  }

  test("agregar descuento de grupo repetido") {
    new TestSets {
      clienteDesc.agregarDescuento(Fiestero)
      assert(clienteDesc.descuentos.size === 2)
      clienteDesc.agregarDescuento(NacPop)
      assert(clienteDesc.descuentos.size === 3)
    }
  }
}