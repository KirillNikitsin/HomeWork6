public class HomeWork6 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Счастье"),
                new Dog("Смурф"),
                new Cat("Молли"),
                new Dog("Алиса"),
                new Cat("Винни"),
                new Dog("Перс"),
                new Cat("Мопс"),
        };
        for (Animal i : animals) {
            i.info();
            i.swiming();
            i.run();
        }
        int cats = 0;
        int dogs = 0;
        for (Animal i : animals) {
            if (i instanceof Cat) {
                cats++;
            } else {
                dogs++;
            }

        }
        System.out.println("Общее количество котов: " + cats);
        System.out.println("Общее количество Собак: " + dogs);
        System.out.println("Общее количество животных: " + (dogs+cats));

    }

}
