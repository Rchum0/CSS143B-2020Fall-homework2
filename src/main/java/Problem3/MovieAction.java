package Problem3;

//MovieAction done
public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super(rating, title);
    }

    public MovieAction(MovieAction anotherMovie) {
        // homework
        // tip: use the 'super' keyword
        super(anotherMovie);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        //
        if (numOfDaysPastDue > 0 && numOfDaysPastDue < 5) {
            int lateFee = numOfDaysPastDue * lateFeePerDayInDollar;
            return lateFee;
        } else if (numOfDaysPastDue >= 5) {
            int lateFee = (2 * (numOfDaysPastDue * lateFeePerDayInDollar));
            return lateFee;
        } else {
            return 0;
        }
    }
}
