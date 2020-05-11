package apipackage;

import java.util.Scanner;
import java.util.*;

class Package {
    public static void main(String[] argr) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter user name (id):");

        String userName = myObj.nextLine();
        System.out.println("User is " + userName);
    }
}