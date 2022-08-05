import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
            HashMap<Integer,String> anggota = new HashMap<Integer,String>();
        String nama;
        Integer umur;

        anggota.put(1,"DIMAS");
        anggota.put(2,"DIKA");
        anggota.put(3,"ILHAM");
        anggota.put(4,"DIKI");
        anggota.put(5,"RESTI");
        for (int i = 1;i<anggota.size();i++){
            System.out.println(anggota.get(i));
        }
    }
}
