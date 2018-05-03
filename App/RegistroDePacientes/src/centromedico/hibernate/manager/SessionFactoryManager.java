/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.hibernate.manager;

import centromedico.entities.Diagnostico;
import centromedico.entities.Medico;
import centromedico.entities.Paciente;
import centromedico.entities.User;
import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Grupo 7
 */
public abstract class SessionFactoryManager {

    public SessionFactoryManager() {
    }
    
    public static SessionFactory getSessionFactory() throws HibernateException{
    
        Configuration config = new Configuration();
        
        Properties hibernateProperties = new Properties();
        hibernateProperties.put("hibernate.connection.driver_class", "org.h2.Driver");
        hibernateProperties.put("hibernate.connection.url", "jdbc:h2:" + "./Database/centromedico");
        hibernateProperties.put("hibernate.connection.username", "sa");
        hibernateProperties.put("hibernate.connection.password", "");
        hibernateProperties.put("hibernate.hbm2ddl.auto","update");
        hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        hibernateProperties.put("hibernate.show_sql", "true");
        
        config.setProperties(hibernateProperties);
        
        config.addAnnotatedClass(Paciente.class);
        config.addAnnotatedClass(Medico.class);
        config.addAnnotatedClass(User.class);
        config.addAnnotatedClass(Diagnostico.class);
        
        StandardServiceRegistryBuilder builder = 
                new StandardServiceRegistryBuilder().applySettings(config.getProperties());

        SessionFactory factory = config.buildSessionFactory(builder.build());
        
        return factory;
    }
}
