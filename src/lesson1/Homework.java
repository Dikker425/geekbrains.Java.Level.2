package lesson1;

import java.util.Random;

/**
 * +Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
 * +Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
 * +Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
 * результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
 * Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
 * * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
 * Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */

public class Homework {

    public static void main(String[] args){

        int count = 3;
        Cat[] cat = new Cat[count];
        Human[] human = new Human[count];
        Robot[] robot = new Robot[count];
        WallTrack[] wall = new WallTrack[2];
        RaceTrack[] raceTrack = new RaceTrack[2];

        for (int i = 0; i < count ; i++) {
            Random r = new Random();
            Random j = new Random();
            cat[i] = new Cat(r.nextInt(10),j.nextInt(10));
            human[i] = new Human(r.nextInt(10),j.nextInt(10));
            robot[i] = new Robot(r.nextInt(10),j.nextInt(10));
        }

        for (int i = 0; i < wall.length ; i++) {
            Random random1 = new Random();
            int h = random1.nextInt(10);
            wall[i] = new WallTrack(h);
        }

        for (int i = 0; i < raceTrack.length ; i++) {
            Random random1 = new Random();
            int l = random1.nextInt(10);
            raceTrack[i] = new RaceTrack(l);
        }


        for (int i = 0; i < wall.length ; i++) {
            for (int j = 0; j < count ; j++) {
                if (cat[j].getLimitJump() >= wall[i].getHeight()){
                    cat[j].jump();
                } else {
                    System.out.println(cat[j] + " cant jump!");
                }
                if (human[j].getLimitJump() >= wall[i].getHeight()){
                    human[j].jump();
                } else {
                    System.out.println(human[j] + " cant jump!");
                }
                if (robot[j].getLimitJump() >= wall[i].getHeight()){
                    robot[j].jump();
                } else {
                    System.out.println(robot[j] + " cant jump!");
                }

            }
        }

        for (int i = 0; i < raceTrack.length ; i++) {
            for (int j = 0; j < count ; j++) {
                if (cat[j].getLimitJump() >= raceTrack[i].getLength()){
                    cat[j].run();
                } else {
                    System.out.println(cat[j] + " cant run!");
                }
                if (human[j].getLimitJump() >= raceTrack[i].getLength()){
                    human[j].run();
                } else {
                    System.out.println(human[j] + " cant run!");
                }
                if (robot[j].getLimitJump() >= raceTrack[i].getLength()){
                    robot[j].run();
                } else {
                    System.out.println(robot[j] + " cant run!");
                }

            }
        }


    }
}
