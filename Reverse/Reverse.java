import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
/*
* Read in lines from a file and reverse the order of the words and print the new lines to a file.
*/

public class Reverse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new FileReader("B-large-practice2.in"));
		PrintWriter pr = new PrintWriter("OutputLarge2.txt");
		String line = null;
		line = input.readLine();
		int num = 1;
		
		while ((line = input.readLine()) != null) {
			String[] words = line.split(" ");
			String s2 = "";
			for (int i = words.length-1; i >= 0; i--) {
				s2 = s2 + " " + words[i];
			}
			
			pr.printf("Case #%d:%s\n\n", num, s2);
			num++;
		}
		pr.close();
	}

}
