public class Main {
    public static void main(String[] args) {
        int cigarettes = 2000000000;
        byte bullets = 27;
        short cat = 5671;
        long stars = 243127321;
        float potato = 15.5f;
        double sugar = 276.23674;
        System.out.println(cigarettes);
        System.out.println(cat);
        System.out.println(stars);
        System.out.println(potato);
        System.out.println(sugar);
        float apples = 27.12f;
        long sand = 987678965549l;
        double seed = 2.786f;
        short flowers = 569;
        short pear = -159;
        int nuts = 27897;
        byte glass = 67;
        System.out.println(apples);
        System.out.println(sand);
        System.out.println(seed);
        System.out.println(flowers);
        System.out.println(pear);
        System.out.println(nuts);
        System.out.println(glass);
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte catherineAndreyevna = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper / (lyudmilaPavlovna + catherineAndreyevna + annaSergeevna) + " листов бумаги" );
        byte machine = 16;
        byte time = 2;
        byte time2 = 20;
        short time3 = 1440;
        short time4 = 4320;
        int time5 = 44640;
        System.out.println("За 20 минут машина произвела " + time2 * (machine / time) + " штук бутылок" );
        System.out.println("За сутки машина произвела " + time3 * (machine / time) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + time4 * (machine / time) + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + time5 * (machine / time) + " штук бутылок");
        byte totalCans = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        int classes = totalCans / (whitePaintPerClass + brownPaintPerClass);
        System.out.println("В школе, где " + classes + " классов, нужно " + (classes * whitePaintPerClass) + " банок белой краски и " + (classes * brownPaintPerClass) + " банок коричневой краски");

        int banana = 5 * 80;
        int milk = 200 / 100 * 105;
        int IceCreamSundae = 2 * 100;
        int RawEggs = 4 * 70;
        float breakfastWeight = banana + milk + IceCreamSundae + RawEggs;
        System.out.println(" Вес такого спортзавтрака " + breakfastWeight + " г");
        System.out.println(" Вес такого спортзавтрака " + (breakfastWeight / 1000) % breakfastWeight + " кг");
        short excessWeight = 7 * 1000;
        short losingЦeight1 = 250;
        short losingЦeight2 = 500;
        short losingЦeight3 = (250 + 500) / 2;
        System.out.println("Если будет терять " + losingЦeight1 + " г в день, то понадобиться " + (excessWeight / losingЦeight1) + " дней");
        System.out.println("Если будет терять " + losingЦeight2 + " г в день, то понадобиться " + (excessWeight / losingЦeight2) + " дней");
        System.out.println("Если будет терять " + losingЦeight3 + " г в день, то понадобиться " + (excessWeight / losingЦeight3) + " дней");
        int masha = 67760;
        int denis = 83690;
        int christina = 76230;
        byte raising = 10;
        int mashaNow = masha + (masha / 100 * raising);
        int denisNow = denis + (denis / 100 * raising);
        int christinaNow = christina + (christina / 100 * raising);
        System.out.println("Маша теперь получает " + mashaNow + " рублей. Годовой доход вырос на " + ( mashaNow * 12 - masha * 12) + " рублей");
        System.out.println("Денис теперь получает " + denisNow + " рублей. Годовой доход вырос на " + ( denisNow * 12 - denis * 12) + " рублей");
        System.out.println("Кристина теперь получает " + christinaNow + " рублей. Годовой доход вырос на " + ( christinaNow * 12 - christina * 12) + " рублей");







    }
}
