package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int thousands = number / 1000;
        int hundreds = number % 1000 / 100;
        int tens = number % 100;
        int numbers = tens % 10;
        tens /= 10;

        System.out.println(thousands + hundreds + tens + numbers);
    }
}
