
package Lesson10.search;

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
    
    @Override
    public int compareTo(Object t) {
       int otherid = ((ISSStudent)t).getID();
       return id - otherid;
    }
}
