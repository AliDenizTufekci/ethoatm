

package com.mycompany.atm;

import java.util.Scanner;
public class Atm {

    public static void main(String[] args) {
        
        
    Scanner scanner =new Scanner (System.in) ;   
    
    int bakiyeissay =0;
int yissay =0;    
   
int cissay =0;

int issay =0;



int bakiye=10000;
   
   int parayt=0;
   
   int paract=0;
        
    int ist;

    do{
System.out.println("yapmak istediginiz isleme gore sayi tiklayiniz.bakiye goruntuleme icin 1,para yatirma icin 2,para cekme icin 3,cikis yapmak icin 4.");
        
  ist =scanner.nextInt();
        
   switch (ist){
       
       case 1:System.out.println("mevcut bakiyeniz "+bakiye+ " kadardir. ");
       
       bakiyeissay =bakiyeissay+1;
       break;
       
       case 2:System.out.println("banka hesabiniza yatirmak istediginiz tutari yaziniz.");
       
   int yatmiktar=scanner.nextInt();
       
   if (yatmiktar>0){
   bakiye =bakiye + yatmiktar;
     parayt =parayt + yatmiktar;  
  
     yissay =yissay +1;
     
     System.out.println("Tebrikler,mevcut bakiyeniz basari ile yenilenmis,yatiriminiz alinmistir.");
   }
   
   else {
       System.out.println("yatirmek istediginiz deger,pozitif bir miktar olmaması sebebiyle gecersiz sayilmistir.");
   }
   break;
   
       case 3: System.out.println("banka hesabinizdan cekmek istediginiz tutari yaziniz.");
   
   
   int cekmiktar = scanner.nextInt();
   
   
   
   if (cekmiktar>10000 || cekmiktar<=0){
       
   System.out.print("girdiginiz deger gecersizdir.");
   }
   
   else {
       
      bakiye =bakiye-cekmiktar ; 
   
   System.out.println("Tebrikler !Para cekme isleminiz basari ile yerine getirilmistir.");
   
   paract = paract+ cekmiktar;
   
   cissay= cissay +1;
   }
   
   break;
   
   
       case 4:
           System.out.println("Yaptiginiz parayatirma islemi sayisi: "+ yissay);
   
           System.out.println("Yaptiginiz paracekme islemi sayisi: "+ cissay);
   
           System.out.println("Yaptiginiz bakiyegosterme  islemi sayisi: "+ bakiyeissay);
          
           issay =cissay+yissay+bakiyeissay;
           System.out.println("Yaptiginiz toplam islem sayisi: "+ issay);
          
           System.out.println("İslemler sonucundaki mevcut  bakiye : " + bakiye);
          
            System.out.println("islemler sonucunda yatirdiginiz para miktari: " + parayt);
            
             System.out.println("islemler sonucunda cektiginiz para miktari: " + paract);
             
             System.out.println("sistemden cikis yapiliyor.");
           break;
   
       default :System.out.println("Gecersiz istek girisi yaptiniz.");
   
   
   
   
   
   
   
   
   
   
   
   
   
   }    
    }while(ist!=4);    
    
    scanner.close();
    
    //*bazı kod bloklarını tekrar yazmamak adına kopyala-yapıltır yaptım ama bunlar da tamamen kendi kodlarımdan alınan kopyalardı.Yani yapay zeka kullanmadım//* 
    }    
   }     
        
   