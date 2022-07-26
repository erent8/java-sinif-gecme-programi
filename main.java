import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {
        int mat,fizik,kimya,muzik,turkce;
        // int : değişken atamamız

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Muzik notunuz : ");
        muzik = input.nextInt();

        System.out.print("Turkce notunuz : ");
        turkce = input.nextInt();

        // Ortalama hesaplayacağımız için double'ı kullanıyoruz

        double average = (mat + fizik + muzik + turkce + kimya)/5;
        // if kullanmamızın sebebi küük eşit, eşittir gibi ifadeler kullanmamız.
        if (average <= 55) {
            System.out.println("Sinifta kaldin kardesim Allah yar ve yardimcin olsun!");
            System.out.println("Ortalaman : " + average);
        }
        // istenen durum gerçekleşmediyse zıttı ise else kullanırız.
        else{
            System.out.println("Helal, sinifi gectin!" );
            System.out.println("Ortalamaniz : " + average);
        }
    }

}

// instagram : erennt8
// https://github.com/erent8
