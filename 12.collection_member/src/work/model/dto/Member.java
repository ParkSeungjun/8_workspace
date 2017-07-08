package work.model.dto;

/**
 * <pre>
 * 회원들의 공통 기능 모델링 부모클래스
 * -- 속성 : 아이디, 비밀번호, 이름, 연락처, 이메일, 가입일, 등급
 * </pre>
 * 
 * @author 임경혜
 * @version ver.1.0
 * @since jdk1.4
 */
public class Member {
	/**
	 * <pre>
	 *  회원 아이디 정보
	 *  최소 8자리에서 최대 30자리
	 *  이메일 사용 가능
	 * </pre> 
	 */
	private String memberId = "Guest";
	
	/** 
	 * <pre>
	 * 회원 암호 정보
	 * 최소 8자리에서 최대 20자리 
	 * </pre>
	 */
	private String memberPw;
	
	/** 회원 이름 정보 */
	private String memberName;
	
	/** 회원 휴대폰 정보 */
	private String mobile;
	
	/** 회원 이메일 정보 */
	private String email;
	
	/** 
	 * <pre>
	 * 회원 가입일 정보
	 * 기본 가입일 형식 : 년도4자리/월2자리/일2자리
	 * 예: 2017/06/28 
	 * </pre>
	 */
	private String entryDate;
	
	/** 
	 * <pre>
	 * 회원 등급 정보
	 * 일반회원(G), 우수회원(S), 관리자회원(A)
	 * 일반회원은 마일리지 제공, 일정 마일리지 달성시 우수회원 등업
	 * 우수회원은 담당자 배정하고, 마일리지 초기화
	 * </pre>
	 */
	private char grade;
	

	/**
	 * 기본 생성자
	 */
	public Member() {
	}

	/**
	 * 사용자 입력 필수데이터 초기화 생성자
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
	 * 모든 데이터 초기화 생성자
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


















