import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int times = Integer.parseInt(br.readLine());
        Set<String> words = new HashSet<>();

        for (int i = 0; i < times; i++) {
            words.add(br.readLine());
        }

        List<String> sortedWords = words.stream()
                                        .sorted(Comparator.comparingInt(String::length)
                                                .thenComparing(Comparator.naturalOrder()))
                                        .collect(Collectors.toList());

        for (String word : sortedWords) {
            bw.write(word);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}