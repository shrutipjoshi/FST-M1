package Activity;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;


public class IOTester {

	    public static void main(String[] args) {
	        try {
	            //Using BufferedReader
	            readUsingTraditionalWay();

	            //Using IOUtils
	            readUsingIOUtils();
	        } catch(IOException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    //reading a file using IOUtils in one go
	    public static void readUsingIOUtils() throws IOException {
	        try(InputStream in = new FileInputStream("input.txt")) {
	            System.out.println( IOUtils.toString( in , "UTF-8") );
	        }
	    }
}
