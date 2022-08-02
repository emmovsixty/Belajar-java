public class ConversiNumber {
    public static void main(String[] args) {
        byte iniByte = 100;
        short IniShort = iniByte;
        int iniInt = IniShort;
        long iniLong = iniInt;
        System.out.println(iniLong);

        int int2 = (int)iniLong;
        short short2 = (short) int2;
        byte byte2 = (byte) short2;
        System.out.println(byte2);
        int hasil = (int)iniLong * (int)iniByte;
        System.out.println("hasil penjumlahan dari angka diatas adalah "+hasil);

    }
}
