import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (int i = 0; i < N - 1; i++) {
            String runner = br.readLine();
            map.put(runner, map.get(runner) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                bw.write(key);
            }
        }
        bw.flush();
    }
}