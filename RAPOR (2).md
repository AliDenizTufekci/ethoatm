# Rapor

**Ad Soyad:Ali Deniz Tüfekci**
**Numara:722**

## 1. Algoritma Açıklaması
<-- Bu algoritma ilk başta kullanıcının önüne bir menü çıkarır. Menüde 4 seçenek vardır. 1,mevcut bakiye gösterimi;2,para yatırma;3,para çekme;4,çıkış yapma. Kullanıcının tıkladığı rakama göre ne yapmak istediği anlaşılır ve ona göre kullanıcıya bilgi verilebilir (mevcut bakiye) ,kullanıcıya sorular sorulur(yatırma-çekme), girdiler alınır(yatırma-çekme) ve gerekli işlem yapılır. Eğer kullanıcı , işlenip bir sonuç üretilmesi mümkün olmayan bir girdi girerse (2 veya 3'te) veya ilk başta menüdeki anahtar rakamlardan biri olmayan bir rakama tıklarsa  uyarı verilir .Kullanıcı 4'e basana kadar menü gösterilmeye devam edilir ve 4'e basılınca , o zamana kadarki tüm işlemlerin sayıları, yatırma-çekme tutarları, mevcut bakiye vs. ekranda gösterilir.-->


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
1)Kullanıcının ,menü karşısına çıktıkça ne yapmak istediğine bağlı olarak tıklanan tuşlar (1/2/3/4).
2)Eğer kullanıcı 2 veya 3'e tıkladıysa da yatırılmak-çekilmek istenen para tutarları.

**İşlemler:**
1)Eğer kullanıcı uygun bir sayı tıkladı ise ona uygun işleme yönlendirmek, eğer geçersiz bir sayıya tıkladı ise uyarı verecek şekilde çalışmak.
2)Eğer 2 veya 3'e tıkladı ise girdileri işleyip bakiyede oluşacak tutarları belirlemek.
**Çıktılar:**
1)Kullanıcıya menü göstermek.
2)Menüde tıklanan sayıya bağlı olarak kullanıcıya bilgi vermek ya da girdi alabilmek amacı ile soru yöneltmek.
3)Eğer menüde yanlış sayı tıklandı ise uyarı vermek.
## 3. Sözde Kod (Pseudocode)

```
1.Tanımla:Bakiye=10000,yapılan işlem sayıları, yatırılan tutar-çekilen tutar ,girilen istek komutu.
2.Do-While döngüsü: açılarak bir işlemin yapılması, sonra önceden belirlenmiş bir koşula göre sonraki aşamalara geçilmesi ya da döngüdeki işlemin tekrarlanması sağlanır.
3.Buradaki işlemden kasıt şudur:
4.output:"yapmak istediginiz isleme gore sayi tiklayiniz.bakiye goruntuleme icin 1,para yatirma icin 2,para cekme icin 3,cikis yapmak icin 4."
5.input:ist(istek komutu)
6.switch (istek komutu):kullanıcının girdiği istek komutu 1 ise 7'den,2 ise 9'dan   , 3 ise 17'den , 4 ise 25'ten , default(başka ise)33 'ten devam et.
7.output:"mevcut bakiyeniz "+bakiye+ " kadardir. "
8.Atama:Bakiyegostermeislemisayisi=bakiyegostermeislemisayisi+1  35'ten devam.      

9.output:"banka hesabiniza yatirmak istediginiz tutari yaziniz."
10.Girdi:integer yatmiktar
11.if:yatmiktar>0 12'den,else   16'dan devam et.
12.atama:bakiye=bakiye+yatmiktar
13.atama:yatırılan toplam para miktarı =yatırılan toplam para miktarı + yatmiktar 
14.atama:yatırmaislemisayisi=yatirmaislemisayisi+1
15.output:"Tebrikler,mevcut bakiyeniz basari ile yenilenmis,yatiriminiz alinmistir."35'ten devam.

16.output:"yatirmek istediginiz deger,pozitif bir miktar olmaması sebebiyle gecersiz sayilmistir."35'ten devam.

17.output:"banka hesabınızdan çekmek istediğiniz tutarı yazınız."
18.girdi:integer cekmiktar
19.if :cekmiktar>10000 or cekmiktar<0  20'den ,else 21'den devam et.
20.output:"girdiginiz deger gecersizdir."35'ten devam.

21.atama:bakiye =bakiye -cekmiktar
22.atama:toplamparacekmetutari=toplamparacekmetutari+cekmiktar
23.atama:cekmeişlemisayisi=cekmeişlemisayisi+1
24.output:"Tebrikler !Para cekme isleminiz basari ile yerine getirilmistir."35'ten devam.
25.output:"Yaptiginiz parayatirma islemi sayisi: "+ yissay
26.output:"Yaptiginiz paracekme islemi sayisi: "+ cissay
27.output:"Yaptiginiz bakiyegosterme  islemi sayisi: "+ bakiyeissay
28.output:"Yaptiginiz toplam islem sayisi: "+ issay
29.output:"İslemler sonucundaki mevcut  bakiye : " + bakiye
30.output:"islemler sonucunda yatirdiginiz para miktari: " + parayt
31.output:"islemler sonucunda cektiginiz para miktari: " + paract
32.output:"sistemden cikis yapiliyor.".   35'ten devam.

33.output:"Gecersiz istek girisi yaptiniz."
34.while:istek!=4 iken bu süreci 4. satırdan itibaren sınırsız sayıda tekrarla.
35.scanner.close():girdi alımını kapat.
























```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Senaryoları (en az 8)

| No | Yapılan işlem / girdi | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 |2,para yatırma, yatmiktar 5000; 1,bakiye gösterme. |1)"ne kadar yatıracaksınız: 2)mevcut bakiyeniz :15000 |1)"ne kadar yatıracaksınız: 2)mevcut bakiyeniz :15000 |Evet |
| 2 |1,bakiye gösterme;4;çıkış. |1)mevcut bakiyeniz:10000 2)bakiyegöstermeişlemisayısı=13)diğer işlemler =04)toplam işlem sayisi=15)çıkış yapılıyor. |1)mevcut bakiyeniz:10000 2)bakiyegöstermeişlemisayısı=13)diğer işlemler =04)toplam işlem sayisi=15)çıkış yapılıyor. |Evet |
| 3 |123 |1)gecersiz istek girisi yaptiniz. |1)gecersiz istek girisi yaptiniz.  |Evet |
| 4 | 3,para çekme;cekmiktar =3000|1)"banka hesabinizdan cekmek istediginiz tutari yaziniz."
2)Tebrikler!para çekme işleminiz basari ile yerine getirilmistir.|1)"banka hesabinizdan cekmek istediginiz tutari yaziniz."
2)Tebrikler!para çekme işleminiz basari ile yerine getirilmistir. |Evet |
| 5 |3,para çekme işlemi;13245=cekmiktar. |1)"banka hesabinizdan cekmek istediginiz tutari yaziniz."2)"girdiginiz deger gecersizdir." 3)yapmak istediginiz isleme gore sayi tiklayiniz.bakiye goruntuleme icin 1,para yatirma icin 2,para cekme icin 3,cikis yapmak icin 4.|1)"banka hesabinizdan cekmek istediginiz tutari yaziniz."2)"girdiginiz deger gecersizdir." yapmak istediginiz isleme gore sayi tiklayiniz.bakiye goruntuleme icin 1,para yatirma icin 2,para cekme icin 3,cikis yapmak icin 4.|Evet |
| 6 |2,para yatırma;4,çıkış yapma. |1)banka hesabiniza yatirmak istediginiz tutari yaziniz.2)yatirmek istediginiz deger,pozitif bir miktar olmaması sebebiyle gecersiz sayilmistir. 3)yapmak istediginiz isleme gore sayi tiklayiniz.bakiye goruntuleme icin 1,para yatirma icin 2,para cekme icin 3,cikis yapmak icin 4.|1)banka hesabiniza yatirmak istediginiz tutari yaziniz.2)yatirmek istediginiz deger,pozitif bir miktar olmaması sebebiyle gecersiz sayilmistir. 3)yapmak istediginiz isleme gore sayi tiklayiniz.bakiye goruntuleme icin 1,para yatirma icin 2,para cekme icin 3,cikis yapmak icin 4. | Evet|
| 7 |5,işlem istek girişi |1)"Gecersiz istek girisi yaptiniz."2)yapmak istediginiz isleme gore sayi tiklayiniz.bakiye goruntuleme icin 1,para yatirma icin 2,para cekme icin 3,cikis yapmak icin 4. |1)"Gecersiz istek girisi yaptiniz."2)yapmak istediginiz isleme gore sayi tiklayiniz.bakiye goruntuleme icin 1,para yatirma icin 2,para cekme icin 3,cikis yapmak icin 4. |Evet |
| 8 |3,işlem isteği;456,cekmiktar;4,çıkış isteği |
1)banka hesabinizdan cekmek istediginiz tutari yaziniz.
2)Tebrikler !Para cekme isleminiz basari ile yerine getirilmistir.
yapmak istediginiz isleme gore sayi tiklayiniz.bakiye goruntuleme icin 1,para yatirma icin 2,para cekme icin 3,cikis yapmak icin 4.
4)Yaptiginiz parayatirma islemi sayisi: 0
Yaptiginiz paracekme islemi sayisi: 1
Yaptiginiz bakiyegosterme  islemi sayisi: 0
Yaptiginiz toplam islem sayisi: 1
islemler sonucundaki mevcut  bakiye : 9544
islemler sonucunda yatirdiginiz para miktari: 0
islemler sonucunda cektiginiz para miktari: 456
sistemden cikis yapiliyor. |1)banka hesabinizdan cekmek istediginiz tutari yaziniz.
2)Tebrikler !Para cekme isleminiz basari ile yerine getirilmistir.
yapmak istediginiz isleme gore sayi tiklayiniz.bakiye goruntuleme icin 1,para yatirma icin 2,para cekme icin 3,cikis yapmak icin 4.
4)Yaptiginiz parayatirma islemi sayisi: 0
Yaptiginiz paracekme islemi sayisi: 1
Yaptiginiz bakiyegosterme  islemi sayisi: 0
Yaptiginiz toplam islem sayisi: 1
islemler sonucundaki mevcut  bakiye : 9544
islemler sonucunda yatirdiginiz para miktari: 0
islemler sonucunda cektiginiz para miktari: 456
sistemden cikis yapiliyor. |Evet |
