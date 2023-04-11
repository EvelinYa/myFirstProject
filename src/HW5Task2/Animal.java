package HW5Task2;

class Animal {
    private int eyes;

    Animal() {
        System.out.println("I am animal");
    }

    void eat() {
        System.out.println("HW5Task2.Animal eats");
    }

    void drink() {
        System.out.println("HW5Task2.Animal drinks");
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}