package beans;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Created by Alejandro on 5/12/2017.
 */

public class LoginBean {
    @NotNull
    @NotEmpty
    @Email
    private String usuario;
    @NotNull
    @NotEmpty
    private String password;

    public LoginBean() {
        super();
    }

    public LoginBean(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
