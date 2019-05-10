package consorcios

class Empleado extends Usuario {

    String nombre
    String apellido
    String cuil

    Dinero sueldo

    static embedded = ['sueldo']

    static constraints = {
    }
}
