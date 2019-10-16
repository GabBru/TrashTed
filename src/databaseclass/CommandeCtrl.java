package databaseclass;

import javax.ejb.EJB;
import javax.inject.Named;
import java.util.List;

@Named
public class CommandeCtrl {

    @EJB
    private CommandeDAO dao;

    public List<Commande> findAll() {return dao.findAll();}
}