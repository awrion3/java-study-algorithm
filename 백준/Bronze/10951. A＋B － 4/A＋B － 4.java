import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        while (line != null) {
            List<String> splitedLine = Arrays.asList(line.split(" "));
        
            int a = Integer.parseInt(splitedLine.get(0));
            int b = Integer.parseInt(splitedLine.get(1));
        
            int result = a + b;

            bw.write(result + "\n");
            bw.flush();
            
            line = br.readLine();
        }
        
        br.close();
        bw.close();
    }
}
