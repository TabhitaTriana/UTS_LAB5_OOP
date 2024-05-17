package no2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Polindrom adalah string yang sama jika dica dari depan maupun dari belakang");
        System.out.println("Contoh : Katak,Level,Apa,dll");
        System.out.println("Program ini dirancang untuk memeriksa apakah sebuah kata merupakan polindrom atau tidak.");
        System.out.println("SElAMAT MENCOBA!");

        System.out.print("Masukkan string: ");
        String inputString = scanner.nextLine();

        PalindromCheck palindromCheck = new PalindromCheck();

        if (palindromCheck.isPalindrom(inputString)) {
            System.out.println("String " + inputString + " adalah palindrom.");
        } else {
            System.out.println("String " + inputString + " bukan palindrom.");
        }
    }
}

