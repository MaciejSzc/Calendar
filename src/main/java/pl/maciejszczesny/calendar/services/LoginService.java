package pl.maciejszczesny.calendar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.maciejszczesny.calendar.entities.LoginEntity;
import pl.maciejszczesny.calendar.forms.LoginForm;
import pl.maciejszczesny.calendar.repositories.LoginRepository;

import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;
    @Autowired
    LoginSession loginSession;

    public boolean login(LoginForm loginForm){
        Optional<LoginEntity> user = loginRepository.getUser(loginForm.getLogin(), loginForm.getPassword());

        if(user.isPresent()){
            loginSession.setLogin(true);
            loginSession.setUserId(user.get().getId());
            return true;
        }

        return false;
    }

    /*public void logout(){
        userSession.setLogin(false);
    }
*/
    public Optional<LoginEntity> getLoginUser(){

        return loginRepository.findById(loginSession.getUserId());
    }
}



