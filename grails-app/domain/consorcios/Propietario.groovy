package consorcios

@groovy.transform.EqualsAndHashCode(includes=['dni', 'sexo'])
class Propietario {

    String nombre
    String apellido
    String piso
    String departamento
    String dni
    String sexo

    Set<UnidadFuncional> unidadesFuncionales
    static hasMany = [
      unidadesFuncionales: UnidadFuncional,
    ]

    static constraints = {
    }
}
