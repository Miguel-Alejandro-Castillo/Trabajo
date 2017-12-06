package models.bo;

import models.dao.IDaoUsuario;
import models.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;

/**
 * Created by Alejandro on 5/12/2017.
 */
public class UsuarioBO {
    @Autowired
    IDaoUsuario daoUsuario;
    public Usuario get(String usuario, String password) {
        List<Usuario> usuarios=daoUsuario.list();
        for(Usuario u : usuarios) {
            if (u.getEmail().equals(usuario) && u.getPassword().equals(password))
                return u;
        }
        return null;
    }

    public void save(Usuario usuario) {
        daoUsuario.save(usuario);
    }

    public Usuario get(Long id_usuario) {
        return daoUsuario.get(id_usuario);
    }
}
