package databaseclass;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Stock {
    private int idVetement;
    private String nomVetement;
    private int prix;
    private byte[] image;

    @Id
    @Column(name = "id_vetement", nullable = false)
    public int getIdVetement() {
        return idVetement;
    }

    public void setIdVetement(int idVetement) {
        this.idVetement = idVetement;
    }

    @Basic
    @Column(name = "nom_vetement", nullable = false, length = 50)
    public String getNomVetement() {
        return nomVetement;
    }

    public void setNomVetement(String nomVetement) {
        this.nomVetement = nomVetement;
    }

    @Basic
    @Column(name = "prix", nullable = false)
    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Basic
    @Column(name = "image", nullable = false)
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return idVetement == stock.idVetement &&
                prix == stock.prix &&
                Objects.equals(nomVetement, stock.nomVetement) &&
                Arrays.equals(image, stock.image);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(idVetement, nomVetement, prix);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }
}
