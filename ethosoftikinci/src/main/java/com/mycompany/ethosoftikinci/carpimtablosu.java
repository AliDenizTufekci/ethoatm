
package com.mycompany.ethosoftikinci;

import java.util.Scanner;


public class carpimtablosu {
    
public static void main(String[] args){
    
 Scanner scanner = new Scanner (System.in);   
    
 System.out.println("çarpım tablosunu olusturmami istediginiz sayiyi giriniz");
 
 int sayi =scanner.nextInt();
    
   int i =0;

 
 while ( i<10) {  
    
    
   i =i+1; 
    
 System.out.println("Girdiginiz sayinin carpim tablsunda " + i + "sayisi ile carpildiginde elde edilen sonuc" + i*sayi + " 'dir");
    
    
 }  
    
   scanner.close();
    
    
    
    
    
   //*bazı kod bloklarını tekrar yazmamak adına kopyala-yapıltır yaptım ama bunlar da tamamen kendi kodlarımdan alınan kopyalardı.Yani yapay zeka kullanmadım//* 
    
    
    
    
    
    
    
    
}


































}
