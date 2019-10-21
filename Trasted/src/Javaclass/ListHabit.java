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

        public ListHabit (){
            list.add(new Habit ("Croptop", "Pull", 6, 4));
            list.add(new Habit ("Derolji", "Jeans", 34, 11));
        }

        public ArrayList<Habit> getList() {
            return list;
        }

    }

