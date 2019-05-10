package consorcios

class GeneradorMail {

  String formato

  String get() {
    "formato del mail ${formato}"
  }
}

class MailSender {

  String usuario
  String contraseña
  Integer port
  boolean ssl
  def generadorMail

  String send(String email, String mensaje, String hostname) {
    println "enviando mail a ${email} ${mensaje} ${generadorMail.get()}"
  }
}
