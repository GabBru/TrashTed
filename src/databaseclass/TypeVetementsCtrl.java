package databaseclass;

import javax.ejb.EJB;
import javax.inject.Named;
import java.util.List;

@Named
public class TypeVetementsCtrl {

    @EJB
    private TypeVetementsDAO dao;

    public List<TypeVetements> findAll() {return dao.findAll();}
}
