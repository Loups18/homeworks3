import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int age = 25;
        if (age >= 18);{
            System.out.println("Если возраст человека равен  " + age + " то он совершеннолетний ");}
        int age1 = 16;
        if (age >= 18);{
            System.out.println("Если возраст человека равен  " + age1 + " то он не достиг совершеннолетия, нужно немного подождать ");}
        int temperature = -1;
        if (temperature > 5){
            System.out.println("Сегодня тепло, можно идти без шапки ");}
        else System.out.println("На улице холодно, нужно надеть шапку" );
        int speed = 50;
        int speed2 = 70;
        if (speed <= 60){
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");}
        else System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        if (speed <= 60){
            System.out.println("Если скорость " + speed2 + " то можно ездить спокойно");}
        else System.out.println("Если скорость " + speed2 + " то придется заплатить штраф");
        int age2 = 17;
        if (age2 >= 2 && + age2 <= 6){
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в детский сад ");}
        else if (age2 >= 7 && age2 <= 17) { System.out.println(" Если возраст человека равен " + age2 + " то ему нужно ходить в школу");}
        else if (age2 >=18 && age2 <= 24) {System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в университете");}
        else if (age2 > 24) {
            System.out.println("Если возраст человека больше " + age2 + " то ему нужно ходить на работу");}
        int ageOfTheChild = 13;
        if (ageOfTheChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + " то ему нельзя кататься на аттракционе");}
        else if (ageOfTheChild >=5 && ageOfTheChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + " то ему можно кататься на аттракционе в сопровождении взрослого");}
        else if (ageOfTheChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + " то ему можно кататься на аттракционе без сопровождения взрослого");}
        int capacityOfOneTrainCarriage = 102;
        int seats = 60;
        int passengers = 58;
        if (passengers <= 60){
            System.out.println(" Мест в вагоне " + ((seats - passengers) + " сидячих, ") + ( (capacityOfOneTrainCarriage - seats) + " стоячих"));}
        else if (passengers >60 && passengers < 102) {
            System.out.println("Мест в вагоне " + ( 0 + " сидячих, ") + ((capacityOfOneTrainCarriage - passengers) + " стоячих"));}
        else if (passengers >= 102){
            System.out.println(" Мест в вагоне нет");}
        int one = 5;
        int two = 10;
        int three = 200;
        if (one < two && three < two ){
            System.out.println("two Больше");}
        else if (two < one && three < one) {
            System.out.println("one Больше");}
        else if (two < three && one < three){
            System.out.println("three Больше");}



    }

    }