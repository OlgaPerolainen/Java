package Lab6.Ex5;

import java.util.Scanner;

public class Age {
    int age;
    public void getInfo(){
        System.out.println("Введите возраст: ");
        age = Integer.parseInt(getAnswer());
    }
    protected String getAnswer(){
        return new Scanner(System.in).next();
    }
    @Override
    public String toString() {
        return "Ваш возраст: " + age;
    }
}
