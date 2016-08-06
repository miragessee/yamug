# YAMUG Apart Yönetim Sistemi v2.3 #
# Geliştirici Dökümantasyonu #
## 1)Apart İşlemleri ##
### 1.1) Apart Bilgilerini Görüntüle ###
![11.jpg](https://github.com/miragessee/yamug/blob/master/wikiresimler/images/3960600952-11.jpg)

* apartController daki apartListesi1() metodu program açılışta çalışır.
* Apart bilgileri bu metodla otomatik olarak görüntülenir.

### 1.2) Yeni Apart Ekle ###
![image003.png](https://github.com/miragessee/yamug/blob/master/wikiresimler/images/2466630757-image003.png)

* " Yenile" butonu apartları yeniden listeler. Seçilen apartın özellikleri sağ tarafta güncellenir.
* - apartController daki apartListesi1() metodu ile çalışır.
* " Ekle " butonu yukarıda girilen veriler ile yeni apart ekler.
* - apartController daki apartEkle() metodu ile çalışır.
* "Güncelle" butonu apart bilgilerini görüntülenen şekilde günceller.
* - apartController daki apartGuncelle() metodu ile çalışır.
* "Silme" butonu görüntülenen apartı siler.
* - apartController daki apartSilme() metodu ile çalışır.



### 1.3) Demirbaş Listesi ###
![13.png](https://github.com/miragessee/yamug/blob/master/wikiresimler/images/3097133566-13.png)

* " Yenile" butonu apartları yeniden listeler. 
* - apartController daki apartListesi1() metodu ile çalışır.
* Seçilen apartın listesi sağ tarafta güncellenir.
* " Demirbaş Listesine Ekle " butonu ile demirbaş ekleme penceresi açılır.
* - apartController daki apartDemirbasId() metodu ile apart idsini aldıktan sonra apartController daki apartDemirbasEkle() metodu ile çalışır.
* "Güncelle" butonu demirbaş listesinde yapılan değişiklikleri günceller.
* - dlistController daki dlistGuncelle() metodu ile çalışır.
* "Sil" butonu sol tarafında bulunan demirbaşı siler.
* - dlistController daki dlistSil() metodu ile çalışır.


### 1.4) Temizlik Durumu ###
![14.jpg](https://github.com/miragessee/yamug/blob/master/wikiresimler/images/148244108-14.jpg)

* " Yenile" butonu apartları yeniden listeler. 
* - apartController daki apartListesi1() metodu ile çalışır.
* Seçilen apartın temizlik durumu sağ tarafta güncellenir.
* Seçilen apartın temizlik durumu Temizlik Düzenleme bölümünde "Güncelle" butonuna tıklanarak güncellenebilir.
* - apartController daki apartTemizlikGuncelle() metodu ile çalışır.



### 1.5) Apart Arıza Durumu ###
![15.jpg](https://github.com/miragessee/yamug/blob/master/wikiresimler/images/2713141488-15.jpg)
 

* " Yenile" butonu apartları yeniden listeler. 
* - apartController daki apartListesi1() metodu ile çalışır.
* Seçilen apartın arıza durumu sağ tarafta güncellenir.
* Seçilen apartın arıza durumunu değiştirilebilir. 
* Apart durumu arızalı seçilirse Apart Arıza kısmı görüntülenir. İçine yazılan not “Ekle/Güncelle” butonuyla kaydedilir.
* - apartController daki apartArizaGuncelle() metodu ile çalışır.
* Apart durumu sağlam seçilirse Apart Arıza kısmı gizlenir ve içindeki not silinir.


## 2)Müşteri İşlemleri ##
### 2.1) Yeni Müşteri Ekle ###
![21.png](https://github.com/miragessee/yamug/blob/master/wikiresimler/images/370796560-21.png)
 

* " Yenile" butonu apartları yeniden listeler. 
* - apartController daki apartListesi1() metodu ile çalışır.
* Müşteri ekleme kısmında gerekli bilgiler girilerek müşteri eklenebilir.
* - apartControllerdaki musteriEkle() metodu ile çalışır.



### 2.2) Müşteri Silme/Güncelleme ###
![22.png](https://github.com/miragessee/yamug/blob/master/wikiresimler/images/386264791-22.png)
 

* Müşterileri isim/soyisim/numaraya göre müşteri bulunup seçilen müşterinin bilgilerinin güncellemesi yapılabilen bölümdür.
* - apartController daki musteriAra1() ve musteriAra2() ile arama yapılır.
* - musteriController daki musteriGuncelle() metodu günceller.
* - musteriController daki musteriSil() metodu siler.


### 2.3) Müşteri Bilgilerini Görüntüle ###
![23.png](https://github.com/miragessee/yamug/blob/master/wikiresimler/images/2530745816-23.png)

* " Yenile" butonu apartları yeniden listeler.  Tüm apart müşterilerini görüntüler.
* - apartController daki apartListesi1() metodu ile çalışır.
* - Soldaki listeye tıklandığında  musteriController daki musteriGoruntule() metodu çalışır.



### 2.4) Giderler ###

### 2.4.1) Giderleri Görüntüle ###
![241.png](https://github.com/miragessee/yamug/blob/master/wikiresimler/images/1971414782-241.png)


* " Yenile" butonu apartları yeniden listeler. 
* - apartController daki apartListesi1() metodu ile çalışır.
* Bu bölüm sol tarafta seçilen apartta bulunan müşterilerin giderlerini isteğe göre "Görüntüle" butonuna tıklandığında görüntüler.
* - musteriController daki giderGoruntule() metodu çalışır.



### 2.4.2) Gider Ekle/Düzenle ###
![242.png](https://github.com/miragessee/yamug/blob/master/wikiresimler/images/3619625315-242.png)


* Müşterileri isim/soyisim/numaraya göre bulup gider güncellemesi yapılabilen bölümdür.
* - musteriController daki giderAra1() ve giderAra2() metodları ile aranır.
* "Güncelle" butonu
* - musteriController daki giderGuncelle() metodu ile çalışır.

## 2.5) Müşteri Bilgilendirme ##
![musteribilgi2_3.jpg](https://github.com/miragessee/yamug/blob/master/wikiresimler/images/2780099168-musteribilgi2_3.jpg)

* "Gönder" butonuna tıklandığında müşterilere belirtilen konu ve içerik ile mail gönderir.
* - musteriController daki musteriBilgilendirme metodu ile çalışır.
* Mailler yamug@yamugapart.com  adresinden gönderilir.
* - YamugView de çalışan sendFromGMail() metodu ile mail gönderir.
*  javax.mail kütüphanesi ile çalışır.

## 3)	Rapor İşlemleri ##
![rapor2_3.jpg](https://github.com/miragessee/yamug/blob/master/wikiresimler/images/500440994-rapor2_3.jpg)

* Bu bölüm apart raporu ve müşteri raporu alma işlemleri için kullanılır.
* YamugView üzerinde çalışır.
* JasperReport yardımı ile rapor görüntüler.


## 4)	Mail Gönder ##
![4.png](https://github.com/miragessee/yamug/blob/master/wikiresimler/images/712981374-4.png)

* "Tablodaki müşterilere mail gönder." butonuna tıklandığında
* - apartController daki mailGonder metodu ile çalışır
*  " Yenile" butonu apartları yeniden listeler. 
* - apartController daki apartListesi1() metodu ile çalışır.
* Bu bölüm kontrat bitim süresine 1 ve 2 gün kalan müşterilere mail atmak için kullanılır. yamugapart@gmail.com adresimizden otomatik oluşturulmuş bir mail müşterilerin email adreslerine gönderilir.
* - YamugView de çalışan sendFromGMail() metodu ile mail gönderir.
*  javax.mail kütüphanesi ile çalışır.

