public class ConvertCase {

	public static String toSnakeCase(String string) {
		StringBuilder newString = new StringBuilder(Capitalisation.decapitalise(string));
		for (int i = 0; i < newString.length(); i++) {
			if (Character.isUpperCase(newString.charAt(i))) {
				newString.setCharAt(i, Character.toLowerCase(newString.charAt(i)));
				newString.insert(i, "_");
				i--;
			}
		}
		return newString.toString();
	}

	public static String toCamelCase(String string, boolean capitaliseFirstLetter) {
		StringBuilder newString;

		if (capitaliseFirstLetter) {
			newString = new StringBuilder(Capitalisation.capitalise(string));
		} else {
			newString = new StringBuilder(Capitalisation.decapitalise(string));
		}

		for (int i = 0; i < newString.length(); i++) {
			if (newString.charAt(i) == '_') {
				newString.setCharAt(i + 1, Character.toUpperCase(newString.charAt(i + 1)));
				newString.deleteCharAt(i);
				i--;
			}
		}
		return newString.toString();
	}
}
