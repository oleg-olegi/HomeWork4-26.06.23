import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age, pls");
        int age = sc.nextInt();//вводим возраст в консоль
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать");
        } else if (age >= 18 && age < 120) {
            System.out.println("Если возраст человека равен " + age +
                    ",то  он совершеннолетний");
        } else {
            System.out.println("Столько не живут :-)");
        }
    }
    public static void task2() {
        int temperature = 5;
        if (temperature<5){
            System.out.println("На улице "+temperature+" градусов, нужно надеть шапку");
        }else{
            System.out.println("На улице "+temperature+" градусов,можно идти без шапки");
    }
}
    public static void task3() {
        int speedLimit = 60;
        if (speedLimit <= 60) {
            System.out.println("Если скорость " + speedLimit + ", то  можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speedLimit + ", то нужно заплатить штраф.");
        }
    }
public static void  task4(){
        int age = 59;
        boolean ageToSleep = age<2;// go to sleep
    boolean ageToKinderGarden = age>=2&&age<7;// go to kindergarden
    boolean ageToSchool = age>=7&&age<=18;//go to school
    boolean ageToUniversity =age>18&&age<=24;// university
    boolean ageToWork = age>24&&age<60;//work
    boolean ageToRest = age>=60;// rest
    if (ageToSleep){
        System.out.println("Если возраст человека равен "+ age + ", то ему нужно спать");
    } else if (ageToKinderGarden) {
        System.out.println("Если возраст человека равен "+ age + ", то ему нужно ходить в детский сад" );}
    else if (ageToSchool){
        System.out.println("Если возраст человека равен "+ age + ", то ему нужно ходить в школу");
    }
    else if (ageToUniversity){
        System.out.println("Если возраст человека равен "+ age + ", то ему нужно ходить в университет");
}else if (ageToWork){
        System.out.println("Если возраст человека равен "+ age + ", то ему нужно ходить на работу");
}else {
        System.out.println("Если возраст человека равен "+ age + ", то ему нужно отдохнуть");
    }
    }
    public static void task5() {
        int age = 5;
        boolean canNotRideAttraction = age<5;
        boolean canRideWithParents = age>=5&&age<14;
        boolean canRideOwnOne = age>=14;
if (canNotRideAttraction){
    System.out.println("Если возраст ребенка равен "+age+ ", то ему нельзя кататься на аттракционе");
}else if (canRideWithParents){
    System.out.println("Если возраст ребенка равен "+age+ ", то ему можно кататься на аттракционе в сопровождении");
    }else {
    System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения");
}}
    public static void task6 (){
        int placeInWagon = 102;//мест всего
                boolean seatPlaces = placeInWagon<=60;//сидячие
        boolean remainingPlaces = placeInWagon>60&&placeInWagon<=102;
               if (seatPlaces){
                   System.out.println("В вагоне есть сидячие места");}
                   else if (remainingPlaces){
                   System.out.println("В вагоне есть стоячие места");}
                   else {
                   System.out.println("Мест нет");}
    }
    public  static void task7(){
        int one=1;
        int two=3;
        int three=2;
        if (one<two&&two<three){
            System.out.println("Большее число three = "+three);}
        else if (one<two&&two>three){
            System.out.println("Большее число two =  "+two);}else {
            System.out.println("Большее число one = "+one);
        }
    }

}