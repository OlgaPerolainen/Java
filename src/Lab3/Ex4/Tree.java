package Lab3.Ex4;

public class Tree {
    private String name;
    private double age;
    private boolean isAlive;

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал.");
    }

    public Tree (String name, double age){
        this.name = name;
        this.age = age;
    }

    public Tree(String name, double age, boolean isAlive){
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        return "Tree" + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Is alive: " + isAlive
                ;
    }
}
