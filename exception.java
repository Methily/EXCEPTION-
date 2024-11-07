
import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class exception { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            if (true) {
                throw new RuntimeException("Abnormal Termination: This is an unchecked exception.");
                
            }
            
            throwCheckedException();
            throw new CustomException("Custom Exception: This is a checked exception.");
        } catch (CustomException ce) {
            System.out.println(ce.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, whether an exception is caught or not.");
            scanner.close();
        }
        
    }
    private static void throwCheckedException() throws CustomException {
        System.out.println("Number is valid.");
        throw new CustomException("Inside Checked Exception Method");
      
    }}


