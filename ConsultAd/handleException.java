package ConsultAd;

import java.util.InputMismatchException;
import java.util.Scanner;

public class handleException{
    
    private int input1;
    private int input2;
    
    public handleException(){
       
       this.input1 = 0;
       this.input2 = 0;
    }
    
    public handleException(int input1, int input2){
       this.input1 = input1;
       this.input2 = input2;
    }
    
    public void computeInt(int input1,int input2){
        try{
            try{
                int result = input1/input2;
                System.out.println(result);
            }
            catch (InputMismatchException e) {
            System.out.print("java.util.InputMismatchException");
        }
    }
    catch (Exception e) {
        System.out.print(e);
    }
    }
    /**
     *
     * @param args
     */
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any two no:");
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        handleException object = new handleException();
        object.computeInt(input1, input2);
    }
}