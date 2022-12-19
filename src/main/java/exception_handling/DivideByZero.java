package exception_handling;

/* Write the following statement and execute: int c = 30/0
Update program to handle exception. Print statement "Division is fun". This statement should be outputted
no matter what.
 */

public class DivideByZero {

    public static void main(String[] args){

        try{
            int c = 30/0;
        }catch (ArithmeticException e){
            System.out.println("Dividing by zero is not permitted");
        }finally {
            System.out.println("Division is fun");
        }

    }
}
