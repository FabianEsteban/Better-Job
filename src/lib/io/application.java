package lib.io;

import java.util.Locale;
import java.util.ResourceBundle;

public class application {
	public static String getProperty(String value){
		String fileName = "application";
		ResourceBundle application = ResourceBundle.getBundle(fileName, Locale.ENGLISH);
		String result=null;
		try{
			result=application.getString(value);
		} catch (Exception ex){
			ex.printStackTrace();
		}
		return result;
	}
}
