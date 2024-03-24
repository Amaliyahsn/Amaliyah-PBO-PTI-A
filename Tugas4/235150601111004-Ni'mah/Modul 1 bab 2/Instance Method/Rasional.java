public class Rasional{
    private int pembilang, penyebut; 
    public Rasional(){
        pembilang=0; 
        penyebut=0;
    }
    public Rasional(int pbl, int pyb){ 
        pembilang=pbl;
        penyebut=pyb;
    }
        //mengecek suatu bilangan adalah rasional atau bukan 
        public boolean isRasional() {
        return (penyebut!= 0);

    }
    //menyederhanakan bilangan rasional 
    public void Sederhana(){
        int temp, A, B; 
    if (penyebut ==0){
        return;

    }
    A = (pembilang<penyebut)?penyebut:pembilang;
    B = (pembilang<penyebut)?pembilang:penyebut;

    for (; B != 0; ) {
        temp = A % B;
        A = B;
        B = temp;
    }
        pembilang/=A;
        penyebut/=A;
    } 
    public double Cast(){
        return (penyebut == 0.0 ) ? 0.0 : (double)pembilang / (double)penyebut;
    }
    //operator >
    public boolean moreThan(Rasional A){
        return(pembilang * A.penyebut > penyebut * A.pembilang);
    }
    // Operator <
    public boolean lessThan(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }
    // Operator >=
    public boolean moreThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }
    // Operator <=
    public boolean lessThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }
    //Operator Unary- ----> A =-A
    public void negasi (){
        pembilang= - pembilang;
    }
    //operator unary +=\
    public void unaryPlus (Rasional A){
        pembilang = pembilang *A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
      // Operator pengurangan (-)
      public void kurang(Rasional A) {
        pembilang = pembilang *A.penyebut - penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
    // Operator perkalian (*)
    public void kali(Rasional A) {
        pembilang = pembilang *A.penyebut * penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
    // Operator pembagian (/)
    public void bagi(Rasional A) {
        pembilang = pembilang *A.penyebut / penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
    public void cetak(){
        System.out.println(pembilang + "/" + penyebut);
        }        
    
}
    