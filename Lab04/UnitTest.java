public class UnitTest {
    public static void main(String[] args) {
        MyDate[] listOfDate = new MyDate[10];

        listOfDate[0] = new MyDate("fourteenth", "February", "one thousand ninety nine");
        listOfDate[1] = new MyDate();
        listOfDate[2] = new MyDate(15, 3, 2021);
        listOfDate[3] = new MyDate("nineth", "April", "two thousand and two");
        listOfDate[4] = new MyDate("tenth", "April", "two thousand");
        listOfDate[5] = new MyDate(27,11,2000);
        listOfDate[6] = new MyDate("nineth", "January", "two thousand");
        listOfDate[7] = new MyDate("eighth", "March", "twenty twenty one");
        listOfDate[8] = new MyDate("first", "January", "twenty twenty");
        listOfDate[9] = new MyDate("thirty first", "December", "twenty nineteen");

        for (MyDate d : listOfDate)
        {
            d.Print("d/MM/yyyy");
        }

        DateUtils.sort(listOfDate);

        System.out.println("Result:");

        for (MyDate d : listOfDate)
        {
            d.Print("d/MM/yyyy");
        }
    }
}