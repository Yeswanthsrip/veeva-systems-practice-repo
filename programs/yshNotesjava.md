lcm*gcd=m*n

lcm=first common multiple

No.of trailing zeroes in n!=divide by 5,25,125....

Set bits=no.of 1's in binary number
unset bits/clear bits=no.of 0's in binary number

***		AsCII Values

		  '0' → 48
		  '1' → 49
		  '9' → 57
		  'A' → 65
		  'Z' → 90
		  'a' → 97
		  'z' → 122
		  

***Converting Integer to String
	1. int n = 123;
		String s = String.valueOf(n);
	
	2. int n = 123;
		String s = Integer.toString(n);
		
	3. int n = 123;
		String s = n + "";
		
***Converting Integer to Character
	1. int n = 7;
		char ch = (char)(n + '0');
		
***Converting String to Integer
	1. String s = "123";
		int n = Integer.parseInt(s);
		
	2. Integer n = Integer.valueOf(s);
	
***Converting String to Character
	1. String s = "Hello";
		char ch = s.charAt(0);
		
***COnverting String to UpperCase/LowerCase
	1. String s = "Java";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	
***COnverting String to Long
	1. String s = "123456789";
		long n = Long.parseLong(s);
		
***COnverting String to Double
	1. String s = "12.5";
		double n = Double.parseDouble(s);
		
***COnverting String to Float
	1. String s = "12.5";
		float n = Float.parseFloat(s);
		
***COnverting String to Boolean
	1. String s = "true";
		boolean value = Boolean.parseBoolean(s);
		
***COnverting String to StringArray
	1. String s = "Java is easy";
		String[] arr = s.split(" ");
		
***COnverting StringArray to String
	1. String[] arr = {"Java", "is", "easy"};
		String s = String.join(" ", arr);
		System.out.println(s);
		
***COnverting String to StringBuilder
	1. String s = "Hello";
		StringBuilder sb = new StringBuilder(s);
		
***Converting StringBuilder to String
	1. StringBuilder sb = new StringBuilder("Hello");
		String s = sb.toString();
		
***COnverting Long to String
	1. long n = 123456789L;
		String s = String.valueOf(n);
		
***Converting Boolean to String
	1. boolean value = true;
		String s = String.valueOf(value);
	
***COnverting Double to String
	1. double n = 12.5;
		String s = String.valueOf(n);
		
***Converting Character to Integer
	1. char ch = '7';
		int n = ch - '0';
	
	2. char ch = '7';
		int n = Character.getNumericValue(ch);
		
	3. char ch = '7';
		int n = Integer.parseInt(String.valueOf(ch));
		
	4. char ch = 'A'; ---Unicode value
		int n = (int) ch;
	
***Converting Character to String
	1. char ch = 'A';
		String s = String.valueOf(ch);

	2. String s = Character.toString(ch);
		
***Converting String to CharacterArray
	1. String s = "Hello";
		char[] arr = s.toCharArray();
		
***Converting String IntegerArray
	1. String s = "12345";
		int[] arr = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i) - '0';
		}
		
***Converting IntegerArray to String
	1. int[] arr = {1, 2, 3, 4, 5};
		String s = "";
		for (int n : arr) {
			s += n;
		}
		System.out.println(s);
		
***COnverting CharacterArray to String
	1. char[] arr = {'H', 'i'};
		String s = new String(arr);
		
***Converting Integer to BinaryString
	1. int n = 10;
		String binary = Integer.toBinaryString(n);
		
***Converting BinaryString to Integer
	1. String binary = "1010";
		int n = Integer.parseInt(binary, 2);
		
***Converting Integer to HexaDecimalString
	1. int n = 255;
		String hex = Integer.toHexString(n);
		
***Converting HexaDecimalString to Integer
	1. String hex = "ff";
		int n = Integer.parseInt(hex, 16);
		
***Converting Integer to OctalString
	1. int n = 10;
		String octal = Integer.toOctalString(n);
		
***Converting OctalString to Integer
	1. String octal = "12";
		int n = Integer.parseInt(octal, 8);
		
***Converting Integer to IntegerBitCount
	1. int n = 10;
		int count = Integer.bitCount(n);
		
		
			Conversion 									Java method


			int → String								String.valueOf(n)

			String → int								Integer.parseInt(s)
			
			char → int digit							ch - '0'
			
			int → char digit							(char)(n + '0')
			
			String → char								s.charAt(i)

			String → char[]								s.toCharArray()

			char[] → String								new String(arr)

			int → binary								Integer.toBinaryString(n)

			binary → int								Integer.parseInt(s, 2)

			int → hex									Integer.toHexString(n)

			hex → int									Integer.parseInt(s, 16)

			int → octal									Integer.toOctalString(n)

			octal → int									Integer.parseInt(s, 8)

			count set bits								Integer.bitCount(n)
			
***Check UpperCase/LowerCase
	1. char ch = 'A';
		System.out.println(Character.isUpperCase(ch));
	
	2. char ch = 'a';
		System.out.println(Character.isLowerCase(ch));
		
***Check Digit
	1. char ch = '7';
		System.out.println(Character.isDigit(ch));

***Check Letter
	1. char ch = 'A';
		System.out.println(Character.isLetter(ch));
		Character.isAlphabetic(ch);
		
***Check LetterOrDigit
	1. char ch = '7';
		System.out.println(Character.isLetterOrDigit(ch));
		
***Check WhiteSpace
	1. char ch = ' ';
		System.out.println(Character.isWhitespace(ch));
		
***Convert to uppercase/lowercase
	1. char ch = 'a';
		char result = Character.toUpperCase(ch);
		
	2. char ch = 'A';
		char result = Character.toLowerCase(ch);
		
***Strings equality
	1. String a = "Java";
		String b = "Java";
		System.out.println(a.equals(b));
		
***equals ignorecase
	1. String a = "Java";
		String b = "JAVA";
		System.out.println(a.equalsIgnoreCase(b));
		
***String contains text
	1. String s = "Hello Java";
		System.out.println(s.contains("Java"));
		
***String startswith/endswith
	1. String s = "Hello Java";
		System.out.println(s.startsWith("Hello"));
		
***indexOfCharacter
	1. String s = "Hello";
		System.out.println(s.indexOf('l'));
		
***lastIndexOf
	1. String s = "Hello";
		System.out.println(s.lastIndexOf('l'));
		
***extract subString
	1. String s = "HelloWorld";
		System.out.println(s.substring(5));
		
***removeSpaceAtBeginingAndEnd
	1. String s = "  Hello  ";
		System.out.println(s.trim());
		
***replaceCharacters
	1. String s = "banana";
		System.out.println(s.replace('a', 'o'));
		
***split strings
	1. String s = "Java is easy";
		String[] arr = s.split(" ");
		
***Math methods
	Math.max(a, b);
	Math.min(a, b);
	Math.abs(a);
	Math.pow(a, b);
	Math.sqrt(n);
	
***Strings Methods
	length()
	charAt()
	indexOf()
	lastIndexOf()
	equals()
	equalsIgnoreCase()
	compareTo()
	compareToIgnoreCase()
	toLowerCase()
	toUpperCase()
	trim()
	split()
	valueOf()
	
***StringBuilder Methods
	length()
	insert(i,ch)
	reverse()
	delete()
	deleteCharAt()
	sb.setLength(0)
	