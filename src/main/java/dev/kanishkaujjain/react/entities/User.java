package dev.kanishkaujjain.react.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@NoArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(nullable = false, length = 255)
    private String emailid;

    @Column(nullable = false, length = 255)
    private String pass;

    @Column(nullable = false, length = 255)
    private String fname;

    @Column(nullable = false, length = 255)
    private String lname;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "User{" +
                "username=" + emailid +
                ", password='" + pass + '\'' +
                ", firstName='" + fname + '\'' +
                ", lastName='" + lname + '\'' +
                '}';
    }
}
