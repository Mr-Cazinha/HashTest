import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashTest {

	public static void main(String[] args) {
		String name = "Mr-Cazinha";
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(name.getBytes());
			byte[] out = md.digest();
			final StringBuilder hexString = new StringBuilder();
			for (int i = 0; i < out.length; i++) {
	            final String hex = Integer.toHexString(0xff & out[i]);
	            if(hex.length() == 1) 
	              hexString.append('0');
	            hexString.append(hex);
	        }
			System.out.println(hexString);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
