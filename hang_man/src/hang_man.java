
import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Eşref
 */
public class hang_man extends javax.swing.JFrame {

    public int sayac = 0 ;
    public String secilenSehir ;
    public char [] sifreliSehir ;
    public  String[] sehirler = {"ADANA", "ADIYAMAN", "AFYONKARAHİSAR", "AĞRI", "AMASYA", "ANKARA", "ANTALYA", "ARTVİN",
            "AYDIN", "BALIKESİR", "BİLECİK", "BİNGÖL", "BİTLİS", "BOLU", "BURDUR", "BURSA", "ÇANAKKALE", "ÇANKIRI", "ÇORUM",
            "DENİZLİ", "DİYARBAKIR", "EDİRNE", "ELAZIĞ", "ERZİNCAN", "ERZURUM", "ESKİŞEHİR", "GAZİANTEP", "GİRESUN", "GÜMÜŞHANE",
            "HAKKARİ", "HATAY", "ISPARTA", "MERSİN", "İSTANBUL", "İZMİR", "KARS", "KASTAMONU", "KAYSERİ", "KIRIKKALE", "KIRKLARELİ",
            "KIRŞEHİR", "KOCAELİ", "KONYA", "KÜTAHYA", "MALATYA", "MANİSA", "KAHRAMANMARAŞ", "MARDİN", "MUĞLA", "MUŞ", "NEVŞEHİR",
            "NİĞDE", "ORDU", "RİZE", "SAKARYA", "SAMSUN", "SİİRT", "SİNOP", "SİVAS", "TEKİRDAĞ", "TOKAT", "TRABZON", "TUNCELİ",
            "ŞANLIURFA", "UŞAK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "ŞIRNAK",
            "BARTIN", "ARDAHAN", "IĞDIR", "YALOVA", "KARABÜK", "KİLİS", "OSMANİYE"};
   
    public String  sehirSec (){
       int rastgeleSayi =(int)( Math.random()*sehirler.length) ;
       secilenSehir = sehirler[rastgeleSayi];
       return secilenSehir ;
    }
    
    public char [] sehriSifrele (int uzunluk){
        char [] sifreliSehirOlustur = new char[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            sifreliSehirOlustur [i] =  '?' ;
        }
        return sifreliSehirOlustur ;
    }
    
    public char[] sehriAc(char [] sifre ,char karakter ,String seciliSehir){
        for (int i = 0; i < seciliSehir.length(); i++) {
            if (seciliSehir.charAt(i)==karakter) {
                sifre [i] = karakter ;
            }
        }
        return sifre ;
    }
    
    public boolean sehirAcildimi (char [] sifre){
        for (int i = 0; i < sifre.length; i++) {
            if (sifre[i]=='?') {
                return false ;
            }
        }
        return true ;
    }
    
    DefaultListModel model = new DefaultListModel();
    
    public void yenidenBaslat(){
        sayac = 0 ;
        secilenSehir = sehirSec() ;
        sifreliSehir=sehriSifrele(secilenSehir.length());
     
        
        String gizliSehir= "" ;
        for (int i = 0; i < sifreliSehir.length; i++) {
            gizliSehir+='?' ;
        }
        lblSifreliSehir.setText(gizliSehir);
        ImageIcon image = new ImageIcon("C:\\Users\\Eşref\\Documents\\NetBeansProjects\\My-1st-grade-codes\\hang_man\\src\\0.jpg");
       lblAdamResmi.setIcon(image);
        txtGirilenHarf.setText("");
       lstCikanHarf.setModel(model);
        model.clear();
        kalanDenemeHakki();
    }
    public void kalanDenemeHakki (){
        lblSayac.setText(""+(10-sayac));
    }
   
 
    public boolean tahminYanlismi(char karakter) {
    boolean tahmin = true;
    sifreliSehir = sehriAc(sifreliSehir, karakter, secilenSehir);
    for (int i = 0; i < sifreliSehir.length; i++) {
        if (sifreliSehir[i] == karakter) {
            tahmin = false;
            break;
        }
    }
    if (tahmin) {
       // sayac++ ;
    }
    return tahmin;
}

    public void basla (){
        secilenSehir = sehirSec() ;
        sifreliSehir = sehriSifrele(secilenSehir.length());
     
        
        String gizliSehir= "" ;
    /*    for (int i = 0; i < sifreliSehir.length; i++) {
            gizliSehir+='?' ;
        }*/
        lblSifreliSehir.setText(gizliSehir);
        }
    
    
    /**
 
     * Creates new form hang_man
     */
    public hang_man() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        basla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new java.awt.Label();
        lblAdamResmi = new javax.swing.JButton();
        label1 = new java.awt.Label();
        btnHarfAl = new javax.swing.JButton();
        txtGirilenHarf = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCikanHarf = new javax.swing.JList<>();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        lblSayac = new java.awt.Label();
        btnRestart = new javax.swing.JButton();
        lblSifreliSehir = new java.awt.Label();

        label2.setText("label2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAdamResmi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0.jpg"))); // NOI18N
        lblAdamResmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAdamResmiActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label1.setText("Şehri Bul Adam Asılacak ");

        btnHarfAl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHarfAl.setText("Harf Al");
        btnHarfAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHarfAlActionPerformed(evt);
            }
        });

        txtGirilenHarf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label3.setText("Harf Al");

        lstCikanHarf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(lstCikanHarf);

        label4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label4.setText("Girilen Harfler ");

        label5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label5.setText("Kalan Hakkınız :");

        lblSayac.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblSayac.setText("10");

        btnRestart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRestart.setText("Restart");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        lblSifreliSehir.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSifreliSehir.setText("Sehir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAdamResmi)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(lblSayac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGirilenHarf, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRestart)
                            .addComponent(btnHarfAl))
                        .addContainerGap(117, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(283, 283, 283))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSifreliSehir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(320, 320, 320))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblSifreliSehir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdamResmi, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGirilenHarf)
                                    .addComponent(btnHarfAl, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lblSayac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAdamResmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAdamResmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAdamResmiActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
    yenidenBaslat();        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestartActionPerformed

    private void btnHarfAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHarfAlActionPerformed
        // TODO add your handling code here:
        sayac = sayac +1 ;
        String girilenHarf = txtGirilenHarf.getText().toUpperCase();
        if (girilenHarf.length()==1) {
            char karakter = girilenHarf.charAt(0);
            sifreliSehir = sehriAc(sifreliSehir, karakter, secilenSehir);
            String sifreliSehirYazdir ="";
            for (int i = 0; i < sifreliSehir.length; i++) {
                sifreliSehirYazdir += sifreliSehir[i];
                lblSifreliSehir.setText(sifreliSehirYazdir);
                if (sehirAcildimi(sifreliSehir)) {
                   JOptionPane.showMessageDialog(null, "Tebrikler kazandiniz ");
                   yenidenBaslat();
                   return ;
                }
                if (tahminYanlismi(karakter)) {
                  //  sayac++;
                    kalanDenemeHakki();
                    ImageIcon image = new ImageIcon("C:\\Users\\Eşref\\Documents\\NetBeansProjects\\My-1st-grade-codes\\hang_man\\src\\"+sayac+".jpg");
                    lblAdamResmi.setIcon(image);
                    lstCikanHarf.setModel(model);
                    model.addElement(karakter);
                   lstCikanHarf.setPreferredSize(new Dimension(250,120));
                }
                if (sayac==10) {
                    JOptionPane.showMessageDialog(null, "Kaybettiniz ! sehir "+secilenSehir);
                    yenidenBaslat();
                    return ;
                }
            }
            
        }else{
        JOptionPane.showMessageDialog(null, "lutfen tek karakter girin ");
    }
        txtGirilenHarf.setText("");
        
    }//GEN-LAST:event_btnHarfAlActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(hang_man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hang_man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hang_man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hang_man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hang_man().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHarfAl;
    private javax.swing.JButton btnRestart;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private javax.swing.JButton lblAdamResmi;
    private java.awt.Label lblSayac;
    private java.awt.Label lblSifreliSehir;
    private javax.swing.JList<String> lstCikanHarf;
    private javax.swing.JTextField txtGirilenHarf;
    // End of variables declaration//GEN-END:variables
}
