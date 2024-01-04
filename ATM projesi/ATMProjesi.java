
package atm.projesi;

import java.util.Scanner;


public class ATMProjesi {

    
    public static void main(String[] args) {
        int bakiye = 1000000 ;
        /*işlemler 
        1 bakiye ogrenme 
        2 para çekme 
        3 para yatırma 
        4 çikiş
        */ 
        System.out.println("1. islem : bakiye sorgulama\n"
                         + "2. islem : para çekme\n"
                         + "3. islem : para yatirma\n"
                         + "4. islem : çikis");
        Scanner klavye = new Scanner(System.in);
     boolean durum = true;
        while(durum){   System.out.print("yapmak istediğiniz işlemi girin :");
       int islem = klavye.nextInt();
       if(islem==1){
           System.out.println("bakiyeniz :"+bakiye);
       }else if(islem==2){
           int cekilenPara = 0;
           do{
               System.out.print("cekmek istediniz tutari girin :");
               cekilenPara=klavye.nextInt();
           }while(bakiye<cekilenPara);
           bakiye = bakiye-cekilenPara;    
       }else if(islem==3){
           System.out.print("yatirmak istediniz tutari girin :");
           int yatirilacakTutar = klavye.nextInt();
           bakiye = bakiye + yatirilacakTutar;
       }
       else if(islem==4 ){
           System.out.println("oturumunuz sonlandı ");
           durum = false;
       }else{
           System.out.println("yanliş bir işlem sectiniz dogru işlemi secin ");
       }
     }
    }
    

}