package consorcios

class Edificio {

    String direccion
    Administrador administrador
    Set<UnidadFuncional> unidadesFuncionales = []
    Set<Contrato> contratos = []

    static hasMany = [
      unidadesFuncionales: UnidadFuncional,
      contratos: Contrato,
    ]

    static constraints = {
      direccion blank: false, nullable: false
    }
}
