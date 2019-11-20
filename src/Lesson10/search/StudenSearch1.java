/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudenSearch1 {

    public static void main(String[] args) {
        ISSStudent iss[] = new ISSStudent[100];
        Scanner input = new Scanner(System.in);
        String n, a;
        int id;
        try {
            Scanner scan = new Scanner(new File("studata.txt"));
            for (int i = 0; i < 100; i++) {
                n = scan.nextLine();
                a = scan.nextLine();
                id = Integer.parseInt(scan.nextLine());
                iss[i] = new ISSStudent(n, a, id);
                System.out.println(iss[i]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }

        System.out.println("Enter an ID to search > ");
        int sid = input.nextInt();

        ISSStudent temp = new ISSStudent("", "", sid);
        int loc = binarysearch(iss, temp);
        if (loc > -1) {
            System.out.println(iss[loc]);
        }
    }

    public static int binarysearch(Object[] a, Object searchValue) {
        int left = 0;
        int tries = 0;
        int right = a.length - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a[midpoint]).compareTo(searchValue);
            tries++;
            if (result == 0) {
                System.out.println("It took " + tries + " to get here.");
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        System.out.println("It took " + tries + " to get here.");
        return -1;
    }

}
