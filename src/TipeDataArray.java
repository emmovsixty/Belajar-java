public class TipeDataArray {
    public static void main(String[] args){
        int[] umur = new int[]{
                21,43,65,75
        };
        String[] nama = new String[3];
        nama[0] = "panjul";
        nama[1] = "dika";
        nama[2] = "lutfi";
        System.out.println(nama[0]+" umur "+umur[0]);
        System.out.println(nama[1]+" umur "+umur[1]);
        System.out.println(nama[2]+" umur "+umur[2]);

        for (int i = 0; i < nama.length; i++){
            System.out.println(nama[i]);
        };

        String[] hewan = new String[]{
          "pampam","dika","dimas"
        };
        System.out.println(hewan[2]);

        String[] alat = {
                "kamera","kipas","lampu"
        };
        System.out.println(alat[0]);
        System.out.println("panjang data : "+alat.length);
        alat[0]="sayur";
        System.out.println(alat[0]);

        String[] rumah = {
                "kursi","meja"
        };
        // aray didalam aray
        String[][] kel = {
                {"ayah","ibu"},
                {"anak","cucu"},
                {"cicit"}
        };

        String[] penyakit ={
                "TBC","COVID","PANU"
        };


    }
}
