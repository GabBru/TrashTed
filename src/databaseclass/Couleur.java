package databaseclass;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Couleur {
    private int idCouleur;
    private String nomCouleur;

    @Id
    @Column(name = "id_couleur", nullable = false)
    public int getIdCouleur() {
        return idCouleur;
    }

    public void setIdCouleur(int idCouleur) {
        this.idCouleur = idCouleur;
    }

    @Basic
    @Column(name = "nom_couleur", nullable = true, length = 50)
    public String getNomCouleur() {
        return nomCouleur;
    }

    public void setNomCouleur(String nomCouleur) {
        this.nomCouleur = nomCouleur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Couleur couleur = (Couleur) o;
        return idCouleur == couleur.idCouleur &&
                Objects.equals(nomCouleur, couleur.nomCouleur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCouleur, nomCouleur);
    }
}
