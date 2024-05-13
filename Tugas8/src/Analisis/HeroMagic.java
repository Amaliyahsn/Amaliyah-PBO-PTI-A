public class HeroMagic extends Hero {
    public String power;
    public HeroMagic(String name, double health){
        super(name, health);
        this.power = "Magic";
    }
    public void display(){
        System.out.println(this.getName() + " is a " + this.power + " Hero.");
    }
}