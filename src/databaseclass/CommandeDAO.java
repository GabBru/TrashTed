package databaseclass;

import sun.lwawt.macosx.CPrinterDevice;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class CommandeDAO {
    public List<Commande> findAll(){
        EntityManagerFactory f = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em = f.createEntityManager();
        Query request = em.createQuery("select cmd from Commande cmd");
        return request.getResultList();
    }
}
