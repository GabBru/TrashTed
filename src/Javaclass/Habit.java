package Javaclass;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.File;

@Named
@RequestScoped
public class Habit {
    private String nom;
    private String type;
    private Integer prix, quantite;
    private String nom_img;

    public Habit() {
    }

    public Habit(String nom, String type, Integer prix, Integer quantite, String nom_img) {
        this.nom = nom;
        this.type = type;
        this.prix = prix;
        this.quantite = quantite;
        this.nom_img = nom_img;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public String getNom_img() {
        return ("/resources/images/" + nom_img);
    }

    public void setNom_img(String nom_img) {
        this.nom_img = nom_img;
    }
}