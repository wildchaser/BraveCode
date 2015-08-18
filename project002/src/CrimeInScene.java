
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CrimeInScene {

	public static void main(String[] args)
	{
		String blood = "12346";
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		md.update(blood.getBytes());
		byte[] byteData = md.digest();
		String hexString = new String();
		for(int i=0; i<byteData.length; i++)
		{
			hexString =""+byteData[i];
		}
		
		System.out.println(hexString);
		

	}
}
