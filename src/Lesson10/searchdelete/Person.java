
package Lesson10.searchdelete;

public class Person implements Comparable {
    private String name, gender;
    private int age;
    
    public Person(String n, String g, int a){
        name = n;
        gender = g;
        age = a;
    }
    public String getName(){
        return name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public int getAge(){
        return age;
    }
    
    public String toString(){
        return name + ": age " + age + " , " + gender;
    }

    @Override
    public int compareTo(Object t) {
        String othername = ((Person)t).getName();
        return name.compareTo(othername);
    }
}
