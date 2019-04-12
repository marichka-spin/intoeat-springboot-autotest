package net.lviv;


import java.io.File;

public class WebDriverManager {
	
	public static void setUpDriver() {
		ClassLoader classLoader = WebDriverManager.class.getClassLoader();
		File file = new File(classLoader.getResource("geckodriver.exe").getFile());
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
	}
}
