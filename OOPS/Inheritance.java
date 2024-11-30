public class Inheritance{
    public static class Animal{
        void eat(){
            System.out.println("They Eat");
        }
    }
    public static class Fish extends Animal{
        void Swim(){
            System.out.println("They Swim");
        }
    }
    public static void main(String[] args) {
        Animal Kashish=new Animal();
        Fish Manan=new Fish();
        Kashish.eat();
        Manan.eat();
        Manan.Swim();
        
    }
}
