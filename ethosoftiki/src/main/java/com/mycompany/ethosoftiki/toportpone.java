
package com.mycompany.ethosoftikinci;

import java.util.Scanner;
public class toportpone {
  public static void main(String[] args){
    
 Scanner scanner = new Scanner (System.in);   
  
 int polar =0;
 
 int neler =0;
 
 int sılar =0;
 
 int tplm=0;
 for (int i =1 ;i<=10;i++){
     
  System.out.println("sayi giriniz.");
     
   int sayi = scanner.nextInt();
     
 tplm = tplm +sayi ;    
     
   if (sayi >0 )  {
   
       polar =polar +1;
   }
   
   else if (sayi<0){
       neler =neler+1;
   }
   
   else {
       sılar = sılar+1;
   }
 }
         
         
 System.out.println("sayilarin ortalamasi " + tplm /10 +"  'dir");
         
         
   System.out.println(polar +" tane pozitif," + neler +"tane negatif " + sılar + "tane sıfır olan sayi vardir. ");      
         
         
         
  scanner.close();
         
         
         
  //*bazı kod bloklarını tekrar yazmamak adına kopyala-yapıltır yaptım ama bunlar da tamamen kendi kodlarımdan alınan kopyalardı.Yani yapay zeka kullanmadım//*           
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         }}
