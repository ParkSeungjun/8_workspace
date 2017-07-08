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
 * ȸ�������ý��� ����(�׽�Ʈ) Ŭ����
 * </pre>
 * 
 * @author �Ӱ���
 * @version ver.1.0
 * @since jdk1.4
 */
public class MemberTest {
	/**
	 * ���۸޼���
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n### ȸ�������ý��� �ʱ�ȭ ����");
		GeneralMember dto1 = new GeneralMember("user01", "password01", "ȫ�浿", "010-1234-1111", "user01@work.com", "2017/05/10", 'G', 1000);
		GeneralMember dto2 = new GeneralMember("user02", "password02", "������", "010-1234-1112", "user01@work.com", "2017/05/10", 'G', 2000);
		GeneralMember dto3 = new GeneralMember("user03", "password03", "�̼���", "010-1234-1113", "user01@work.com", "2017/05/10", 'G', 3000);
		SpecialMember dto4 = new SpecialMember("suser01", "password01", "������", "010-1111-1111", "suser01@work.com", "2017/05/10", 'S', "���߱�");
		SpecialMember dto5 = new SpecialMember("suser02", "password02", "������", "010-1111-1112", "suser01@work.com", "2017/05/10", 'A', "������");
		AdminMember dto6 = new AdminMember("auser01", "password01", "������", "010-1234-1111", "auser01@work.com", "2017/05/10", 'A', "����");
		
		// ȸ���������(crud)�� ����ϱ����� ���� ��ü ����
		MemberService service = new MemberService();
		
		System.out.println("\n### ȸ�����");
		service.addMember(dto1);
		service.addMember(dto2);
		service.addMember(dto3);
		service.addMember(dto4);
		service.addMember(dto5);
		service.addMember(dto6);
		
		int count = service.getCount();
		System.out.println("\n### ���� ����ο��� : " + count);
		
		System.out.println("\n### ȸ����ü��ȸ");
		Member[] members = service.getMember();
		for (int index = 0; index < members.length; index++) {
			System.out.println(members[index]);
		}
		
		System.out.println("\n### ȸ����ȸ : user01");
		Member dto = service.getMember("user01");
		if (dto != null) {
			System.out.println(dto);
		}
		
		System.out.println("\n### ������ ȸ����ȸ : user99");
		dto = service.getMember("user99");

		System.out.println("\n### ȸ������ : user01");
		dto = new GeneralMember("user01", "bluesky", "ȫ����", "010-1234-3333", "hong@work.com", "2017/05/10", 'G', 15000);
		dto = service.updateMember(dto);
		System.out.println("\n## ȸ�������� ���� : user01");
		System.out.println(dto);
		
		System.out.println("\n## ȸ�������� ���� : user01");	
		dto = service.getMember("user01");
		System.out.println(dto);
		
		System.out.println("\n## ȸ����ȣ ���� : user02 password02 happyday");
		service.updateMemberPw("user02", "password02", "happyday");
		System.out.println("\n## ȸ����ȣ ������ ��ȸ : user02");
		dto = service.getMember("user02");
		System.out.println(dto.getMemberId() + "���� �����ȣ : " + dto.getMemberPw());
		
		count = service.getCount();
		System.out.println("\n### ���� ����ο��� : " + count);
		System.out.println("\n### ȸ����ü��ȸ");
		members = service.getMember();
		for (int index = 0; index < members.length; index++) {
			System.out.println(members[index]);
		}
		
		System.out.println("\n## ȸ��Ż�� : user03, suser01");
		service.deleteMember("user03");
		service.deleteMember("suser01");
		
		count = service.getCount();
		System.out.println("\n### ���� ����ο��� : " + count);
		System.out.println("\n### ȸ����ü��ȸ : ȸ��Ż����");
		members = service.getMember();
		for (int index = 0; index < members.length; index++) {
			System.out.println(members[index]);
		}
	}

}

















