import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

public class utility {

	
	// 암호 등의 보안문자정보 출력시 2자리만 보여주고 남은 문자는 *(기호)로 대체 출력위한 메서드
	public String convertSecureString(String securePw) {

        StringBuffer body = new StringBuffer(securePw);
		String head = body.substring(0,2);
		String mod = null;
		body.delete(0, 2);
		for(int index = 0; index < body.length(); index++ ) {
			mod += "*";
		}
		return head+mod; 
	}
	
	// 암호 분실시 임시암호 등 임의의 보안문자열 반환 메서드(임시 보안문자열 길이는 기본은 4자리)
	public String getSecureString() {
		 Random rnd = new Random();
		 rnd.setSeed(System.currentTimeMillis());
		 return Integer.toString(rnd.nextInt(9000)+ 1000);
	 }
	
	// 암호 분실시 임시암호 등 임의의 보안문자열 반환 메서드(아규먼트로 길이 입력한 길이만큼)
	public String getSecureString(int length) {
		 Random rnd = new Random();
		 rnd.setSeed(System.currentTimeMillis());
		 return Integer.toString(rnd.nextInt((10^length)*9)+ 10^length);
	 }
	
	
	// 현재 날짜를 기본형식의 문자열로 반환하는 메서드(기본형식 : 년도4자리/월2자리/일2자리)
	 public String getCurrentDay() {
		 SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		 return df.format(new Date());
	 }
	 
	 // 현재 날짜를 기본형식의 문자열로 반환하는 메서드(날짜의 형식을 아규먼트로 전달받아 해당형식의 문자열 반환)
	 public String getCurrentDay(String date) {
		 
		 String df = new SimpleDateFormat(date).format(new Date()).toString();

		 return df;
	 }
}
	
	