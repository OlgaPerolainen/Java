package Lab7;

public class Plane {
    private final Wing leftWing = new Wing(45.5);
    private final Wing rightWing = new Wing(46);

    public Wing getLeftWing() {
        return leftWing;
    }

    public Wing getRightWing() {
        return rightWing;
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