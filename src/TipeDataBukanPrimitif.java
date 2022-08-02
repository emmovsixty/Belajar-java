public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        // default null
        Integer num = null;
        String str = "Hello world ";
        Integer Int = 123234;
        Short shr = 123;
        Byte byt = 123;
        Long ll = 42441l;
        Float Flo = 12.54f;
        Double dbl = 12.43;

        System.out.println(num);
        System.out.println(str);
        System.out.println(Int);
        System.out.println(Flo);
        System.out.println(shr);
        System.out.println(byt);
        System.out.println(ll);
        System.out.println(dbl);


        str = "world hello";
        System.out.println(str);

        // konversi primitif ke bukan primitif
        int nomor = 1232;
        Integer nomor2 = nomor;
        System.out.println(nomor2);

        // konversi bukan primitif ke primitif
        Integer no = 213;
        int no1 = no;
        System.out.println(no1);

        short nmr = 123;
        byte nmr2 = (byte) nmr;

        Integer nm = 1;
        byte nm1 = nm.byteValue();

        int nm2 = 2;
        Integer we = nm2;

    }
}
