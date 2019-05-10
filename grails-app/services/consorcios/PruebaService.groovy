package consorcios

import grails.gorm.transactions.Transactional

@Transactional
class PruebaService {

    def mailSender

    def registrar(String username) {
      Usuario usuario = new Usuario(username: username).save()
      mailSender.send(usuario.username, 'bienvenido', 'google')
      usuario
    }

    def recuperarContrasena(String email) {
      mailSender.send(usuario.username, 'tu contraseña es tal', 'google')
    }
}
