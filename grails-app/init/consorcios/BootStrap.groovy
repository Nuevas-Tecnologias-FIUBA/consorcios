package consorcios

class BootStrap {

    def init = { servletContext ->
      // (1..1000).each {
      //   def a = new Administrador(
      //     nombre: "nombre ${it}",
      //     apellido: 'apellido',
      //     matricula: 'matricula',
      //     edad: 20,
      //     email: 'cosso@gmail.com',
      //   )
      //   a.save(failOnError: true)
      // }
    }
    def destroy = {
    }
}
