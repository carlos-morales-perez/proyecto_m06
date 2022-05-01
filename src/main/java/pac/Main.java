package pac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio");

        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session s = sf.openSession();

        System.out.println("Conexion a la BBDD configurada.");
    }
}

