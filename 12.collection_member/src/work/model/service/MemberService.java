package work.model.service;

import work.model.dto.Member;

/**
 * 회원관리를 위한 기능(crud)이 모델링된 서비스 클래스
 * 
 * ## 적용 설계 기술
 * -- encapsulation
 * -- array
 * -- constuctor 중복정의
 * -- polymorphism 다형성 : 회원타입의 배열(부모타입)
 * 
 * @author cse
 *
 */
public class MemberService {
	/** 다형성 : 회원(일반,우수,관리자) 객체들을 저장하기위한 자료 저장구조 */
	private Member[] members;
	
	/** 등록 회원수 정보 및 등록 회원의 자료저장소 위치 인덱스 */
	private int count;
	
	/** 기본생성자 : 배열크기 기본 10개 생성 초기화 */
	public MemberService() {
		//members = new Member[10];
		this(10);
	}
	
	/** 생성자 중복정의 : 배열크기 전달받은 크기로 생성 초기화 */
	public MemberService(int length) {
		members = new Member[length];
	}
	
	/** 등록 회원수 조회 메서드 */
	public int getCount() {
		return count;
	}
	
	// 매개변수 다형성 : 회원 등록기능(부모타입) : 일반, 우수, 관리자
	public void addMember(Member dto) {
		members[count++] = dto;
	}
	
	// 내정보조회(회원아이디) : 회원(부모) 반환타입 다형성
	/*
	 * 1. 등록된 회원수 만큼 반복하면서
	 * 2. 아규먼트로 전달받은 아이디와 배열요소객체의 아이디가 같은지 비교해서 : equals(Object)
	 * 3. 아이디가 같으면 현재 인덱스객체가 조회객체이므로 반환
	 * 4. for 구문을 반복을 다했는데도 return 되지 않았다면 해당아이디가 존재하지않으므로
	 *    오류메세지 출력하고
	 *    return null
	 */
	public Member getMember(String memberId) {
		for(int index = 0; index < count; index++) { // 1.
			if (memberId.equals(members[index].getMemberId())) { // 2.
				return members[index]; // 3.
			}
		}
		System.out.println("Error : 회원정보가 존재하지 않습니다. : " + memberId);
		return null; // 4.
	}
	
	// 내정보변경
	/**
	 * 내정보변경
	 * @param dto 변경 회원객체 정보
	 * @return 변경전 회원객체 정보
	 */
	public Member updateMember(Member dto) {
		for (int index = 0; index < count; index++) {
			if (dto.getMemberId().equals(members[index].getMemberId())) { 
				Member tmp = members[index];
				members[index] = dto;
				return tmp;
			}
		}
		System.out.println("Error : 회원정보가 존재하지 않습니다. : " + dto.getMemberId());
		return null; 
	}
	
	// 암호변경
	public void updateMemberPw(String memberId, String memberPw, String modifyMemberPw) {
		for (int index = 0; index < count; index++) {
			if (memberId.equals(members[index].getMemberId())
					&& memberPw.equals(members[index].getMemberPw())) { 
				members[index].setMemberPw(modifyMemberPw);;
				return;
			}
		}
		System.out.println("Error : 회원정보가 존재하지 않습니다. : " + memberId);
	}
	
	// 회원탈퇴
	public Member deleteMember(String memberId) {
		for (int index = 0; index < count; index++) {
			if (memberId.equals(members[index].getMemberId())) { 
				Member tmp = members[index];
				members[index] = members[--count];
				return tmp;
			}
		}
		System.out.println("Error : 회원정보가 존재하지 않습니다. : " + memberId);
		return null; 
	}
	
	// 전체회원 조회
	public Member[] getMember() {
		//return members;
		Member[] tmp = new Member[count];
		for (int index = 0; index < count; index++) {
			tmp[index] = members[index];
		}
		
		return tmp;
	}
}









