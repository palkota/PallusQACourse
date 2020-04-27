package abstractClass;

import java.text.DecimalFormat;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double expected=106.17000000000002;
		DecimalFormat df = new DecimalFormat("####.##");
		expected=Double.parseDouble(df.format(expected));
		System.out.println(expected);
	}

}
