package Lab7;

public class Plane {
    private final Wing wing = new Wing(45.5);
    private final Wing wing2 = new Wing(46);

    public Wing getWing() {
        return wing;
    }

    public Wing getWing2() {
        return wing2;
    }

    static class Wing {
        private final double weight;

        public Wing(double weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Вес крыла составляет: " + weight + "т.";
        }
    }
}