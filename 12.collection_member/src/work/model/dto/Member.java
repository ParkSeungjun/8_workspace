package work.model.dto;

/**
 * <pre>
 * ȸ������ ���� ��� �𵨸� �θ�Ŭ����
 * -- �Ӽ� : ���̵�, ��й�ȣ, �̸�, ����ó, �̸���, ������, ���
 * </pre>
 * 
 * @author �Ӱ���
 * @version ver.1.0
 * @since jdk1.4
 */
public class Member {
	/**
	 * <pre>
	 *  ȸ�� ���̵� ����
	 *  �ּ� 8�ڸ����� �ִ� 30�ڸ�
	 *  �̸��� ��� ����
	 * </pre> 
	 */
	private String memberId = "Guest";
	
	/** 
	 * <pre>
	 * ȸ�� ��ȣ ����
	 * �ּ� 8�ڸ����� �ִ� 20�ڸ� 
	 * </pre>
	 */
	private String memberPw;
	
	/** ȸ�� �̸� ���� */
	private String memberName;
	
	/** ȸ�� �޴��� ���� */
	private String mobile;
	
	/** ȸ�� �̸��� ���� */
	private String email;
	
	/** 
	 * <pre>
	 * ȸ�� ������ ����
	 * �⺻ ������ ���� : �⵵4�ڸ�/��2�ڸ�/��2�ڸ�
	 * ��: 2017/06/28 
	 * </pre>
	 */
	private String entryDate;
	
	/** 
	 * <pre>
	 * ȸ�� ��� ����
	 * �Ϲ�ȸ��(G), ���ȸ��(S), ������ȸ��(A)
	 * �Ϲ�ȸ���� ���ϸ��� ����, ���� ���ϸ��� �޼��� ���ȸ�� ���
	 * ���ȸ���� ����� �����ϰ�, ���ϸ��� �ʱ�ȭ
	 * </pre>
	 */
	private char grade;
	

	/**
	 * �⺻ ������
	 */
	public Member() {
	}

	/**
	 * ����� �Է� �ʼ������� �ʱ�ȭ ������
	 * @param memberId
	 * @param memberPw
	 * @param memberName
	 * @param mobile
	 * @param email
	 */
	public Member(String memberId, String memberPw, String memberName, String mobile, String email) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.mobile = mobile;
		this.email = email;
	}

	/**
	 * ��� ������ �ʱ�ȭ ������
	 * @param memberId
	 * @param memberPw
	 * @param memberName
	 * @param mobile
	 * @param email
	 * @param entryDate
	 * @param grade
	 */
	public Member(String memberId, String memberPw, String memberName, String mobile, 
			String email, String entryDate, char grade) {
		this(memberId, memberPw, memberName, mobile, email);
		this.entryDate = entryDate;
		this.grade = grade;
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the memberPw
	 */
	public String getMemberPw() {
		return memberPw;
	}

	/**
	 * @param memberPw the memberPw to set
	 */
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the entryDate
	 */
	public String getEntryDate() {
		return entryDate;
	}

	/**
	 * @param entryDate the entryDate to set
	 */
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	/**
	 * @return the grade
	 */
	public char getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(char grade) {
		this.grade = grade;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return memberId + ", " + memberPw + ", " + memberName + ", " + mobile + ", " + email + ", " + entryDate + ", "
				+ grade;
	}

}


















