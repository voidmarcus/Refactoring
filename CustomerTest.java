import org.junit.Test;

public class CustomerTest {
	@Test
	void testStatement() {
		Movie vingadores= new Movie("Vingadores", 2);
		Movie branquelas= new Movie("Branquelas", 1);
		Movie logan = new Movie("Logan", 0);

		Rental rentalVingadores= new Rental(vingadores, 5);
		Rental rentalBranquelas= new Rental(branquelas, 3);
		Rental rentalLogan= new Rental(logan, 2);

		Customer sara= new Customer("Sara");

		sara.addRental(rentalVingadores);
		sara.addRental(rentalPikachu);
		sara.addRental(rentalLogan);

		String result= sara.statement();
        String expected = "Rental Record for Sara\n" + "\tVingadores\t4.5\n" + "\tBranquelas\t9.0\n" + "\tLogan\t2.0\n" + "Amount owed is 15.5\n" + "You earned 4 frequent renter points";

		assertEquals(expected, result);
	}
}