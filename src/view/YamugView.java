package view;

import com.mysql.jdbc.Connection;
import controller.ApartController;
import controller.DlistController;
import controller.MusteriController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.VeritabaniIslemleri;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class YamugView extends javax.swing.JFrame {    
    private MusteriController musteriController;
    private ApartController apartController;
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
    private static final String USER_NAME = "yamug@yamugapart.com";  // GMail user name (just the part before "@gmail.com")
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
    public static String aEkleAriza;
    public static String aEkleOnarim;
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
    public static int parametre28;

    public YamugView() {
        initComponents();
        jTextArea1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton4 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList();
        jButton15 = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel34 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jButton16 = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        jList8 = new javax.swing.JList();
        jPanel47 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton26 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jButton6 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList();
        jButton5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel68 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jTextField43 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jTextField20 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jList10 = new javax.swing.JList();
        jButton32 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton33 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jPanel48 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jList9 = new javax.swing.JList();
        jButton31 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList();
        jButton17 = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton19 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yamug Apart Yönetim Sistemi");

        jTabbedPane1.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(204, 0, 204))); // NOI18N

        jTabbedPane4.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Apart Bilgileri", new javax.swing.ImageIcon(getClass().getResource("/resimler/home_32.png")), jPanel23); // NOI18N

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apart Listesi", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton4.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton4.setText("Yenile");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apart Ekle / Güncelle / Sil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 51, 204))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel31.setText("Apart Adı");

        jLabel32.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel32.setText("Apart Adresi:");

        jLabel33.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel33.setText("Temizlik Durumu:");

        jButton12.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton12.setText("Ekle");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton13.setText("Güncelle");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jComboBox8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "temiz", "temiz değil" }));

        jLabel30.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel30.setText("Apart ID:");

        jButton27.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton27.setText("Sil");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton29.setText("Bilgileri Temizle");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane17.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel33)
                .addGap(14, 14, 14)
                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel32))
                .addGap(37, 37, 37)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton29))
                    .addComponent(jTextField28)
                    .addComponent(jScrollPane17)))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane4.addTab("Apart İşlemleri", new javax.swing.ImageIcon(getClass().getResource("/resimler/aparteklev3.png")), jPanel22); // NOI18N

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apart Listesi", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jList3);

        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton3.setText("Yenile");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Demirbaş Listesi Görüntüleme ve Güncelleme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(102, 0, 153))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel14.setText("marka");

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel16.setText("adet");

        jButton22.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton22.setText("Güncelle");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton20.setText("Demirbaş Listesine Ekle");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addGap(157, 157, 157)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(367, Short.MAX_VALUE)
                .addComponent(jButton22)
                .addGap(351, 351, 351))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel16)
                        .addComponent(jButton20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton22)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane4.addTab("Demirbaş İşlemleri", new javax.swing.ImageIcon(getClass().getResource("/resimler/demirbaslistesi.png")), jPanel27); // NOI18N

        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apart Listesi", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jList5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList5MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jList5);

        jButton15.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton15.setText("Yenile");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Temizlik Durumu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 0, 153))); // NOI18N

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable5.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10)
                .addContainerGap())
        );

        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Temizlik Güncelleme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 51, 0))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 13)); // NOI18N
        jLabel3.setText("Apart Adı:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Temiz");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Temiz Değil");

        jButton16.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton16.setText("Güncelle");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(jRadioButton6)
                        .addGap(41, 41, 41)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addGap(150, 150, 150))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 603, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("Temizlik İşlemleri", new javax.swing.ImageIcon(getClass().getResource("/resimler/temizlik.png")), jPanel31); // NOI18N

        jPanel46.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apart Listesi", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jButton25.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton25.setText("Yenile");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jList8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList8MouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(jList8);

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton25))
        );

        jPanel47.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apart Arıza Durumu Güncelleme", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(51, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel1.setText("Apart Durumu:");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel2.setText("Arıza Açıklaması:");

        jComboBox7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "arızalı", "sağlam" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane16.setViewportView(jTextArea1);

        jButton26.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton26.setText("Güncelle");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel35.setText("Apart Adı:");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE))))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jButton26)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane4.addTab("Arıza İşlemleri", new javax.swing.ImageIcon(getClass().getResource("/resimler/ariza.png")), jPanel44); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Apart İşlemleri", new javax.swing.ImageIcon(getClass().getResource("/resimler/home_32.png")), jPanel4); // NOI18N

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(51, 51, 255))); // NOI18N

        jTabbedPane2.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder("Apart Listesi"));

        jList4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList4MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jList4);

        jButton6.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton6.setText("Yenile");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Görüntüleme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 102, 0))); // NOI18N

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane2.addTab("Müşteri Bilgileri", new javax.swing.ImageIcon(getClass().getResource("/resimler/musterigoruntule.png")), jPanel13); // NOI18N

        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder("Apart Listesi"));

        jList7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList7MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(jList7);

        jButton5.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton5.setText("Yenile");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Ekleme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 102, 51))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel6.setText("Adı:");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel7.setText("Soyadı:");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel8.setText("Tel:");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel9.setText("Email:");

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel11.setText("Doğalgaz:");

        jLabel13.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel13.setText("Su:");

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel15.setText("İnternet:");

        jLabel17.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel17.setText("Elektrik:");

        jLabel19.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel19.setText("Oda No:");

        jButton8.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton8.setText("Ekle");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel28.setText("Apart Adı:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel68.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel68.setText("Kira Bitiş Zamanı:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(447, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane2.addTab("Müşteri Ekle", new javax.swing.ImageIcon(getClass().getResource("/resimler/musterieklev2_1.png")), jPanel1); // NOI18N

        jPanel41.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Ara", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 0, 51))); // NOI18N

        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İsimle Arama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel45.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel45.setText("Müşteri Soyadı:");

        jButton18.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton18.setText("Ara");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel46.setText("Müşteri Adı:");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel43.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefon Numarasıyla Arama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(51, 102, 0))); // NOI18N

        jLabel47.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel47.setText("Telefon Numarası:");

        jButton21.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton21.setText("Ara");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField45, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel45.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Listesi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 153, 0))); // NOI18N

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(jTable7);

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14)
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Ekle / Güncelle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel12.setText("Telefon:");

        jLabel56.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel56.setText("E-posta:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel57.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel57.setText("Kira Bitiş Zamanı:");

        jLabel58.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel58.setText("Doğalgaz:");

        jLabel59.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel59.setText("Su:");

        jLabel60.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel60.setText("İnternet:");

        jLabel61.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel61.setText("Elektrik:");

        jLabel63.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel63.setText("Oda No:");

        jButton23.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton23.setText("Sil");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel64.setText("Müşteri ID:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel66.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel66.setText("Adı:");

        jLabel67.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel67.setText("Soyadı:");

        jButton24.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton24.setText("Güncelle");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel60)
                                    .addComponent(jLabel61))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                    .addComponent(jTextField47, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField46, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField49)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel66)
                                            .addComponent(jLabel67)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(39, 39, 39))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(20, 20, 20)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton24)
                    .addComponent(jButton23))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Müşteri Güncelle / Sil", new javax.swing.ImageIcon(getClass().getResource("/resimler/musterisilmev2.png")), jPanel39); // NOI18N

        jTabbedPane3.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Apart Listesi"));

        jScrollPane3.setViewportView(jList2);

        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton2.setText("Yenile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gider Listesi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(51, 0, 204))); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jButton14.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton14.setText("Görüntüle");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Doğalgaz");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Su");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("İnternet");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Elektrik");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton7.setSelected(true);
        jRadioButton7.setText("Hepsi");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton7)
                        .addGap(54, 54, 54)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton7)
                    .addComponent(jButton14))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane3.addTab("Gider Görüntüle", jPanel16);

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Ara", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 0, 51))); // NOI18N

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İsimle Arama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel20.setText("Müşteri Soyadı:");

        jButton9.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton9.setText("Ara");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel21.setText("Müşteri Adı:");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefon Numarasıyla Arama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(51, 102, 0))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel18.setText("Telefon Numarası:");

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton10.setText("Ara");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton10))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gider Ekle / Düzenle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(153, 0, 255))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel22.setText("Doğalgaz:");

        jLabel23.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel23.setText("Elektrik:");

        jLabel24.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel24.setText("Su:");

        jLabel25.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel25.setText("İnternet:");

        jButton11.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton11.setText("Güncelle");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField22, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jTextField25)
                    .addComponent(jTextField23)
                    .addComponent(jTextField24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(118, 118, 118))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(27, 27, 27)
                .addComponent(jButton11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Listesi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 153, 0))); // NOI18N

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Gider Ekle / Düzenle", jPanel17);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addGap(0, 0, 0))
        );

        jTabbedPane2.addTab("Gider İşlemleri", new javax.swing.ImageIcon(getClass().getResource("/resimler/giderler.png")), jPanel12); // NOI18N

        jPanel50.setBorder(javax.swing.BorderFactory.createTitledBorder("Apart Listesi"));

        jList10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList10MouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(jList10);

        jButton32.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton32.setText("Yenile");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton32))
        );

        jLabel39.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel39.setText("Konu:");

        jLabel40.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel40.setText("Apart Adı:");

        jLabel41.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel42.setText("İçerik:");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane20.setViewportView(jTextArea3);

        jButton33.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton33.setText("Gönder");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel49Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel49Layout.createSequentialGroup()
                                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel42))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)))))
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jButton33)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Müşteri Bilgilendirme", new javax.swing.ImageIcon(getClass().getResource("/resimler/musteribilgi.png")), jPanel49); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Müşteri İşlemleri", new javax.swing.ImageIcon(getClass().getResource("/resimler/musteriler.png")), jPanel5); // NOI18N

        jButton7.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton7.setText("Tüm Apartları Raporla");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton28.setText("Tüm Müşterileri Raporla");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton1.setText("Apart Raporu Al");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton30.setText("Müşteri Raporu Al");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jPanel48.setBorder(javax.swing.BorderFactory.createTitledBorder("Apart Listesi"));

        jList9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList9MouseClicked(evt);
            }
        });
        jScrollPane18.setViewportView(jList9);

        jButton31.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton31.setText("Yenile");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel10.setText("Apart Seçilmedi");

        jLabel38.setFont(new java.awt.Font("Palatino Linotype", 0, 1)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel44.setText("Seçilen Apart:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel38)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(316, 316, 316)
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(284, 284, 284)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jButton30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton30)
                            .addComponent(jButton1))
                        .addGap(0, 250, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1115, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rapor İşlemleri", new javax.swing.ImageIcon(getClass().getResource("/resimler/raporalma.png")), jPanel6); // NOI18N

        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apart Listesi", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jList6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList6MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jList6);

        jButton17.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton17.setText("Yenile");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mail Gönderme Listesi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(102, 0, 0))); // NOI18N

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane12.setViewportView(jTable6);

        jButton19.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jButton19.setText("Tablodaki müşterilere mail gönder.");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap(337, Short.MAX_VALUE)
                .addComponent(jButton19)
                .addGap(303, 303, 303))
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("E-Posta", new javax.swing.ImageIcon(getClass().getResource("/resimler/mailgonder.png")), jPanel35); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel29.setText("YamugApart Yönetim Sistemi  v2.2");

        jLabel43.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel43.setText("YamugSoftware  2014");

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Serhan AKSOY");

        jLabel48.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 102, 204));
        jLabel48.setText("Hasan YILMAZ");

        jLabel49.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 102, 204));
        jLabel49.setText("Okan SÜTÇÜOĞLU");

        jLabel50.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 102, 204));
        jLabel50.setText("Nevzat KÖKLÜ");

        jLabel51.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 102, 204));
        jLabel51.setText("Gönül TOPÇU");

        jLabel52.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 102, 204));
        jLabel52.setText("Sami ARABOĞA");

        jLabel53.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 102, 204));
        jLabel53.setText("Ahmet KARAGÖZ");

        jLabel54.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 102, 204));
        jLabel54.setText("Hakan ÜNAL");

        jLabel55.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 102, 204));
        jLabel55.setText("Hüseyin DOĞRUSÖYLER");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53)
                            .addComponent(jLabel55)
                            .addComponent(jLabel54))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(337, 337, 337))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hakkında", new javax.swing.ImageIcon(getClass().getResource("/resimler/hakkinda.png")), jPanel26); // NOI18N

        jLabel26.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel26.setText("Yamug Apart Yönetim Sistemi");

        jLabel27.setText("v2.3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if(jList2.getSelectedValue() != null )
        {
            gList ="asd";
            JTable bosTablo = new JTable();
            jTable2.setModel(bosTablo.getModel());
            
            if(jRadioButton7.isSelected() == true)
            {
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(false);
                jRadioButton3.setSelected(false);
                jRadioButton4.setSelected(false);
            }
            if(jRadioButton1.isSelected())
            {
                jRadioButton7.setSelected(false);
            }
            if(jRadioButton1.isSelected())
            {
                jRadioButton7.setSelected(false);
            }
            if(jRadioButton2.isSelected())
            {
                jRadioButton7.setSelected(false);
            }
            if(jRadioButton3.isSelected())
            {
                jRadioButton7.setSelected(false);
            }
            if(jRadioButton4.isSelected())
            {
                jRadioButton7.setSelected(false);
            }
            
            rb1=jRadioButton1.isSelected();
            rb2=jRadioButton2.isSelected();
            rb3=jRadioButton3.isSelected();
            rb4=jRadioButton4.isSelected();
            musteriController.giderGoruntule(jList2.getSelectedValue().toString(),rb1,rb2,rb3,rb4);
            rb1=false;
            rb2=false;
            rb3=false;
            rb4=false;
            gList=null;
            parametre1= null;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Lütfen soldaki listeden Apart seçiniz");
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        apartController.apartListesi1();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        musteriController.giderAra1(jTextField20.getText(), jTextField21.getText());
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        musteriController.giderAra2(jTextField19.getText());
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(jTable3.getSelectedColumn() != -1)
        {
            parametre1 = jTextField22.getText();
            parametre2 = jTextField23.getText();
            parametre3 = jTextField24.getText();
            parametre4 = jTextField25.getText();
            parametre5 = (String) jTable3.getModel().getValueAt(jTable3.getSelectedRow(),2);
            musteriController.giderGuncelle(parametre1, parametre2, parametre3, parametre4, parametre5);
            jTextField19.setText((String) jTable3.getModel().getValueAt(jTable3.getSelectedRow(),2));
            jButton10ActionPerformed(evt);
            JOptionPane.showMessageDialog(null, "Güncellendi");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Önce müşteri arama yapın. Sonra soldaki tablodan müşteriyi seçin, Sonra giderleri güncelleyin");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        jTextField22.setText((String) jTable3.getModel().getValueAt(jTable3.getSelectedRow(),4));
        jTextField23.setText((String) jTable3.getModel().getValueAt(jTable3.getSelectedRow(),5));
        jTextField24.setText((String) jTable3.getModel().getValueAt(jTable3.getSelectedRow(),6));
        jTextField25.setText((String) jTable3.getModel().getValueAt(jTable3.getSelectedRow(),7));
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        aTumList="asd";
        VeritabaniIslemleri.sorgu = "from Apart";
        VeritabaniIslemleri.veritabanindanApartGetir();
        apartController.viewGuncelle();
        aTumList=null;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        apartController.apartListesi1();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jList5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList5MouseClicked
        if(jList5.getSelectedValue() != null )
            {
                parametre1=jList5.getSelectedValue().toString();
                jLabel5.setText(jList5.getSelectedValue().toString());
            }
        else
            {
                if(jLabel5.getText() != null)
                {
                    parametre1=jLabel5.getText();
                }  
            }
        apartController.apartBul(parametre1);
    }//GEN-LAST:event_jList5MouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if(jTable5.getSelectedColumn() != -1 || jLabel5.getText() != null)
        {
            
            if(jRadioButton5.isSelected() && jRadioButton6.isSelected())
            {
                JOptionPane.showMessageDialog(null, "Temiz yada Temiz Değil seçeneklerinden birini seçmelisiniz");
            }
            else if(jRadioButton5.isSelected() == false && jRadioButton6.isSelected() == false)
            {
                JOptionPane.showMessageDialog(null, "Temiz yada Temiz Değil seçeneklerinden birini seçmelisiniz");
            }
            else
            {               
                if( jRadioButton5.isSelected())
                {
                    parametre1= "temiz";
                }
                if( jRadioButton6.isSelected())
                {
                    parametre1= "temiz değil";
                }
                parametre2= jLabel5.getText();
                apartController.apartTemizlikGuncelle(parametre1,parametre2);
            }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        jLabel5.setText((String) jTable5.getModel().getValueAt(jTable5.getSelectedRow(),0));
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        apartController.apartListesi1();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if(apartController.tablo5.getRowCount() > 0)
        {
            for(int i = 0;i<musteriController.mailListSayac;i++)
            {
                String kelimecik = "";
                String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
                String[] gunler = timeStamp.split("_");
                yil =gunler[0].substring(0,4);
                ay = gunler[0].substring(4,6);
                gun = gunler[0].substring(6,8);
                String tarih2 = (String) jTable6.getModel().getValueAt(i,4);
                String[] tarih = tarih2.split("-");
                RECIPIENT = null;
                if(Integer.parseInt(gun) > 26)
                {
                    JOptionPane.showMessageDialog(null, "Mailler ayın 26'sından sonra gönderilemez");
                }
                else
                {
                    int gunx = Integer.parseInt(gun);
                    if(Integer.parseInt(tarih[2]) == gunx+1 || Integer.parseInt(tarih[2]) == gunx+2 || Integer.parseInt(tarih[2]) == gunx)
                    {
                        kelimecik = (String) jTable6.getModel().getValueAt(i,3);
                        kelimecik = kelimecik.replace('ö', 'o'); 
                        kelimecik = kelimecik.replace('ü', 'u'); 
                        kelimecik = kelimecik.replace('ğ', 'g'); 
                        kelimecik = kelimecik.replace('ş', 's'); 
                        kelimecik = kelimecik.replace('ı', 'i'); 
                        kelimecik = kelimecik.replace('ç', 'c'); 
                        kelimecik = kelimecik.replace('Ö', 'O'); 
                        kelimecik = kelimecik.replace('Ü', 'U'); 
                        kelimecik = kelimecik.replace('Ğ', 'G'); 
                        kelimecik = kelimecik.replace('Ş', 'S'); 
                        kelimecik = kelimecik.replace('İ', 'I'); 
                        kelimecik = kelimecik.replace('Ç', 'C'); 
                        RECIPIENT = kelimecik;
                        String from = USER_NAME;
                        String pass = PASSWORD;
                        String[] to = { RECIPIENT }; // list of recipient email addresses
                        String subject = "Apart Bildirimi";
                        String body = "Kiranızı ödemeniz için 1 gününüz kaldı. Ödeme yaptıysanız bu maili dikkate almayınız. Bu mail otomatik olarak oluşturulmuştur. Lütfen yanıtlamayınız.";

                        sendFromGMail(from, pass, to, subject, body);
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Gönderildi");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Tablo boş");
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        if(jList3.getSelectedValue() != null)
        {
            //dlistG = "asd";
            for(int i = 0; i <dlistController.dlistSayac*2; i++)
            {
                if(tfler[i] != null)
                {
                    if(i == 0)
                    {
                        dlistController.dlistGuncelle(tfler[i].getText(), tfler[i+1].getText(),dlistController.dizi4.getElementAt(i).toString());
                    }
                    if(i == 2)
                    {
                        dlistController.dlistGuncelle(tfler[i].getText(), tfler[i+1].getText(),dlistController.dizi4.getElementAt(i-1).toString());
                    }
                    if(i==4)
                    {
                        dlistController.dlistGuncelle(tfler[i].getText(),tfler[i+1].getText(), dlistController.dizi4.getElementAt(i-2).toString());
                    }
                    if(i==6)
                    {
                        dlistController.dlistGuncelle(tfler[i].getText(), tfler[i+1].getText(),dlistController.dizi4.getElementAt(i-3).toString());
                    }
                    if(i==8)
                    {
                        dlistController.dlistGuncelle(tfler[i].getText(), tfler[i+1].getText(),dlistController.dizi4.getElementAt(i-4).toString());
                        
                    }
                    if(i==10)
                    {
                        dlistController.dlistGuncelle(tfler[i].getText(),tfler[i+1].getText(), dlistController.dizi4.getElementAt(i-5).toString());
                      
                    }
                    if(i==12)
                    {
                        dlistController.dlistGuncelle(tfler[i].getText(),tfler[i+1].getText(), dlistController.dizi4.getElementAt(i-6).toString());
                     
                    }
                    if(i==14)
                    {
                        dlistController.dlistGuncelle(tfler[i].getText(), tfler[i+1].getText(),dlistController.dizi4.getElementAt(i-7).toString());
                      
                    }
                    if(i==16)
                    {
                        dlistController.dlistGuncelle(tfler[i].getText(), tfler[i+1].getText(),dlistController.dizi4.getElementAt(i-8).toString());
                      
                    }
                    if(i==18)
                    {
                        dlistController.dlistGuncelle(tfler[i].getText(), tfler[i+1].getText(),dlistController.dizi4.getElementAt(i-9).toString());
                     
                    }
                    if(i==20)
                    {
                        dlistController.dlistGuncelle(tfler[i].getText(), tfler[i+1].getText(),dlistController.dizi4.getElementAt(i-10).toString());
                
                    }
                    if(i==22)
                    {
                        dlistController.dlistGuncelle(tfler[i].getText(), tfler[i+1].getText(),dlistController.dizi4.getElementAt(i-11).toString());
                 
                    }
                    if(i==24)
                    {
                        dlistController.dlistGuncelle(tfler[i].getText(), tfler[i+1].getText(),dlistController.dizi4.getElementAt(i-12).toString());
                   
                    }
                }
            }
            //dlistG = null;
            JOptionPane.showMessageDialog(null, "Güncellendi");
            yenile();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Önce Apart görüntüleyin ve Apart Seçin");
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        apartController.apartListesi1();
 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jList4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList4MouseClicked
        if(jList4.getSelectedValue() != null )
        {
            musteriController.musteriGoruntule(jList4.getSelectedValue().toString());
        }
        apartController.apartListesi1();
    }//GEN-LAST:event_jList4MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        apartController.apartListesi1();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jList7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList7MouseClicked
        
        //mElist = "asd";
        if(jList7.getSelectedValue() != null )
        {
            jLabel62.setText(jList7.getSelectedValue().toString());
        }
        //mElist = null;
        apartController.apartListesi1();
    }//GEN-LAST:event_jList7MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        if(jLabel62.getText() != "")
        {
            if(jTextField4.getText().length()<11)
            {
                apartController.apartId(jLabel62.getText());
                mEkleAdi = jTextField2.getText();
                mEkleSoyAdi = jTextField3.getText();
                mEkleTel = jTextField4.getText();
                mEkleEmail = jTextField5.getText();
                mEkleKira_Tarihi = jComboBox1.getSelectedItem().toString()+"-"+jComboBox2.getSelectedItem().toString()+"-"+jComboBox3.getSelectedItem().toString();
                mEkleOda_NO = jTextField7.getText();
                mEkleDogalgaz = jTextField8.getText();
                mEkleSu = jTextField9.getText();
                mEkleInternet = jTextField10.getText();
                mEkleElektrik = jTextField11.getText();
                musteriController.musteriEkle(jLabel62.getText(),mEkleAdi,mEkleSoyAdi,mEkleTel,mEkleEmail,mEkleKira_Tarihi,mEkleOda_NO,mEkleDogalgaz,mEkleSu,mEkleInternet,mEkleElektrik);
                apartController.apartListesi1();
                JOptionPane.showMessageDialog(null, "Eklendi");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Telefon numarası 10 haneli olmalıdır. Ör: 506 145 00 68");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Apart Listesinden Apart Seçin");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        if(tiklama == 0 && dEklelist !="asd")
        {
            jLabel37.setText(jList3.getSelectedValue().toString());
            dSilA=jList3.getSelectedValue().toString();
            dlistController.dizi2.removeAllElements();
            dlistController.dizi3.removeAllElements();
            dlistController.dizi4.removeAllElements();
            dlistController.dizi.removeAllElements();
            parametre6 = jList3.getSelectedValue().toString();
            dlistController.dlistSay(jList3.getSelectedValue().toString());
            parametre7 = jList3.getSelectedValue().toString();
            dlistController.dlistGoruntule(jList3.getSelectedValue().toString());
            
            int gecicisayac = 0;
            for(int i = 0;i<dlistController.dlistSayac*2;i++)
            {                  
                if(gecicisayac > dlistController.dlistSayac*2)
                {
                    break;
                }
                if(i==0)
                {
                    tf1 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i).toString());
                    tfler[0] = tf1;
                }
                if(i==1)
                {
                    tf2 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-1).toString());  
                    tfler[1] = tf2;
                }
                if(i==2)
                {
                    tf3 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-1).toString());  
                    tfler[2] = tf3;
                }
                if(i==3)
                {
                    tf4 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-2).toString());    
                    tfler[3] = tf4;
                }
                if(i==4)
                {
                    tf5 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-2).toString());   
                    tfler[4] = tf5;
                }
                if(i==5)
                {
                    tf6 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-3).toString());  
                    tfler[5] = tf6;
                }
                if(i==6)
                {
                    tf7 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-3).toString()); 
                    tfler[6] = tf7;
                }
                if(i==7)    
                {
                    tf8 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-4).toString());  
                    tfler[7] = tf8;
                }
                if(i==8)   
                {
                    tf9 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-4).toString());  
                    tfler[8] = tf9;
                }
                if(i==9)    
                {
                    tf10 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-5).toString());    
                    tfler[9] = tf10;
                }
                if(i==10)    
                {
                    tf11 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-5).toString());  
                    tfler[10] = tf11;
                }
                if(i==11)
                {
                    tf12 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-6).toString());  
                    tfler[11] = tf12;
                }
                if(i==12)
                {
                    tf13 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-6).toString()); 
                    tfler[12] = tf13;
                }
                if(i==13)
                {
                    tf14 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-7).toString());  
                    tfler[13] = tf14;
                }
                if(i==14)
                {
                    tf15 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-7).toString()); 
                    tfler[14] = tf15;
                }
                if(i==15)
                {
                    tf16 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-8).toString()); 
                    tfler[15] = tf16;
                }
                if(i==16)
                {
                    tf17 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-8).toString());  
                    tfler[16] = tf17;
                }
                if(i==17)
                {
                    tf18 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-9).toString());  
                    tfler[17] = tf18;
                }
                if(i==18)  
                {
                    tf19 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-9).toString()); 
                    tfler[18] = tf19;
                }
                if(i==19)
                {
                    tf20 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-10).toString());  
                    tfler[19] = tf20;
                }
                if(i==20)    
                {
                    tf21 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-10).toString());  
                    tfler[20] = tf21;
                }
                if(i==21)
                { 
                    tf22 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-11).toString()); 
                    tfler[21] = tf22;
                }
                
                if(i==22)
                {   
                    tf23 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-11).toString());
                    tfler[22] = tf23;
                }
                
                if(i==23)   
                {
                    tf24 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-12).toString());    
                    tfler[23] = tf24;
                }
                
                gecicisayac++;
            }
            int gecicisayi = 0;
            for(int i = 0;i<dlistController.dizi.getSize();i++)
            { 
                if(gecicisayi>dlistController.dizi.getSize())
                {
                    break;
                }
                if(i==0)    
                {
                    javax.swing.JLabel lbl1 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[0] = lbl1;
                    javax.swing.JButton btn1 = new javax.swing.JButton("Sil");
                    btnler[0] = btn1;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[0].getText(), tfler[0].getText(), tfler[1].getText(), dSilA);
                            dlistSil = null;
                            jList3MouseClicked(evt);
                        }
                    });
                }

                if(i==1)    
                {
                    javax.swing.JLabel lbl2 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[1] = lbl2;
                    javax.swing.JButton btn2 = new javax.swing.JButton("Sil");
                    btnler[1] = btn2;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[1].getText(), tfler[2].getText(), tfler[3].getText(), dSilA);
                            dlistSil = null;
                            jList3MouseClicked(evt);
                        }
                    });
                }

                if(i==2)    
                {
                    javax.swing.JLabel lbl3 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[2] = lbl3;
                    javax.swing.JButton btn3 = new javax.swing.JButton("Sil");
                    btnler[2] = btn3;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[2].getText(), tfler[4].getText(), tfler[5].getText(), dSilA);
                            dlistSil = null;
                            jList3MouseClicked(evt);
                        }
                    });
                }

                if(i==3)    
                {
                    javax.swing.JLabel lbl4 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString()); 
                    lbller[3] = lbl4;
                    javax.swing.JButton btn4 = new javax.swing.JButton("Sil");
                    btnler[3] = btn4;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[3].getText(), tfler[6].getText(), tfler[7].getText(), dSilA);
                            dlistSil = null;
                            jList3MouseClicked(evt);
                        }
                    });
                }

                if(i==4)    
                {
                    javax.swing.JLabel lbl5 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[4] = lbl5;
                    javax.swing.JButton btn5 = new javax.swing.JButton("Sil");
                    btnler[4] = btn5;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[4].getText(), tfler[8].getText(), tfler[9].getText(), dSilA);
                            dlistSil = null;
                            jList3MouseClicked(evt);
                        }
                    });
                }

                if(i==5)    
                {
                    javax.swing.JLabel lbl6 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[5] = lbl6;
                    javax.swing.JButton btn6 = new javax.swing.JButton("Sil");
                    btnler[5] = btn6;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[5].getText(), tfler[10].getText(), tfler[11].getText(), dSilA);
                            dlistSil = null;
                            jList3MouseClicked(evt);
                        }
                    });
                }

                if(i==6)    
                {
                    javax.swing.JLabel lbl7 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[6] = lbl7;
                    javax.swing.JButton btn7 = new javax.swing.JButton("Sil");
                    btnler[6] = btn7;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[6].getText(), tfler[12].getText(), tfler[13].getText(), dSilA);
                            dlistSil = null;
                            jList3MouseClicked(evt);
                        }
                    });
                }

                if(i==7)    
                {
                    javax.swing.JLabel lbl8 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[7] = lbl8;
                    javax.swing.JButton btn8 = new javax.swing.JButton("Sil");
                    btnler[7] = btn8;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[7].getText(), tfler[14].getText(), tfler[15].getText(), dSilA);
                            dlistSil = null;
                            jList3MouseClicked(evt);
                        }
                    });
                }

                if(i==8)    
                {
                    javax.swing.JLabel lbl9 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[8] = lbl9;
                    javax.swing.JButton btn9 = new javax.swing.JButton("Sil");
                    btnler[8] = btn9;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[8].getText(), tfler[16].getText(), tfler[17].getText(), dSilA);
                            dlistSil = null;
                            jList3MouseClicked(evt);
                        }
                    });
                }

                if(i==9)    
                {
                    javax.swing.JLabel lbl10 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[9] = lbl10;
                    javax.swing.JButton btn10 = new javax.swing.JButton("Sil");
                    btnler[9] = btn10;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[9].getText(), tfler[18].getText(), tfler[19].getText(), dSilA);
                            dlistSil = null;
                            jList3MouseClicked(evt);
                        }
                    });
                }

                if(i==10)    
                {
                    javax.swing.JLabel lbl11 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[10] = lbl11;
                    javax.swing.JButton btn11 = new javax.swing.JButton("Sil");
                    btnler[10] = btn11;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[10].getText(), tfler[20].getText(), tfler[21].getText(), dSilA);
                            dlistSil = null;
                            jList3MouseClicked(evt);
                        }
                    });
                }

                if(i==11)    
                {
                    javax.swing.JLabel lbl12 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[11] = lbl12;
                    javax.swing.JButton btn12 = new javax.swing.JButton("Sil");
                    btnler[11] = btn12;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[11].getText(), tfler[22].getText(), tfler[23].getText(), dSilA);
                            dlistSil = null;
                            jList3MouseClicked(evt);
                        }
                    });
                }
                gecicisayi++;
            }
            
            for(int i=0;i<dlistController.dlistSayac*2;i++)
            {
                if(i<12 && i<dlistController.dizi.getSize())
                {
                jPanel30.remove(lbller[i]);
                jPanel30.remove(btnler[i]);    
                }
                if(tfler[i] != null)
                jPanel30.remove(tfler[i]);
                jPanel30.revalidate();
                jPanel30.repaint();
            }
            
            
            for(int i=0;i<dlistController.dlistSayac*2;i++)
            {
                JLabel label1 = new JLabel();
                label1.setSize(label1.getPreferredSize());
                label1.setFont(jLabel14.getFont());
                tfler[i].setSize(200, 20);
                tfler[i].setFont(jLabel14.getFont());
                if(i<12 && i<dlistController.dizi.getSize())
                {
                    lbller[i].setSize(200,20);
                    lbller[i].setFont(jLabel14.getFont());
                    btnler[i].setSize(50,20);
                    btnler[i].setFont(jLabel14.getFont());
                }
                label1.setLocation(jLabel14.getX()-50,jLabel14.getY()+30);
                if(i==0)
                {
                    tfler[i].setLocation(label1.getX()+30,label1.getY());
                    if(i<12)
                    {
                    lbller[i].setLocation(jLabel14.getX()-125,jLabel14.getY()+29);
                    btnler[i].setLocation(lbller[i].getX()+600,lbller[i].getY());
                    }
                }
                else if(i%2 == 0)
                {
                    tfler[i].setLocation(tfler[i-1].getX()-240,tfler[i-1].getY()+30);
                    if(i<12 && i<dlistController.dizi.getSize())
                    {
                    lbller[i].setLocation(lbller[i-1].getX(),lbller[i-1].getY()+30);    
                    btnler[i].setLocation(lbller[i].getX()+600,lbller[i].getY());
                    }
                }
                else if(i == 1)
                {
                    tfler[i].setLocation(tfler[i-1].getX()+240,label1.getY());
                    if(i<12 && i<dlistController.dizi.getSize())
                    {
                    lbller[i].setLocation(lbller[i-1].getX(),lbller[i-1].getY()+30);    
                    btnler[i].setLocation(lbller[i].getX()+600,lbller[i].getY());
                    }
                }
                else
                {
                    tfler[i].setLocation(tfler[i-1].getX()+240,tfler[i-1].getY());
                    if(i<12 && i<dlistController.dizi.getSize())
                    {
                    lbller[i].setLocation(lbller[i-1].getX(),lbller[i-1].getY()+30);    
                    btnler[i].setLocation(lbller[i].getX()+600,lbller[i].getY());
                    }
                }
                if(i<12 && i<dlistController.dizi.getSize())
                {
                    jPanel30.add(lbller[i]);
                    jPanel30.add(btnler[i]);
                }    
                    jPanel30.add(tfler[i]);
                    jPanel30.revalidate();
                    jPanel30.repaint();   
                
                
            }
            tiklama++;
        }
        else
        {
            if(dEklelist != "asd")
            {
                for(int i=0;i<dlistController.dlistSayac*2;i++)
                {
                    if(i<12 && i<dlistController.dizi.getSize())
                    {
                        jPanel30.remove(lbller[i]);
                        jPanel30.remove(btnler[i]);
                    }
                    
                    if(tfler[i] != null)
                    jPanel30.remove(tfler[i]);
                    jPanel30.revalidate();
                    jPanel30.repaint();
                }
            tiklama--;
            jList3MouseClicked(evt);
            }
        }
    }//GEN-LAST:event_jList3MouseClicked

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed

        if(jList3.getSelectedValue() != null)
        {
            apartController.apartDemirbasId(jLabel37.getText());
            apartController.apartListesi1();
            JFrame frame = new JFrame("Demirbaş Listesine Ekle");
            frame.setSize(300, 300);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            JPanel panel = new JPanel();
            panel.setSize(290,290);
            panel.setLayout(null);
            JTextField tf1 = new JTextField();
            tf1.setSize(150, 20);
            tf1.setLocation(70, 50);
            JTextField tf2 = new JTextField();
            tf2.setSize(150,20);
            tf2.setLocation(tf1.getX(), tf1.getY()+30);
            JTextField tf3 = new JTextField();
            tf3.setSize(150,20);
            tf3.setLocation(tf2.getX(), tf2.getY()+30);
            JButton btn1 = new JButton("Ekle");
            btn1.setFont(jButton20.getFont());
            btn1.setSize(100,50);
            btn1.setLocation(90,150);

            tf3.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                   
                        btn1.doClick();
                }
            });
            
            btn1.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if(tf1.getText() != null)
                    {
                        if(dlistController.dizi.getSize()<12)
                        {
                            dEklelist = "asd";
                            dlistTuru = tf1.getText();
                            dlistMarka = tf2.getText();
                            dlistAdet = tf3.getText();
                            apartController.apartDemirbasEkle(dlistTuru, dlistMarka, dlistAdet);
                            tf1.setText("");
                            tf2.setText("");
                            tf3.setText("");
                            tf1.requestFocus();
                            dlistController.viewGuncelle();
                            dEklelist = null;
                            yenile();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "En fazla 12 tane eklenebilir.");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Boş bırakılamaz");
                    }
                }
            });
            
            JLabel lbl1 = new JLabel("Eklenek Demirbaş girin: Ör: Ütü");
            lbl1.setFont(jLabel14.getFont());
            lbl1.setSize(lbl1.getPreferredSize());
            lbl1.setLocation(tf1.getX(), tf1.getY()-30);
            JLabel lbl2 = new JLabel("Turu:");
            lbl2.setFont(jLabel14.getFont());
            lbl2.setSize(lbl2.getPreferredSize());
            lbl2.setLocation(tf1.getX()-35, tf1.getY());
            JLabel lbl3 = new JLabel("Marka:");
            lbl3.setFont(jLabel14.getFont());
            lbl3.setSize(lbl3.getPreferredSize());
            lbl3.setLocation(tf2.getX()-35, tf2.getY());
            JLabel lbl4 = new JLabel("Adet:");
            lbl4.setFont(jLabel14.getFont());
            lbl4.setSize(lbl4.getPreferredSize());
            lbl4.setLocation(tf3.getX()-35, tf3.getY());
            panel.add(btn1);
            panel.add(tf1);
            panel.add(tf2);
            panel.add(tf3);
            panel.add(lbl1);
            panel.add(lbl2);
            panel.add(lbl3);
            panel.add(lbl4);
            panel.revalidate();
            panel.repaint();
            frame.add(panel);
            frame.revalidate();
            frame.repaint();
            frame.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Önce Apart Listeleyin ve Apart seçin");
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jList6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList6MouseClicked
       mailA = jList6.getSelectedValue().toString();
        if(jList6.getSelectedValue()!=null)
        {
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            String[] gunler = timeStamp.split("_");
            yil =gunler[0].substring(0,4);
            ay = gunler[0].substring(4,6);
            gun = gunler[0].substring(6,8);
            gunx = Integer.parseInt(gun);
            gunx2 = gunx+2;
            gunx3 = gunx+1;
            musteriController.mailGoruntule(mailA, yil, ay, gunx2, gunx3, gunx);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Önce Apart seçin");
        }
        apartController.apartListesi1();
    }//GEN-LAST:event_jList6MouseClicked

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        musteriController.musteriAra1(jTextField43.getText(), jTextField44.getText());
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        musteriController.musteriAra2(jTextField45.getText());
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        jLabel65.setText(String.valueOf(jTable7.getModel().getValueAt(jTable7.getSelectedRow(),0)));
        jTextField6.setText((String) jTable7.getModel().getValueAt(jTable7.getSelectedRow(),1));
        jTextField12.setText((String) jTable7.getModel().getValueAt(jTable7.getSelectedRow(),2));
        jTextField13.setText((String) jTable7.getModel().getValueAt(jTable7.getSelectedRow(),3));
        jTextField17.setText((String) jTable7.getModel().getValueAt(jTable7.getSelectedRow(),4));
        String qwe = (String) jTable7.getModel().getValueAt(jTable7.getSelectedRow(),5);
        String[] qwer = qwe.split("-");
        jComboBox5.setSelectedItem(qwer[0]);
        jComboBox6.setSelectedItem(qwer[1]);
        jComboBox4.setSelectedItem(qwer[2]);
        jTextField18.setText((String) jTable7.getModel().getValueAt(jTable7.getSelectedRow(),6));
        jTextField46.setText((String) jTable7.getModel().getValueAt(jTable7.getSelectedRow(),7));
        jTextField47.setText((String) jTable7.getModel().getValueAt(jTable7.getSelectedRow(),8));
        jTextField48.setText((String) jTable7.getModel().getValueAt(jTable7.getSelectedRow(),9));
        jTextField49.setText((String) jTable7.getModel().getValueAt(jTable7.getSelectedRow(),10));
    }//GEN-LAST:event_jTable7MouseClicked

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        if(jTable7.getSelectedColumn() != -1)
        {
            musteriController.musteriSil(jLabel65.getText());
            jTextField45.setText(jTextField13.getText());
            jButton21ActionPerformed(evt);
            jTextField45.setText("");
            jLabel65.setText("");
            jTextField6.setText("");
            jTextField12.setText("");
            jTextField13.setText("");
            jTextField17.setText("");
            jComboBox5.setSelectedItem("1");
            jComboBox6.setSelectedItem("2014");
            jComboBox4.setSelectedItem("1");
            jTextField18.setText("");
            jTextField46.setText("");
            jTextField47.setText("");
            jTextField48.setText("");
            jTextField49.setText("");
            JOptionPane.showMessageDialog(null, "Silindi");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Önce müşteri arama yapın. Sonra soldaki tablodan müşteriyi seçin, Sonra müşterileri güncelleyin");
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        if(jTable7.getSelectedColumn() != -1)
        {
            if(jTextField13.getText().length()<11)
            {
                parametre13 = jTextField6.getText();
                parametre14 = jTextField12.getText();
                parametre15 = jTextField13.getText();
                parametre16 = jTextField17.getText();
                parametre17 = jComboBox5.getSelectedItem().toString()+"-"+jComboBox6.getSelectedItem().toString()+"-"+jComboBox4.getSelectedItem().toString();
                parametre18 = jTextField18.getText();
                parametre19 = jTextField46.getText();
                parametre20 = jTextField47.getText();
                parametre21 = jTextField48.getText();
                parametre22 = jTextField49.getText();
                musteriController.musteriGuncelle(jLabel65.getText(),parametre13,parametre14,parametre15,parametre16,parametre17,parametre18,parametre19,parametre20,parametre21,parametre22);
                jTextField45.setText(jTextField13.getText());
                jButton21ActionPerformed(evt);
                JOptionPane.showMessageDialog(null, "Güncellendi");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Telefon numarası 10 haneli olmalıdır. Ör: 506 145 00 68");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Önce müşteri arama yapın. Sonra soldaki tablodan müşteriyi seçin, Sonra müşterileri güncelleyin");
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        apartController.apartListesi1();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        apartController.apartListesi1();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String stradi = jTextField28.getText();
        String stradres = jTextArea2.getText();
        if(stradi.length() != 0 && stradres.length() != 0)
        {
            aEkleAdi=jTextField28.getText();
            aEkleAdres=jTextArea2.getText();
            aEkleAriza = "";
            aEkleOnarim = "saglam";
            aEkleTemizlik=jComboBox8.getSelectedItem().toString();
            apartController.apartEkle(aEkleAdi, aEkleAdres, aEkleTemizlik,aEkleAriza,aEkleOnarim);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Apart Adi ve Adresi boş bırakılamaz.");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if(jList1.getSelectedValue() != null)
        {
            apartController.aGuncelle = "asd";
            apartController.apartId(jList1.getSelectedValue().toString());
            jLabel34.setText(String.valueOf(apartController.aID));
            jTextField28.setText(apartController.aGAdi);
            jTextArea2.setText(apartController.aGAdres);
            jComboBox8.setSelectedItem(apartController.aGTemizlik);
            apartController.apartListesi1();
            apartController.aGuncelle = null;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Apart seçilemedi");
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String strAid = jLabel34.getText();
        if(strAid.length() != 0)
        {
                parametre23 = jTextField28.getText();
                parametre24 = jTextArea2.getText();
                parametre25 = jComboBox8.getSelectedItem().toString();
                parametre28 = Integer.parseInt(jLabel34.getText());
                apartController.apartGuncelle(parametre23, parametre24, parametre25,parametre28);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Apart seçilemedi.");
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        String strAid = jLabel34.getText();
        if(strAid.length() != 0)
        {
            int reply = JOptionPane.showConfirmDialog(null, jTextField28.getText()+" silmek istediğinizden emin misiniz ?");
            if(reply == JOptionPane.YES_OPTION)
            {
                apartController.apartSilme(jLabel34.getText());
                jLabel34.setText("");
                jTextField28.setText("");
                jTextArea2.setText("");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Apart seçilemedi.");
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jList8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList8MouseClicked
        if(jList8.getSelectedValue() != null)
        {
            jComboBox7.setSelectedIndex(-1);
            jTextArea1.setText("");
            jLabel36.setText(jList8.getSelectedValue().toString());
            arizaGuncelle = "asd";
            String gecici= apartController.apartArizaGoruntule(jList8.getSelectedValue().toString());
            arizaGuncelle = null;
            String[] gdizi = gecici.split("/");
            if(gdizi[0] == "null")
            {
                jComboBox7.setSelectedIndex(-1);
            }
            else
            {
                jComboBox7.setSelectedItem(gdizi[0]);
            }
            if(gdizi.length>1)
            if(gdizi[1] == "null")
            {
                jTextArea1.setText("");
            }
            else
            {
                jTextArea1.setText(gdizi[1]);
            }

            apartController.apartListesi1();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Apart seçilemedi");
        }
    }//GEN-LAST:event_jList8MouseClicked

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
       if(jComboBox7.getSelectedIndex() == 1 || jComboBox7.getSelectedIndex() == -1)
       {
           jTextArea1.setVisible(false);
           jTextArea1.setText("");
       }
       else
       {
         jTextArea1.setVisible(true);
       }
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
            String strAaid = jLabel36.getText();
            if(strAaid.length() != 0)
            {
                apartController.apartArizaGuncelle(jComboBox7.getSelectedItem().toString(), jTextArea1.getText(), jLabel36.getText());
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Apart seçilmedi.");
            }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String yol = System.getProperty("user.dir")+"\\src\\yamugapart\\entity\\report12.jrxml";
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection baglanti = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/yamugapart","root","1234");
            JasperDesign jasperDesign = JRXmlLoader.load(yol);
            String raporSorgusu = "Select * From Apart";
            JRDesignQuery designQuery = new JRDesignQuery();
            designQuery.setText(raporSorgusu);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null,baglanti);
            JasperViewer.viewReport(jasperPrint, false);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        String yol = System.getProperty("user.dir")+"\\src\\yamugapart\\entity\\report15.jrxml";
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection baglanti = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/yamugapart","root","1234");
            JasperDesign jasperDesign = JRXmlLoader.load(yol);
            String raporSorgusu = "Select * From Musteri where Musteri_Apart_ID in (Select Apart_ID from Apart)";
            JRDesignQuery designQuery = new JRDesignQuery();
            designQuery.setText(raporSorgusu);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null,baglanti);
            JasperViewer.viewReport(jasperPrint, false);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        jLabel34.setText("");
        jTextField28.setText("");
        jTextArea2.setText("");
        jComboBox8.setSelectedIndex(0);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        jRadioButton7.setSelected(false);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        jRadioButton7.setSelected(false);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jRadioButton7.setSelected(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        jRadioButton7.setSelected(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        String musteriRapor = jLabel38.getText();
        if(musteriRapor.length() >0)
        {
            String yol = System.getProperty("user.dir")+"\\src\\yamugapart\\entity\\report19.jrxml";
            HashMap param = new HashMap();
            param.put("apartadirapor", musteriRapor);
            //select * from Musteri where Musteri_Apart_ID in (select Apart_ID from Apart where Apart_Adi=$P{apartadirapor})
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection baglanti = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/yamugapart","root","1234");
                JasperDesign jasperDesign = JRXmlLoader.load(yol);
                //String raporSorgusu = "Select * From Apart";
                //JRDesignQuery designQuery = new JRDesignQuery();
                //designQuery.setText(raporSorgusu);
                JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param,baglanti);
                JasperViewer.viewReport(jasperPrint, false);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Önce soldaki listeden Apart Seçiniz Sonra Butona tıklayın");
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:      
        String musteriRapor = jLabel10.getText();
        if(musteriRapor.length() >0)
        {
            String yol = System.getProperty("user.dir")+"\\src\\yamugapart\\entity\\report20.jrxml";
            HashMap param = new HashMap();
            param.put("apartadirapor", musteriRapor);
            //select * from Apart where Apart_Adi = $P{apartadirapor}
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection baglanti = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/yamugapart","root","1234");
                JasperDesign jasperDesign = JRXmlLoader.load(yol);
                //String raporSorgusu = "Select * From Apart";
                //JRDesignQuery designQuery = new JRDesignQuery();
                //designQuery.setText(raporSorgusu);
                JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param,baglanti);
                JasperViewer.viewReport(jasperPrint, false);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Önce soldaki listeden Apart Seçiniz Sonra Butona tıklayın");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList9MouseClicked
        // TODO add your handling code here:
        jLabel10.setText(jList9.getSelectedValue().toString());
        jLabel38.setText(jList9.getSelectedValue().toString());
        apartController.apartListesi1();
    }//GEN-LAST:event_jList9MouseClicked

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        apartController.apartListesi1();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jList10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList10MouseClicked
        // TODO add your handling code here:
        jLabel41.setText(jList10.getSelectedValue().toString());
        apartController.apartListesi1();
    }//GEN-LAST:event_jList10MouseClicked

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        apartController.apartListesi1();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        if(jLabel41.getText() != "")
        {
            String konuKontrol = jTextField1.getText();
            String icerikKontrol = jTextArea3.getText();
            if(konuKontrol.length()>1 && icerikKontrol.length()>1)
            {
            //apartController.apartId(jLabel41.getText());
            String mApartAdi = jLabel41.getText();
            String mKonu = jTextField1.getText();
            String mIcerik = jTextArea3.getText();
            musteriController.musteriBilgilendirme(mApartAdi);
            for(int i=0;i<musteriController.mBilgiList.getSize();i++)
            {
                String kelimecik = "";
                kelimecik = (String) musteriController.mBilgiList.getElementAt(i);
                kelimecik = kelimecik.replace('ö', 'o'); 
                kelimecik = kelimecik.replace('ü', 'u'); 
                kelimecik = kelimecik.replace('ğ', 'g'); 
                kelimecik = kelimecik.replace('ş', 's'); 
                kelimecik = kelimecik.replace('ı', 'i'); 
                kelimecik = kelimecik.replace('ç', 'c'); 
                kelimecik = kelimecik.replace('Ö', 'O'); 
                kelimecik = kelimecik.replace('Ü', 'U'); 
                kelimecik = kelimecik.replace('Ğ', 'G'); 
                kelimecik = kelimecik.replace('Ş', 'S'); 
                kelimecik = kelimecik.replace('İ', 'I'); 
                kelimecik = kelimecik.replace('Ç', 'C'); 
                RECIPIENT = kelimecik;
                String[] to = { RECIPIENT }; // list of recipient email addresses
                String from = USER_NAME;
                String pass = PASSWORD;
                String subject = mKonu;
                String body = mIcerik;

                sendFromGMail(from, pass, to, subject, body);


            }
            JOptionPane.showMessageDialog(null, "Gönderildi");  
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Konu ve İcerik boş bırakılamaz.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Soldaki listeden Apart seçin");
        }
        
    }//GEN-LAST:event_jButton33ActionPerformed

    private static void sendFromGMail(String from, String pass, String[] to, String subject, String body) {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            for( int i = 0; i < to.length; i++ ) {
                    toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }
            
    public void musteriBilgileriniEkle(int mid,String ad,String soyad, String tel,String email,String kira_tarihi,int musteri_apart_id,String oda_no,String dogalgaz,String su,String internet,String Elektrik){
      if(apartController.tablo2.getRowCount()>0 && musteriController.mlist != "asd" && musteriController.like2 !="asd" && musteriController.gList =="asd")
      {
          jTable2.setModel(apartController.tablo2.getModel());
      }
      if(musteriController.like =="asd")
      jTable3.setModel(apartController.tablo3.getModel());
      jTable4.setModel(apartController.tablo4.getModel());
      jTable6.setModel(apartController.tablo5.getModel());
      if(musteriController.like2 == "asd")
      jTable7.setModel(apartController.tablo6.getModel());
    }
    
    public void apartBilgileriniEkle(int Apart_ID,String Apart_Adi,String Apart_Adres,String Apart_Temizlik, String Demirbas_Listesi){  
        if(dlist != "asd" )
        {
           jTable1.setModel(apartController.tablo.getModel()); 
        }
        if(jList5.getSelectedValue() != null || apartController.alist == "asd")
        {
            jTable5.setModel(apartController.tablo.getModel());
        }
        
        jList2.setModel(apartController.dlm);
        jList3.setModel(apartController.dlm);
        jList5.setModel(apartController.dlm);
        jList6.setModel(apartController.dlm);
        jList4.setModel(apartController.dlm);
        jList7.setModel(apartController.dlm);
        jList1.setModel(apartController.dlm);
        jList8.setModel(apartController.dlm);
        jList9.setModel(apartController.dlm);
        jList10.setModel(apartController.dlm);
    }
                 
    public void dlistBilgileriniEkle(int Dlist_ID, String Dlist_Turu, String Dlist_Marka, String Dlist_Adet, int Dlist_Apart_ID){
        if(apartController.dEklelist == "asd")
        {
            JOptionPane.showMessageDialog(null, "Eklendi.");
        }
    }
    public void yenile(){
        
        if(tiklama == 0)
        {
            dlistController.dizi2.removeAllElements();
            dlistController.dizi3.removeAllElements();
            dlistController.dizi4.removeAllElements();
            dlistController.dizi.removeAllElements();
            dlist = "asd";
            dlistController.dlistSay(jLabel37.getText());
            dlist = null;
            dlist = "asdf";
            dlistController.dlistGoruntule(jLabel37.getText());
            dlist = null;
            
            int gecicisayac = 0;
            for(int i = 0;i<dlistController.dlistSayac*2;i++)
            {                  
                if(gecicisayac > dlistController.dlistSayac*2)
                {
                    break;
                }
                if(i==0)
                {
                    tf1 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i).toString());
                    tfler[0] = tf1;
                }
                if(i==1)
                {
                    tf2 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-1).toString());  
                    tfler[1] = tf2;
                }
                if(i==2)
                {
                    tf3 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-1).toString());  
                    tfler[2] = tf3;
                }
                if(i==3)
                {
                    tf4 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-2).toString());    
                    tfler[3] = tf4;
                }
                if(i==4)
                {
                    tf5 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-2).toString());   
                    tfler[4] = tf5;
                }
                if(i==5)
                {
                    tf6 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-3).toString());  
                    tfler[5] = tf6;
                }
                if(i==6)
                {
                    tf7 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-3).toString()); 
                    tfler[6] = tf7;
                }
                if(i==7)    
                {
                    tf8 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-4).toString());  
                    tfler[7] = tf8;
                }
                if(i==8)   
                {
                    tf9 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-4).toString());  
                    tfler[8] = tf9;
                }
                if(i==9)    
                {
                    tf10 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-5).toString());    
                    tfler[9] = tf10;
                }
                if(i==10)    
                {
                    tf11 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-5).toString());  
                    tfler[10] = tf11;
                }
                if(i==11)
                {
                    tf12 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-6).toString());  
                    tfler[11] = tf12;
                }
                if(i==12)
                {
                    tf13 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-6).toString()); 
                    tfler[12] = tf13;
                }
                if(i==13)
                {
                    tf14 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-7).toString());  
                    tfler[13] = tf14;
                }
                if(i==14)
                {
                    tf15 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-7).toString()); 
                    tfler[14] = tf15;
                }
                if(i==15)
                {
                    tf16 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-8).toString()); 
                    tfler[15] = tf16;
                }
                if(i==16)
                {
                    tf17 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-8).toString());  
                    tfler[16] = tf17;
                }
                if(i==17)
                {
                    tf18 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-9).toString());  
                    tfler[17] = tf18;
                }
                if(i==18)  
                {
                    tf19 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-9).toString()); 
                    tfler[18] = tf19;
                }
                if(i==19)
                {
                    tf20 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-10).toString());  
                    tfler[19] = tf20;
                }
                if(i==20)    
                {
                    tf21 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-10).toString());  
                    tfler[20] = tf21;
                }
                if(i==21)
                { 
                    tf22 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-11).toString()); 
                    tfler[21] = tf22;
                }
                
                if(i==22)
                {   
                    tf23 = new javax.swing.JTextField(dlistController.dizi2.getElementAt(i-11).toString());
                    tfler[22] = tf23;
                }
                
                if(i==23)   
                {
                    tf24 = new javax.swing.JTextField(dlistController.dizi3.getElementAt(i-12).toString());    
                    tfler[23] = tf24;
                }
                
                gecicisayac++;
            }
            int gecicisayi = 0;
            for(int i = 0;i<dlistController.dizi.getSize();i++)
            { 
                if(gecicisayi>dlistController.dizi.getSize())
                {
                    break;
                }
                if(i==0)    
                {
                    javax.swing.JLabel lbl1 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[0] = lbl1;
                    javax.swing.JButton btn1 = new javax.swing.JButton("Sil");
                    btnler[0] = btn1;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[0].getText(), tfler[0].getText(), tfler[1].getText(), dSilA);
                            dlistSil = null;
                            yenile();
                        }
                    });
                }

                if(i==1)    
                {
                    javax.swing.JLabel lbl2 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[1] = lbl2;
                    javax.swing.JButton btn2 = new javax.swing.JButton("Sil");
                    btnler[1] = btn2;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[1].getText(), tfler[2].getText(), tfler[3].getText(), dSilA);
                            dlistSil = null;
                            yenile();
                        }
                    });
                }

                if(i==2)    
                {
                    javax.swing.JLabel lbl3 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[2] = lbl3;
                    javax.swing.JButton btn3 = new javax.swing.JButton("Sil");
                    btnler[2] = btn3;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[2].getText(), tfler[4].getText(), tfler[5].getText(), dSilA);
                            dlistSil = null;
                            yenile();
                        }
                    });
                }

                if(i==3)    
                {
                    javax.swing.JLabel lbl4 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString()); 
                    lbller[3] = lbl4;
                    javax.swing.JButton btn4 = new javax.swing.JButton("Sil");
                    btnler[3] = btn4;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[3].getText(), tfler[6].getText(), tfler[7].getText(), dSilA);
                            dlistSil = null;
                            yenile();
                        }
                    });
                }

                if(i==4)    
                {
                    javax.swing.JLabel lbl5 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[4] = lbl5;
                    javax.swing.JButton btn5 = new javax.swing.JButton("Sil");
                    btnler[4] = btn5;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[4].getText(), tfler[8].getText(), tfler[9].getText(), dSilA);
                            dlistSil = null;
                            yenile();
                        }
                    });
                }

                if(i==5)    
                {
                    javax.swing.JLabel lbl6 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[5] = lbl6;
                    javax.swing.JButton btn6 = new javax.swing.JButton("Sil");
                    btnler[5] = btn6;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[5].getText(), tfler[10].getText(), tfler[11].getText(), dSilA);
                            dlistSil = null;
                            yenile();
                        }
                    });
                }

                if(i==6)    
                {
                    javax.swing.JLabel lbl7 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[6] = lbl7;
                    javax.swing.JButton btn7 = new javax.swing.JButton("Sil");
                    btnler[6] = btn7;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[6].getText(), tfler[12].getText(), tfler[13].getText(), dSilA);
                            dlistSil = null;
                            yenile();
                        }
                    });
                }

                if(i==7)    
                {
                    javax.swing.JLabel lbl8 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[7] = lbl8;
                    javax.swing.JButton btn8 = new javax.swing.JButton("Sil");
                    btnler[7] = btn8;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[7].getText(), tfler[14].getText(), tfler[15].getText(), dSilA);
                            dlistSil = null;
                            yenile();
                        }
                    });
                }

                if(i==8)    
                {
                    javax.swing.JLabel lbl9 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[8] = lbl9;
                    javax.swing.JButton btn9 = new javax.swing.JButton("Sil");
                    btnler[8] = btn9;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[8].getText(), tfler[16].getText(), tfler[17].getText(), dSilA);
                            dlistSil = null;
                            yenile();
                        }
                    });
                }

                if(i==9)    
                {
                    javax.swing.JLabel lbl10 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[9] = lbl10;
                    javax.swing.JButton btn10 = new javax.swing.JButton("Sil");
                    btnler[9] = btn10;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[9].getText(), tfler[18].getText(), tfler[19].getText(), dSilA);
                            dlistSil = null;
                            yenile();
                        }
                    });
                }

                if(i==10)    
                {
                    javax.swing.JLabel lbl11 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[10] = lbl11;
                    javax.swing.JButton btn11 = new javax.swing.JButton("Sil");
                    btnler[10] = btn11;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[10].getText(), tfler[20].getText(), tfler[21].getText(), dSilA);
                            dlistSil = null;
                            yenile();
                        }
                    });
                }

                if(i==11)    
                {
                    javax.swing.JLabel lbl12 = new javax.swing.JLabel(dlistController.dizi.getElementAt(i).toString());
                    lbller[11] = lbl12;
                    javax.swing.JButton btn12 = new javax.swing.JButton("Sil");
                    btnler[11] = btn12;
                        btnler[i].addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dlistSil = "asd";
                            dlistController.dlistSil(lbller[11].getText(), tfler[22].getText(), tfler[23].getText(), dSilA);
                            dlistSil = null;
                            yenile();
                        }
                    });
                }
                gecicisayi++;
            }
            
            for(int i=0;i<dlistController.dlistSayac*2;i++)
            {
                if(i<12 && i<dlistController.dizi.getSize())
                {
                jPanel30.remove(lbller[i]);
                jPanel30.remove(btnler[i]);    
                }
                if(tfler[i] != null)
                jPanel30.remove(tfler[i]);
                jPanel30.revalidate();
                jPanel30.repaint();
            }
            
            
            for(int i=0;i<dlistController.dlistSayac*2;i++)
            {
                JLabel label1 = new JLabel();
                label1.setSize(label1.getPreferredSize());
                label1.setFont(jLabel14.getFont());
                tfler[i].setSize(200, 20);
                tfler[i].setFont(jLabel14.getFont());
                if(i<12 && i<dlistController.dizi.getSize())
                {
                    lbller[i].setSize(200,20);
                    lbller[i].setFont(jLabel14.getFont());
                    btnler[i].setSize(50,20);
                    btnler[i].setFont(jLabel14.getFont());
                }
                label1.setLocation(jLabel14.getX()-50,jLabel14.getY()+30);
                if(i==0)
                {
                    tfler[i].setLocation(label1.getX()+30,label1.getY());
                    if(i<12)
                    {
                    lbller[i].setLocation(jLabel14.getX()-125,jLabel14.getY()+29);
                    btnler[i].setLocation(lbller[i].getX()+600,lbller[i].getY());
                    }
                }
                else if(i%2 == 0)
                {
                    tfler[i].setLocation(tfler[i-1].getX()-240,tfler[i-1].getY()+30);
                    if(i<12 && i<dlistController.dizi.getSize())
                    {
                    lbller[i].setLocation(lbller[i-1].getX(),lbller[i-1].getY()+30);    
                    btnler[i].setLocation(lbller[i].getX()+600,lbller[i].getY());
                    }
                }
                else if(i == 1)
                {
                    tfler[i].setLocation(tfler[i-1].getX()+240,label1.getY());
                    if(i<12 && i<dlistController.dizi.getSize())
                    {
                    lbller[i].setLocation(lbller[i-1].getX(),lbller[i-1].getY()+30);    
                    btnler[i].setLocation(lbller[i].getX()+600,lbller[i].getY());
                    }
                }
                else
                {
                    tfler[i].setLocation(tfler[i-1].getX()+240,tfler[i-1].getY());
                    if(i<12 && i<dlistController.dizi.getSize())
                    {
                    lbller[i].setLocation(lbller[i-1].getX(),lbller[i-1].getY()+30);    
                    btnler[i].setLocation(lbller[i].getX()+600,lbller[i].getY());
                    }
                }

                if(i<12 && i<dlistController.dizi.getSize())
                {
                    jPanel30.add(lbller[i]);
                    jPanel30.add(btnler[i]);
                }    
                    jPanel30.add(tfler[i]);
                    jPanel30.revalidate();
                    jPanel30.repaint();   
                
                
            }
            tiklama++;
        }
        else
        {
                for(int i=0;i<dlistController.dlistSayac*2;i++)
                {
                    if(i<12 && i<dlistController.dizi.getSize())
                    {
                        jPanel30.remove(lbller[i]);
                        jPanel30.remove(btnler[i]);
                    }
                    
                    if(tfler[i] != null)
                    jPanel30.remove(tfler[i]);
                    jPanel30.revalidate();
                    jPanel30.repaint();
                }
            tiklama--;
            yenile();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YamugView().setVisible(true);
            }
        });
    }

    public MusteriController getMusteriController() {
        return musteriController;
    }

    public void setMusteriController(MusteriController musteriController) {
        this.musteriController = musteriController;
    }

    public ApartController getApartController() {
        return apartController;
    }

    public void setApartController(ApartController apartController) {
        this.apartController = apartController;
    }

    public DlistController getDlistController() {
        return dlistController;
    }

    public void setDlistController(DlistController dlistController) {
        this.dlistController = dlistController;
    }
    
    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList10;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JList jList5;
    private javax.swing.JList jList6;
    private javax.swing.JList jList7;
    private javax.swing.JList jList8;
    private javax.swing.JList jList9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables


}
