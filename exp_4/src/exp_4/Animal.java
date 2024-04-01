package exp_4; //dynamic polymorphism

public class Animal {
    public void animalSound() {
        System.out.println("Default Sound");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("Woof");
    }

    public static void main(String args[]) {
        Animal obj = new Dog();
        obj.animalSound();
    }
}
