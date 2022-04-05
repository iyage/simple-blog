

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SpringSecurityInilializer extends AbstractSecurityWebApplicationInitializer {
    public SpringSecurityInilializer() {
        super(SecurityConfig.class);
    }
}
