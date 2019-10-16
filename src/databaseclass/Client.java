package databaseclass;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Client {
    private int idClient;
    private String nomClient;
    private String adresse;

    @Id
    @Column(name = "id_client", nullable = false)
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    @Basic
    @Column(name = "nom_client", nullable = false, length = 50)
    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    @Basic
    @Column(name = "adresse", nullable = false, length = 100)
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return idClient == client.idClient &&
                Objects.equals(nomClient, client.nomClient) &&
                Objects.equals(adresse, client.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient, nomClient, adresse);
    }
}
