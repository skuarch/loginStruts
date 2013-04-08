package controller;

import com.opensymphony.xwork2.ActionSupport;
import model.beans.User;

/**
 *
 * @author skuarch
 */
public class LoginAction  extends ActionSupport{

    private static final long serialVersionUID = 1L;
    private User user = new User();
    private String name;
    private String password;   
    
    //==========================================================================
    @Override
    public String execute() throws Exception {        
        
        user.setName(name);
        user.setPassword(password);
        
        return SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
    
} // end class
