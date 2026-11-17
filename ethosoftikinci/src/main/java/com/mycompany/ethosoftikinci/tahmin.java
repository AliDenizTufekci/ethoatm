
package com.mycompany.ethosoftikinci;

import java.util.Scanner ;


public class tahmin {
  
   public static void main(String[] args){
    
 Scanner scanner = new Scanner (System.in);   
    
    int sayi =5476;
   
   
  boolean flag =true;
   
  do {
   
   System.out.println("tahmin giriniz.");
   
  int th=scanner.nextInt();
   
   if (th>sayi){
       
   flag =true;
   
       System.out.println("tahmininiz sayidan büyük ,yine tahmin giriniz.");    
   
   
   
           
           
           }
   
   else if (sayi>th){
   
    flag =true;
   
       System.out.println("tahmininiz sayidan kücük ,yine tahmin giriniz.");    
   
   

   }
   
   
   else if (scanner.nextLine()== "bitti"){
       flag =false;
   }
   else {
       
       flag=false;
   
   System.out.println("tebrikler.");
   }
  
  
  
  }while (flag);


   
   
   scanner.close();
   //*bazı kod bloklarını tekrar yazmamak adına kopyala-yapıltır yaptım ama bunlar da tamamen kendi kodlarımdan alınan kopyalardı.Yani yapay zeka kullanmadım//*    
   }
}