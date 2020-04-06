package action;

public class Wall implements Obstacle{
    int jumpHeight;
    public Wall(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
    @Override
    public Boolean getAction (int partMaxHeihgt){
        if (partMaxHeihgt >= jumpHeight){
            System.out.println("Успешно прыгнул");
            return true;
        }else {
            System.out.println("Не смог прыгнуть");
            return false;
        }

    }
}
