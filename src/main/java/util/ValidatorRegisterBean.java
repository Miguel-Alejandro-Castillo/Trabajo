package util;

import beans.UsuarioBean;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Alejandro on 6/12/2017.
 */
@Component
public class ValidatorRegisterBean implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        //just validate the Customer instances
        return UsuarioBean.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        /*.rejectIfEmptyOrWhitespace(errors, "password",
                "ingrese contraseña", "Field name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password_test",
                "confirme contraseña", "Field name is required.");
         */
        UsuarioBean usuario = (UsuarioBean)o;

        if(!(usuario.getPassword().equals(usuario.getPassword_test()))){
            errors.rejectValue("password_test", "passwords.incorrectas");
        }
    }
}
