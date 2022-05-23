package Lab6.Ex1_2;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Иван", "Иванов", "Сбербанк");
        client.getInfo();

        Person clerk = new Clerk("Петр", "Петров", "ВТБ");
        clerk.getInfo();
    }
}
