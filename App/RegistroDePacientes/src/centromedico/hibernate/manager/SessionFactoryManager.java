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
 * Clase abstracta que va a ser utilizada para realizar la conexión con la base de datos
 * en este caso la base de datos es h2, la misma se define en las propiedades de
 * hibernate definiendo el driver, la url de la base de datos, el usuario, la contraseña y
 * en que motor de base de datos se va a guardar
 */
public abstract class SessionFactoryManager {

    public SessionFactoryManager() {
    }
    
    public static SessionFactory getSessionFactory() throws HibernateException{
    
        Configuration config = new Configuration();
        
        Properties hibernateProperties = new Properties();
        hibernateProperties.put("hibernate.connection.driver_class", "org.h2.Driver"); //Driver
        hibernateProperties.put("hibernate.connection.url", "jdbc:h2:" + "./Database/centromedico"); //ruta bdd
        hibernateProperties.put("hibernate.connection.username", "sa"); //usuario
        hibernateProperties.put("hibernate.connection.password", ""); //contraseña
        //se utiliza la propiedad hb2ddl.auto para que el framework hibernate decida si crear las tablas
        //con la propiedad "create" o buscar si ya existen las tablas con la propiedad "update", que si no
        //existen las tablas en la bdd las crea
        hibernateProperties.put("hibernate.hbm2ddl.auto","update"); 
        hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect"); //motor de bdd
        hibernateProperties.put("hibernate.show_sql", "true"); //muestra la inyeccion de sql realizada por hibernate en la consola
        
        config.setProperties(hibernateProperties); //setea las propiedades
        
        //Le decimos a hibernate cuales son las clases con anotaciones
        config.addAnnotatedClass(Paciente.class); 
        config.addAnnotatedClass(Medico.class);
        config.addAnnotatedClass(User.class);
        config.addAnnotatedClass(Diagnostico.class);
        
        //Creamos un builder con las propiedades de hibernate
        StandardServiceRegistryBuilder builder = 
                new StandardServiceRegistryBuilder().applySettings(config.getProperties());

        //Creamos el SessionFactory a ser retornado que es el que nos va a permitir realizar la conexión
        SessionFactory factory = config.buildSessionFactory(builder.build());
        
        return factory;
    }
}
