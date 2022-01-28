public class NumbersUtils {

    void compareNumberAndPrint(int number, int compareTo) {
        if (number == compareTo)
            System.out.println("Liczba jest równa " + compareTo);
        else if (number > compareTo)
            System.out.println(number + " liczba jest większa " + compareTo);
        else
            System.out.println(number + " liczba jest mniejsza " + compareTo);
    }

    void printAddOrEven(int number) {
        if (number % 2 == 0)
            System.out.println(number+" jest liczbą parzystą");
        else
            System.out.println(number+" jest liczbą nieparzystą");
    }
}
