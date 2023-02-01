import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Artık Yıl Nedir?\n" +
                "\n" +
                "Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.");
        Scanner scanner = new Scanner(System.in);
        int year ;
        System.out.println("Yıl giriniz: ");
        year = scanner.nextInt();

        if (year % 4 == 0 && !(year % 100 == 0) || year % 100 == 0 && year % 400 == 0 ){
            System.out.println(year + " bir artık yıldır.");

        }else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}