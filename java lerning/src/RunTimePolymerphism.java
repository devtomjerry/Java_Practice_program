class Animal{
    public void sound(){
        System.out.println("Sound");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog Sound");
    }
}
public class RunTimePolymerphism {
    public static void main (String[] args){
        Animal myAnimal;
        myAnimal = new Dog();
        myAnimal.sound();
    }
}
