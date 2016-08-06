package controller;

import javax.swing.DefaultListModel;
import model.DlistModel;
import model.VeritabaniIslemleri;
import view.YamugView;

public class DlistController {
    public static String parametre6;
    public static String parametre7;
    public static String dlist;
    public static int dlistSayac;
    public static String dlistSil;
    public static DefaultListModel dizi = new DefaultListModel();
    public static DefaultListModel bosDizi = new DefaultListModel();
    public static DefaultListModel bosDlm2 = new DefaultListModel();
    public static DefaultListModel dizi2 = new DefaultListModel();
    public static DefaultListModel dizi3 = new DefaultListModel();
    public static DefaultListModel dizi4 = new DefaultListModel();
    public static String dlistG;
    
    private final DlistModel model;
    private final YamugView view;

    public DlistController(DlistModel model, YamugView view) {
        this.model = model;
        this.view = view;
    }
    
        public int getDlist_ID() {
        return model.getDlist_ID();
    }

    public void setDlist_ID(int Dlist_ID) {
        model.setDlist_ID(Dlist_ID);
    }

    public String getDlist_Turu() {
        return model.getDlist_Turu();
    }

    public void setDlist_Turu(String Dlist_Turu) {
        model.setDlist_Turu(Dlist_Turu);
    }

    public String getDlist_Marka() {
        return model.getDlist_Marka();
    }

    public void setDlist_Marka(String Dlist_Marka) {
        model.setDlist_Marka(Dlist_Marka);
    }

    public String getDlist_Adet() {
        return model.getDlist_Adet();
    }

    public void setDlist_Adet(String Dlist_Adet) {
        model.setDlist_Adet(Dlist_Adet);
    }

    public int getDlist_Apart_ID() {
        return model.getDlist_Apart_ID();
    }

    public void setDlist_Apart_ID(int Dlist_Apart_ID) {
        model.setDlist_Apart_ID(Dlist_Apart_ID);
    }
    
    public void viewGuncelle(){				
       view.dlistBilgileriniEkle(getDlist_ID(),getDlist_Turu(),getDlist_Marka(),getDlist_Adet(),getDlist_Apart_ID());
   }
    
    public void dlistSay(String a){
        dlist = "asd";
        parametre6 = a;
        VeritabaniIslemleri.veritabanindanDlistGetir();
        viewGuncelle();
        dlist = null;
    }
    
    public void dlistGoruntule(String a){
        dlist = "asdf";
        parametre7 = a;
        VeritabaniIslemleri.sorgu3 = "from Dlist where Dlist_Apart_ID = (from Apart where Apart_Adi= :parametre7)";
        VeritabaniIslemleri.veritabanindanDlistGetir();
        viewGuncelle();
        dlist = null;
    }
    
    public void dlistSil(String a,String b,String c,String d){
        dlistSil = "asd";
        VeritabaniIslemleri.sorgu3 = "DELETE FROM Dlist where Dlist_Turu = '"+a+"'"+" and Dlist_Marka = '"+b+"'"+" and Dlist_Adet = '"+c+"'"+" and Dlist_Apart_ID = (from Apart where Apart_Adi='"+d+"'"+")";
        VeritabaniIslemleri.veritabanindanDlistGetir();
        viewGuncelle();
        dlistSil = null;
    }
    
    public void dlistGuncelle(String a,String b,String c){
        dlistG = "asd";
        VeritabaniIslemleri.sorgu3 = "UPDATE Dlist set Dlist_Marka = "+"'"+a+"'"+", Dlist_Adet = '"+b+"' WHERE Dlist_ID = "+"'"+c+"'";
        VeritabaniIslemleri.veritabanindanDlistGetir();
        viewGuncelle();
        dlistG = null;
    }
}
