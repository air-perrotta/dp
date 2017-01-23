package common;

import java.util.Arrays;
import java.util.List;

public class PrintUtil {

	public static void print(List<String> textList) {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		textList.stream().forEach(text -> {
			System.out.println(text);
		});
		System.out.println("");
	}

	public static void print(String text) {
		print(Arrays.asList(text));
	}
}