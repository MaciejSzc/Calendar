package pl.maciejszczesny.calendar.services;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Data
public class LoginSession {

        private  int userId;
        private  boolean isLogin;

}
