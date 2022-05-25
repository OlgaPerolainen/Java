package Lab6.Ex1_2;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Иван", "Иванов", "Сбербанк");
        client.Welcome();
        client.getInfo();
        client.GoodBye();

        Person clerk = new Clerk("Петр", "Петров", "ВТБ");
        clerk.Welcome();
        clerk.getInfo();
        clerk.GoodBye();
    }
}
