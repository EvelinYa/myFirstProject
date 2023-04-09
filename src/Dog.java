class Dog extends Pet {
    Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is: " + this.name);
    }

    void play() {
        System.out.println("Dog plays");
    }
}