package Lab7;

public class Plane {
    Wing wing = new Wing(45.5);
    Wing wing2 = new Wing(46);


    static class Wing {
        private double weight;
        public void showWeight(){
            System.out.println("Вес крыла составляет: " + weight + "т.");
        }
        public Wing(double weight){
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.wing.showWeight();
        plane.wing2.showWeight();
    }
}
