
//*yönergede menü ile ilgili olarak sadece "gösterin" ibaresi yer aldığından dolayı 1/2/3/4 harflerinden herhangi birine basılması halinde ".........işlemi yapılmaktadır" dan başka bir şey demiyor,yani işlemi gerçekten yapmıyor çünkü yönergede gereksinim belirtilmemiş.
package com.mycompany.ethosoftikinci;

import java.util.Scanner;
public class menu {
  
    public static void main(String[] args){
    
    
  Scanner scanner = new Scanner (System.in);

    
int ist;
          
          
         do {
          System.out.println("kare hesaplama icin 1 ,kup hesaplama icin 2, tek-cift belirleme icin 3 ,pozitif-negatif-sıfır belirleme icin 4 , cıkış yapmak icin 5'e basiniz.");
    
  
  ist =scanner.nextInt();
      
  
  switch (ist) {
      
      case 1: System.out.println("kare alma islemi yapılıyor.");
      break;
      case 2: System.out.println("kup alma islemi yapiliyor.");
  break;
  case 3: System.out.println("tek-cift belirleme islemi yapiliyor.");
  break;
  case 4: System.out.println("pozitif-negatif-sıfır belirleme islemi yapiliyor.");
  break;
  
  case 5:System.out.println("cikis yapiliyor.");
  break;
  default : System.out.println("gecersiz giris");
  }
              
              
        
        
    } while ( ist !=5);
    
    
    
    
    scanner.close();
    
    //*bazı kod bloklarını tekrar yazmamak adına kopyala-yapıltır yaptım ama bunlar da tamamen kendi kodlarımdan alınan kopyalardı.Yani yapay zeka kullanmadım//*    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }}
