package org.example.hyber;

import org.example.models.Buy;
import org.example.models.Product;
import org.example.models.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Session {
    private static SessionFactory sessionFactory;

    private Session(){
    }

    public static SessionFactory getSessionFactory(){
        if (sessionFactory == null){
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(User.class);
                configuration.addAnnotatedClass(Product.class);
                configuration.addAnnotatedClass(Buy.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySetting(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            }catch (Exception e){
                System.out.println("Исключение " + e);
            }
        }
        return sessionFactory;
    }
}
