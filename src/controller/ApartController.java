package controller;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.ApartModel;
import model.VeritabaniIslemleri;
import view.YamugView;

public class ApartController {
    private MusteriController musteriController;
    private DlistController dlistController;
    private VeritabaniIslemleri vtIslem;
    public static JTable tablo = new JTable();
    public static JTable tablo2 = new JTable();
    public static JTable tablo3 = new JTable();
    public static JTable tablo4 = new JTable();
    public static JTable tablo5 = new JTable();
    public static JTable tablo6 = new JTable();
    public static DefaultListModel dlm = new DefaultListModel();
    public static String parametre1;
    public static String parametre2;
    public static String parametre3;
    public static String parametre4;
    public static String parametre5;
    public static String parametre6;
    public static String parametre7;
    public static String parametre8;
    public static String parametre9;
    public static boolean rb1;
    public static boolean rb2;
    public static boolean rb3;
    public static boolean rb4;
    public static boolean rb5;
    public static boolean rb6;
    public static String alist;
    public static String dlist;
    public static String str;
    public static String mlist;
    public static String mElist;
    public static String a2list;
    private final JTextField[] tfler = new JTextField[35]; 
    private final JLabel[] lbller = new JLabel[13];
    private final JButton[] btnler = new JButton[13];
    public static String d2list;
    public static String dEklelist;
    public static String dlistTuru;
    public static String dlistMarka;
    public static String dlistAdet;
    public static int dlistSayac;
    public static int dlistlblSayac;
    public static DefaultListModel dizi = new DefaultListModel();
    public static DefaultListModel bosDizi = new DefaultListModel();
    public static DefaultListModel bosDlm2 = new DefaultListModel();
    public static DefaultListModel dizi2 = new DefaultListModel();
    public static DefaultListModel dizi3 = new DefaultListModel();
    public static DefaultListModel dizi4 = new DefaultListModel();
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf11;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf13;
    private javax.swing.JTextField tf14;
    private javax.swing.JTextField tf15;
    private javax.swing.JTextField tf16;
    private javax.swing.JTextField tf17;
    private javax.swing.JTextField tf18;
    private javax.swing.JTextField tf19;
    private javax.swing.JTextField tf20;
    private javax.swing.JTextField tf21;
    private javax.swing.JTextField tf22;
    private javax.swing.JTextField tf23;
    private javax.swing.JTextField tf24;
    private int tiklama;
    public static String dlistG;
    public static String like;
    public static String mailA;
    public static String kac;
    public static String yil;
    public static String ay;
    public static String gun;
    public static String yil2;
    public static String ay2;
    public static String gun2;
    private static final String USER_NAME = "yamugapart";  // GMail user name (just the part before "@gmail.com")
    private static final String PASSWORD = "yamugapart*"; // GMail password
    private static String RECIPIENT;
    public static int mailListSayac;
    public static int gunx;
    public static int gunx2;
    public static int gunx3;
    public static String dlistSil;
    public static String dSilA;
    public static String dlistSil2;
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
    public static String mEkleList;
    public static String mEkleAlist;
    public static int mEkleAId;
    public static String like2;
    public static String parametre10;
    public static String parametre11;
    public static String mGuncelle;
    public static String parametre12;
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
    public static String mGT;
    public static String mSil;
    public static String gList;
    public static String aEkleList;
    public static String aEkleAdi;
    public static String aEkleAdres;
    public static String aEkleTemizlik;
    public static String aEkleOnarim;
    public static String aEkleAriza;
    public static String aTumList;
    public static String aGuncelle;
    public static String parametre23;
    public static String parametre24;
    public static String parametre25;
    public static int aGId;
    public static String aGAdi;
    public static String aGAdres;
    public static String aGTemizlik;
    public static String aGuncelle2;
    public static String aSil;
    public static String arizaGuncelle;
    public static String onarim;
    public static String ariza;
    public static String arizaEkleList;
    public static String onarimEkle;
    public static String arizaEkle;
    public static String parametre26;
    public static String parametre27;
    public static int aID;
    
    private final ApartModel model;
    private final YamugView view;

    public ApartController(ApartModel model, YamugView view) {
        this.model = model;
        this.view = view;
    }
     
    public int getApart_ID() {
        return model.getApart_ID();
    }

    public void setApart_ID(int Apart_ID) {
        model.setApart_ID(Apart_ID);
    }
    
    public String getApart_Adi() {
        return model.getApart_Adi();
    }
    
    public void setApart_Adi(String Apart_Adi) {
        model.setApart_Adi(Apart_Adi);
    }
    
    public String getApart_Adres() {
        return model.getApart_Adres();
    }
    
    public void setApart_Adres(String Apart_Adres) {
        model.setApart_Adres(Apart_Adres);
    }
    
    public String getApart_Temizlik() {
        return model.getApart_Temizlik();
    }

    public void setApart_Temizlik(String Apart_Temizlik) {
        model.setApart_Temizlik(Apart_Temizlik);
    }

    public String getApart_Demirbas_Listesi() {
        return model.getApart_Demirbas_Listesi();
    }

    public void setApart_Demirbas_Listesi(String Apart_Demirbas_Listesi) {
        model.setApart_Demirbas_Listesi(Apart_Demirbas_Listesi);
    }
    
   public void viewGuncelle(){				
       view.apartBilgileriniEkle(getApart_ID(),getApart_Adi(), getApart_Adres(), getApart_Temizlik(), getApart_Demirbas_Listesi());
   }
   
   public void apartListesi1(){
       aTumList="asd";
       VeritabaniIslemleri.sorgu = "from Apart";
       VeritabaniIslemleri.veritabanindanApartGetir();
       viewGuncelle();
       aTumList=null;

   }
   
   public void apartEkle(String a,String b,String c,String e,String f){
        
        aEkleList = "asd";
        aEkleAdi = a;
        aEkleAdres = b;
        aEkleTemizlik = c;
        aEkleAriza = e;
        aEkleOnarim = f;
        VeritabaniIslemleri.veritabanindanApartGetir();
        viewGuncelle();
        aEkleList = null;
        apartListesi1();

        JOptionPane.showMessageDialog(null, "Eklendi");

   }
   
   public void apartGuncelle(String a,String b,String c,int d){
        aGuncelle2="asd";
        VeritabaniIslemleri.sorgu = "UPDATE Apart set Apart_Adi=:parametre23 , Apart_Adres = :parametre24 , Apart_Temizlik = :parametre25 where Apart_ID ='"+d+"'";
        parametre23 = a;
        parametre24 = b;
        parametre25 = c;
        VeritabaniIslemleri.veritabanindanApartGetir();
        viewGuncelle();
        aGuncelle2=null;
        apartListesi1();
        JOptionPane.showMessageDialog(null, "Güncellendi");
   }
   
   public void apartSilme(String ApartId){
        aSil = "asd";
        VeritabaniIslemleri.sorgu = "DELETE FROM Apart where Apart_ID='"+ApartId+"'";
        VeritabaniIslemleri.veritabanindanApartGetir();
        viewGuncelle();
        JOptionPane.showMessageDialog(null, "Silindi");
        aSil = null;
        apartListesi1();
   }
   
   public void apartBul(String a){
       alist = "asd";
       VeritabaniIslemleri.sorgu = "from Apart where Apart_ID in (from Apart where Apart_Adi = :parametre1)";
       parametre1=a;
       VeritabaniIslemleri.veritabanindanApartGetir();
       viewGuncelle(); 
       parametre1=null;
       alist = null;
       apartListesi1();
   }
   
   public void apartTemizlikGuncelle(String a, String b){
       parametre1 = a;
       parametre2 = b;
       VeritabaniIslemleri.sorgu="UPDATE Apart set Apart_Temizlik = :parametre1 where Apart_Adi = :parametre2";
       VeritabaniIslemleri.veritabanindanApartGetir();
       viewGuncelle();
       parametre2="asd";
       parametre1="asd";
       apartBul(b);
   }
   
   public String apartArizaGoruntule(String a){
       arizaGuncelle = "asd";
       VeritabaniIslemleri.sorgu = "from Apart where Apart_Adi='"+a+"'";
       VeritabaniIslemleri.veritabanindanApartGetir();
       viewGuncelle();
       arizaGuncelle = null;
       apartListesi1();
       String gecici=onarim+"/"+ariza;
       return gecici;
   }
   
   public void apartArizaGuncelle(String a,String b,String c){
       arizaEkleList = "asd";
       VeritabaniIslemleri.sorgu = "UPDATE Apart set Apart_Onarim = '"+a+"'"+" , Apart_Ariza = '"+b+"'"+" where Apart_Adi='"+c+"'";
       onarimEkle=a;
       arizaEkle=b;
       VeritabaniIslemleri.veritabanindanApartGetir();
       viewGuncelle();
       arizaEkleList = null;
       JOptionPane.showMessageDialog(null, "Eklendi/Güncellendi");
   }
   
   public void apartDemirbasId(String a){
       d2list = "asd";
       parametre1 = a;
       VeritabaniIslemleri.sorgu = "from Apart where Apart_Adi = :parametre1";
       VeritabaniIslemleri.veritabanindanApartGetir();
       viewGuncelle();
       parametre1 = null;
       d2list = null;
   }
   
   public void apartDemirbasEkle(String b,String c,String d){
       dEklelist="asd";
       dlistTuru=b;
       dlistMarka=c;
       dlistAdet=d;
       VeritabaniIslemleri.veritabanindanDlistGetir();
       dEklelist = null;
   }
   
   public void apartId(String a){
       parametre1 = a;
       VeritabaniIslemleri.sorgu = "from Apart where Apart_Adi = :parametre1";
       VeritabaniIslemleri.veritabanindanApartGetir();
       viewGuncelle();
       parametre1 = null;
   }
}
