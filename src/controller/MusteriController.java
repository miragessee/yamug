package controller;

import javax.swing.DefaultListModel;
import model.MusteriModel;
import model.VeritabaniIslemleri;
import view.YamugView;

public class MusteriController {
    public static String mlist;
    public static String parametre1;
    public static String mEkleAlist;
    public static String mEkleList;
    public static String mEkleAdi;
    public static String mEkleSoyAdi;
    public static String mEkleTel;
    public static String mEkleEmail;
    public static String mEkleKira_Tarihi;
    public static String mEkleOda_NO;
    public static String mEkleDogalgaz;
    public static String mEkleSu;
    public static String mEkleInternet;
    public static String mEkleElektrik;
    public static String like2;
    public static String parametre10;
    public static String parametre11;
    public static String mGT;
    public static String parametre13;
    public static String parametre14;
    public static String parametre15;
    public static String parametre16;
    public static String parametre17;
    public static String parametre18;
    public static String parametre19;
    public static String parametre20;
    public static String parametre21;
    public static String parametre22;
    public static String mSil;
    public static String gList;
    public static String parametre2;
    public static boolean rb1;
    public static boolean rb2;
    public static boolean rb3;
    public static boolean rb4;
    public static String like;
    public static String parametre3;
    public static String parametre4;
    public static String parametre5;
    public static int mEkleAId;
    public static String parametre8;
    public static String parametre9;
    public static String mailA;
    public static String kac;
    public static String yil;
    public static String ay;
    public static String yil2;
    public static String ay2;
    public static String gun2;
    public static int mailListSayac;
    public static String gunx;
    public static String gunx2;
    public static String gunx3;
    public static String parametre23;
    public static String mBilgilendirme;
    public static DefaultListModel mBilgiList = new DefaultListModel();
    
    private final MusteriModel model;
    private final YamugView view;

    public MusteriController(MusteriModel model, YamugView view) {
        this.model = model;
        this.view = view;
    }

    public int getMusteri_ID() {
        return model.getMusteri_ID();
    }

    public void setMusteri_ID(int musteri_ID) {
        model.setMusteri_ID(musteri_ID);
    }
    
    public void setAd(String ad) {
        model.setAd(ad);
    }
    
    public String getAd() {
        return model.getAd();
    }

    public void setSoyad(String soyad) {
        model.setSoyad(soyad);
    }
    
    public String getSoyad() {
        return model.getSoyad();
    }

    public void setMusteri_tel(String musteri_tel) {
        model.setMusteri_tel(musteri_tel);
    }
    
    public String getMusteri_tel() {
        return model.getMusteri_tel();
    }

    public void setMusteri_email(String musteri_email) {
        model.setMusteri_email(musteri_email);
    }
    
    public String getMusteri_email() {
        return model.getMusteri_email();
    }

    public void setMusteri_kira_tarihi(String musteri_kira_tarihi) {
        model.setMusteri_kira_tarihi(musteri_kira_tarihi);
    }
    
    public String getMusteri_kira_tarihi() {
        return model.getMusteri_kira_tarihi();
    }
    
    public int getMusteri_Apart_ID() {
        return model.getMusteri_Apart_ID();
    }

    public void setMusteri_Apart_ID(int musteri_Apart_ID) {
        model.setMusteri_Apart_ID(musteri_Apart_ID);
    }

    public String getMusteri_oda_no() {
        return model.getMusteri_oda_no();
    }

    public void setMusteri_oda_no(String musteri_oda_no) {
        model.setMusteri_oda_no(musteri_oda_no);
    }

    public String getMusteri_dogalgaz() {
        return model.getMusteri_dogalgaz();
    }

    public void setMusteri_dogalgaz(String musteri_dogalgaz) {
        model.setMusteri_dogalgaz(musteri_dogalgaz);
    }

    public String getMusteri_su() {
        return model.getMusteri_su();
    }

    public void setMusteri_su(String musteri_su) {
        model.setMusteri_su(musteri_su);
    }

    public String getMusteri_internet() {
        return model.getMusteri_internet();
    }

    public void setMusteri_internet(String musteri_internet) {
        model.setMusteri_internet(musteri_internet);
    }

    public String getMusteri_elektrik() {
        return model.getMusteri_elektrik();
    }

    public void setMusteri_elektrik(String musteri_elektrik) {
        model.setMusteri_elektrik(musteri_elektrik);
    }

   public void viewGuncelle(){				
       view.musteriBilgileriniEkle(getMusteri_ID(),getAd(),getSoyad(),getMusteri_tel(),getMusteri_email(),getMusteri_kira_tarihi(),getMusteri_Apart_ID(),getMusteri_oda_no(),getMusteri_dogalgaz(),getMusteri_su(),getMusteri_internet(),getMusteri_elektrik());
   }	
    
   public void musteriGoruntule(String a){
       mlist = "asd";
       VeritabaniIslemleri.sorgu2 = "from Musteri where Musteri_Apart_ID in (from Apart where Apart_Adi = :parametre1)";
       parametre1=a;
       VeritabaniIslemleri.veritabanindanMusteriGetir();
       viewGuncelle();
       parametre1=null;
       mlist = null;
   }
   
   public void musteriEkle(String a,String adi,String soyadi,String tel,String email,String kira,String odaNO,String dogalgaz,String su,String internet,String elektrik){
       mEkleList = "asd";
       mEkleAdi = adi;
       mEkleSoyAdi = soyadi;
       mEkleTel = tel;
       mEkleEmail = email;
       mEkleKira_Tarihi = kira;
       mEkleOda_NO = odaNO;
       mEkleDogalgaz = dogalgaz;
       mEkleSu = su;
       mEkleInternet = internet;
       mEkleElektrik = elektrik;
       VeritabaniIslemleri.veritabanindanMusteriGetir();
       viewGuncelle();
       mEkleList = null;
   }
   
   public void musteriAra1(String a,String b){
       like2 = "asd";
       VeritabaniIslemleri.sorgu2 = "from Musteri where Musteri_Adi like :parametre10 and Musteri_Soyadi like :parametre11";
       parametre10 = a;
       parametre11 = b;
       VeritabaniIslemleri.veritabanindanMusteriGetir();
       viewGuncelle();
       parametre10 = null;
       parametre11 = null;
       like2 = null;
   }
   
   public void musteriAra2(String a){
       like2 = "asd";
       VeritabaniIslemleri.sorgu2 = "from Musteri where Musteri_Tel like :parametre10";
       parametre10 = a;
       VeritabaniIslemleri.veritabanindanMusteriGetir();
       viewGuncelle();
       parametre10 = null;
       like2 = null;
   }
   
   public void musteriGuncelle(String a,String p13,String p14,String p15,String p16,String p17,String p18,String p19,String p20,String p21,String p22){
       mGT = "asd";
       VeritabaniIslemleri.sorgu2 = "UPDATE Musteri set Musteri_Adi = :parametre13, Musteri_Soyadi = :parametre14, Musteri_Tel=:parametre15, Musteri_Email=:parametre16, Musteri_Kira_Tarihi = :parametre17, Musteri_Oda_NO = :parametre18, Musteri_Dogalgaz = :parametre19 , Musteri_Su = :parametre20, Musteri_Internet = :parametre21 ,Musteri_Elektrik = :parametre22 where Musteri_ID= '"+a+"'";
       parametre13 = p13;
       parametre14 = p14;
       parametre15 = p15;
       parametre16 = p16;
       parametre17 = p17;
       parametre18 = p18;
       parametre19 = p19;
       parametre20 = p20;
       parametre21 = p21;
       parametre22 = p22;
       VeritabaniIslemleri.veritabanindanMusteriGetir();
       viewGuncelle();
       mGT = null;
   }
   
   public void musteriSil(String a){
       mSil = "asd";
       //DELETE FROM Dlist where Dlist_Turu = '2'  and Dlist_Marka = '2' and Dlist_Adet = '2' and Dlist_Apart_ID = (from Apart where Apart_Adi='yamugapart') 
       VeritabaniIslemleri.sorgu2 = "DELETE FROM Musteri where Musteri_ID='"+a+"'";
       VeritabaniIslemleri.veritabanindanMusteriGetir();
       viewGuncelle();
       mSil = null;
   }
   
   public void giderGoruntule(String a,boolean r1,boolean r2,boolean r3,boolean r4){
       gList ="asd";
       rb1=r1;
       rb2=r2;
       rb3=r3;
       rb4=r4;
       parametre1 = a;
       VeritabaniIslemleri.sorgu2 = "from Musteri where Musteri_Apart_ID in (from Apart where Apart_Adi = :parametre1)";
       parametre2 = null;
       VeritabaniIslemleri.veritabanindanMusteriGetir();
       viewGuncelle();
       rb1=false;
       rb2=false;
       rb3=false;
       rb4=false;
       gList=null;
       parametre1= null;
   }
   
   public void giderAra1(String a,String b){
       like = "asd";
       VeritabaniIslemleri.sorgu2 = "from Musteri where Musteri_Adi like :parametre1 and Musteri_Soyadi like :parametre2";
       parametre1 = a;
       parametre2 = b;
       VeritabaniIslemleri.veritabanindanMusteriGetir();
       viewGuncelle();
       parametre2 = null;
       parametre1 = null;
       like = null;
   }
   
   public void giderAra2(String a){
       like = "asd";
       VeritabaniIslemleri.sorgu2 = "from Musteri where Musteri_Tel like :parametre1";
       parametre1 = a;
       //parametre2 = "asd";
       VeritabaniIslemleri.veritabanindanMusteriGetir();
       viewGuncelle();
       parametre1 = null;
       like = null;
   }
   
   public void giderGuncelle(String p1,String p2,String p3,String p4,String p5){
       VeritabaniIslemleri.sorgu2 = "UPDATE Musteri set Musteri_Dogalgaz = :parametre1 , Musteri_Su = :parametre2, Musteri_Internet = :parametre3 ,Musteri_Elektrik = :parametre4 WHERE Musteri_Tel = :parametre5";
       parametre1 = p1;
       parametre2 = p2;
       parametre3 = p3;
       parametre4 = p4;
       parametre5 = p5;
       VeritabaniIslemleri.veritabanindanMusteriGetir();
       viewGuncelle();
       parametre1 = "asd";
       //parametre2 = "asd";
        parametre2 = null;
       parametre3 = "asd";
       parametre4 = "asd";
       parametre5 = "asd";
   }
   
   public void mailGoruntule(String mA,String yl,String ayy,int gun2,int gun3,int gun){
       parametre8 = "asd";
       mailA = mA;
       yil = yl;
       ay = ayy;
       
       String gunx2s = String.valueOf(gun2);
       if(gunx2s.length() == 1)
       {
           gunx2=0+gunx2s;
       }
       else
       {
           gunx2 = String.valueOf(gun2);
       }
       
       String gunx3s = String.valueOf(gun3);
       if(gunx3s.length() == 1)
       {
           gunx3=0+gunx3s;
       }
       else
       {
           gunx3 = String.valueOf(gun3);
       }
       
       String gunxs = String.valueOf(gun);
       if(gunxs.length() == 1)
       {
           gunx=0+gunxs;
       }
       else
       {
           gunx= String.valueOf(gun);
       }
       
       VeritabaniIslemleri.sorgu2="from Musteri where Musteri_Apart_ID in (from Apart where Apart_Adi="+"'"+mailA+"'"+" and (Musteri_Kira_Tarihi ="+"'"+yil+"-"+ay+"-"+gunx2+"'"+"or Musteri_Kira_Tarihi="+"'"+yil+"-"+ay+"-"+gunx3+"' or Musteri_Kira_Tarihi="+"'"+yil+"-"+ay+"-"+gunx+"'))";
       //VeritabaniIslemleri.sorgu2 = "from Musteri where Musteri_Apart_ID in (from Apart where Apart_Adi='yamugapart' and (Musteri_Kira_Tarihi ='2015-01-03'  or Musteri_Kira_Tarihi='2015-01-04' or Musteri_Kira_Tarihi='2015-01-05'))";
       VeritabaniIslemleri.veritabanindanMusteriGetir();
       viewGuncelle();
       parametre8=null;
       parametre9 ="asd";
       VeritabaniIslemleri.veritabanindanMusteriGetir();
       viewGuncelle();
       parametre9=null;
   }
   
   public void musteriBilgilendirme(String apartAdi){
       parametre23 = apartAdi;
       VeritabaniIslemleri.sorgu2="from Musteri where Musteri_Apart_ID = (from Apart where Apart_Adi = '"+parametre23+"')";
       VeritabaniIslemleri.veritabanindanMusteriGetir();
       viewGuncelle();
       parametre23=null;
   }
}
