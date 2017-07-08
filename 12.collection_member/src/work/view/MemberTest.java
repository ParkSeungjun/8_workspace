package work.view;


import work.model.dto.AdminMember;
import work.model.dto.GeneralMember;
import work.model.dto.Member;
import work.model.dto.SpecialMember;
import work.model.service.MemberService;

/**
 * 
 */

/**
 * <pre>
 * 회원관리시스템 시작(테스트) 클래스
 * </pre>
 * 
 * @author 임경혜
 * @version ver.1.0
 * @since jdk1.4
 */
public class MemberTest {
	/**
	 * 시작메서드
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n### 회원관리시스템 초기화 생성");
		GeneralMember dto1 = new GeneralMember("user01", "password01", "홍길동", "010-1234-1111", "user01@work.com", "2017/05/10", 'G', 1000);
		GeneralMember dto2 = new GeneralMember("user02", "password02", "강감찬", "010-1234-1112", "user01@work.com", "2017/05/10", 'G', 2000);
		GeneralMember dto3 = new GeneralMember("user03", "password03", "이순신", "010-1234-1113", "user01@work.com", "2017/05/10", 'G', 3000);
		SpecialMember dto4 = new SpecialMember("suser01", "password01", "유관순", "010-1111-1111", "suser01@work.com", "2017/05/10", 'S', "송중기");
		SpecialMember dto5 = new SpecialMember("suser02", "password02", "김유신", "010-1111-1112", "suser01@work.com", "2017/05/10", 'A', "송혜교");
		AdminMember dto6 = new AdminMember("auser01", "password01", "박재형", "010-1234-1111", "auser01@work.com", "2017/05/10", 'A', "과장");
		
		// 회원관리기능(crud)을 사용하기위한 서비스 객체 생성
		MemberService service = new MemberService();
		
		System.out.println("\n### 회원등록");
		service.addMember(dto1);
		service.addMember(dto2);
		service.addMember(dto3);
		service.addMember(dto4);
		service.addMember(dto5);
		service.addMember(dto6);
		
		int count = service.getCount();
		System.out.println("\n### 현재 등록인원수 : " + count);
		
		System.out.println("\n### 회원전체조회");
		Member[] members = service.getMember();
		for (int index = 0; index < members.length; index++) {
			System.out.println(members[index]);
		}
		
		System.out.println("\n### 회원조회 : user01");
		Member dto = service.getMember("user01");
		if (dto != null) {
			System.out.println(dto);
		}
		
		System.out.println("\n### 미존재 회원조회 : user99");
		dto = service.getMember("user99");

		System.out.println("\n### 회원변경 : user01");
		dto = new GeneralMember("user01", "bluesky", "홍수현", "010-1234-3333", "hong@work.com", "2017/05/10", 'G', 15000);
		dto = service.updateMember(dto);
		System.out.println("\n## 회원변경전 정보 : user01");
		System.out.println(dto);
		
		System.out.println("\n## 회원변경후 정보 : user01");	
		dto = service.getMember("user01");
		System.out.println(dto);
		
		System.out.println("\n## 회원암호 변경 : user02 password02 happyday");
		service.updateMemberPw("user02", "password02", "happyday");
		System.out.println("\n## 회원암호 변경후 조회 : user02");
		dto = service.getMember("user02");
		System.out.println(dto.getMemberId() + "님의 변경암호 : " + dto.getMemberPw());
		
		count = service.getCount();
		System.out.println("\n### 현재 등록인원수 : " + count);
		System.out.println("\n### 회원전체조회");
		members = service.getMember();
		for (int index = 0; index < members.length; index++) {
			System.out.println(members[index]);
		}
		
		System.out.println("\n## 회원탈퇴 : user03, suser01");
		service.deleteMember("user03");
		service.deleteMember("suser01");
		
		count = service.getCount();
		System.out.println("\n### 현재 등록인원수 : " + count);
		System.out.println("\n### 회원전체조회 : 회원탈퇴후");
		members = service.getMember();
		for (int index = 0; index < members.length; index++) {
			System.out.println(members[index]);
		}
	}

}

















