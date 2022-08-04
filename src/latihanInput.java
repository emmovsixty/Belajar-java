
import java.util.ArrayList;


public class latihanInput {
    public static void main(String[] args) {
        ArrayList<String> dataNama = new ArrayList<>();
        System.out.println("--- Data Karyawan ---");

        String nama = "farhan";
        String nama1 = "mualif";
        String nama2 = "dika";
        String nama3 = "luth";
        String nama4 = "saputra";
        dataNama.add(nama);
        dataNama.add(nama1);
        dataNama.add(nama2);
        dataNama.add(nama3);
        dataNama.add(nama4);

        for (String i : dataNama){
            System.out.println("nama "+i);
        }

    }
}
