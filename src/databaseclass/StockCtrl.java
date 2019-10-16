package databaseclass;

import javax.ejb.EJB;
import javax.inject.Named;
import java.util.List;

@Named
public class StockCtrl {

    @EJB
    private StockDAO dao;

    public List<Stock> findAll() {return dao.findAll();}
}
