

public class Dog {
    private int age;
    private String name;
    private String color;

    public Dog() {this.age = 0;}
    public Dog(int age,String name,String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public void setColor(String c){
        color = c;
    }
    public void addOneAge(){age++;}
    public int birthday(){
        addOneAge();
        return age;
    }
    public String toString(){
        String s = "The dog is named " + name + " and is " + age + " years old. This dog is " + color;
        return s;
    }

}

