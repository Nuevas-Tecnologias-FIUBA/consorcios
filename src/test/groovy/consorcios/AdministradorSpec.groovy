package consorcios

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class AdministradorSpec extends Specification implements DomainUnitTest<Administrador> {

    def setup() {
    }

    def cleanup() {
    }

    void "test un administrador que ya administra 3 edificios cuando intento que adminstre un cuarto falla"() {
      when:
        Administrador adm = new Administrador(username: 'juan carlos')
        Edificio e1 = new Edificio(direccion: 'paseo colon 850')
        Edificio e2 = new Edificio(direccion: 'paseo colon 851')
        Edificio e3 = new Edificio(direccion: 'paseo colon 852')
        Edificio e4 = new Edificio(direccion: 'paseo colon 853')

        adm.administrar(e1)
        adm.administrar(e2)
        adm.administrar(e3)

        assert adm.edificios.size() == 3

        adm.administrar(e4)
      then:
        IllegalStateException ex = thrown()
    }
}
