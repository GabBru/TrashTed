package databaseclass;

import javax.ejb.EJB;
import javax.inject.Named;
import java.util.List;

@Named
public class MarqueCtrl {

    @EJB
    private MarqueDAO dao;

    public List<Marque> findAll() {return dao.findAll();}
}
