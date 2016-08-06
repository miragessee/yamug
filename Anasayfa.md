# 1) Giriş #

## 1.1) Amaç ##

###Projenin amacı apart yöneticilerinin daire hakkındaki bilgileri, dairelerdeki daire sahiplerine ait bilgileri, elektrik, su, yakıt kullanımı verilerini yönetebileceği, potansiyel kiracılara apartlarını gösterebileceği bir program geliştirmektir.###

# 2) Sisteme Genel Bakış #

##2.1) Sistem Mimari Diyagramı##

![213.jpg](https://bitbucket.org/repo/7rBGpr/images/3694345135-213.jpg)

##2.2) Ürün Özellikleri##

- Apartların kaçının dolu kaçının boş olduğunu gösterme
- Apart özelliklerini listeleme
- Apart özelliklerini kıyaslama
- Kiracıların fatura ödemelerinin takibini yapma
- Apartların daha hızlı ve daha efektif kiralanmasını sağlama
- Apartların konum ve özelliklerine göre fiyatlandırma olacağı için adil bir fiyatlandırma sağlama
- Apartlarda çıkabilecek sorunların takibini yapma
- Apart kiralayacak müşteri taleplerine göre boşalacak apartı bildirme
- Apart sahiplerinin bilgilerini görüntüleme
- Apartın rezerasyonunu yapma
- Rezervasyonu yapılmış apartın kısa süreli ( 1-7 gün ) kiralanmasını sağlama
- Apartları tek ekranda durumuna göre renkli olarak görüntüleme

##2.3) Kullanıcılar##

#3.	Gereksinimler#
##3.1	Fonksiyonel Gereksinimler##

Yeni Apart Ekleme: Yeni apart eklenebilecek. Apart ekleme sırasında aparta ait özellikler ve apartın resimleri girilecek.

Apartların Bakım ve Onarım Durumu: Apartların Bakım ve Onarımı ile ilgili bilgiler girilebilecek ve görüntülenebilecek. Apartlarda bir arıza oluştuğunda bu arızayla ilgili bilgiler girilebilecek ve onarım durumu belirtilebilecek.

Rapor Alma: Apartlardaki kiracıların listesi, aidat ödeme durumları ve fatura ödeme durumları gibi konularla ilgili raporlar alınabilecek.

Müşteri Kaydı: Apartı kiralayacak olan müşterilerin düzenli ve eksiksiz kayıtları tutulmalı. Gerektiğinde müşteriye kolayca ulaşılabilmeli.

Apart Görüntüleme Apart sahibi tarafından boş ve dolu apartların durumu, kat bilgisi, apart numarası görsel bir arayüz ile rahatça görülebilmeli. Gerektiğinde bu ekrandan tıklandığında bütün bilgilere erişebilmeli.

Müşteri Bilgilendirme Formu: Tüm müşterilere tek tek veya toplu olarak e-posta gönderebilme.

Müşteri Talep Formu: Konaklayan müşteriler için anket düzenleyebilme.

Kiralanmış bir apart dairesinin görünümünde "Kirala" sekmesi pasifleşir. Çünkü iki kez üst üste kiralama yapılamaz. Sadece "Boşalt" sekmesi aktiftir. Ancak daire boşaltıldığında iki kez üst üste boşaltma yapılamayacağından "Boşalt" sekmesi pasifleşir. "Kirala" sekmesi aktif olur. Sekmeye tıklansa dahi, sistem "Daire zaten dolu" ya da "Daire zaten boş" uyarıları verir.

Bir apartta boşaltma işlemi yapılırken "Boşalt" sekmesine tıklandığında eğer kiracıya ait her hangi bir borç varsa işlem yapılmaz. Sistem "Daireye ait borç bulunmaktadır" uyarısı verir.


##3.2	Fonksiyonel Olmayan Gereksinimler##

Kolay Kullanılabilir Olma: Apart Yönetim Sistemi kolay kullanılabilecek. Grafik arayüz üzerinde gereken işlemler kolay bir şekilde yapılabilecek.

Basitlik ve Kolay Programlanabilme: Apart Yönetim Sistemi basit olacak ve kısa bir sürede kodlama işlemi yapılabilecek.

Güvenlik: Programa yetkili kişi dışında dışarıdan her türlü erişim kapatılmalı.

Performans: Program hızlı çalışmalı. Apart sahibini müşteri karşısında zor duruma düşürmemeli.

Kontrol Edilebilirlik: Kayıtların ne zaman ve kimin tarafından değiştirildiğinin sistemden öğrenilebilmesi ve kayıtların ne zaman ve kimin tarafından değiştirildiğinin sistemden öğrenilebilmesi.

Genişletilebilirlik: Program gerekli durumda daha çok aparta hizmet verebilecek

Kurulum: Programın kurulumu türkçe,basit ve anlaşılır olmalı

Platform Uyumluluğu: Program tüm windows sürümlerinde sorunsuz çalışmalı

Kullanıcı arayüzü: İşlevsel bir kullanıcı arayüzü kullanılmalı. gereksiz detaylar gizlenmeli. ihtiyaç durumunda gösterilmelidir.

#4.	Proje Planı#
#5.	Use – Case Diyagramı ve Senaryolar#
##5.1	Use – Case Diyagramı##
##5.2	Use – Case  Senaryoları##
