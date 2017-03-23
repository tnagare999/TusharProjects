package ConsultAd;

import java.util.Scanner;

public class MyCalculator {
	
    public void calculatePower(int firstNumber, int secondNumber) {
        long result = 1;
        try {            
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
            
            if(firstNumber == 0){
                secondNumber = 0;
            }
            if(firstNumber < 0 || secondNumber < 0) {
                throw new java.lang.Exception("n and p should be non-negative");
            }
            else {
                System.out.println("The power of "+firstNumber+" is:"+result);
            }        
        }           
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter 2 values: ");
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        MyCalculator object = new MyCalculator();
        object.calculatePower(input1,input2);		
    }

}