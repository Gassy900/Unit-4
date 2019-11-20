package Lesson10.searchdelete;

import static Lesson10.searchdelete.InsertDeleteFruit.logicalSize;
import static Lesson10.searchdelete.InsertDeletePerosn.findInsertPoint;
import static Lesson10.searchdelete.InsertDeletePerosn.insert;
import static Lesson10.searchdelete.InsertDeletePerosn.showPerson;
import java.util.ArrayList;

public class ArrayListPerson {

    public static void main(String[] args) {
        ArrayList<Person> peeps = new ArrayList();
        peeps.add(new Person("Andy","male",23));
        peeps.add(new Person("Cindy","Female",31));
        peeps.add(new Person("Fred","male",54));
        peeps.add(new Person("Sue","female",18));
         System.out.println("Inserting meg(female 27)");
        Person p = new Person("Meg","female",27);
        int loc = findInsertPoint(peeps,p);
        peeps.add(loc,p);
        showPerson(peeps);
        System.out.println("Inserting Lenord");
        p = new Person("Leonard", "male", 38);
        loc = findInsertPoint(peeps,p);
        peeps.add(loc,p);
        showPerson (peeps);
        
        System.out.println("Removing Fred");
        p = new Person("Fred","",0);
        loc = search(peeps,p);
        peeps.remove(loc);
        showPerson(peeps);
    }
    
    public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size()-1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;

    }
    
      public static void showPerson(ArrayList arr){
        System.out.println("---------------");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
            
        }
        System.out.println("---------------------------");
    }
      public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midpoint = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;

            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (((Comparable) a.get(midpoint)).compareTo(searchValue) < 0) {
            midpoint++;
        }
        return midpoint;
    }
}
