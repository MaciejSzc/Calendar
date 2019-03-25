package pl.maciejszczesny.calendar.forms;

import lombok.Data;

@Data
public class LoginForm {
    private int id;
    private String login;
    private String password;
    private String email;
}
