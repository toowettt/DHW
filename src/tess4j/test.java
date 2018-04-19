package tess4j;

import java.io.File;
import java.io.*;
import net.sourceforge.tess4j.*;

public class test {
	public static void main(String[] args) throws IOException{
		
		//Creates file instance and references the file in its location
		//WHere get image from camera??
		//File imageFile = new File("C:\\Users\\images\\blah.tif");
		File imageFile = new File("C:\\Users\\Sean\\eclipse-workspace\\DHW\\images\\eurotext.tif");
		
		//Creating a new tesseract instance and setting the data path with the trained data
		ITesseract instance = new Tesseract();
		instance.setDatapath("C:\\Users\\Sean\\eclipse-workspace\\DHW\\tessdata"); //<-tessdata data path
		
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
