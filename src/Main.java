public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
    byte one = 10;
    short two = 150;
    int three = 330;
    long four = 6701L;
    float five = 20.54f;
    double six = 89.99d;
    System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);

    }

    public static void task2 () {
        System.out.println("Задача 2");
    double a = 27.12d;
    long b = 987678965549L;
    float c = 2.786f;
    short d = 569;
    short f = -159;
    short g = 27897;
    byte h = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);


    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte childLP = 23;
        byte childAS = 27;
        byte childEA = 30;
        short allLists = 480;
        short allChild = (short) (childLP + childAS + childEA);
        System.out.println("Всего детей " + allChild);
        short childList = (short) (allLists / allChild);
        System.out.println("На каждого ученика рассчитано " + childList + " листов бумаги");





    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte botle = 16;
        byte time = 2;
        byte oneMin = (byte) (botle/time);
       // System.out.println("Произовдительность за одну минуту " + oneMin + " бутылок");

        byte first = 20;
        short second = (short) (oneMin * first);
        //System.out.println("Произовдительность за двадцать минут " +  second + " бутылок");

        short third = 60 * 24;
        short fourth = (short) (oneMin * third);
        //System.out.println("в стуки " + fourth + " бутылок");

        int fifth = fourth * 3;
        //System.out.println("за трое суток " + fifth +  " бутылок");

        int sixth = fifth * 10;
        System.out.println("За месяц " + sixth + " штук бутылок");







    }


    public static void task5 () {
        System.out.println("Задача 5");
        byte allJac = 120;
        byte whiteJac = 2;
        byte brownJac = 4;
        byte oneClassJac = (byte) (whiteJac + brownJac);
        //System.out.println(oneClassJac);
        byte allClass = (byte) (allJac / oneClassJac);
        //System.out.println(allClass);
        byte allWhiteJac =(byte) (whiteJac * allClass);
        byte allBrownJac = (byte) (brownJac * allClass);
        System.out.println("В школе, где " + allClass + " классов, нужно "
                + allWhiteJac + " банок белой краски и " + allBrownJac + " банок коричневой краски");

    }
}