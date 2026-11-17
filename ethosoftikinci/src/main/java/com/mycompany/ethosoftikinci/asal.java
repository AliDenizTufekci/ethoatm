
package com.mycompany.ethosoftikinci;

import java.util.Scanner;

public class asal {
    
    public static void main(String[] args){
    
 Scanner scanner = new Scanner (System.in);   
    
 System.out.println("asal olup olmadigini bulmami istediginiz sayiyi giriniz.");
 
 int sayi =scanner.nextInt();

 if (sayi>1){
  boolean flag =true;  
    
  
  
  for (int i=2 ;i<sayi;i++){

  if (sayi%i!=0){
      
      flag=true;
  }
      
  else {
      
      flag = false;
  
  break;
  } 
      
  } 
      
  if (flag==true ) {
      
      System.out.println("sayi asaldir.");
  }   
      
  else {
      
    System.out.println("sayi asal degildir.");  
  }    
      
  } 
    
 else {
     
     System.out.println("sayi asal degildir.");
 }  
    
    
    
    
    
  scanner.close();
    
    
    
    
   //*bazı kod bloklarını tekrar yazmamak adına kopyala-yapıltır yaptım ama bunlar da tamamen kendi kodlarımdan alınan kopyalardı.Yani yapay zeka kullanmadım//*     
    
    
    
    
    
    
    
    
    
    
    
    
    }
    }
