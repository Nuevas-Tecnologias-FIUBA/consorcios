package consorcios

class Administrador {

    String nombre
    String apellido
    String matricula
    Integer edad
    String email

    Set<Edificio> edificios = []

    static hasMany = [
      edificios: Edificio,
    ]

    static constraints = {
      nombre blank: false, nullable: false
      apellido blank: false, nullable: false
      matricula blank: false, nullable: false
      edad nullable: false, min: 18
      email nullable: false, email: true
    }
}
