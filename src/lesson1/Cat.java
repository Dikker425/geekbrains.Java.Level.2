package lesson1;

public class Cat implements Competitor{

    private int limitRun, limitJump;

    public Cat(int limitRun, int limitJump) {
        this.limitJump = limitJump;
        this.limitRun = limitRun;
    }

    public int getLimitRun() {
        return limitRun;
    }

    public void setLimitRun(int limitRun) {
        this.limitRun = limitRun;
    }

    public int getLimitJump() {
        return limitJump;
    }

    public void setLimitJump(int limitJump) {
        this.limitJump = limitJump;
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Кот пробежал");
    }
}
