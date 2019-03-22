package HOMEWORK2;

public class UseString {

	public static void main(String[] args) {
		String str = "I want to learn java";
		String str1 = "i want to learn java";
		
		System.out.println("1.)	" + str.toUpperCase());
		System.out.println("2.)	" + str.toLowerCase());
		System.out.println("3.)	" + str.length());
		System.out.println("4.)	" + str.trim());
		System.out.println("5.) " + str.hashCode());
		System.out.println("6.)	" + str.getBytes());
		System.out.println("7.)	" + str.charAt(5));
		System.out.println("8.)	" + str.getClass());
		System.out.println("9.)	" + str.compareTo(str1));
		System.out.println("10.) " + str.concat(".This was Concated!"));
		System.out.println("11.)" + str.contains(str));
		System.out.println("12.)" + str.intern());
		System.out.println("13.) " + str.contentEquals(str1));
		System.out.println("14.) " + str.equalsIgnoreCase("I want to learn java"));
		System.out.println("15.) " + str.endsWith("java"));
		System.out.println("16.) " + str.replace('w', 'B'));
		System.out.println("17.) " + str.codePointAt(4));
		System.out.println("18.) " + str.CASE_INSENSITIVE_ORDER);
		System.out.println("19.)" + str1.contentEquals(str));
		System.out.println("20.) " + str1.indexOf(str));
		
		char array[] = str1.toCharArray();
		
		System.out.println("21.)" + array.length);
		System.out.println("22.) " + str.substring(2, 4));
		System.out.println("23.) " + array[5]);
		System.out.println("24.) " + str1.substring(1, 4));
		System.out.println("25.) " + str1.isEmpty());
		System.out.println("26.) " + str1.indexOf('a'));
		System.out.println("27.) " + str1.endsWith("!!!"));
		System.out.println("28) " + str1.compareTo(str));
		System.out.println("29.) " + str1.concat(" More please!"));
		System.out.println("30.) " + str1.compareToIgnoreCase(str));

	}

}
