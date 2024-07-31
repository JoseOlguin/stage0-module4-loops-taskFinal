package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int acc = 1;
        for (int i = 1; i <= power; i++) {
            acc *= numberToPrint;
        }
        System.out.println(acc);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
