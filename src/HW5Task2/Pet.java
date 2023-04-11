package HW5Task2;

class Pet extends Animal {
    private final int tail = 1;
    protected String name;
    private int paw = 4;

    Pet() {
        super();
        setEyes(2);
        System.out.println("I am pet");
    }

    void run() {
        System.out.println("HW5Task2.Pet runs");
    }

    void jump() {
        System.out.println("HW5Task2.Pet runs « jumps");
    }

    int getPaw() {
        return paw;
    }

    void setPaw(int paws) {
        paw = paws;
    }
}