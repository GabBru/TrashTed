package Javaclass;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;

   @Named
   @RequestScoped
   public class ListHabit {
        private ArrayList<Habit> list = new ArrayList<>();
        private Habit current;

        public ListHabit (){
            list.add(new Habit ("UglyCroptop", "Pull", 69, 40, "crop-top-homme.jpg"));
            list.add(new Habit ("UglyJeans", "Jeans", 340, 101, "Kapital-899-d.jpg"));
            list.add(new Habit ("UglyShoes", "Chaussures", 500, 234, "1134568_w767h767c1cx296cy296.jpg"));
            current = new Habit();
        }

        public ArrayList<Habit> getList() {
            return list;
        }

        public void add_vetement(Habit h) {
            this.list.add(h);
            current = new Habit();
        }

        public String getPathToImg(String name) {
            for (Habit h : this.getList()
                 ) {
                if (h.getNom().equals(name)){
                    return ("#{request.contextPath}/resources/images/" + h.getNom_img());
                }
            }
            return "#{request.contextPath}/resources/images/crop-top-homme.jpg";
        }
    }

