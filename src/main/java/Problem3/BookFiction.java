package Problem3;
//BookFiction Done
public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        // homework
        // tip: use the 'super' keyword
        super(title, author);
        this.genres = genres;

    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        // homework
        // tip: use the 'super' keyword
        super(anotherBook);
        genres = anotherBook.genres;
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        if (numOfDaysPastDue > 0) {
            int lateFee = numOfDaysPastDue * lateFeePerDayInDollar;
            return lateFee;
        }else {
            return 0;
        }
    }
}
