import java.util.Random;

public class NumberInfo {
    public static void main(String[] args) {

        Random random = new Random();
        int randomInt = random.nextInt(10000);
        System.out.println("Wylosowana liczba : " + randomInt);

        NumbersUtils numbersUtils = new NumbersUtils();
        numbersUtils.compareNumberAndPrint(randomInt,5000);
        numbersUtils.printAddOrEven(randomInt);
    }

}
