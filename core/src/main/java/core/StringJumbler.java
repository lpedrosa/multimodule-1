package core;

import java.util.Random;

import org.apache.commons.lang3.StringUtils;

public final class StringJumbler {

	public static int NO_ERROR_PERCENTAGE = 10;
	
	public final Random random;

	public StringJumbler() {
		this.random = new Random();
	}
	
	public String jumble(String str) {
		int number = random.nextInt(100);
		if (number < NO_ERROR_PERCENTAGE)
			return "NO!";
		return StringUtils.reverse(StringUtils.swapCase(str));
	}
}
