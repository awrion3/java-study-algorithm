import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        String input = br.readLine();

        List<Integer> values = Arrays.stream(input.split(" "))
                             .map(Integer::parseInt)
                             .collect(Collectors.toList());
        
        int max = Collections.max(values);
        int min = Collections.min(values);

        bw.write(min + " " + max);
           
        br.close();
        bw.close();
    }
}