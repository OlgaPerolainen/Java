package Lab6.Ex1_2;

public class Client extends Person {
    private String bankName;

    public Client() {
    }

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    void getInfo() {
        System.out.println("Банк: " + bankName);
        System.out.println("Фамилия: " + super.getLastName());
        System.out.println("Имя: " + super.getFirstName());
    }

    @Override
    public void welcome() {
        System.out.println("Добро пожаловать в наш банк!");
    }

    @Override
    public void goodBye() {
        System.out.println("Всего доброго!");
    }
}
