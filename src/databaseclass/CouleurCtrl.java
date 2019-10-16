package databaseclass;

import javax.ejb.EJB;
import javax.inject.Named;
import java.util.List;

@Named
public class CouleurCtrl {

    @EJB
    private CouleurDAO dao;

    public List<Couleur> findAll() {return dao.findAll();}
}
