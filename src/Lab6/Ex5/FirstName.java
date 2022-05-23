package Lab6.Ex5;

public class FirstName extends Age{
    String firstName;
    @Override
    public void getInfo() {
        System.out.println("Введите имя: ");
        firstName = super.getAnswer();
    }

    @Override
    public String toString() {
        return "Ваше имя: " + firstName;
    }
}
