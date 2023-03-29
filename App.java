import java.util.Scanner;

public class App{
    
    private static final Scanner inputScanner = new Scanner(System.in);
    private static String getString(String prompt){
        System.out.println(prompt);
        String inputString = inputScanner.nextLine();
        return inputString;
    }
    private static double getDouble(String prompt){
        System.out.println(prompt);
        double inputDouble = inputScanner.nextDouble();
        inputScanner.nextLine();
        return inputDouble;
    }
    public static void main(String[] args){
        while(true){
            Calculator calc = new Calculator();
            String operation = getString("\nWhat would you like to do? \n*add \n*subtract \n*multiply \n*divide \n*exit \n");
            if (operation.equals("exit")){
                System.out.println("Goodbye!");
                break;
            }
            if(operation.equals("add") || operation.equals("subtract") 
                || operation.equals("multiply") || operation.equals("divide")){
                double num1 = getDouble("\nInput first number");
                double num2 = getDouble("\nInput second number");
                if (operation.equals("add")){
                    double sum = calc.add(num1, num2);
                    System.out.println("\nResult: " + sum);
                    //continue;
                }
                if (operation.equals("subtract")){
                    double difference = calc.subtract(num1, num2);
                    System.out.println("\nResult: " + difference);
                    //continue;
                }
                if (operation.equals("multiply")){
                    double product = calc.multiply(num1, num2);
                    System.out.println("\nResult: " + product);
                    //continue;
                }
                if (operation.equals("divide")){
                    if(num2 == 0){
                        System.out.println("\nDividing by 0 will break math. Can't do it.");
                        continue;
                    }
                    double ratio = calc.divide(num1, num2);
                    System.out.println("\nResult: " + ratio);
                    //continue;
                }
            }
            else{
                System.out.println("\nThat wasn't one of the options! Try again.");
            }
        }
    }
}
    

