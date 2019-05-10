package consorcios

class RegistracionCommand {

  String username
  String email

  static constraints = {
    username blank: false, nullable: false
    email blank: false, nullable: false, email: true
  }
}


import groovy.json.JsonOutput

class Temp {
  def dist
}

class PruebaController {

    def pruebaService

    def temperatura() {
      // def a = new URL('https://ws.smn.gob.ar/map_items/weather').text
      def a = new groovy.json.JsonSlurper().parseText(new URL('https://ws.smn.gob.ar/map_items/weather').text)
      // def b = JsonOutput.prettyPrint(a)
      def temp = new Temp(dist: a[0].dist)
      render "<pre>${temp.dist}</pre>"
    }

    def registrar(RegistracionCommand cmd) {
      if (!cmd.hasErrors()) {
        pruebaService.registrar(cmd.username)
        render "ok"
      } else {
        render "hay errores=${cmd.errors}"
      }
    }

    def listar() {
      def a = [
        usuarios: Usuario.list(),
        administradores: Administrador.list(),
        empleados: Empleado.list(),
      ]
      render "${a}"
    }

    def crear() {
      new Usuario(username: 'pepito').save()
      new Administrador(
        username: 'pepito',
        nombre: 'nombre',
        apellido: 'apellido',
        matricula: 'matricula',
        edad: 20,
        email: 'email@email.com',
      ).save()
    }

    def index() {
      render """
        <b>hola</b> <br/>
        <b>como les va?</b> <br/>

        <marquee style="color: red; background-color: yellow;">esto es muy vintage</marquee>

        <br/>

        <p>hola ${params.nombre.replace('<', '&lt;')}</p>

        &lt;

        la hora actual es: ${new Date()}
      """
    }

    def index2() {
    }

    def index3(String nombre) {
      // codigo comprar
      redirect action: 'comprasteBien'
    }

    def comprasteBien() {
      render "bien papu"
    }

    def index4(Long id) {
      def administradores = Administrador.list()
      administradores = Administrador.findAllByNombre('cosso')
      administradores = Administrador.findByNombre('cosso')
      administradores = Administrador.findAllByNombreAndApellido('pablo', 'cosso')

      administradores = [Administrador.get(id)].grep()
      [administradores: administradores]
    }

    def index5(Long id) {
      def a = new Administrador(
        nombre: 'nombre',
        apellido: 'apellido',
        matricula: 'matricula',
        edad: 20,
        email: 'cosso@gmail.com',
      )
      a.save(failOnError: true)
      render "listo ${a} ${a.errors}"
    }
}
