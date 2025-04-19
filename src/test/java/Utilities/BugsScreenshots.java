package Utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Base.BaseTest;
import TestCases.CandidateUploadDocuments;

public class BugsScreenshots {
	
	 public static String takeScreenshot(WebDriver driver, String screenshotName) {
	        // 1. Generate timestamp for unique filename
	        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

	        // 2. Set the path where screenshot will be saved
	        String path = System.getProperty("user.dir") + "D:/Demo screenshots/upload" + CandidateUploadDocuments.java + "_" + timestamp + ".png";

	        // 3. Take the screenshot
	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	        try {
	            // 4. Save screenshot to the path
	        	 File destination = new File("D:/Demo screenshots/Sample.png");
	                Files.copy(src.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);

	        } catch (IOException e) {
	            System.out.println("Failed to save screenshot: " + e.getMessage());
	        }

	        return path;  // Optionally return the path for reporting or logging
	    }
	}
	
