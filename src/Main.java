public class Main {
    public static void main(String[] args) {
        //Задание 1.1
     for(int i=1; i<11; i++)  {System.out.println(i);}
        //Задание 1.2
     for(int a=10; a>0; a--) {System.out.println(a);}
        //Задание 1.3
     for(int b=0; b<18; b=b+2) {System.out.println(b);}
        //Задание 1.4
     for(int c=10; c>-11; c--) {System.out.println(c);}
        //Задание 2.1
     for(int i=1904; i<2097; i=i+4) {System.out.println(i+" год является високосным");}
        //Задание 2.2
     for(int i=7; i<99; i=i+7)  {System.out.print(i+" ");}
     System.out.println();
        //Задание 2.3
     for(int i=1; i<513; i=i*2)  {System.out.print(i+" ");}
     System.out.println();
     //Задание 3.1-3.2
     int sum=29000; int total=0;
     for (int i=1; i<13; i++)  { total=total+sum+(total/100); System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей");}
    }
}