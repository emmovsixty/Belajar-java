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
            System.out.println("--- pilih tiket ---");
            System.out.println("1. High class : Rp. 300.000");
            System.out.println("2. Premium : Rp. 200.000");
            System.out.println("3. Reguler : Rp. 100.000");
            int tiket = input.nextInt();
            switch (tiket){
                case 1:
                    struk(name,age);
                    break;
                case 2:
                    struk(name,age);
                    break;
                case 3:
                    struk(name,age);
                    break;
            }
        } else if(age <= 17) {
            System.out.println("Maap anda belum cukup umur");
        } else {
            System.out.println("Input tidak valid");
        }

    }
    static void struk(String name, int age){
        Date date = new Date();
        Scanner input = new Scanner(System.in);
        System.out.println("jumlah tiket yang dibeli : ");
        int jml3 = input.nextInt();
        int tot3 = jml3*300000;
        System.out.println("nama : "+name);
        System.out.println("Umur : "+age);
        System.out.println("Tanggal : "+date.toString());
        System.out.println("jumlah uang yang harus di bayar = Rp. "+tot3);

    }
}
