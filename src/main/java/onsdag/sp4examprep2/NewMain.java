package onsdag.sp4examprep2;

import entity.Name;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Fen
 */
public class NewMain {

    public static void main(String[] args) {
        Persistence.generateSchema("pu", null);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        List<Name> names = em.createQuery("SELECT n FROM Name n", Name.class).getResultList();
        names.forEach((t) -> {System.out.println(t.getName() + " " + t.getSurname() + " " + t.getGender());
        });

    }

}
