/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing_assignment;

import java.util.Scanner;
public class Testing_Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass n=new MyClass();
        Scanner input=new Scanner(System.in);
        System.out.println(n.GCD(input.nextInt(), input.nextInt()));
    }
    
}
