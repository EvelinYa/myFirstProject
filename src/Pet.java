class Pet extends Animal {
    protected String name;
    private final int tail = 1;
    private int paw = 4;

    Pet() {
        this.eyes = 2;
        System.out.println("I am pet");
    }

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet runs « jumps");
    }

    int getPaw() {
        return paw;
    }

    void setPaw(int paws) {
        paw = paws;
    }
}