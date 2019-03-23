package pl.maciejszczesny.calendar.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "user")
public class LoginEntity {
    private @Id @GeneratedValue int id;
    private String login;
    private  String password;
}
