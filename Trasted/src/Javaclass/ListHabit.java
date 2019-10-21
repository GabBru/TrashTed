package Javaclass;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;



    @Named
    @RequestScoped
   public class ListHabit {
        private ArrayList<Habit> list = new ArrayList<>();
        private Habit current = new Habit();
        private Habit modif = new Habit();

        public ListHabit (){
            list.add(new Habit ("Croptop", "Pull", 6, 4));
            list.add(new Habit ("Derolji", "Jeans", 34, 11));

        }

        public ArrayList<Habit> getList() {
            return list;
        }

        public String suppHabit(Habit h){
            for (int i=0; i<list.size();i++){
                boolean nom = h.getNom() == list.get(i).getNom();
                boolean type = h.getType() == list.get(i).getType();
                boolean prix = h.getQuantite() ==list.get(i).getQuantite();
                boolean quantite = h.getQuantite() == list.get(i).getQuantite();
                if (nom&&type&&prix&&quantite){
                    list.remove(i);}
            }
                return"adminPage";
            }

        public  String modifHabit(Habit h, Habit old){
            current.setNom(old.getNom());
            current.setPrix(old.getPrix());
            current.setQuantite(old.getQuantite());
            current.setType(old.getType());
            return "modifHabit";
        }
        public void add_vetement(Habit h){
            this.list.add(h);
            current = new Habit();
        }

        public Habit getCurrent() {
            return current;
        }

        public void setCurrent(Habit current) {
            this.current = current;
        }

        public Habit getModif() {
            return modif;
        }

        public void setModif(Habit modif) {
            this.modif = modif;
        }
    }


