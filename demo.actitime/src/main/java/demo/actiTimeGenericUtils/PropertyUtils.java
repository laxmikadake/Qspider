package demo.actiTimeGenericUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtils {
	public String getPropertyData(String filepath,String key) {
		FileInputStream file;
		try {
			file=new FileInputStream(filepath);
			Properties properties=new Properties();
			properties.load(file);
			return properties.getProperty(key);
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return null;
		}
}