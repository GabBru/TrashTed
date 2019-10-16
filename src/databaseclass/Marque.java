package databaseclass;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Marque {
    private int idMarque;
    private String nomMarque;

    @Id
    @Column(name = "id_marque", nullable = false)
    public int getIdMarque() {
        return idMarque;
    }

    public void setIdMarque(int idMarque) {
        this.idMarque = idMarque;
    }

    @Basic
    @Column(name = "nom_marque", nullable = true, length = 50)
    public String getNomMarque() {
        return nomMarque;
    }

    public void setNomMarque(String nomMarque) {
        this.nomMarque = nomMarque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marque marque = (Marque) o;
        return idMarque == marque.idMarque &&
                Objects.equals(nomMarque, marque.nomMarque);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMarque, nomMarque);
    }
}
