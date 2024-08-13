package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0)
            System.out.println("too much power");

        int counter = 0;
        int num = 1;
        while (counter <= power) {
            System.out.println(num);
            num = num * 2;
            counter++;
        }
    }
}
