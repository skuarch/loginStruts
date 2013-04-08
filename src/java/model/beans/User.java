package model.beans;

import java.io.Serializable;

/**
 *
 * @author skuarch
 */
public class User implements Serializable {

    private String name;
    private String password;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "name: " + name + " password: " + password;
    }
} // end 
