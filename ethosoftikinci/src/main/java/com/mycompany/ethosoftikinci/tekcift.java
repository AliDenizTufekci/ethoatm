
package com.mycompany.ethosoftikinci;
import java.util.Scanner;





public class tekcift {
    
    public static void main(String[] args){
        
    
   Scanner scanner =new Scanner (System.in) ;
    
    System.out.println("Bana bir sayı gir ve ben de sana,1'den o sayıya kadar olan sayıların tek ve çift olanlarını ayırıp,tekleri ve ciftleri kendi aralarında toplayıp ayrı ayrı ekrana yansıtayım.");
        
 int N =scanner.nextInt();
    
   int tplmc=0;
   
   for(int i=2 ; i<N;i+=2){  //*1 ile N "arasında" dediği için 0'ı ve N'yi dahil etmedim//*
       
     tplmc= tplmc+i;  
       
   }
    
   System.out.println(tplmc + "sayisi,1'den girdiginiz sayiya kadarki tek sayilarin toplamidir.");
    
    
    int tplmt=0;
   
   for(int i=3 ; i<N;i+=2){  //*1 ile N "arasında" dediği için 1'i ve N'yi dahil etmedim//*
       
     tplmt= tplmt+i;  
       
   }
    
   System.out.println(tplmt + "sayisi,1'den girdiginiz sayiya kadarki tek sayilarin toplamidir.");
    
    
    
   scanner.close();
   
   
    //*bazı kod bloklarını tekrar yazmamak adına kopyala-yapıltır yaptım ama bunlar da tamamen kendi kodlarımdan alınan kopyalardı.Yani yapay zeka kullanmadım//*
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
