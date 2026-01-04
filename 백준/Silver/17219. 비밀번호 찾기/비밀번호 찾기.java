import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, String> map = new HashMap<>();

        String[] N = br.readLine().split(" ");

        for (int i = 0; i < Integer.parseInt(N[0]); i++) {
            String[] line = br.readLine().split(" ");
            map.put(line[0], line[1]);
        }

        for (int i = 0; i < Integer.parseInt(N[1]); i++) {
            String pwd = map.get(br.readLine());
            bw.write(pwd + "\n");
        }
        bw.flush();
    }
}