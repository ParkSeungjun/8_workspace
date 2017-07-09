import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

public class utility {

	
	// ��ȣ ���� ���ȹ������� ��½� 2�ڸ��� �����ְ� ���� ���ڴ� *(��ȣ)�� ��ü ������� �޼���
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
	
	// ��ȣ �нǽ� �ӽþ�ȣ �� ������ ���ȹ��ڿ� ��ȯ �޼���(�ӽ� ���ȹ��ڿ� ���̴� �⺻�� 4�ڸ�)
	public String getSecureString() {
		 Random rnd = new Random();
		 rnd.setSeed(System.currentTimeMillis());
		 return Integer.toString(rnd.nextInt(9000)+ 1000);
	 }
	
	// ��ȣ �нǽ� �ӽþ�ȣ �� ������ ���ȹ��ڿ� ��ȯ �޼���(�ƱԸ�Ʈ�� ���� �Է��� ���̸�ŭ)
	public String getSecureString(int length) {
		 Random rnd = new Random();
		 rnd.setSeed(System.currentTimeMillis());
		 return Integer.toString(rnd.nextInt((10^length)*9)+ 10^length);
	 }
	
	
	// ���� ��¥�� �⺻������ ���ڿ��� ��ȯ�ϴ� �޼���(�⺻���� : �⵵4�ڸ�/��2�ڸ�/��2�ڸ�)
	 public String getCurrentDay() {
		 SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		 return df.format(new Date());
	 }
	 
	 // ���� ��¥�� �⺻������ ���ڿ��� ��ȯ�ϴ� �޼���(��¥�� ������ �ƱԸ�Ʈ�� ���޹޾� �ش������� ���ڿ� ��ȯ)
	 public String getCurrentDay(String date) {
		 
		 String df = new SimpleDateFormat(date).format(new Date()).toString();

		 return df;
	 }
}
	
	