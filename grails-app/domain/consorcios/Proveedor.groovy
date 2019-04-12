package consorcios

class Proveedor {

    String razonSocial
    String rubro
    String cuit

    Set<Contrato> contratos = []
    static hasMany = [
      contratos: Contrato,
    ]

    static constraints = {
    }
}
