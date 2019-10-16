package databaseclass;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Commande {
    private int idCommande;
    private int facture;

    @Id
    @Column(name = "id_commande", nullable = false)
    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    @Basic
    @Column(name = "facture", nullable = false)
    public int getFacture() {
        return facture;
    }

    public void setFacture(int facture) {
        this.facture = facture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commande commande = (Commande) o;
        return idCommande == commande.idCommande &&
                facture == commande.facture;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCommande, facture);
    }
}
