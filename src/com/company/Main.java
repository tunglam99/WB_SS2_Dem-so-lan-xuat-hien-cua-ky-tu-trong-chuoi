package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String str = scanner.nextLine();

        int count=0;
        System.out.println("nhap ky tu muon kiem tra");
        char x = (char) System.in.read();
        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == x) {
                count++;
            }
        }
        System.out.println("so lan xuat hien ky tu " + x+" la "+ count + " lan ");
    }
}
