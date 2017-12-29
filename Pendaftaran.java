import java.util.Scanner;
import java.util.Random;

class Pendaftaran {
    String nama = "";
    String alamat = "";
    String tempat_lahir = "";
    String bulan_lahir= "";
    String agama = "";
    String jenis_kelamin = "";
    String asal_sekolah = "";
    String jurusan = "";
    String no_registrasi = "";
    int tanggal  ;
    int tahun_lahir ;
    int tahun_lulus  ;
    boolean status = false;

    void login() {

    }

   


    void daftar(){
         Scanner keyboard = new Scanner (System.in);              
        // tampilkan ke user
        System.out.println("######################## FORM PENDAFTARAN MAHASISWA BARU ############################");
        System.out.print(" Nama                     :" + nama);
        nama = keyboard.next();
        System.out.print(" Alamat                   :" + alamat);
        alamat = keyboard.next();
        System.out.print(" Tanggal lahir            :" + tanggal);
        tanggal = keyboard.nextInt();
        System.out.print(" Tempat lahir             :" + tempat_lahir);
        tempat_lahir = keyboard.next();
        System.out.print(" Bulan Lahir              :" + bulan_lahir); 
        bulan_lahir = keyboard.next();
        System.out.print(" Tahun Lahir              :" + tahun_lahir);
        tahun_lahir = keyboard.nextInt();
        System.out.print(" Agama                    :" + agama);
        agama = keyboard.next();
        System.out.print(" Jenis Kelamin            :" + jenis_kelamin);
        jenis_kelamin = keyboard.next();
        System.out.print(" Asal Sekolah SMA / SMK   :" + asal_sekolah);
        asal_sekolah = keyboard.next();
        System.out.print(" Tahun Lulus              :" + tahun_lulus);
        tahun_lulus = keyboard.nextInt();
        System.out.print(" Jurusan yang di pilih    :" + jurusan);
        jurusan = keyboard.next();
        System.out.print("########################################################################################");
        
        
    }
    void generateNoregistrasi(){
        Random ran = new Random();
        no_registrasi = " Reg " + ran.nextInt(99999);
    }
    void isRegister() {
        if (status) {
            System.out.println("*  -------------------------------------- *");
            System.out.println("*  Anda berhasil daftar.                  *");
            System.out.println("No registrasi anda : " + no_registrasi);
            System.out.println();
        }
    }


}
          


