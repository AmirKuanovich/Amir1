import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
//      "  Scanner sc = new Scanner(System.in);
////        System.out.print(" number: ");
////        int n = sc.nextInt();
////        System.out.print(" answer: ");
////        int m = sc.nextInt();
////        if (n>m){
////            System.out.println(" result: " + n +">" + m);
////        }else if (n<m){
////            System.out.println(" result: " + n +<" + m);
//        }

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Сан киргиз: ");
//        int bek = scan.nextInt();
//        int res = bek % 2;
//        if ( res == 0) {
//            System.out.println("jup san");
//        }else  {
//            System.out.println("Tak  san");
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int number = sc.nextInt();
//        System.out.println("Num1 ");
//        int num1 = sc.nextInt();
//        System.out.println("Num2 ");
//        int num2 = sc.nextInt();
//
//        if (number > num1 && number > num2){
//            System.out.println("Number is greater than the numberv1");
//        }else if (num1 > number && num1 > num2){
//            System.out.println("Number is greater than the number2");
//        }else if (num2 > number && num2 > num1){
//            System.out.println("Number is greater than the number3");
//        }

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Сан киргиз: ");
//        int b = scan.nextInt();
//        System.out.print(" San jaz:");
//        int r = scan.nextInt();
//        if (b % 2 == 0 && r % 2 == 0) {
//            System.out.println( "Jup san ;");
//        }else if (b % 2== 0) {
//            System.out.println( ("жуп санy = " + b + "\nтак санy = " + r));
//        } else if (r % 2== 0 ) {
//            System.out.println("жуп санy = " + r + "\nтак санy = " + b);
//        }  else {
//           System.out.println("так санdar");
//        }
//
//        Random rand = new Random();
//        int as = rand.nextInt(1 , 10 );
//        System.out.println(as);
//        switch(as){
//            case 1:
//                System.out.println("Так ");
//                break;
//                case 2:
//                    System.out.println("Жуп ");
//                    break;
//                    case 3:
//                        System.out.println("Так ");
//                        break;
//                        case 4:
//                            System.out.println("Жуп ");
//                            break;
//                            case 5:
//                                System.out.println("Так ");
//                                break;
//                                case 6:
//                                    System.out.println("Жуп ");
//                                    break;
//                                    case 7:
//                                        System.out.println("Так ");
//                                        break;
//                                        case 8:
//                                            System.out.println("Жуп ");
//                                            break;
//                                            case 9:
//                                                System.out.println("Так ");
//                                                break;
//                                                case 10:
//                                                    System.out.println("Так ");
//                                                    break;
//                                                    }
                //lesson 1

//        Напишите программу, который принимает с клавиатуры целое
//        положительное трехзначное число. Затем следует построить новое
//        значение, составленное
//        из цифр числа, введенного с клавиатуры, но в обратном
//        порядке. После этого новое значение следует уменьшить на 20, и
//        окончательныйрезультат вывести на экран.
//        Мисалы:
//        Input: 327
//        Output: 703


//        Scanner scanner = new Scanner(System.in);
//       System.out.println("Write number: ");
//       int number = scanner.nextInt();//327
//        number -= 20;
//        int resalt1 = number / 100;
//        int resalt2 = (number / 10) % 10;
//        int resalt3 = number % 10;
//
//        System.out.println("resalt = " + resalt3 + resalt2 + resalt1);


                //  task 2
   //    Напишите программу, который принимает с клавиатуры целое число
    //   и, если оно положительное, увеличивает его вдвое. Класс должен
      // выводить на экран новое значение.
        //        Мисалы:
//        Input: 4
//        Output: 8
//        Input: -5
//        Output: -5
//
//        System.out.print("write number: ");
//        int number = scanner.nextInt();
//        double res;
//        if (number > 0) {
//            res = Math.pow(number, 2);
//            System.out.println("output: " + (int) res);
//        }else {
//            System.out.println("output : " + number);
//       }


                //Task 3
                /* Напишите программу, который принимает с клавиатуры целое число
                 и выводит на экран одно из следующих сообщений: "Положительное",
                 или "Отрицательное", или "Ноль", - в зависимости от значения числа */
//
//        System.out.print("write number: ");
//        int number = scanner.nextInt();
//        if (number > 0) {
//            System.out.println("Положительное = " + number);
//        } else if (number < 0) {
//            System.out.println("Отрицательное = " + number);
//        }else {
//            System.out.println("Ноль = " + number);
//        }


                //Task 4
//        Напишите программу, который принимает с клавиатуры целое
//        положительное число и, если оно как минимум трехзначное и
//        положительное, уменьшает его на 1.
//        Мисалы:
//        Input: 332
//        Output: 331

//        System.out.print("write number: ");
//        int n1 = scanner.nextInt();
//
//        if (n1 > 100) {
//            n1--;
//            System.out.println("output : " + n1);
//        }

                //Task 5
//        Бир программа жазыныз, сиз клавиатурадан эки сан беришиниз
//        керек, биринчи сан окуучулардын саны, экинчи отургучтардын саны.
//        Сиздер текшеришиниздер керек окуучуларга орун жетеби же жетпейби.
//        Мисалы
//        Input: 25 30
//        Output: "Отургучтардын саны окуучулардан коп экен"
//        жана "Отургучтар жетет экен" , "Отургучтар жетпей калат деген"

//        System.out.print("сан окуучулардын саны: ");
//        int n1 = scanner.nextInt();
//
//        System.out.print("отургучтардын саны: ");
//        int n2 = scanner.nextInt();
//
//        String res = n1 <= n2 ? "Отургучтар жетет экен" : "Отургучтар жетпей калат ";
//        System.out.println(res);

//        //Task 6
//        Бир программа жазыныз, клавиатурадан уч сан ала турган, анан
//        аларды if, else if, else жардамдары менен ушул сандарды чоною
//        тартибинде чыгарасыздар консольго.
//                Мисалы:
//        Input: 2 243 1
//        Output: 1, 2, 243
//        Input: 1 -5 92
//        Output: -5, 1, 92

//        System.out.print("write number1: ");
//        int n1 = scanner.nextInt();
//        System.out.print("write number2: ");
//        int n2 = scanner.nextInt();
//        System.out.print("write number3: ");
//        int n3 = scanner.nextInt();
//        if (n1 > n2 && n1 > n3) {
//            if (n2 > n3) {
//                System.out.println(n3 + "," + n2 + "," + n1);
//            } else {
//                System.out.println(n2 + "," + n3 + "," + n1);
//            }
//        } else if (n2 > n1 && n2 > n3) {
//            if (n1 > n3) {
//                System.out.println(n3 + "," + n1 + "," + n2);
//            } else {
//                System.out.println(n3 + "," + n1 + "," + n1);
//            }
//        } else if (n3 > n1 && n2 < n3) {
//            if (n1 > n2) {
//                System.out.println(n2 + "," + n1 + "," + n3);
//            } else {
//                System.out.println(n1 + "," + n2 + "," + n1);
//            }
//        } else {
//            System.out.println("number 1 :" + n1 + "\nnumber 2 :" + n2 + "\nnumber 3 :" + n3);
//        }

//        Task-7. Напишите программу, который принимает с клавиатуры целое число
//        и выводит на экран его квадрат, но только в случае, если введенное
//        число отрицательно. В противном случае - на экран выводится
//        сообщение Ошибка.

//        System.out.print("write number1: ");
//        int n1 = scanner.nextInt();
//        if(n1>0){
//        double res = Math.pow(n1,2);
//            System.out.println("output: " + (int)res);
//        }else {
//            System.err.println("error");
//        }

//        Task-8. Напишите класс, который принимает с клавиатуры положительное
//        целое число и выводит на экран ближайшее к нему
//        «крутлое число».
//        Например, для введенного значения 433 выводится на экран 430, а для
//        56 выводится 60.
//        ______________________________________________

//        System.out.print("Введите целое число: ");
//        int number = scanner.nextInt();
//
//        int number1 = (number / 10) * 10;
//        if (number % 10 >= 5) {
//            number1 += 10;
//        }
//        System.out.println("круглое число: " + number1);

//      Task-  9. Напишите класс, который принимает с клавиатуры целое число,
//                которое должно означать порядковый номер месяца. В случае если
//                полученное
//        значение действительно соответствует порядковому номеру
//        одного из месяцев, следует вывести сезон (лето, осень, зима,
//                весна), к которому относится месяц.
//        В случае если введенное значение не является порядковым
//        номером месяца, следует вывести на экран соответствующее
//        текстовое сообщение.
//
//        System.out.print("номер месяца : ");
//        int number = scanner.nextInt();
//
//        if (number==1||number==2||number==12){
//            System.out.println("кыш айы");
//        } else if (number==3||number==4||number==5) {
//            System.out.println("жаз айы");
//        } else if (number==6||number==7||number==8) {
//            System.out.println("жайдын ыссык аптабы");
//        } else if (number==9||number==10||number==11) {
//            System.out.println("кыштын кыраан челдеси");
//        }else {
//            System.err.println("ERROR");
//        }

//       Task- 10. Напишите класс, который принимает с клавиатуры положительное
//        трехзначное число и проверяет, сколько разных цифр оно содержит.

//        System.out.print("write 3number : ");
//        int n1 = scanner.nextInt();
//
//        int res = (n1 / 100) % 10;
//        int res2 = (n1 / 10) % 10;
//        int res3 = n1 % 10;
//        System.out.println("one number : " + res);
//        System.out.println("two number : " + res2);
//        System.out.println("three number : " + res3);

//        Task - 11. Напишите класс, который читает с клавиатуры символ и проверяет,
//        является ли введенный символ буквой латинского алфавита. По
//        результатам проверки следует вывести на экран соответствующее
//                сообщение
//        System.out.print(" Введите латынская буква : ");
//        char s = scanner.next().charAt(0);
//
//        switch (s){
//            case 'q','Q','w','W','e','E','R','r','t','T','y','Y','u','U','I','i','o','O','p','P','x','X','c','C','v','V':
//                System.out.println(" латынская буква ");
//                break;
//            case 'a','A','s','S','d','D','f','F','g','G','h','H','j','J','k','K','l','L','z','Z','b','B','n','N','m','M':
//                System.out.println(" латынская буква");
//                break;
//            default:
//                System.err.println(" это не латынская буква");
//                break;
//        }

//      Task-12. Напишите класс, который принимает с клавиатуры два строковых
//        значения, каждое из которых содержит имя человека, и проверяет,
//                являются ли эти люди тезками. По результатам проверки следует
//        вывести на экран соответствующее сообщение.

//        System.out.print("WRITE NAME 1: ");
//        String name1 = scanner.nextLine();
//
//        System.out.print("WRITE NAME 2: ");
//        String name2 = scanner.nextLine();
//
//        if (name1.equals(name2)){
//            System.out.println(name1 + " = " + name2);
//        }else {
//            System.err.println("ERROR");
//        }

//       Task- 13. Напишите программу, которая генерирует числа от 1 до 3,
//       1 -камень, 2 - ножницы, 3 бумага. Сиз озунуз бир сан бересиз консольдон
//        анан текшересиз if, else if, else шарттык операторлор менен, ким утту
//        же тең чыгуу болду деп.
//                Компьютер утса, консольго толук малымат чыгыш керек кимде
//        кайсыл вариант чыкты жана ким утту

   //     System.out.print("write number (1,3): ");
     //   int num = scanner.nextInt();

       //Random random = new Random();
        //int ran = random.nextInt(3) + 1;
        //System.out.println("number = " + num);
        //System.out.println("random = " + ran);
        //if (num > ran) {
          //System.out.println(num + " > " + ran + "     сиз уттунуз");
       //} else if (num < ran) {
        //   System.out.println(num + " < " + ran + "     компютер утту");
       //} else {
         //  System.out.println(num + " = " + ran + "     тен чыктыныз");
       //}






            }
        }
































