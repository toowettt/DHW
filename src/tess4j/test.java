package tess4j;

import java.io.File;
import java.io.*;
import net.sourceforge.tess4j.*;

public class test {
	public static void main(String[] args) throws IOException{
		
		//Creates file instance and references the file in its location
		//WHere get image from camera??
		//File imageFile = new File("C:\\Users\\images\\blah.tif");
		//WHERE HCREAL IS INSERT YOUR COMPUTER NAME THEN EVERYTHING PAST WILL WORK
		File imageFile = new File("C:\\Users\\hcreal\\git\\DHW\\images\\Southern_Life_in_Southern_Literature_text_page_322.jpg");
		
		//Creating a new tesseract instance and setting the data path with the trained data
		ITesseract instance = new Tesseract();
		//WHERE HCREAL IS INSERT YOUR COMPUTER NAME THEN EVERYTHING PAST WILL WORK
		instance.setDatapath("C:\\Users\\hcreal\\git\\DHW\\tessdata"); //<-tessdata data path
		
		//Try catch that runs the OCR on the file/document/camera
		try {
			String result = instance.doOCR(imageFile);
			System.out.println(result);
			
			//Catch if the OCR fails
		} catch(TesseractException e) {
			System.err.println(e.getMessage());
		}
	}

}
