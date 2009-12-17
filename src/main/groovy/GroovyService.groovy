import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="groovyBean")
@RequestScoped
class GroovyService {
    String simpleProperty = "Nope, this is not a method!"

    def getMessage() {
        "Hello, Groovy World!"
    }
}
