package databaseclass;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class LigneCommandeDAO {

    public List<LigneCommande> findAll(){
        EntityManagerFactory f = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em = f.createEntityManager();
        Query request = em.createQuery("select lcmd from LigneCommande lcmd");
        return request.getResultList();
    }
}
