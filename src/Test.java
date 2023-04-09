public class Test extends Pet {

    public static void main(String[] args) {
        Dog doggy = new Dog("Bublyk");
        System.out.println("I have " + doggy.getPaw() + " paws");

        System.out.println();

        Cat kitty = new Cat("Busia");
        kitty.sleep();
    }
}