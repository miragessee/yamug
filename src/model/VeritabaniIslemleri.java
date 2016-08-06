package model;

import controller.ApartController;
import controller.DlistController;
import controller.MusteriController;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import view.YamugView;
import yamugapart.entity.Apart;
import yamugapart.entity.Dlist;
import yamugapart.entity.Musteri;
import yamugapart.util.HibernateUtil;

public class VeritabaniIslemleri {
    private MusteriController musteriController;
    private static ApartController apartController;
    private DlistController dlistController;
    static String aAdi = "";
    static String aAdres = "";
    static String aTemizlik = "";
    static int mID;
    static String mAdi = "";
    static String mSoyadi = "";
    static String mTel = "";
    static String mEmail = "";
    static String mKira_Tarihi = "";
    static int mApart_ID;
    static String mOda_NO;
    static String mDogalgaz = "";
    static String mSu = "";
    static String mInternet = "";
    static String mElektrik = "";
    public DefaultTableModel dtm = new DefaultTableModel();
    public static String sorgu="from Apart";
    public static String sorgu2="from Musteri";
    public static String sorgu3="from Dlist";
    static int dID;
    static String dTuru = "";
    static String dMarka = "";
    static String dAdet = "";
    static int dApart_ID;
    private static final DefaultListModel bosDlm = new DefaultListModel();
    
    private void runQueryBasedOnFirstName() {
        executeHQLQuery(sorgu);
    }
    
    private void runQueryBasedOnFirstName2() {
        executeHQLQuery2(sorgu2);
    }
    
    private void runQueryBasedOnFirstName3() {
        executeHQLQuery3(sorgu3);
    }
    private void executeHQLQuery(String hql) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery(hql);
        if(apartController.parametre1 != null)
        {
            q.setParameter("parametre1", apartController.parametre1);
        }
        if(apartController.parametre2 != null && apartController.parametre2 != "asd")
        {
            q.setParameter("parametre2", apartController.parametre2);
        }
        
        if(apartController.parametre23 != null && apartController.aGuncelle2 == "asd")
        {
            q.setParameter("parametre23",apartController.parametre23);
        }
        if(apartController.parametre24 != null && apartController.aGuncelle2 == "asd")
        {
            q.setParameter("parametre24",apartController.parametre24);
        }
        if(apartController.parametre25 != null && apartController.aGuncelle2 == "asd")
        {
            q.setParameter("parametre25",apartController.parametre25);
        }
        
        if(apartController.parametre2 == "asd" || apartController.parametre2 == null && apartController.aGuncelle2 != "asd" && apartController.aSil != "asd" && apartController.arizaEkleList !="asd")
        {
            if(apartController.arizaEkleList !="asd")
            {
            List resultList = q.list();
            displayResult(resultList);
            }
        }
        try
        {
            int result = q.executeUpdate();
        }
        catch (Exception e)
        {
            
        }
        if(apartController.aEkleList == "asd")
        {
            Apart alist = new Apart();
            alist.setApartAdi(apartController.aEkleAdi);
            alist.setApartAdres(apartController.aEkleAdres);
            alist.setApartTemizlik(apartController.aEkleTemizlik);
            alist.setApartOnarim("sağlam");
            alist.setApartAriza("");
            session.save(alist);
        }

        session.getTransaction().commit();
    } catch (HibernateException he) {
        he.printStackTrace();
    }
    }
    
    private void executeHQLQuery2(String hql) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery(hql);
        if(musteriController.like2 != "asd")
        {
        if(musteriController.parametre1 != null && musteriController.like == "asd")
        {
            q.setParameter("parametre1", musteriController.parametre1+"%");
        }
        if(musteriController.parametre1 != null && musteriController.like == null)
        {
            q.setParameter("parametre1", musteriController.parametre1);
        }
        if(musteriController.parametre2 != null && musteriController.like == "asd")
        {
            q.setParameter("parametre2", musteriController.parametre2+"%");
        }
        if(musteriController.parametre2 != null && musteriController.like == null)
        {
            q.setParameter("parametre2", musteriController.parametre2);
        }
        if(musteriController.parametre3 != "asd" && musteriController.parametre3 != null)
        {
            q.setParameter("parametre3", musteriController.parametre3);
        }
        if(musteriController.parametre4 != "asd" && musteriController.parametre4 != null)
        {
            q.setParameter("parametre4", musteriController.parametre4);
        }
        if(musteriController.parametre5 != "asd" && musteriController.parametre5 != null)
        {
            q.setParameter("parametre5", musteriController.parametre5);
        }
        }        
        if(musteriController.parametre10 != null && musteriController.like2 =="asd")
        {
            q.setParameter("parametre10", musteriController.parametre10+"%");
        }
        
        if(musteriController.parametre11 != null && musteriController.like2 =="asd")
        {
            q.setParameter("parametre11", musteriController.parametre11+"%");
        }
        
        
        if(musteriController.mGT == "asd")
        {  
            q.setParameter("parametre13",musteriController.parametre13);
            q.setParameter("parametre14",musteriController.parametre14);
            q.setParameter("parametre15",musteriController.parametre15);
            q.setParameter("parametre16",musteriController.parametre16);
            q.setParameter("parametre17",musteriController.parametre17);
            q.setParameter("parametre18",musteriController.parametre18);
            q.setParameter("parametre19",musteriController.parametre19);
            q.setParameter("parametre20",musteriController.parametre20);
            q.setParameter("parametre21",musteriController.parametre21);
            q.setParameter("parametre22",musteriController.parametre22);
        }
        if((musteriController.parametre5 == "asd" || musteriController.parametre5 == null) && musteriController.mGT != "asd" && musteriController.mSil != "asd" && musteriController.mEkleList !="asd" && musteriController.mGT !="asd")
        {
            List resultList2 = q.list();
            displayResult2(resultList2);
        }
        try
        {
            int result = q.executeUpdate();
        }
        catch (Exception e)
        {
            
        }
        if(musteriController.parametre9 == "asd")
        {
            String say2 = "select count(*) from Musteri where Musteri_Apart_ID in (from Apart where Apart_Adi="+"'"+musteriController.mailA+"'"+" and (Musteri_Kira_Tarihi ="+"'"+musteriController.yil+"-"+musteriController.ay+"-"+musteriController.gunx2+"'"+"or Musteri_Kira_Tarihi="+"'"+musteriController.yil+"-"+musteriController.ay+"-"+musteriController.gunx3+"'"+"or Musteri_Kira_Tarihi="+"'"+musteriController.yil+"-"+musteriController.ay+"-"+musteriController.gunx+"'))";
            //System.out.println(musteriController.mailA);
            //System.out.println(musteriController.yil);
            //System.out.println(musteriController.ay);
            //System.out.println(musteriController.gunx);
            //String say2 = "select count(*) from Musteri where Musteri_Apart_ID in (from Apart where Apart_Adi='yamugapart' and (Musteri_Kira_Tarihi ='2015-01-03' or Musteri_Kira_Tarihi='2015-01-04' or Musteri_Kira_Tarihi='2015-01-05'))";
            musteriController.mailListSayac = ((Long)session.createQuery(say2).uniqueResult()).intValue();
        }
        if(musteriController.mEkleList =="asd")
        {
            Musteri mlist = new Musteri();
            mlist.setMusteriApartId(musteriController.mEkleAId);
            mlist.setMusteriAdi(musteriController.mEkleAdi);
            mlist.setMusteriSoyadi(musteriController.mEkleSoyAdi);
            mlist.setMusteriTel(musteriController.mEkleTel);
            mlist.setMusteriEmail(musteriController.mEkleEmail);
            mlist.setMusteriKiraTarihi(musteriController.mEkleKira_Tarihi);
            mlist.setMusteriOdaNo(musteriController.mEkleOda_NO);
            mlist.setMusteriDogalgaz(musteriController.mEkleDogalgaz);
            mlist.setMusteriSu(musteriController.mEkleSu);
            mlist.setMusteriInternet(musteriController.mEkleInternet);
            mlist.setMusteriElektrik(musteriController.mEkleElektrik);
            session.save(mlist); 
        }
        session.getTransaction().commit();
    } catch (HibernateException he) {
        he.printStackTrace();
    }
    }
    
    private void executeHQLQuery3(String hql) {
        try
        {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            if(dlistController.dlistG == "asd" || dlistController.dlistSil == "asd")
            {
                q.executeUpdate();
            }
            if(dlistController.dlist == "asdf")
            {
                q.setParameter("parametre7", dlistController.parametre7);
                List resultList3 = q.list();
                displayResult3(resultList3);
            }
            if(dlistController.parametre7 == null || dlistController.dlist == "asd" && apartController.dEklelist !="asd")
            {
                String say = "SELECT count(*) from Dlist where Dlist_Apart_ID in (from Apart where Apart_Adi = " + "'"+dlistController.parametre6+"'"+")";
                dlistController.dlistSayac = ((Long)session.createQuery(say).uniqueResult()).intValue();
            }
              
            if(apartController.dEklelist == "asd")
            {
                Dlist dlist = new Dlist();
                dlist.setDlistApartId(dApart_ID);
                dlist.setDlistTuru(apartController.dlistTuru);
                dlist.setDlistMarka(apartController.dlistMarka);
                dlist.setDlistAdet(apartController.dlistAdet);
                session.save(dlist);
            }
            session.getTransaction().commit();
        } 
        catch (HibernateException he) 
        {
            he.printStackTrace();
        }
    }
    
    public void displayResult(List resultList) {
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        if(apartController.alist == null)
        {
            tableHeaders.add("Apart_ID");  
        }
        
        tableHeaders.add("Apart_Adi");
        if(apartController.alist == null)
        {
              tableHeaders.add("Apart_Adres"); 
        }
            tableHeaders.add("Apart_Temizlik");
        
        apartController.dlm.removeAllElements();
        for (Object o : resultList) {
            Apart actor = (Apart) o;
            Vector<Object> oneRow = new Vector<Object>();
            if(apartController.alist == null)
            {
                oneRow.add(actor.getApartId());
            }
            if(apartController.aGuncelle == "asd")
            {
                apartController.aGId = actor.getApartId();
                apartController.aGAdi = actor.getApartAdi();
                apartController.aGAdres = actor.getApartAdres();
                apartController.aGTemizlik = actor.getApartTemizlik();
            }
            
            if(apartController.arizaGuncelle == "asd")
            {
                apartController.ariza = actor.getApartAriza();
                apartController.onarim = actor.getApartOnarim();
            }
            if(apartController.d2list == "asd")
            {
                dApart_ID = actor.getApartId();
            }
            
            musteriController.mEkleAId = actor.getApartId();
            apartController.aID = actor.getApartId();
            oneRow.add(actor.getApartAdi());
            aAdi = actor.getApartAdi();
            
            if(apartController.alist == null)
            {
                    if(musteriController.mlist == null)
                    {
                                   if(musteriController.mEkleList == null) 
                                   {   
                                       if(apartController.aEkleList == null)
                                       {
                                               apartController.dlm.addElement(aAdi);
                                           
                                       }
                                   }     
                    }
            }
            if(apartController.alist == null)
            {
                oneRow.add(actor.getApartAdres()); 
            }
            
            aAdres = actor.getApartAdres();
            oneRow.add(actor.getApartTemizlik());
            
            aTemizlik = actor.getApartTemizlik();
            
          
            tableData.add(oneRow);
        }
      
        apartController.tablo.setModel(new DefaultTableModel(tableData, tableHeaders));
    }
    
    public void displayResult2(List resultList2) {
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        
        if(musteriController.like2 == "asd")
        {
            tableHeaders.add("ID");
        }
        
        tableHeaders.add("Adi");
        tableHeaders.add("Soyadi");
        tableHeaders.add("Tel");
        if(musteriController.mlist == "asd" || musteriController.parametre8 == "asd" || musteriController.like2 =="asd")
        {
           tableHeaders.add("Email"); 
        }
        if(musteriController.mlist == "asd" || musteriController.parametre8 == "asd" || musteriController.like2 =="asd")
        {
           tableHeaders.add("Kira_Tarihi"); 
        }
        tableHeaders.add("Oda_NO");
        if(musteriController.rb1 == true)
        {
            tableHeaders.add("Dogalgaz");
        }
        if(musteriController.rb2 == true)
        {
            tableHeaders.add("Su");
        }
        if(musteriController.rb3 == true)
        {
            tableHeaders.add("Internet");
        }
        if(musteriController.rb4 == true)
        {
            tableHeaders.add("Elektrik");
        }
        if(musteriController.rb1 == false && musteriController.rb2 == false && musteriController.rb3 == false && musteriController.rb4 == false && musteriController.parametre8 ==null)
        {
            tableHeaders.add("Dogalgaz");
            tableHeaders.add("Su");
            tableHeaders.add("Internet");
            tableHeaders.add("Elektrik");
        }
        if(musteriController.parametre8 ==null)
        tableHeaders.add("Toplam");

        for (Object o : resultList2) {
            Musteri actor = (Musteri) o;
            Vector<Object> oneRow = new Vector<Object>();
            if(musteriController.like2 == "asd")
            oneRow.add(actor.getMusteriId());
            mID = actor.getMusteriId();
            oneRow.add(actor.getMusteriAdi());
            mAdi = actor.getMusteriAdi();
            oneRow.add(actor.getMusteriSoyadi());
            mSoyadi = actor.getMusteriSoyadi();
            oneRow.add(actor.getMusteriTel());
            mTel = actor.getMusteriTel();
            if(musteriController.parametre23 != null)
            {
                musteriController.mBilgiList.addElement(actor.getMusteriEmail());
            }
            if(musteriController.like !="asd" && musteriController.gList != "asd")
            {
                oneRow.add(actor.getMusteriEmail());
            }
            mEmail = actor.getMusteriEmail();
            if(musteriController.like !="asd" && musteriController.gList != "asd")
            {
            oneRow.add(actor.getMusteriKiraTarihi());
            }
            mKira_Tarihi = actor.getMusteriKiraTarihi();
            mApart_ID = actor.getMusteriApartId();
            oneRow.add(actor.getMusteriOdaNo());
            mOda_NO = actor.getMusteriOdaNo();
            if(musteriController.rb1 == true)
            {
                oneRow.add(actor.getMusteriDogalgaz());
            }
            mDogalgaz = actor.getMusteriDogalgaz();
            if(musteriController.rb2 == true)
            {
                oneRow.add(actor.getMusteriSu());
            }
            mSu = actor.getMusteriSu();
            if(musteriController.rb3 == true)
            {
                oneRow.add(actor.getMusteriInternet());
            }
            mInternet = actor.getMusteriInternet();
            if(musteriController.rb4 == true)
            {
                oneRow.add(actor.getMusteriElektrik());
            }
            mElektrik = actor.getMusteriElektrik();
            if(musteriController.rb1 == false && musteriController.rb2 == false && musteriController.rb3 == false && musteriController.rb4 == false)
            {
                oneRow.add(actor.getMusteriDogalgaz());
                oneRow.add(actor.getMusteriSu());
                oneRow.add(actor.getMusteriInternet());
                oneRow.add(actor.getMusteriElektrik());
            }
            int toplam = 0;
            try
            {
                if(musteriController.rb1 == true)
                {
                    toplam = toplam + Integer.parseInt(mDogalgaz);
                }
                if(musteriController.rb2 == true)
                {
                    toplam = toplam + Integer.parseInt(mSu);
                }
                if(musteriController.rb3 == true)
                {
                    toplam = toplam + Integer.parseInt(mInternet);
                }
                if(musteriController.rb4 == true)
                {
                    toplam = toplam + Integer.parseInt(mElektrik);
                }
                if(musteriController.rb1 == false && musteriController.rb2 == false && musteriController.rb3 == false && musteriController.rb4 == false && musteriController.parametre8 ==null)
                {
                    toplam = Integer.parseInt(mDogalgaz) + Integer.parseInt(mSu) + Integer.parseInt(mInternet) + Integer.parseInt(mElektrik);
                }
                    
            }
            catch (Exception e)
            {
                
            }
            oneRow.add(toplam);
            tableData.add(oneRow);  
        }
            if(musteriController.parametre2 == null)
            {
            apartController.tablo2.setModel(new DefaultTableModel(tableData, tableHeaders));
            }
            else
            {
                apartController.tablo3.setModel(new DefaultTableModel(tableData, tableHeaders));
            }
            if(musteriController.like == "asd")
            {
                apartController.tablo3.setModel(new DefaultTableModel(tableData, tableHeaders));
            }
            if(musteriController.mlist == "asd")
            {
                apartController.tablo4.setModel(new DefaultTableModel(tableData, tableHeaders));
            }
            if(musteriController.parametre8 =="asd")
            {
                apartController.tablo5.setModel(new DefaultTableModel(tableData, tableHeaders));
            }
            if(musteriController.like2 == "asd")
            {
                apartController.tablo6.setModel(new DefaultTableModel(tableData, tableHeaders));
            }
    }
    
    private void displayResult3(List resultList3) {
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("DlistID"); 
        tableHeaders.add("DlistTuru");
        tableHeaders.add("DlistMarka");
        tableHeaders.add("DlistAdet");
        tableHeaders.add("DlistApartId");
        dlistController.dizi = bosDlm;
        for(Object o : resultList3) {
            Dlist actor = null;
            if(dlistController.dlist !="asd")
            {
                actor = (Dlist) o;
            }
            if(dlistController.dlist == "asdf")
            {
                dTuru = actor.getDlistTuru();
                dlistController.dizi.addElement(dTuru);
                dlistController.dizi2.addElement(actor.getDlistMarka());
                dlistController.dizi3.addElement(actor.getDlistAdet());
                dlistController.dizi4.addElement(actor.getDlistId());
            }  
        }
    }
    
    public static MusteriModel veritabanindanMusteriGetir(){
      VeritabaniIslemleri vtGetir = new VeritabaniIslemleri();
      vtGetir.runQueryBasedOnFirstName2();
      MusteriModel musteri = new MusteriModel();
      musteri.setAd(mAdi);
      musteri.setSoyad(mSoyadi);
      musteri.setMusteri_tel(mTel);
      musteri.setMusteri_email(mEmail);
      musteri.setMusteri_kira_tarihi(mKira_Tarihi);
      musteri.setMusteri_Apart_ID(mApart_ID);
      musteri.setMusteri_oda_no(mOda_NO);
      musteri.setMusteri_dogalgaz(mDogalgaz);
      musteri.setMusteri_su(mSu);
      musteri.setMusteri_internet(mInternet);
      musteri.setMusteri_elektrik(mElektrik);
      return musteri;
   }
    
   public static ApartModel veritabanindanApartGetir(){
       VeritabaniIslemleri vtGetir = new VeritabaniIslemleri();
       vtGetir.runQueryBasedOnFirstName();
       ApartModel apart = new ApartModel();
       apart.setApart_ID(apartController.aID);
       apart.setApart_Adi(aAdi);
       apart.setApart_Adres(aAdres);
       apart.setApart_Temizlik(aTemizlik);
       return apart;
   }
   
   public static DlistModel veritabanindanDlistGetir(){
       VeritabaniIslemleri vtGetir = new VeritabaniIslemleri();
       vtGetir.runQueryBasedOnFirstName3();
       DlistModel dlist = new DlistModel();
       dlist.setDlist_ID(dID);
       dlist.setDlist_Turu(dTuru);
       dlist.setDlist_Marka(dMarka);
       dlist.setDlist_Adet(dAdet);
       dlist.setDlist_ID(dApart_ID);
       return dlist;
   }
}
