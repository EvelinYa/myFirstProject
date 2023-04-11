package HW5Task2;

class Cat extends Pet {

    Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is: " + this.name);
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }
}