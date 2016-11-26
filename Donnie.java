/**
 * Created by Duncol on 2016-11-11.
 */
public class Donnie implements Observer {
    public void update(Paper p){
        System.out.println("Donnie is enjoying his new paper!");
        System.out.println(p.title + " (" + p.month + "/" + p.year + ")");
    }
}
