package pl.maciejszczesny.calendar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.maciejszczesny.calendar.repositories.LoginRepository;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;


}
