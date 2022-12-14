package lesson1.part2;

public class Main {
    public static void main(String[] args) {
//        testEnum();
//        testAnonClasses();
        testInnerClasses();
    }

    private static void testEnum() {
//        Cat cat1 = new Cat(ColorOld.BLACK);
//        Cat cat2 = new Cat("Синий");
        Cat cat1 = new Cat(Color.BLACK);
        Cat cat2 = new Cat(Color.WHITE);

        System.out.println(cat1);
        System.out.println(cat2);
    }

    private static void testAnonClasses() {
//        SomeOneFileToImplement foo = new Foo();
//        SomeOneFileToImplement bar = new Bar();
        SomeOneFileToImplement foo = new SomeOneFileToImplement() {
            @Override
            public void action() {
                System.out.println("Привет, Мир");
            }
        };

        //лямбда выражение
        SomeOneFileToImplement bar = () -> System.out.println("Привет, Москва");



        foo.action();
        bar.action();

        //передали функциональность
//        test(bar);
        test(() -> System.out.println("Привет, это сообщение из лямбды"));

        new Thread(() -> System.out.println("Новый поток начался!")).start();
    }

    //приняли функциональность

    private static void test(SomeOneFileToImplement o) {
        System.out.println("Действие");
        System.out.println("Действие");
        System.out.println("Действие");
        //приветствие
        o.action();
        System.out.println("Действие");
        System.out.println("Действие");
        System.out.println("Действие");
        System.out.println("==========");
    }

    private static void testInnerClasses() {
        Cat cat = new Cat(Color.RED, "Ричард", 8);
//        Cat.CatAttribute catAttribute = cat.new CatAttribute("Ричард", 8);
//        System.out.println(catAttribute);
        System.out.println(cat);

        Cat.StaticTestClassCat classCat = new Cat.StaticTestClassCat();
    }
}
