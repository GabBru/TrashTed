package Javaclass;

import com.sun.codemodel.internal.JForEach;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ManageStock {
    private boolean trouve;
    private ListHabit list;

    public ManageStock(){
    }

    public void updateDownStock(ListHabit list_habit, String nom_habit, Integer nombre_commande){
        for (Habit h : list_habit.getList()
             ) {
            if (h.getNom().equals(nom_habit)) {
                h.setQuantite(h.getQuantite() - nombre_commande);
            }
        }
    }

    public void updateUpStock(ListHabit list_habit, String nom_habit, Integer nombre_commande){
        for (Habit h : list_habit.getList()
        ) {
            if (h.getNom().equals(nom_habit)) {
                h.setQuantite(h.getQuantite() + nombre_commande);
            }
        }
    }
}
