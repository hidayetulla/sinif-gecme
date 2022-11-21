import java.util.Scanner;


public class pratik8{
    public static void main(String[] args) {
        double sayac =0 , toplam = 0 , mat , fizik , turkce , kimya , muzik ,avrage;

        Scanner input = new Scanner(System.in);
        System.out.print("matimatik notunuz: ");
        mat = input.nextInt();
        System.out.print("fizik notunuz: ");
        fizik = input.nextInt();
        System.out.print("turkce notunuz: ");
        turkce = input.nextInt();
        System.out.print("kimya notunuz: ");
        kimya = input.nextInt();
        System.out.print("muzik notunuz: ");
        muzik = input.nextInt();

        if(mat > 0 && mat < 100){
            toplam+=mat;
            sayac++;
        } 
        if(fizik > 0 && fizik < 100){
            toplam += fizik;
            sayac++;
        }
        if(turkce > 0 && turkce < 100){
            toplam += turkce;
            sayac++;
        }
        if(kimya > 0 && kimya < 100){
            toplam += kimya;
            sayac++;
        }
        if(muzik > 0 && muzik < 100){
            toplam += muzik;
            sayac++;
        }

        avrage = toplam/sayac;

        System.out.println("ortalama:" + avrage);
    }
}