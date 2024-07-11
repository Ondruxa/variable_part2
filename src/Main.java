//task 1  Объявите переменные типа int, byte, short, long, float, double.
public class Main {
    public static void main(String[] args) {
        int varInt = 4567975;
        byte varByte = -24;
        short varShort = 2467;
        long varLong = 7676476465L;
        float varFloat = -467.5765f;
        double varDouble = 788.7899543566;
        System.out.println("Значение переменной varInt с типом int равно " +varInt);
        System.out.println("Значение переменной varByte с типом byte равно " +varByte);
        System.out.println("Значение переменной varLong с типом long равно " +varLong);
        System.out.println("Значение переменной varShort с типом short равно " +varShort);
        System.out.println("Значение переменной varFloat с типом float равно " +varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " +varDouble);
        System.out.println();

        //task 2 Инициализируйте переменные
        float var1 = 27.12f;
        long var2 = 987678965549L;
        double var3 = 2.786;          //использовал double вместо float так как требуется использовать все типы данных
        int var4 = 569;               //использовал int вместо short так как требуется использовать все типы данных
        short var5 = -159;
        short var6 = -27897;
        byte var7 = 67;

        //task3 Посчитайте, сколько достанется листов каждому ученику.
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int numberStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int sheetsToStudents = 480/numberStudents;
        System.out.println("На каждого ученика рассчитано " +sheetsToStudents+ " листов бумаги");
        System.out.println();

        //task4 производительность машины
        int bottlePerMinute = 16/2;
        int bottleTwentyMinute = bottlePerMinute*20;
        int bottleOneDay = bottlePerMinute*60*24;
        int bottleThreeDays = bottleOneDay*3;
        int bottleOneMonth = bottleOneDay*30;    // было принято что в месяце 30 дней
        System.out.println("За 20 минут машина произвела " + bottleTwentyMinute + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottleOneMonth + " штук бутылок");
        System.out.println();

        //task5 Сколько банок каждой краски было куплено?
        byte cansPerClass = 2+4;
        int numberClasses = 120/cansPerClass;
        int whiteCans = numberClasses*2;
        int brawnCans = numberClasses*4;
        System.out.println("В школе, где " + numberClasses + " классов, нужно "
                + whiteCans + " банок белой краски и " + brawnCans + " банок коричневой краски");
        System.out.println();

        //task6 вес спортзавтрака
        short bananas = 5*80;
        short milk = 2*105;
        short iceCream = 2*100;
        short eggs = 4*70;
        int totalWeightGramms = bananas + milk + iceCream + eggs;
        int grPerKg = 1000;
        float totalWeightKg = totalWeightGramms/(float)grPerKg;
        System.out.println("Вес спортзавтрака в граммах " + totalWeightGramms
                + ", в килограммах " +totalWeightKg);
        System.out.println();

        //task7 результат похудения
        int goalWeight = 7*1000;
        int minWeightLose = 250;
        int maxWeightLose = 500;
        float daysMinWeightLose = (float)goalWeight/minWeightLose;
        float daysMaxWeightLose = (float)goalWeight/maxWeightLose;
        float daysMiddleWeightLose = daysMinWeightLose/2 + daysMaxWeightLose/2;
        System.out.println("Спортсмен сбросит 7 кг с потерей веса 250 грамм в день за " + daysMinWeightLose + " дней.");
        System.out.println("Спортсмен сбросит 7 кг с потерей веса 500 грамм в день за " + daysMaxWeightLose + " дней.");
        System.out.println("Спортсмен сбросит 7 кг в среднем за " + daysMiddleWeightLose + " дней.");
        System.out.println();

        //task8 прирост зарплаты
        int presentMashaWage = 67760;
        int presentDenisWage = 83690;
        int presentKristinaWage = 76230;
        float futureMashaWage = presentMashaWage * 0.1f + presentMashaWage;
        float futureDenisWage = presentDenisWage * 0.1f + presentDenisWage;
        float futureKristinaWage = presentKristinaWage * 0.1f + presentKristinaWage;
        float growthMashaWage = futureMashaWage - presentMashaWage;
        float growthDenisWage = futureDenisWage - presentDenisWage;
        float growthKristinaWage = futureKristinaWage - presentKristinaWage;
        System.out.println("Маша теперь получает " + futureMashaWage + " рублей. Годовой доход вырос на "
                + growthMashaWage + " рублей");
        System.out.println("Денис теперь получает " + futureDenisWage + " рублей. Годовой доход вырос на "
                + growthDenisWage + " рублей");
        System.out.println("Кристина теперь получает " + futureKristinaWage + " рублей. Годовой доход вырос на "
                + growthKristinaWage + " рублей");
    }
}