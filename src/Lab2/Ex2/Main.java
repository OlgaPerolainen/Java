package Lab2.Ex2;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        First small algorithm: buying ice-cream while it is available
//        Creating an example of IceCream
        IceCream iceCream = new IceCream("Indman", "Jättis", Type.SOFT_SERVE, Flavor.CARAMEL, 150
                , true, 100, 4);
        System.out.println(iceCream);

        Scanner scanner = new Scanner(System.in);

//        Checking that ice-cream is available
        while (iceCream.isAvailable()) {
//          Offering ice-cream to a buyer
            System.out.println("Do you want to buy it? [y/n]: ");
            String answer = scanner.next();

//            Enquiring for quantity
            if (Objects.equals(answer, "y")) {
                System.out.println("Enter quantity: ");
                int neededQuantity = scanner.nextInt();

//                Checking that this quantity is available
                if (neededQuantity <= iceCream.getQuantity()) {

//                    Enquiring for buyer's sum of money
                    System.out.println("How much money do you have?");
                    int buyerMoney = scanner.nextInt();

//                    Buying ice-cream
                    if (buyerMoney / neededQuantity >= iceCream.getPrice()) {
                        System.out.println("You bought this ice-cream!");
                        iceCream.buy(neededQuantity);

//                    Offering discount for a buyer, setting new price
                    } else {
                        iceCream.calculateDiscountPrice(iceCream.getPrice() - buyerMoney / neededQuantity);
                        System.out.println("We offer a discount");
                        System.out.println("New price per ice-cream: " + iceCream.getPrice());
                        System.out.println("Do you want to buy it? [y/n]: ");
                        String answer2 = scanner.next();

//                        Buying ice-cream
                        if (Objects.equals(answer2, "y")) {
                            System.out.println("You bought this ice-cream!");
                            iceCream.buy(neededQuantity);
                        } else {
                            System.out.println("Pity.");
                            break;
                        }
                    }
                } else {
                    System.out.println("This quantity is not available.");
                    break;
                }
            } else {
                System.out.println("You haven't bought this ice-cream.");
                break;
            }
        }


//        Second small algorithm: creating ice-cream(s) with desired flavor and type; imitating a bill
//        Creating own ice-cream
        IceCream makingOwnIceCream = new IceCream("Indman", "Jättis", 120, true, 150);

//        Enquiring for flavor
        System.out.println("Do you want mint or chocolate ice-cream? Press 1 or 2: ");
        int choosingFlavor = scanner.nextInt();

//        Setting ice-cream flavor
        if (choosingFlavor == 1) {
            makingOwnIceCream.setFlavor(Flavor.MINT);
        } else {
            makingOwnIceCream.setFlavor(Flavor.CHOCOLATE);
        }

//        Enquiring for type
        System.out.println("Do you want soft serve ice-cream or escimo pie? Press 1 or 2: ");
        int choosingType = scanner.nextInt();

//        Setting ice-cream type
        if (choosingType == 1) {
            makingOwnIceCream.setType(Type.SOFT_SERVE);
        } else {
            makingOwnIceCream.setType(Type.ESKIMO_PIE);
        }

//        Enquiring for quantity
        System.out.println("Enter quantity: ");
        int wantedQuantity = scanner.nextInt();
        makingOwnIceCream.setQuantity(wantedQuantity);

//        Imitating a bill
        System.out.println(makingOwnIceCream);
        System.out.println("Total price: " + makingOwnIceCream.getPrice() * wantedQuantity);

//        Imitating a purchase
        makingOwnIceCream.buy(wantedQuantity);
        System.out.println("Thank you!");

//        Checking that "quantity" is 0 and "available" is false
        System.out.println(makingOwnIceCream);
    }
}
