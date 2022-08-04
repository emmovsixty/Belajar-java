import java.io.BufferedReader;
import java.io.IOException;
import   java.io.InputStreamReader;


public class InputBufferReader {
    public static void main(String[] args) throws IOException {
        String nama, alamat;

        InputStreamReader sr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(sr);

        System.out.println("masukan nama");
        nama = br.readLine();
        System.out.println("masukan alamat");
        alamat = br.readLine();
        System.out.println(nama);
        System.out.println(alamat);

    }
}
