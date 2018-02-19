import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String args[]) {
        String userString;
        String newUserString;
        long hexValue=0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        userString=scanner.next();

        newUserString= userString.substring(0,2);

        if (newUserString.equals("0x")){
            userString= userString.substring(2);
        }

        userString=userString.toUpperCase();
        int i=userString.length()-1;
        long nextPower=0;
        long characterValue=0;

        while (i> -1) {
            if (userString.charAt(i) == '1') {
                characterValue = 1;
            }
            if (userString.charAt(i) == '2') {
                characterValue = 2;
            }
            if (userString.charAt(i) == '3') {
                characterValue = 3;
            }
            if (userString.charAt(i) == '4') {
                characterValue = 4;
            }
            if (userString.charAt(i) == '5') {
                characterValue = 5;
            }
            if (userString.charAt(i) == '6') {
                characterValue = 6;
            }
            if (userString.charAt(i) == '7') {
                characterValue = 7;
            }
            if (userString.charAt(i) == '8') {
                characterValue = 8;
            }
            if (userString.charAt(i) == '9') {
                characterValue = 9;
            }
            if (userString.charAt(i) == 'A') {
                characterValue = 10;
            }
            if (userString.charAt(i) == 'B') {
                characterValue = 11;
            }
            if (userString.charAt(i) == 'C') {
                characterValue = 12;
            }
            if (userString.charAt(i) == 'D') {
                characterValue = 13;
            }
            if (userString.charAt(i) == 'E') {
                characterValue = 14;
            }
            if (userString.charAt(i) == 'F') {
                characterValue = 15;
            }
            hexValue = hexValue + (long)(characterValue * (Math.pow(16,nextPower)));
            i-= 1;
            nextPower += 1;

        }

        System.out.println("Your number is " + hexValue+ " in decimal");













    }


}

