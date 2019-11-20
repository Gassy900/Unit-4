
package Lesson10.searchdelete;

import static Lesson10.searchdelete.InsertDeleteFruit.logicalSize;
import java.util.Scanner;

public class InsertDeletePerosn {

    static int logicalsSize = 0;
   
    public static void main(String[] args) {

        Person peeps[] = new Person[10];
        peeps[0] = new Person("Andy","male",23);
        peeps[1] = new Person("Cindy","Female",31);
        peeps[2] = new Person("Fred","male",54);
        peeps[3] = new Person("Sue","female",18);
        logicalSize = 4;
        showPerson(peeps);
        System.out.println("Inserting meg(female 27)");
        Person p = new Person("Meg","female",27);
        int loc = findInsertPoint(peeps,p);
        insert(peeps,p,loc);
        showPerson(peeps);
        System.out.println("Inserting Lenord");
        p = new Person("Leonard", "male", 38);
        loc = findInsertPoint(peeps,p);
        insert(peeps,p,loc);
        showPerson (peeps);
    }
    
    public static void showPerson(Object arr[]){
        System.out.println("---------------");
        for (int i = 0; i < logicalSize; i++) {
            System.out.print(arr[i]+",");
            
        }
        System.out.println("---------------------------");
    }

    public static int search(Object[] a, Object searchValue) {
        int left = 0;
        int right = logicalSize - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a[midpoint]).compareTo(searchValue);
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

//////////////////////////////////////////////////////////////////////////////////
    public static boolean insert(Object array[], Object newItem, int targetIndex) {
        // Check for a full array and return false if full
        if (logicalSize == array.length) {
            return false;
        }
        // Check for valid target index or return false 
        if (targetIndex < 0 || targetIndex > logicalSize) {
            return false;
        }
        // Shift items down by one position
        for (int i = logicalSize; i > targetIndex; i--) {
            array[i] = array[i - 1];
        }
        // Add new item, increment logical size,return true                       
        array[targetIndex] = newItem;
        logicalSize++;
        return true;
    }

//////////////////////////////////////////////////////////////////////////////////
    public static boolean delete(Object array[], int targetIndex) {
        if (targetIndex < 0 || targetIndex >= logicalSize) {
            return false;
        }

        // Shift items up by one position
        for (int i = targetIndex; i < logicalSize - 1; i++) {
            array[i] = array[i + 1];
        }

        // Decrement logical size and return true 
        logicalSize--;
        return true;
    }

/////////////////////////////////////////////////////////////////////////////////
    public static int findInsertPoint(Object a[], Object searchValue) {
        int left = 0;
        int right = logicalSize - 1;
        int midpoint = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;

            int result = ((Comparable) a[midpoint]).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (((Comparable) a[midpoint]).compareTo(searchValue) < 0) {
            midpoint++;
        }
        return midpoint;
    }

}

    

