package action;

public class Treadmill implements Obstacle{
    int runDistance;
    public Treadmill(int runDistance) {
        this.runDistance = runDistance;
    }
    @Override
    public Boolean getAction (int partMaxDis){
        if (partMaxDis >= runDistance){
            System.out.println("Успешно пробежал");
            return true;
        }else {
            System.out.println("Не смог пробежать");
            return false;
        }

    }
}
