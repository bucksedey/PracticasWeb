import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
public class MiSHA-1 {
    public static String encryptThisString(String input){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String args[]) throws NoSuchAlgorithmException{
        System.out.println("Código Hash Generado por SHA-1 para: "); 
        String s1 = "Escuela Superior de Cómputo";
        System.out.println("\n" + s1 + " : " + encryptThisString(s1));
        String s2 = "ESCOM";
        System.out.println("\n" + s2 + " : " + encryptThisString(s2));
    }
}
