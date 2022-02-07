public abstract class Animal {
    public String name;

    public Animal(String name){
        this.name = name;
    }
    public void info(){
        System.out.printf("Животное зовут: %s\n", name);
    }
    int SWIMING_LIMIT;
    int RUN_LIMIT;
    public void swiming() {
        int distance = 15;
        if (distance > SWIMING_LIMIT) {
            System.out.printf("Животное не может проплыть %d метров\n", distance);
        } else {
            System.out.printf("Животное проплыло %d метров\n", distance);
        }
    }
    public void run() {
        int distance = 15;
        if (distance > RUN_LIMIT) {
            System.out.printf("Животное не может пробежать %d метров\n", distance);
        } else {
            System.out.printf("Животное пробежало %d метров\n", distance);
        }
    }
}
