package yamugapart.entity;
// Generated 24.Ara.2014 13:47:28 by Hibernate Tools 3.6.0



/**
 * Apart generated by hbm2java
 */
public class Apart  implements java.io.Serializable {


     private Integer apartId;
     private String apartAdi;
     private String apartAdres;
     private String apartTemizlik;
     private String apartAriza;
     private String apartOnarim;

    public Apart() {
    }

    public Apart(String apartAdi, String apartAdres, String apartTemizlik, String apartAriza, String apartOnarim) {
       this.apartAdi = apartAdi;
       this.apartAdres = apartAdres;
       this.apartTemizlik = apartTemizlik;
       this.apartAriza = apartAriza;
       this.apartOnarim = apartOnarim;
    }
   
    public Integer getApartId() {
        return this.apartId;
    }
    
    public void setApartId(Integer apartId) {
        this.apartId = apartId;
    }
    public String getApartAdi() {
        return this.apartAdi;
    }
    
    public void setApartAdi(String apartAdi) {
        this.apartAdi = apartAdi;
    }
    public String getApartAdres() {
        return this.apartAdres;
    }
    
    public void setApartAdres(String apartAdres) {
        this.apartAdres = apartAdres;
    }
    public String getApartTemizlik() {
        return this.apartTemizlik;
    }
    
    public void setApartTemizlik(String apartTemizlik) {
        this.apartTemizlik = apartTemizlik;
    }
    public String getApartAriza() {
        return this.apartAriza;
    }
    
    public void setApartAriza(String apartAriza) {
        this.apartAriza = apartAriza;
    }
    public String getApartOnarim() {
        return this.apartOnarim;
    }
    
    public void setApartOnarim(String apartOnarim) {
        this.apartOnarim = apartOnarim;
    }




}

