import java.util.Scanner;

public class switchLamda {
    public static void main(String[] args) {
        String nama;
        Integer age;
        Scanner input = new Scanner(System.in);
        System.out.println("nama lengkap");
        nama = input.next();
        System.out.println("nilai");
        age = input.nextInt();

        switch (age){
            case 100 -> System.out.println("Coumbloud");
            case 90 -> System.out.println("Perfect");
            case 80,70,60 -> System.out.println("Good");
            case 50,40,30,20,10 -> System.out.println("so bad");
            default -> System.out.println("anda tolol");
        };

    }
}
