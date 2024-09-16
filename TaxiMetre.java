import java.util.Scanner;

public class TaxiMetre{

    public static void main(String[] args) {

      // değişkenleri girdim
      int km ;
      double perkm = 2.20 , total , startPrice = 10;
      //kullancıya ekrana giriş verdim

      Scanner input =new Scanner(System.in);
      System.out.print("KM Yİ GİRİNİZ:");
      km = input.nextInt();

      //km hesaplamasını yaptım
      total=(km*perkm);
      total += startPrice;

      // verdiği koşulu aktif hale getirdim

        total=(20>total)? 20 : total ;

  System.out.print("TOPLAM TUTAR:"+total);





    }
}
