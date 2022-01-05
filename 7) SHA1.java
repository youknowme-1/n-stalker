import java.security.*;
import java.io.*;

public class SHA1 {
    public static void main(String[] a) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            MessageDigest md = MessageDigest.getInstance("SHA1");
            System.out.println("Enter the string: ");
            String input = in.readLine();
            md.update(input.getBytes());
            byte[] output = md.digest();
            System.out.println();
            System.out.println("SHA1(\"" + input + "\") = " + bytesToHex(output));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    public static String bytesToHex(byte[] b) { // char hexDigit[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                                                // 'A', 'B', 'C', 'D', 'E', 'F' };
        StringBuffer buf = new StringBuffer(); // for (int j = 0; j < b.length; j++) { //
        // buf.append(hexDigit[(b[j] >> 4) & 0x0f]); // buf.append(hexDigit[b[j]
        // & 0x0f]); // }
        for (byte by : b) {
            buf.append(String.format("%X", by));
        }
        return buf.toString();
    }
}
