/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncr_npr;

import java.util.Scanner;

/**
 *
 * @author ORIGINAL
 */
public class Ncr_npr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in) ;
          int n,r;
      int l = 0,c = 1;
      int cnr;
      int p=1,k=1;
       n = input.nextInt();
       r= input.nextInt();
       if(n-r<r)
           r=n-r; 
    l=n-r;   
 for(int i=1;i<=n;i++)
 {
 p*=i ;   
}
for(int i=1;i<=r;i++)
 {
 k*=i;    
 }
for(int i=1;i<=l;i++)
 {
 c*=i;    
 }     
      cnr=(p/(c)*(k)); 
        int pnr = p/c; 
    System.out.println("print the combination %d   "+ cnr);
    System.out.println("print the permutation %d   "+ pnr);

    }
    
}
