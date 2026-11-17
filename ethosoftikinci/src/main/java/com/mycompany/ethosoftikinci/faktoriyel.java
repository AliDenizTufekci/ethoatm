
package com.mycompany.ethosoftikinci;

import java.util.Scanner;


public class faktoriyel {
    
public static void main(String[] args){
    
    
  Scanner scanner = new Scanner (System.in);   
    
 System.out.println("faktoriyelini almami  istediginiz sayiyi giriniz");
 
 int sayi =scanner.nextInt();  
    
  if (sayi >0){
  
      int fakt =1;
              
              
  for (int i =1;i<=sayi;i++){
      
    fakt =fakt*i;  
      
    
      
  }
  System.out.println(fakt);
  }
    
    
  else if (sayi<0) {
      
      System.out.println("negatif sayilarin faktoriyeli tanimsizdir.");
  }
    
  else {
      
      System.out.println("faktoriyel 1'dir.");
  }  
    
    
    
   scanner.close();
    
    
    
    
    
    
     //*bazı kod bloklarını tekrar yazmamak adına kopyala-yapıltır yaptım ama bunlar da tamamen kendi kodlarımdan alınan kopyalardı.Yani yapay zeka kullanmadım//* 
    
    
    
    
    
    
    
    
    
}






















}
