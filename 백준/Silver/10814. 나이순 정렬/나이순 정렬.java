import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static class Member {
        public int age;
        public String name;
        
        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 온라인 회원 수 입력
        int times = Integer.parseInt(br.readLine());
        
        // 각 회원의 나이와 이름이 공백으로 구분하여 입력됨
        List<Member> arr = new ArrayList<>();

        for (int i = 0; i < times; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            arr.add(new Member(age, name));
        }
        
        // 오름차순 정렬 결과 출력
        Collections.sort(arr, (a, b) -> a.age - b.age);

        for (Member v : arr) {
            bw.write(v.age + " " + v.name + "\n");
        }

        br.close();
        bw.close();
    }
}