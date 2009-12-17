import groovy.util.GroovyTestCase

class GroovyServiceTest extends GroovyTestCase {

    void testServiceBean() {
        def bean = new GroovyService()
        assertEquals "Hello, Groovy World!", bean.getMessage()
        assertEquals "Nope, this is not a method!", bean.simpleProperty
    }

}

