import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
    int g = 27897;
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
        System.out.println("За 20 минут машина произвела  " +  second + " штук бутылок");

        short third = 60 * 24;
        short fourth = (short) (oneMin * third);
        System.out.println("За сутки машина произвела  " + fourth + " штук бутылок");

        int fifth = fourth * 3;
        System.out.println("За трое суток машина произвела  " + fifth +  " штук бутылок");

        int sixth = fifth * 10;
        System.out.println("За месяц машина произвела " + sixth + " штук бутылок");







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

    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte weightOneBananas = 80;
        int allWeightBananas = bananas * weightOneBananas;
        short milk = 200;
        short weightOneMilk = 210;
        byte iceCream = 2;
        byte weightOneIceCream = 100;
        int allWeightIceCream = iceCream * weightOneIceCream;
        byte eggs = 4;
        byte weightOneEggs = 70;
        int allWeightEggs = eggs * weightOneEggs;
        int allWeightGrams = allWeightEggs + allWeightBananas + allWeightIceCream + weightOneMilk;
        System.out.println(allWeightGrams + " грамм - вес спортзавтрака");
        double allWeightKg = allWeightGrams / 1000d;
        System.out.println("или " + allWeightKg + " кг - вес спортзавтрака");




    }




    public static void task7 () {
        System.out.println("Задача 7");
       int allWeightLoss = 7000;
       int minLoss = 250;
       int maxLoss = 500;
       double minDays = (double) allWeightLoss / minLoss;
       double maxDays = (double) allWeightLoss / maxLoss;
       double averageDays =  (minLoss + maxLoss) /2D;
       double averageCount = allWeightLoss / averageDays;
       System.out.println("Минимальное кол-во дней для похудения " + minDays);
        System.out.println("Максимальное кол-во дней для похудения " + maxDays);
        System.out.printf(Locale.US, "Среднее кол-во дней для похудения %.2f%n", averageCount);


    }


    public static void task8 () {
        System.out.println("Задача 8");
        int  masha = 67760;
        int  denis = 83690;
        int  kris  = 76230;
        float percent = 0.1f;
        int oldMashaYear = (int) (masha * 12); //зп маши в год до повышения
        short yvMasha = (short) (masha * percent); //повышение зп маши на 10%
        int newMasha = (int) (yvMasha + masha); //новая зп маши в месяц
        int mashaYear = (int) (newMasha * 12); //новая зп маши в год
        int diffMasha = (int) (mashaYear - oldMashaYear);//разница годовой зп

        System.out.println("Маша теперь получает " + newMasha + " рублей в месяц. Годовой доход вырос на " + diffMasha + " рублей"); //Итог по Маше

        int oldDenisYear = (int) (denis * 12); //зп Дениса в год до повешения
        short yvDenis = (short) (denis * percent); //повышения зп Дениса на 10%
        int newDenis = (int) (yvDenis + denis); //новая зп Дениса в месяц
        int denisYear = (int) (newDenis * 12); //новая зп Дениса в год
        int diffDenis = (int) (denisYear - oldDenisYear);
        System.out.println("Денис теперь получает " + newDenis + " рублей в месяц. Годовой доход вырос на " + diffDenis + " рублей");

        int oldKrisYear = (int) (kris * 12);
        short yvKris = (short) (kris * percent);
        int newKris = (int) (yvKris + kris);
        int krisYear = (int) (newKris * 12);
        int diffKris = (int) (krisYear - oldKrisYear);
        System.out.println("Кристина теперь получает " + newKris + " рублей в месяц. Годовой доход вырос на " + diffKris + " рублей");






    }
}