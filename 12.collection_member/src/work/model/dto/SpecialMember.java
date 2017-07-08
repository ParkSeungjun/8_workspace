package work.model.dto;

/**
 * 우수회원
 * -- 담당자 
 * @author cse
 *
 */
public class SpecialMember extends Member {
	private String manager;
	
	/** 기본 생성자 */
	public SpecialMember() {
	}

	/** 
	 * 필수데이터 초기화 생성자
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
	 * 우수회원 전체데이터 초기화 생성자
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
