package util;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

/**
 * Created by Alejandro on 4/12/2017.
 */



    public class HibernateUtil {
        private static final SessionFactory sessionFactory = buildSessionFactory();
        private static SessionFactory buildSessionFactory() {
            try {
                // Create the SessionFactory from hibernate.cfg.xml
                return new Configuration().configure().configure().buildSessionFactory();
            } catch (Throwable ex) {
                // Make sure you log the exception, as it might be swallowed
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }

        public static SessionFactory getSessionFactory() {
            return sessionFactory;
        }
}
