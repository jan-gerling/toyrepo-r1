package a;

class Example1 {

	private int convert(int a) {
		int bbb = a + 5;
		return bbb;
	}

	public void m1() {
		int a = 0;
		int b = convert(a);

		b = b * 2;

		System.out.println(b);

	}

}

