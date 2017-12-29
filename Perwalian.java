import java.util.Scanner;

 class Perwalian {
      
      String mahasiswa= "";
      String prodi = "";
      int npm = (0); 



      void isi (){
      	Scanner in = new Scanner(System.in);

      	System.out.println( " ############# FORM PERWALIAN MAHASISWA ###########");
      	System.out.print(" Nama Mahasiswa       : "+ mahasiswa );
      	mahasiswa= in.next();
      	System.out.print( " NPM                 :" + npm);
      	npm = in.nextInt();
      	System.out.print( " Jurusan             :" + prodi);
      	prodi = in.next();

      }


}