import java.util.Scanner;

public class latihanInput {
    public static void main(String[] args) {
        String nama, alamat;
        Integer umur, gaji, jmlAnak, totGaji;

        Scanner input = new Scanner(System.in);

        System.out.println("--- Selamat datang di Pendataan Karyawan ---");
        System.out.println("Masukan Nama lengkap : ");
        nama = input.nextLine();
        System.out.println("Umur : ");
        umur = input.nextInt();
        System.out.println("Gaji : ");
        gaji = input.nextInt();
        System.out.println("Jumlah anak : ");
        jmlAnak = input.nextInt();
        totGaji = jmlAnak*gaji;

        System.out.println("--- Data karyawan ---");
        System.out.println("nama lengkap : "+nama);
        System.out.println("umur : "+umur);
        System.out.println("jumlah anak : "+jmlAnak);
        System.out.println("total gaji : "+totGaji);




    }
}
