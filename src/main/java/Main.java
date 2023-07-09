import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет! На скольких человек поделить счёт?");
        Calculator calc = new Calculator();
        calc.calcCountOfFriends();
        calc.insertProduct();
    }
}
