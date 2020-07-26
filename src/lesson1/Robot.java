package lesson1;

public class Robot implements Competitor{

    private int limitRun, limitJump;

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

    public Robot(int limitRun, int limitJump) {
        this.limitJump = limitJump;
        this.limitRun = limitRun;
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Робот пробежал");
    }
}
