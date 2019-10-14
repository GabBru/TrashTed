package VetementManager;

import javax.annotation.PostConstruct;
import javax.faces.annotation.ManagedProperty;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
public class DataGridViewVet implements Serializable {

    private List<Vetement> vetementList;

    private Vetement selectedVet;

    @ManagedProperty("#{vetService}")
    private VetService service;

    @PostConstruct
    public void init() {
        vetementList = service.createCars(48);
    }

    public List<Vetement> getVetementList() {
        return vetementList;
    }

    public void setService(VetService service) {
        this.service = service;
    }

    public Vetement getSelectedVet() {
        return selectedVet;
    }

    public void setSelectedVet(Vetement selectedVet) {
        this.selectedVet = selectedVet;
    }
}
