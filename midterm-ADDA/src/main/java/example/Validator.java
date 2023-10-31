package example;
import java.util.*;
public class Validator {
private Properties storedCredentials;
public Validator(Properties storedCredentials) {
this.storedCredentials = storedCredentials;
}
public boolean matchCredentials(String username, String ID) {
String storedID = storedCredentials.getProperty(username);
return storedID != null && storedID.equals(ID);
}
public static void main(String args[]) {
Properties storedCredentials = new Properties();
// Add predefined stored properties here
storedCredentials.setProperty("ram", "3025");
Validator matcher = new Validator(storedCredentials);
Scanner scan = new Scanner(System.in);
// String inputUsername = "user2";
// String inputPassword = "password1";
String inputUsername,inputPassword;
System.out.print("Enter the username: ");
inputUsername = scan.next();
System.out.println();
System.out.print("Enter the ID: ");
inputPassword = scan.next();
if (matcher.matchCredentials(inputUsername, inputPassword)) {
System.out.println("Valid Username and ID" + "\nLogin successful!");
} else {
System.out.println("Invalid username or id.");
}
scan.close();
}
}