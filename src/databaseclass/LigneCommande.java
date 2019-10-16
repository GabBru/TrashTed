package databaseclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "LIGNE_COMMANDE", schema = "9A6bZzn9dl", catalog = "")
public class LigneCommande {
    private int idLigne;

    @Id
    @Column(name = "id_ligne", nullable = false)
    public int getIdLigne() {
        return idLigne;
    }

    public void setIdLigne(int idLigne) {
        this.idLigne = idLigne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LigneCommande that = (LigneCommande) o;
        return idLigne == that.idLigne;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLigne);
    }
}
