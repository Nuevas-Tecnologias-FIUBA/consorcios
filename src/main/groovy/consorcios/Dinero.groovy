package consorcios

@groovy.transform.ToString
@groovy.transform.EqualsAndHashCode
class Dinero {

  // value object
  // Long, Integer, String, BigDecimal, Float, Double, Char, Boolean

  enum Moneda {
    PESOS,
    DOLARES,
  }

  final Moneda moneda
  final BigDecimal monto

  Dinero(Moneda moneda, BigDecimal monto) {
    if (monto < 0) throw new IllegalArgumentException("no")
    this.moneda = moneda
    this.monto = monto
  }

  Dinero plus(Dinero otro) {
    if (this.moneda != otro.moneda) throw new IllegalArgumentException("jodete")
    new Dinero(this.moneda, this.monto + otro.monto)
  }

  Dinero minus(Dinero otro) {
    if (this.moneda != otro.moneda) throw new IllegalArgumentException("jodete")
    new Dinero(this.moneda, this.monto - otro.monto)
  }
}
