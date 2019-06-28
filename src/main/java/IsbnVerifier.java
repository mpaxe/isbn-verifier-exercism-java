class IsbnVerifier {

	boolean isValid(String isbn) {
		isbn = isbn.replace("-", "");
		int numVerify = 0;
		if (isbn.length() != 10) {
			return false;
		}
		for (int i = 0; i < 10; i++) {
			if (isbn.charAt(i) == 'X') {
				numVerify += 10;
			} else if (Character.isDigit(isbn.charAt(i))) {
				numVerify += ((Integer.parseInt("" + isbn.charAt(i))) * (10 - i));
			} else {
				return false;
			}
		}
		return numVerify % 11 == 0;
	}
}
