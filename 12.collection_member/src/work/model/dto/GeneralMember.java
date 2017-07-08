/**
 * 
 */
package work.model.dto;

/**
 * <pre>
 * Member 클래스를 상속받은 자식클래스 일반회원 모델링 클래스
 * -- 일반회원 추가속성 : 마일리지
 * </pre>
 * @author cse
 *
 */
public class GeneralMember extends Member {
	/** 일반회원 마일리지 정보 */
	private int mileage;

	/**
	 * 기본생성자
	 */
	public GeneralMember() {
		super();
	}

	/**
	 * 필수 데이터 초기화 생성자
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
	 * 일반회원 모든 데이터 초기화 생성자
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
















