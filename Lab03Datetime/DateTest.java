package Lab03Datetime;

public class DateTest {
	public static void main(String[] agr) {
		MyDate time = new MyDate("February/13th/2021");
		time.print();
		time = new MyDate(3,24,2000);
		time.print();
		time = new MyDate();
		time.accept();
		time.print();
	}
}
