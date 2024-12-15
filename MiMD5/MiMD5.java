import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
class MiMD5{
    public static void main(String[] args) throws Exception{
        String password = "The quick brown fox jumps over the lazy dog.";
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(password.getBytes(StandardCharsets.UTF_8));
        String md5 = DatatypeConverter.printHexBinary(digest);
        System.out.println(md5);
    }
}