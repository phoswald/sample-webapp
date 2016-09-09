package phoswald.sample.webapp;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class SampleRestApplication extends Application {

    public Set<Class<?>> getClasses() {
        return Collections.singleton(SampleRestResource.class);
    }
}
