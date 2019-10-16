package databaseclass;

import javax.ejb.EJB;
import javax.inject.Named;
import java.util.List;

@Named
public class LigneCommandeCtrl {

    @EJB
    private LigneCommandeDAO dao;

    public List<LigneCommande> findAll() {return dao.findAll();}
}
