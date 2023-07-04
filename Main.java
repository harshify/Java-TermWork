package HARSH40;
import java.util.Scanner;
abstract class CreditCard {
public abstract boolean isValid(String cardNumber);
}

class MasterCard extends CreditCard { @Override
public boolean isValid(String cardNumber) {
if (cardNumber.length() != 16) {
return false;
}
int prefix = Integer.parseInt(cardNumber.substring(0, 2));
return prefix >= 51 && prefix <= 55;
}
}

class Visa extends CreditCard { @Override
public boolean isValid(String cardNumber) {
int len = cardNumber.length();
if (len != 13 && len != 16) {
return false;
}
return cardNumber.charAt(0) == '4';
}
}

class AmericanExpress extends CreditCard { @Override
public boolean isValid(String cardNumber) {
if (cardNumber.length() != 15) {
return false;
}
String prefix = cardNumber.substring(0, 2);
 
return prefix.equals("34") || prefix.equals("37");
}
}

public class Main {
public static void main(String[] args) { CreditCard card = null;
Scanner sc=new Scanner(System.in); System.out.println("Enter the card number: "); String c=sc.next();
// Validate a MasterCard number 
card = new MasterCard();
if (card.isValid(c)) {
System.out.println("Valid MasterCard number");
} else {
System.out.println("Invalid MasterCard number");
}

// Validate a Visa number card = new Visa();
if (card.isValid(c)) { System.out.println("Valid Visa number");
} else {
System.out.println("Invalid Visa number");
}

// Validate an American Express number card = new AmericanExpress();
if (card.isValid(c)) {
System.out.println("Valid American Express number");
}
else

System.out.println("Invalid American Express Number");
System.out.println("*****************************************************************");
System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
System.out.println("*****************************************************************");
}
}
