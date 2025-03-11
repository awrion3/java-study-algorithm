import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 단어의 개수 입력
        int times = Integer.parseInt(br.readLine());
        
        // 알파벳 단어들 입력
        Set<String> words = new HashSet<>();
        
        for (int i = 0; i < times; i++) {
            words.add(br.readLine());
        }

        // 정렬 기준에 따라 정렬하기
        List<String> sortedWords = new ArrayList<>(words);
        
        Collections.sort(sortedWords, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b); // 길이가 같으면 사전순 정렬
            }
            return a.length() - b.length(); // 길이순 정렬
        });
        
        for (String word : sortedWords) {
            bw.write(word);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}