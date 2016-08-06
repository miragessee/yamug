package test;

import controller.ApartController;
import controller.DlistController;
import controller.MusteriController;
import java.net.URL;
import javax.swing.ImageIcon;
import model.ApartModel;
import model.DlistModel;
import model.MusteriModel;
import model.VeritabaniIslemleri;
import view.YamugView;

public class YamugApart {
    static YamugView View = new YamugView();
    
    public static void main(String[] args) {
      MusteriModel musteriModel  = VeritabaniIslemleri.veritabanindanMusteriGetir();
      
      ApartModel apartModel = VeritabaniIslemleri.veritabanindanApartGetir();
      
      DlistModel dlistModel = VeritabaniIslemleri.veritabanindanDlistGetir();
      
      View.setVisible(true);
      
      View.setLocationRelativeTo(null);
      
      YamugApart ya = new YamugApart();
      ya.iconAyarla();

      MusteriController musteriController = new MusteriController(musteriModel, View);
      
      ApartController apartController = new ApartController(apartModel, View);
      
      DlistController dlistController = new DlistController(dlistModel, View);
      
      View.setMusteriController(musteriController);
      
      View.setApartController(apartController);
      
      View.setDlistController(dlistController);
      apartController.viewGuncelle();
    }
    
    public void iconAyarla(){
        URL iconURL = getClass().getResource("/resimler/logov1.jpg");
        ImageIcon icon = new ImageIcon(iconURL);
        View.setIconImage(icon.getImage());
    }
}