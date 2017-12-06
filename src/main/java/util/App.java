package util;

import models.dao.UsuarioDAOImplHibernate;
import models.entities.Usuario;

/**
 * Created by Alejandro on 4/12/2017.
 */
public class App {

    public static void main(String[] args) {
         UsuarioDAOImplHibernate dao = new  UsuarioDAOImplHibernate();

        // Add new user
        Usuario user = new Usuario();
        user.setEmail("daniel@example.com");
        user.setEmail("daniel@updatedJdbc.com");
        dao.save(user);


    }

}