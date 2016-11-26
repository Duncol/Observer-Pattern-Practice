/**
 * Created by Duncol on 2016-11-11.
 */
public class Ronnie implements Observer {
    public void update(Paper p){
        System.out.println("Ronnie is enjoying his new paper!");
        System.out.println(p.title + " (" + p.month + "/" + p.year + ")");
    }
}
