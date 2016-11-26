import java.util.*;

/**
 * Created by Duncol on 2016-11-11.
 */
public class Newspaper implements Subject{
    private ArrayList<Paper> paperReleases;

    Newspaper() {
        paperReleases = new ArrayList<>();
    }

    public void addSubscriber(Observer o){
        if (subscribers == null){
            subscribers = new ArrayList<>();
        }
        subscribers.add(o);
    }
    public void releaseSubscriber(Observer o){
        if(subscribers != null){
            subscribers.remove(o);
        }
    }
    public void updateSubscribers(Paper p){
        for (Observer obs : subscribers){
            obs.update(p);
        }
    }
    ArrayList<Observer> subscribers;

    public void releaseNewPaper(){
        Paper p = new Paper();
        paperReleases.add(p);
        this.updateSubscribers(p);
    }
    public void releaseNewPaper(String title, int month, int year, int pages){
        Paper p = new Paper(title, month, year, pages);
        paperReleases.add(p);
        this.updateSubscribers(p);
    }

    public static void main(String[] args){
        Newspaper theGazeta = new Newspaper();
        theGazeta.addSubscriber(new Lonnie());
        theGazeta.addSubscriber(new Donnie());
        theGazeta.addSubscriber(new Ronnie());
        theGazeta.releaseNewPaper();
        theGazeta.releaseNewPaper("Extraordinary Duncol attacks the market!", 2, 2016, 98);
    }
}
