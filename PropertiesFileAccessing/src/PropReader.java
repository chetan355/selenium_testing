import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("D:\\practice_stuff\\java\\selenium\\PropertiesFileAccessing\\src\\data.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		
		prop.setProperty("browser", "firefox");
		
		FileOutputStream fos = new FileOutputStream("D:\\practice_stuff\\java\\selenium\\PropertiesFileAccessing\\src\\data.properties");
		prop.store(fos, null);
	}

}
