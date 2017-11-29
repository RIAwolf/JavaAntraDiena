package lt.kaunascoding.java;

import java.util.Scanner;

public class Main {
    public static final int CHOISE_0 = 0;
    public static final int CHOISE_1 = 1;
    public static final int CHOISE_2 = 2;
    public static final int CHOISE_3 = 3;
    public static final int CHOISE_4 = 4;

    public static void main(String[] args) {
        // Parodyti vartotojui kiek yra uzduociu
        // paklausti vartoto kokia uzduoti parodyti
        // nuskaityti vartotojo pasirinkima
        // pagal ivesta sveika skaiciu rodyti uzduoties vykdyma
        // programa kartoja sia seka kol vartotojas neiveda 0


        // git init
        // git add --all
        // git commit -m "Pirmas ikelimas"
        // dvi komandos is github.com


        Scanner skaitytuvas = new Scanner(System.in);
        while (true) {
            System.out.println("Turime isviso 1 uzduociu");
            System.out.println("Iveskite uzduoties numeri kad ja vykdyti");
            System.out.println("Ivedus 0 programa bus baigta");

            int pasirinkimas = skaitytuvas.nextInt();

            switch (pasirinkimas) {
                case CHOISE_0:
                    return;
                case CHOISE_1:
                    Uzduotis01 pirmoji = new Uzduotis01();
                    break;
            }
        }
    }
}
