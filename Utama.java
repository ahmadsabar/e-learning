import java.util.Scanner;
public class Utama {

public static void main(String[] args) {
    Utama utama = new Utama();
    utama.showMenu(); 
    Pendaftaran siswa = new Pendaftaran();
     siswa.daftar();
     siswa.isRegister();
     Perwalian wali = new Perwalian();
    wali.isi(); 


 }
    public static void showMenu(){
    
     int pilihan;
     Scanner scan = new Scanner(System.in);

         System.out.println("################### SELAMAT DATANG ########################");
         System.out.println(" 1 PENDAFTARAN ");
         System.out.println(" 2 PERWALIAN");
         System.out.println("############################################################");
         System.out.println(" MASUKAN PILIHAN ANDA                : ");
         pilihan = scan.nextInt();

        
        switch(pilihan){
            case 1 :
            break;
            case 2 :
            break;
            case 3:
            break;
            default:
            System.out.println(" Pilihan Salah !!");
            break;
            

     
    
 
    
    
    
}
        
    }
        
         
    
}
