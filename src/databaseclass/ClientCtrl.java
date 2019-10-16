package databaseclass;

import javax.ejb.EJB;
import javax.inject.Named;
import java.util.List;

@Named
public class ClientCtrl {

    @EJB
    private ClientDAO dao;

    public List<Client> findAll() {return dao.findAll();}
}
