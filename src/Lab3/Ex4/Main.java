package Lab3.Ex4;

public class Main {
    public static void main(String[] args) {
        Tree oak = new Tree("oak", 120.5);
        System.out.println(oak);

        Tree birch = new Tree("birch tree", 33, true);
        System.out.println(birch);

        Tree cottonwood = new Tree();
        System.out.println(cottonwood);
    }
}
