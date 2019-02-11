package hello;

import com.citrix.netscaler.nitro.resource.config.lb.lbvserver;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component("customSuccessHandler")
public class LoginSuccessHandler implements AuthenticationSuccessHandler {

    public LoginSuccessHandler() {
        lbvserver new_lbvserver_obj = new lbvserver();

    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        System.out.println("Login success !!" + authentication);
        response.setStatus(HttpServletResponse.SC_OK);
        response.sendRedirect("/hello");
    }
}
