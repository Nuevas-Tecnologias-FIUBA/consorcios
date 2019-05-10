// Place your Spring DSL code here
import consorcios.*

beans = {
  generadorMail(GeneradorMail) {
    formato = 'html'
  }

  mailSender(MailSender) {
    usuario = 'usuario'
    contraseña = 'dasdsad'
    port = 100
    ssl = true
    generadorMail = ref('generadorMail')
  }
}
