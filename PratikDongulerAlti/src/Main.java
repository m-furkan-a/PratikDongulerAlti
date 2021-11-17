import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int sayi , basSayisi = 0 , toplam = 0 , m = 0 , test;
	    System.out.print("Sayı Giriniz : ");
	    sayi = input.nextInt();
        test = sayi;
	    while (sayi != 0){
	        sayi /= 10;
	        basSayisi++;
        }

	    for (int i = 1; i <= basSayisi; i++){
            toplam += test % 10;
            System.out.println(toplam);
            test /= 10;
        }
        System.out.println("sayının basamak sayılarının toplamı : " + toplam);
    }
}
