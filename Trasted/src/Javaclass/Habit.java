package Javaclass;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;



    @Named
    @RequestScoped
    public class Habit {
        private String nom;
        private String type;
        private Integer prix;
        public Habit (){}

        public Habit(String nom, String type, Integer prix) {
            this.nom = nom;
            this.type = type;
            this.prix = prix;
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

    }


