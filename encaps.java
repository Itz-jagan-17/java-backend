class human {
    private int age;
    private String name;
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age =a;
 
    }
    
    public String getName(){
        return name;

    }
    public void setName(String n) {
        name = n;
    }
}
public class encaps {
    public static void main(String[] args) {
        human obj =new human();
        obj.setAge( 30);
        obj.setName("jagan ");
        System.out.println(obj.getName() + " :" + obj.getAge());
    }
}
