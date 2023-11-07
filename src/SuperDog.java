public class SuperDog extends Animal {


    public SuperDog(String n){
        super(n);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("SuperDog unleashes sonic bark");
    }
}
