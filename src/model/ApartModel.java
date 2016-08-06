package model;

public class ApartModel {
   private int Apart_ID;
   private String Apart_Adi;
   private String Apart_Adres;
   private String Apart_Temizlik;
   private String Apart_Demirbas_Listesi;
   private String Apart_Onarim;
   private String Apart_Ariza;

    public int getApart_ID() {
        return Apart_ID;
    }

    public void setApart_ID(int Apart_ID) {
        this.Apart_ID = Apart_ID;
    }
    
    public String getApart_Onarim() {
        return Apart_Onarim;
    }

    public void setApart_Onarim(String Apart_Onarim) {
        this.Apart_Onarim = Apart_Onarim;
    }
    
    public void setApart_Ariza(String Apart_Ariza) {
        this.Apart_Ariza = Apart_Ariza;
    }
    
    public String getApart_Ariza() {
        return Apart_Ariza;
    }

    public String getApart_Adi() {
        return Apart_Adi;
    }

    public void setApart_Adi(String Apart_Adi) {
        this.Apart_Adi = Apart_Adi;
    }

    public String getApart_Adres() {
        return Apart_Adres;
    }

    public void setApart_Adres(String Apart_Adres) {
        this.Apart_Adres = Apart_Adres;
    }

    public String getApart_Temizlik() {
        return Apart_Temizlik;
    }

    public void setApart_Temizlik(String Apart_Temizlik) {
        this.Apart_Temizlik = Apart_Temizlik;
    }

    public String getApart_Demirbas_Listesi() {
        return Apart_Demirbas_Listesi;
    }

    public void setApart_Demirbas_Listesi(String Apart_Demirbas_Listesi) {
        this.Apart_Demirbas_Listesi = Apart_Demirbas_Listesi;
    }
    
    
}
