import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> anggota = new HashMap<String,Integer>();
        String nama;
        Integer umur;

        anggota.put("farhan",19);
        anggota.put("dimas",21);
        anggota.put("yusuf",20);
        anggota.put("bayu",19);
        anggota.put("baker",19);
        anggota.put("dwi",24);

        System.out.println(anggota);

    }
}
