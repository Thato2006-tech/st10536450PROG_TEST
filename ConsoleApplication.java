/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.console;

/**
 *
 * @author Student
 */
public class ConsoleApplication {
    public static void main(String[] args) {
        String[] consoleTypes ={"PS5"," XBOX", "SWITCH"};
        System.out.println("Select the beverage type");
         for (int i = 0; i< consoleTypes.length; i++){
             System.out.println((i + 1) + " " + consoleTypes[i]);
         }
          int choice = 0;
          while (choice < 1 choice > consoleTypes.length){
        System.out.println("Enter choice (1-3)");
        if (input.has.NextInt()){
            choice = input.nextInt();
        } else {
            input.next();
        }
    }
    input.nextLine();
    
    System.out.println("Enter the store");
    String store input.nextLine();
    
    int totalSales = -1;
    while (totalSales < 0){
        System.out.println("Enter the total sales");
        if (input.has.NextInt()){
            totalSales = input.nextInt();     
        } else {
            input.next()
        }
    }
    ConsoleSales sales = new ConsoleSales(consoleTypes[choice - 1], store, totalSales);
    sales.printReport();
    input.close();
    }
 
}
