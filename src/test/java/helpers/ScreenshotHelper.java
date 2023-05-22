package helpers;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotHelper {

	public static void create(WebDriver driver, String fileName) {

		try {
			
			String data = new SimpleDateFormat("dd-MM-yyyy HH-mm ").format(new Date());
			
			File arquivo = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(arquivo, new File(data + fileName));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

