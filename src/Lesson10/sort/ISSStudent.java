
package Lesson10.sort;

import Lesson10.search.*;

public class ISSStudent implements Comparable{
    private String name, address;
    private int id;
    
    public ISSStudent(String n, String a, int i){
        name = n;
        address = a;
        id = i;
    }
    
    public String toString(){
        String str = "Name: " + name;
        str+="\nAddress: "+ address;
        str+="\nID: " + id + "\n-----------------";
        return str;
    }

    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public int compareTo(Object t) {
       String othername = ((ISSStudent)t).getName();
       return name.compareTo(othername);
    }
}
