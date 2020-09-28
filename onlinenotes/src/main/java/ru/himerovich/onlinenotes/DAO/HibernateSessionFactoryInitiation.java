package ru.himerovich.onlinenotes.DAO;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import ru.himerovich.onlinenotes.models.Note;

public class HibernateSessionFactoryInitiation {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryInitiation(){}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Note.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                System.out.println("Error in SessionFactory: " + e);
            }
        }
        return sessionFactory;
    }
}
