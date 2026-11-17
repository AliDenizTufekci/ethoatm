
package com.mycompany.ethosoftikinci;

import java.util.Scanner;


public class basamak {
   
public static void main(String[] args){
    
 Scanner scanner = new Scanner (System.in);   
    
 System.out.println("basamak sayisini bulmami istediginiz sayiyi giriniz.");
 
 int sayi =scanner.nextInt();    

 if (sayi>0){
boolean flag =true;

int i =1;

int bassay=0;
while (flag){

    if (sayi >=i ){
        flag=true;
   
   bassay=bassay+1; 
    
    i=i*10;
    }
            
    else {
        flag=false;
    } 

} 

    System.out.println("Girdiginiz sayi  "+ bassay +" basamaklidir."); 
     }

 
 else if(sayi<0){
     
    boolean flag =true;

int i =-1;

int bassay=0;
while (flag){

    if (sayi <=i ){
        flag=true;
   
   bassay=bassay+1; 
    
   
  i=i*10;
    }
            
    else {
        flag=false;
    } 

} 

    System.out.println("Girdiginiz sayi  "+ bassay +" basamaklidir.");  
     
     
     
     
     
     
     
     
 }
 
 
 
 
 
 
 else {
     System.out.print("Girdiginiz sayinin basamak sayisi 1'dir.");
 }

 scanner.close();
 
//*bazı kod bloklarını tekrar yazmamak adına kopyala-yapıltır yaptım ama bunlar da tamamen kendi kodlarımdan alınan kopyalardı.Yani yapay zeka kullanmadım//* 
    

}






}   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

