import java.util.Date;
import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Pembelian tiket ---");
        System.out.println("Nama lengkap :");
        String name = input.nextLine();
        System.out.println("Umur :");
        int age = input.nextInt();
        if (age >= 17){
            menu();
            System.out.println("pilih tiket : ");
            int tiket = input.nextInt();
            if (tiket == 1){
                System.out.println("jumlah tiket : ");
                int jml = input.nextInt();
                int tot = jml*300000;
                struk(name,age,tot,jml);
            } else if (tiket == 2){
                System.out.println("jumlah tiket : ");
                int jml = input.nextInt();
                int tot = jml*200000;
                struk(name,age,tot,jml);
            } else if (tiket == 3){
                System.out.println("jumlah tiket : ");
                int jml = input.nextInt();
                int tot = jml*100000;
                struk(name,age,tot,jml);
            }
        } else if(age <= 17) {
            System.out.println("Maap anda belum cukup umur");
        } else {
            System.out.println("Input tidak valid");
        }
    }
    static void struk(String name, int age,int tot, int jml){
        System.out.println("------ Selamat datang ------");
        Date date = new Date();
        Scanner input = new Scanner(System.in);
        System.out.println("Tanggal : "+date.toString());
        System.out.println("nama : "+name);
        System.out.println("Umur : "+age);
        System.out.println("Jumlah tiket : "+jml);
        System.out.println("jumlah uang yang harus di bayar = Rp. "+tot);
        System.out.println("------ Terimakasih Sudah Datang datang ------");
    }
    static void menu(){
        System.out.println("--- pilih tiket ---");
        System.out.println("1. High class : Rp. 300.000");
        System.out.println("2. Premium : Rp. 200.000");
        System.out.println("3. Reguler : Rp. 100.000");
    }
}
