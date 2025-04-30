package Utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Base.BaseTest;

public class BugsScreenshots extends BaseTest {

	public String getScreenshot(String methodName) throws IOException {
        Date currentDate = new Date();
        String formattedDate = currentDate.toString().replace(":", " ").replace(" ", "_");

        String screenshotFileName = methodName + "_" + formattedDate + ".png";
        String filePath = ".//screenshot//" + screenshotFileName;

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(filePath));

        return filePath; // Return the path if you want to log it in the report
    }
}

// Without using method name we can use this logic
/*
public  void getScreenshot() throws IOException
{
	Date currentdate = new Date();
	String screenshotfilename = currentdate.toString().replace("", " ").replace(":"," ");
	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFile,new File(".//screenshot//" + screenshotfilename + ".png"));
}
}
*/