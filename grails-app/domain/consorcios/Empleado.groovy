package consorcios

class Empleado {

    String nombre
    String apellido
    String cuil

    Dinero sueldo

    static embedded = ['sueldo']

    static constraints = {
    }
}
