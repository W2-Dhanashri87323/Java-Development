import java.util.Calendar;

public class Demo06 {
    public static void main(String[] args) {
        Date d1 = new Date(5, 5, 2020);
        d1.printRecord();
        Date d2 = new Date(5, 5, 2020);
        d2.printRecord();

    }

}

class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        System.out.println(" parameterless constructor ");
        Calendar c = Calendar.getInstance();
        this.day = c.get(Calendar.DATE);
        this.month = c.get(Calendar.MONTH);
        this.year = c.get(Calendar.YEAR);
    }

    public Date(int day1, int month1, int year1) {
        System.out.println(" Parameterized constructor ");
        this.day = day1;
        this.month = month1;
        this.year = year1;

    }

    public void printRecord() {
        System.out.println(day + "/" + month + "/" + year);
    }

}
