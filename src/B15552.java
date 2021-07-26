import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader mBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter mBufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(mBufferedReader.readLine());

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(mBufferedReader.readLine()," ");
            mBufferedWriter.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
        }
        mBufferedReader.close();

        mBufferedWriter.flush();
        mBufferedWriter.close();
    }
}
