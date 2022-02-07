public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public static final int RUN_LIMIT = 200;
    @Override
    public void swiming() {
            System.out.printf("Коты не умеют плавать\n");
    }
    @Override
    public  void run() {
        int distance = 15;
        if (distance > RUN_LIMIT) {
            System.out.printf("Кот не может пробежать %d метров\n", distance);
        } else {
            System.out.printf("Кот пробежал %d метров\n", distance);
        }
    }

    @Override
    public void info() {
        System.out.printf("Кота зовут: %s\n", name);
    }
}
