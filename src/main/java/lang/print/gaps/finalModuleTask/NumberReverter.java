package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundreds = number / 100;
        int tens = number % 100;
        int numbers = tens % 10;
        tens -= numbers;
        tens /= 10;

        System.out.print(numbers);
        System.out.print(tens);
        System.out.print(hundreds);
    }
}
