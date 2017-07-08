package work.model.service;

import work.model.dto.Member;
import java.util.ArrayList;

/**
 * 회원관리를 위한 기능(crud)이 모델링된 서비스 클래스
 * --배열 자료저장구조 => Collection(List) 변경 설
 * ## 적용 설계 기술
 * -- encapsulation
 * -- array
 * -- constuctor 중복정의
 * -- polymorphism 다형성 : 회원타입의 배열(부모타입)
 * 
 * @author cse
 *
 */
public class MemberServiceArray {
	/** 다형성 : 회원(일반,우수,관리자) 객체들을 저장하기위한 자료 저장구조 */
	
	private ArrayList<Member> members = new ArrayList<Member>();
	
	
	/** 등록 회원수 조회 메서드 */
	public int getCount() {
		return members.size();
	}
	
	// 매개변수 다형성 : 회원 등록기능(부모타입) : 일반, 우수, 관리자
	public void addMember(Member dto) {
		members.add(dto);
	}
	
	public int isExist(String memberId) {
		Member tmp = null;
		for(int index = 0; index < members.size(); index++) {
				tmp = members.get(index);
				if(memberId.equals(tmp.getMemberId())) {
					return index;
				}
			}
		return -1;
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
		int index = isExist(memberId);
		if(index >= 0) {			
				return members.get(index); 
			}
		System.out.println("Error : 회원정보가 존재하지 않습니다. : " + memberId);
		return null;
		}
			
	
	// 내정보변경
	/**
	 * 내정보변경
	 * @param dto 변경 회원객체 정보
	 * @return 변경전 회원객체 정보
	 */
	public Member updateMember(Member dto) {
		int index = isExist(dto.getMemberId());
		if(index >= 0) {
			Member tmp = members.get(index);
			members.set(index, dto);
			return tmp;
		}
		System.out.println("Error : 회원정보가 존재하지 않습니다. : " + dto.getMemberId());
		return null; 
	}
	
	// 암호변경
	public void updateMemberPw(String memberId, String memberPw, String modifyMemberPw) {
		int index = isExist(memberId);
		Member tmp = new Member();
		tmp.setMemberId(memberId);
		tmp.setMemberPw(modifyMemberPw);
		
		if (isExist(memberId) >= 0 && memberPw.equals(members.get(index))) { 
			members.set(index, tmp);
			return;
		}
		System.out.println("Error : 회원정보가 존재하지 않습니다. : " + memberId);
	}
	

	// 회원탈퇴
	public void deleteMember(String memberId) {
		int index = isExist(memberId);
		if(index >= 0) {	
			members.remove(index);
			return;
		} else {
			System.out.println("Error : 회원정보가 존재하지 않습니다. : " + memberId);
		}
	}
	
	// 전체회원 조회
	public ArrayList getMember() {
		
		ArrayList tmp = new ArrayList();
		for (int index = 0; index < members.size(); index++) {
			tmp.add(index, members.get(index));
		}
		
		return tmp;
	}
}









