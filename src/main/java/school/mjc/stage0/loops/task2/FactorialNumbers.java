package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int counter = 0;
        int total = 1;
        while (counter <= printToInclusive) {
            if (counter > 0)
                total *= counter;

            System.out.println(total);
            counter++;
        }
    }
}
