public class Student {
    private String name; 
    private String address; 
    private int age;
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average;
    private static int jumlahObjek = 0;
    
    public static void jumlahObjek() {
        System.out.println("Jumlah objek Student yang telah dibuat: " + jumlahObjek);
    }

    // Metode getter untuk mendapatkan jumlah objek
    public static int getJumlahObjek() {
        return jumlahObjek;
    }

    public Student(){
        name = ""; 
        address = ""; 
        age = 0;
        jumlahObjek++;
    }
    public Student(String n, String a, int ag){ 
        name = n;
        address = a; 
        age = ag;
    }
    // Constructor dengan parameter untuk mengatur nama, alamat, umur, dan nilai mata pelajaran
    public Student(String n, String a, int ag, double math, double english, double science){ 
        name = n;
        address = a; 
        age = ag;
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
    }
     // Metode setter untuk mengatur nama, alamat, dan umur
    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){ 
        address = a;
    }
    public void setAge(int ag){ 
        age = ag;
    }
    // Metode setter untuk mengatur nilai masing-masing mata pelajaran
    public void setMath(double math){ 
        mathGrade = math;
    }
    public void setEnglish(double english){ 
        englishGrade = english;
    }
    public void setScience(double science){ 
        scienceGrade = science;
    }

    private double getAverage(){ 
        double result = 0;
        result = (mathGrade+scienceGrade+englishGrade)/3;
        return result;
    }
    // Method untuk menentukan status akhir siswa (remidi atau tidak)
    public boolean statusAkhir() {
        double avg = getAverage();
        return avg >= 61; // Jika rata-rata >= 61, mengembalikan true (lolos), jika tidak, false (remidi)
    }
    public void displayMessage(){
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beralamat di "+ address);
        System.out.println("berumur "+ age);
        System.out.println("mempunyai nilai rata rata "+getAverage());
        System.out.println("Status akhir: " + (statusAkhir() ? "Lolos" : "Remidi"));
    }
}