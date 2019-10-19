package Javaclass;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;


    @Named
    @SessionScoped
   public class ListHabit implements Serializable {
        protected static final Logger LOGGER = Logger.getLogger(ListHabit.class.getName());
        private Habit
                habit1 = new Habit("Croc","Pull",6);
        private ArrayList<Habit> liste = new ArrayList<>();

        public ArrayList<Habit> getListe() {
            return liste;
        }

        public ListHabit (){
            liste.add(habit1);

        }
    }

