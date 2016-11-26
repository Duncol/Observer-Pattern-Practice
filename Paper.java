/**
 * Created by Duncol on 2016-11-12.
 */
public class Paper {
    public final String title;
    public final int month;
    public final int year;
    public final int pages;

    Paper() {
        this.title = "[NONE]";
        this.month = 0;
        this.year = 1410;
        this.pages = 666;
    }

    Paper(String title, int month, int year, int pages) {
        this.title = title;
        this.month = month;
        this.year = year;
        this.pages = pages;
    }
}
