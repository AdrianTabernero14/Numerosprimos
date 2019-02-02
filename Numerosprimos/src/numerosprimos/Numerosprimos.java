/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;
import java.util.Scanner;
/**
 *
 * @author adria
 */
public class Numerosprimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []num=new int [10];
        int []resultado=new int [10];
       int ordenar=0;
        for(int i=0;i<num.length;i++){
            System.out.println("Introduce elemto "+(i+1)+" :");
            num[i]=sc.nextInt();
        }
        System.out.println(" El array es: ");
        for(int i=0;i<num.length;i++){
            System.out.print(i+" \t");
        }
        System.out.println("");
          for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" \t");
        }
          System.out.println("\n El array con los primos primero es: ");
         for(int i=0;i<num.length;i++){
             if (num[i] % 2 == 0 && num[i] != 2){
                 
             }
             else {
                 resultado[ordenar] = num[i];
             ordenar++;
             }
             
         }
         for(int i=0;i<num.length;i++){
             if (num[i] % 2 == 0 && num[i] != 2){
               resultado[ordenar] = num[i];
             ordenar++;  
             }
             else {
                 
             }
    }
         for(int i=0;i<num.length;i++){
            System.out.print(i+" \t");
        }
         System.out.println("");
         for(int i=0;i<num.length;i++){
            System.out.print(resultado[i]+" \t");
        }
    } 
}
