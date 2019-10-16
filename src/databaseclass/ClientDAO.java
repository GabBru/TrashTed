package databaseclass;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class ClientDAO {

    // @PersistenceContext(unitName = "NewPersistenceUnit");
    // private EntityManager em;

    public List<Client> findAll(){
        EntityManagerFactory f = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em = f.createEntityManager();
        Query request = em.createQuery("select c from Client c");
        return request.getResultList();
    }
}