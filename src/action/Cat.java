package action;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Cat implements Action {
    int runMaxDistance;
    int jumpMaxHeight;
    String name;


    public Cat(String name, int runMaxDistance, int jumpMaxHeight) {
        this.runMaxDistance = runMaxDistance;
        this.jumpMaxHeight = jumpMaxHeight;
        this.name = name;
    }
    @Override
    public int run() {
        System.out.println(name + " бежит");
        return runMaxDistance;
    }
    @Override
    public int jump() {
        System.out.println(name + " прыгает");
        return jumpMaxHeight;
    }
}


