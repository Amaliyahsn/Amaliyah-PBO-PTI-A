public class Main {
    public static void main(String[] args) {
        // casting
        // double angka = 5.4;
        // int angka_int = (int)angka;
        // System.out.println(angka_int);

        // Object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("Ucup", 100);
        hero1.display();
        // upcasting
        Hero heroUp = (Hero) hero1;
        heroUp.display();
        // System.out.println(heroUp.getType()); //ini error

        // Object dgn class Hero
        Hero heroReg = new Hero("Boy", 100);
        heroReg.display();

        // downcasting
        // HeroAgility heroDown = (HeroAgility) heroReg; //ini error
        // heroDown.display();

        // heroUp dikembalikan ke hero1
        HeroIntel hero2 = (HeroIntel) heroUp;
        hero2.display(); // ini berhasil downcasting

        // nomer 3
        // Tidak dapat downcasting ke HeroAgility karena heroUp bukan instance dari HeroAgility
        HeroAgility hero3 = (HeroAgility) heroUp; // ini akan menghasilkan ClassCastException
        hero3.display();

        // nomer 4
        // HeroIntel hero4 = new HeroIntel("nime", 100);
        // System.out.println(hero4.type); // dapat diakses langsung karena modifier adalah public
        // HeroAgility hero5 = new HeroAgility("lotso", 100);
        // System.out.println(hero5.type); // dapat diakses langsung karena modifier adalah public

        // //nomer 5
        //casting
        // HeroMagic heroMagic = new HeroMagic("Amaliyah", 100);
        // heroMagic.display();
        // //upcasting
        // Hero heroCas = (Hero)heroMagic;
        // heroCas.display();
        // //downcasting
        // HeroMagic heroMagic2 = (HeroMagic) heroCas;
        // heroMagic2.display();
    }
}
