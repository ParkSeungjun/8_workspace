/**
 * 
 */
package work.model.dto;

/**
 * <pre>
 * Member Ŭ������ ��ӹ��� �ڽ�Ŭ���� �Ϲ�ȸ�� �𵨸� Ŭ����
 * -- �Ϲ�ȸ�� �߰��Ӽ� : ���ϸ���
 * </pre>
 * @author cse
 *
 */
public class GeneralMember extends Member {
	/** �Ϲ�ȸ�� ���ϸ��� ���� */
	private int mileage;

	/**
	 * �⺻������
	 */
	public GeneralMember() {
		super();
	}

	/**
	 * �ʼ� ������ �ʱ�ȭ ������
	 * @param memberId
	 * @param memberPw
	 * @param memberName
	 * @param mobile
	 * @param email
	 */
	public GeneralMember(String memberId, String memberPw, String memberName, 
			String mobile, String email) {
		super(memberId, memberPw, memberName, mobile, email);
	}
	
	/**
	 * �Ϲ�ȸ�� ��� ������ �ʱ�ȭ ������
	 * @param memberId
	 * @param memberPw
	 * @param memberName
	 * @param mobile
	 * @param email
	 * @param entryDate
	 * @param grade
	 * @param mileage
	 */
	public GeneralMember(String memberId, String memberPw, String memberName, 
			String mobile, String email, String entryDate, char grade, int mileage) {
		super(memberId, memberPw, memberName, mobile, email);
		setEntryDate(entryDate);
		setGrade(grade);
		this.mileage = mileage;
	}

	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/**
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + ", " + mileage;
	}
	
	
}
















