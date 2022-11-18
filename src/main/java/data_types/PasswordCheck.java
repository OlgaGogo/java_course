package data_types;

import java.util.Scanner;

public class PasswordCheck {
    String username;
    String currentPassword;

    private boolean valid;
    private String errorMessage;

    private static final Scanner scanner = new Scanner(System.in);

    public PasswordCheck(String username, String currentPassword){
        this.username = username;
        this.currentPassword = currentPassword;
    }

    public boolean isValid(){
        return valid;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

    public void closeScanner(){
        scanner.close();
    }

    public static void main(String[] args){
        var validator = login();
        validator.printPasswordRules();
        validator.getProposedPassword();

        do {
            var proposedPassword = validator.getProposedPassword();
            validator.passwordRules(proposedPassword);

            if(!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }
//will execute this loop until "! validator is valid =(false)" is TRUE
        }while(!validator.isValid());

        System.out.println("Your password has been changed successfully");

        validator.closeScanner();
    }

    public static PasswordCheck login(){
        System.out.println("Enter your username");
        String username = scanner.nextLine();

        System.out.println("Enter your password");
        String password = scanner.nextLine();

        return new PasswordCheck(username, password);
    }

    public void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters");
        System.out.println("* one uppercase");
        System.out.println("* one symbol");
        System.out.println("* not contain username");
        System.out.println("* not the same as an old password");
    }

    public String getProposedPassword(){
        System.out.println("Enter your new password:");
        return scanner.nextLine();
    }

    public void passwordRules(String newPassword){

        valid = true;
        errorMessage = "";

        if(newPassword.length()<8){
            valid = false;
            errorMessage += "\n Your password must include at least 8 characters";
        }

        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must include at least one uppercase";
        }

        if(newPassword.matches("[a-zA-z0-9 ]*")){
            valid = false;
            errorMessage += "\n Your password must include a special character such as $,^,*.";
        }

        if(newPassword.toUpperCase().contains(username.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password cannot contain your username";
        }

        if(newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Your password must be different from your current password";
        }
    }


}
