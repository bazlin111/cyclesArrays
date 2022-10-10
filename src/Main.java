

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Vbh Мир Братья? Я имею Этот Мир  ");
        System.out.println();
        //task1();
        //task2();
//         task3();
//      task4();
//        task5();
//         task6();
//         task7();
//        task8();
//         task9();
         task10();
//         массивы ( arrays)
           task11();
//         task12();
//         task13();
//         task14();
    }

    public static void task1() {
        int num = 1;
        while (num <= 10) {
            if (num == 10) {
                System.out.println(num);
                break;
            }
            System.out.print(num + "  ");
            num++;
        }
        for (; num > 0; num--) {
            if (num == 1) {
                System.out.println(num);
                break;
            }

            System.out.print(num + "");
        }
    }

    public static void task2() {
        for (int i = 1; i < 75; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task3() {
        for (int i = 10; i > -11; i--) {
            System.out.println();
            System.out.println(i + " cfvjt dthyjt ");
        }
    }

    public static void task4() {
        for (int year = 1904; year < 2096; year++)
            if ((year % 4 == 0) && ((year % 100 != 0) || year % 400 == 0)) {
//            System.out.println();
                System.out.println(year + " -- високосный год . ");
            }
    }

    public static void task5() {
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.printf("  перове %d это? ", i);
        }
    }

    public static void task6() {
        int montPay = 36_000;
        int sum = 0;
        for (int i = 1; i <= 16; i++) {
            sum += montPay;
            sum *= 1.09;
            System.out.printf("  Месяц %d , сумма накоплений равна %d рублей \n", i, sum);
        }
    }

    public static void task7() {
        int i = 1;
        int sum = 0;
        while (sum < 2_459_000) {
            sum += 78_000;
            System.out.printf(" Месяц %d , сумма равна %d  рублей \n", i, sum);
            i++;
        }
    }

    public static void task8() {
        int population = 12_000_000;
        int birthRate = 17 * population / 1000;
        int deathRate = 8 * population / 1000;
        for (int i = 1; i <= 10; i++) {
            population += birthRate;
            population -= deathRate;
            System.out.printf("Год %d , численость %d  \n", i, population);
        }
    }
    public static void task9(){
        for ( int i = 1; i< 38; i++){
            System.out.print( i+" : ");
            if ( i % 2 ==0){
                System.out.print (" ping "+ " ");
            }
            if ( i % 5 ==0){
                System.out.print (" pong ");
            }
            System.out.println();
        }
    }

    public static void task10() {
        System.out.println();
//        числа фибаначи из фильма К О Д Давинчи !
        int a = 0;
        int b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " " + b + " ");
            a += b;
            b += a;
        }

    }

    public static void task11(){

    }

}

