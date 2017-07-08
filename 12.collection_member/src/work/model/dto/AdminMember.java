package work.model.dto;

/**
 * 관리자 회원
 * -- 직책 : 과장 부장 String position
 * @author cse
 *
 */
public class AdminMember extends Member {
	private String position;
	
	/**
	 * 
	 */
	public AdminMember() {
		super();
	}
	
	/**
	 * @param memberId
	 * @param memberPw
	 * @param memberName
	 * @param mobile
	 * @param email
	 */
	public AdminMember(String memberId, String memberPw, String memberName, String mobile, String email) {
		super(memberId, memberPw, memberName, mobile, email);
	}

	/**
	 * @param memberId
	 * @param memberPw
	 * @param memberName
	 * @param mobile
	 * @param email
	 * @param entryDate
	 * @param grade
	 * @param mileage
	 * @param manager
	 * @param position
	 */
	public AdminMember(String memberId, String memberPw, String memberName, String mobile, String email,
			String entryDate, char grade, String position) {
		super(memberId, memberPw, memberName, mobile, email, entryDate, grade);
		this.position = position;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + ", " + position;
	}

}










