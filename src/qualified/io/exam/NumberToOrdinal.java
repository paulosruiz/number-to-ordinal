package qualified.io.exam;

public class NumberToOrdinal {
	public static void main(String[] args) {

		System.out.println(numberToOrdinal(0));
		System.out.println(numberToOrdinal(1));

		System.out.println(numberToOrdinal(2));
		System.out.println(numberToOrdinal(3));
		System.out.println(numberToOrdinal(10));
		System.out.println(numberToOrdinal(11));
		System.out.println(numberToOrdinal(13));
		System.out.println(numberToOrdinal(15));
		System.out.println(numberToOrdinal(20));
		System.out.println(numberToOrdinal(21));
		System.out.println(numberToOrdinal(22));
		System.out.println(numberToOrdinal(23));
		System.out.println(numberToOrdinal(30));
		System.out.println(numberToOrdinal(32));
	}

	public static String numberToOrdinal(Integer number) {

		if (number == 0) {
			return number.toString();
		}

		// most common case
		String ret = "th";
		int lastDigit = number % 10;

		int lastButOne;
		if (number < 10) {
			lastButOne = 0;
		} else {
			lastButOne = (number % 100) / 10;
		}

		// 1 to 10 or >= 20
		if (lastButOne != 1) {
			if (lastDigit == 1) {
				ret = "st";
			} else if (lastDigit == 2) {
				ret = "nd";
			} else if (lastDigit == 3) {
				ret = "rd";
			}
		}
		return number + ret;

	}

}
