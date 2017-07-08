package work.model.dto;

/**
 * ���ȸ��
 * -- ����� 
 * @author cse
 *
 */
public class SpecialMember extends Member {
	private String manager;
	
	/** �⺻ ������ */
	public SpecialMember() {
	}

	/** 
	 * �ʼ������� �ʱ�ȭ ������
	 * @param memberId
	 * @param memberPw
	 * @param memberName
	 * @param mobile
	 * @param email
	 */
	public SpecialMember(String memberId, String memberPw, String memberName, String mobile, String email) {
		super(memberId, memberPw, memberName, mobile, email);
	}

	/**
	 * ���ȸ�� ��ü������ �ʱ�ȭ ������
	 * @param memberId
	 * @param memberPw
	 * @param memberName
	 * @param mobile
	 * @param email
	 * @param entryDate
	 * @param grade
	 * @param mileage
	 * @param manager
	 * @param manager2
	 */
	public SpecialMember(String memberId, String memberPw, String memberName, String mobile, String email,
			String entryDate, char grade, String manager) {
		super(memberId, memberPw, memberName, mobile, email, entryDate, grade);
		manager = manager;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + ", " + manager;
	}
	
}
