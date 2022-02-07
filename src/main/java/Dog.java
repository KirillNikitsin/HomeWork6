public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public static final int RUN_LIMIT = 500;
    public static final int SWIMING_LIMIT = 10;
    @Override
    public void swiming() {
        int distance = 15;
        if (distance > SWIMING_LIMIT) {
            System.out.printf("Пес не может проплыть %d метров\n", distance);
        } else {
            System.out.printf("Пес проплыл %d метров\n", distance);
        }
    }
    @Override
    public void run() {
        int distance = 15;
        if (distance > RUN_LIMIT) {
            System.out.printf("Пес не может пробежать %d метров\n", distance);
        } else {
            System.out.printf("Пес пробежал %d метров\n", distance);
        }
    }

    @Override
    public void info() {
        System.out.printf("Собаку зовут: %s\n", name);
    }
}
