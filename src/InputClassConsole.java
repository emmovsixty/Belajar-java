import java.io.Console;
public class InputClassConsole {
    public static void main(String[] args) {
        String nama;
        Integer usia;

        Console input = System.console();
        System.out.println("Masukan nama anda : ");
        nama = input.readLine();
        System.out.println("Usia anda");
        usia = Integer.parseInt(input.readLine());

        System.out.println("--- Data Masyarakat ---");
        System.out.println("nama : "+nama);
        System.out.println("usia : "+usia);

    }
}
