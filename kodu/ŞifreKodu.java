
package şifre.kodu;

import java.util.Scanner;


public class ŞifreKodu {

    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.println(3-i+" deneme hakkınız kaldı ");
            System.out.print("lütfen şifrenizi girin :");
            int sifre = klavye.nextInt();
            if(sifre ==123456){
                System.out.println(" şifreniz dogru ");
                break;
            }
            if(i==2){
                System.out.println("yanliş şifre cihaz bloke edildi");
            }
        }
    }
    
}
