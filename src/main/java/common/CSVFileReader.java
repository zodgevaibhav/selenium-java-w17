package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/* test.csv

 admin,admin
 ess,ess
 admin123,admin213
 
 */

public class CSVFileReader {
	public static void main(String[] args) throws Exception {
		File file = new File("/Users/vzodge/eclipse-workshop/SeleniumAutomation/src/test/Test.csv");
		
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		
		while ((st = br.readLine()) != null) {
			System.out.println(st.split(",")[0]+" "+st.split(",")[1]);
		}
	}
}
