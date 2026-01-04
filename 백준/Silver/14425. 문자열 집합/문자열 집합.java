import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();

        String[] N = br.readLine().split(" ");
        int count = 0;

        for (int i = 0; i < Integer.parseInt(N[0]); i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < Integer.parseInt(N[1]); i++) {
            if (set.contains(br.readLine())) {
                count++;
            }
        }
        bw.write(count + " ");
        bw.flush();
    }
}