import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int n1,n2,select,toplama,cikarma,carpma,bolme;
    Scanner input=new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz: ");
        n1= input.nextInt();
        System.out.println("İkinci Sayıyı giriniz: ");
        n2= input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select= input.nextInt();
        toplama=n1+n2;
        cikarma=n1-n2;
        carpma=n1*n2;
        bolme=n1/n2;
        switch (select){
            case 1:
                System.out.println(toplama);
                break;
            case 2:
                System.out.println(cikarma);
                break;
            case 3:
                System.out.println(carpma);
                break;
            case 4:
                System.out.println(bolme);
                break;
            default:
                System.out.println("Tekrar Sayı Giriniz");
        }

    }
}