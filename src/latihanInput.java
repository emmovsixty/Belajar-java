import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class latihanInput {
    public static void main(String[] args) {
        ArrayList<String> namaPegawai = new ArrayList<>();
        ArrayList<Integer> GajiPegawai = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Nama lengkap :");
            namaPegawai.add(input.next());
            System.out.println("Gaji :");
            GajiPegawai.add(input.nextInt());
            System.out.println("lanjut isi? ");
            String next = input.next();
            if (!Objects.equals(next, "yes")){
                for (int i = 0; i < GajiPegawai.size(); i++){
                    System.out.println("Nama : "+namaPegawai.get(i));
                    System.out.println("gaji : "+namaPegawai.get(i));
                    System.out.println("-----------------------------");
                }
                break;
            }
        }

    }
}