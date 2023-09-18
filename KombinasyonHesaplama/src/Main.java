import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner getData = new Scanner(System.in);

        System.out.print("Lütfen n değerini giriniz : ");

        int n = getData.nextInt();

        System.out.print("Lütfen r değerini giriniz : ");

        int r = getData.nextInt();

        if (r > n){

            System.out.println("r değeri n'den büyük olmamalıdır !!!");

        }


        else{

            long kombinasyon = 1;

            for (int i = 1; i <= n; i++){   // n faktöriyel

                kombinasyon *= i;

            }

            long faktoriyelR = 1;  // r faktöriyel

            for (int i = 1; i <= r; i++){

                faktoriyelR *= i;

            }

            long NeksiR = 1;  // n-r faktöriyel

            for (int i = 1; i <= (n-r); i++){

                NeksiR *= i;

            }

            if (faktoriyelR != 0 && NeksiR != 0) {
                long formul = kombinasyon / (faktoriyelR * NeksiR);
                System.out.println("C(" + n + ", " + r + ") = " + formul);
            } else {
                System.out.println("Sıfıra Bölünemiyor...");
            }

        }

    }

}
