package templateMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CoffeeWithHook extends Coffee {
    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        System.out.println("Would you like milk and sugar with your coffee(y/n)?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer == null){
            return "no";
        }
        return answer;
    }
}
