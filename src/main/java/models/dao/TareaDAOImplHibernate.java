package models.dao;

import models.entities.Tarea;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Alejandro on 4/12/2017.
 */
public class TareaDAOImplHibernate extends GenericDAOImplHibernate<Tarea> implements IDaoTarea {

    public TareaDAOImplHibernate() {
        super();
    }

    @Override
    public List<Tarea> list(Long id) {
        Session session=this.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createSQLQuery("SELECT * FROM tareas WHERE id_usuario = "+id);
        List<Tarea> entities = query.list();
        session.getTransaction().commit();
        return entities;
    }
}
