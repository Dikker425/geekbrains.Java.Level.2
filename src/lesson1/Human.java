package lesson1;

public class Human implements Competitor{
    private int limitRun, limitJump;

    public Human(int limitRun, int limitJump) {
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
        System.out.println("Человек прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Человек пробежал");
    }
}
