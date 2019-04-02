package consorcios

class PruebaController {

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
