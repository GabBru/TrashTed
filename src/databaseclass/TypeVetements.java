package databaseclass;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TYPE_VETEMENTS", schema = "9A6bZzn9dl", catalog = "")
public class TypeVetements {
    private int idType;
    private String nomType;

    @Id
    @Column(name = "id_type", nullable = false)
    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    @Basic
    @Column(name = "nom_type", nullable = true, length = 50)
    public String getNomType() {
        return nomType;
    }

    public void setNomType(String nomType) {
        this.nomType = nomType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeVetements that = (TypeVetements) o;
        return idType == that.idType &&
                Objects.equals(nomType, that.nomType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idType, nomType);
    }
}
