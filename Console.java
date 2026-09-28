/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.console;

/**
 *
 * @author Student
 */

public class Console {

    public static void main(String[] args) {
     String[] consoles ={"PS5"," XBOX", "SWITCH"};
     String[] cities ={"Cape Town", "Port Elizabeth", "Pretoria"};
     
     int[][] sales = {
      {1000, 2000, 3000},
      {2000, 3000, 4000},
      {1500, 1100, 1200}
  };
    int[] totals = new int[cities.length];
     
    for (int i = 0; i< cities.length; i++){
        for (int b = 0; b< consoles.length; b++){
            totals[i] += sales[i][b];
        }
    }
     
    int maxIndex = 0;
    for (int i = 1; i< totals.length; i++){
        if (totals[i]> totals[maxIndex]){
            maxIndex = i;
        }
    }
    System.out.println("Gaming Console Report");
    System.out.printf("%20s", "");
         for (String c : consoles){
             System.out.printf("%10s", c);
        }
         System.out.println();
         for (int i = 0; i< cities.length; i++){
             System.out.printf("%20s", cities[i]);
              for (int b = 0; b< consoles.length; b++){
                   System.out.printf("%10d", sales[i][b]);
              }
        System.out.println("Console Sales Totals For Each City");
        for (int b = 0; b < cities.length; b++){
            System.out.printf("%20s%d%n", cities[i], totals[i]);
        }
            
        System.out.println("City With Most Sales: " +cities[maxIndex]);
         }
    }
    
}
