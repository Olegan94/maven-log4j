package calculator;

import calculator.Calculator;
import java.util.Scanner;

/**
 *
 * @author smw
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        while(true)
        {
            System.out.println("Калькулятор");

            Calculator calc = new Calculator();
            double result = 0;

            Scanner in = new Scanner(System.in);

            System.out.println("Число a");
            calc.setA(in.nextDouble());

            System.out.println("Действие");
            String action = in.next();

            System.out.println("Число b");
            calc.setB(in.nextDouble());

            switch(action.charAt(0))
            {
                case '+':
                    result = calc.plus();
                    break;
                case '-':
                    result = calc.minus();
                    break;
                case '/':
                    result = calc.division();
                    break;
                case '*':
                    result = calc.multiply();
                    break;
            }
            System.out.println("Резултат: " + result);
        }
    }
}
