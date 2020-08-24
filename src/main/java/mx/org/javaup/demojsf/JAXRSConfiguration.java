package mx.org.javaup.demojsf;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import mx.org.javaup.demojsf.rs.ArticuloRS;

/**
 * Configures JAX-RS for the application.
 *
 * @author Juneau
 */
@ApplicationPath("rs")
public class JAXRSConfiguration extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(ArticuloRS.class);
        return classes;
    }

    @Override
    public Set<Object> getSingletons() {
        return super.getSingletons();
    }
}
