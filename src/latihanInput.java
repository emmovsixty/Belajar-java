
import java.util.ArrayList;
import java.util.Scanner;


public class latihanInput {
    public static void main(String[] args) {
        ArrayList<String> dataNama = new ArrayList<>();
        System.out.println("--- Data Karyawan ---");
        Scanner input = new Scanner(System.in);
        System.out.println("Nama lengkap : ");
        dataNama.add(input.nextLine());
        for (String i :dataNama){
            System.out.println(i);
        }

    }
}
