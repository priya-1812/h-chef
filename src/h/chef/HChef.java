/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h.chef;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class HChef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            int n=in.nextInt();
            if(n<10)
            {
                System.out.println("Thanks for Helping Chef!");
            }
            else
            {
                System.out.println(-1);
            }
        }
        t--;
                
    }
    
}
    
    

