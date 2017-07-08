package work.model.service;

import work.model.dto.Member;
import java.util.ArrayList;

/**
 * ȸ�������� ���� ���(crud)�� �𵨸��� ���� Ŭ����
 * --�迭 �ڷ����屸�� => Collection(List) ���� ����
 * ## ���� ���� ���
 * -- encapsulation
 * -- array
 * -- constuctor �ߺ�����
 * -- polymorphism ������ : ȸ��Ÿ���� �迭(�θ�Ÿ��)
 * 
 * @author cse
 *
 */
public class MemberServiceArray {
	/** ������ : ȸ��(�Ϲ�,���,������) ��ü���� �����ϱ����� �ڷ� ���屸�� */
	
	private ArrayList<Member> members = new ArrayList<Member>();
	
	
	/** ��� ȸ���� ��ȸ �޼��� */
	public int getCount() {
		return members.size();
	}
	
	// �Ű����� ������ : ȸ�� ��ϱ��(�θ�Ÿ��) : �Ϲ�, ���, ������
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
	
	// ��������ȸ(ȸ�����̵�) : ȸ��(�θ�) ��ȯŸ�� ������
	/*
	 * 1. ��ϵ� ȸ���� ��ŭ �ݺ��ϸ鼭
	 * 2. �ƱԸ�Ʈ�� ���޹��� ���̵�� �迭��Ұ�ü�� ���̵� ������ ���ؼ� : equals(Object)
	 * 3. ���̵� ������ ���� �ε�����ü�� ��ȸ��ü�̹Ƿ� ��ȯ
	 * 4. for ������ �ݺ��� ���ߴµ��� return ���� �ʾҴٸ� �ش���̵� �������������Ƿ�
	 *    �����޼��� ����ϰ�
	 *    return null
	 */
	public Member getMember(String memberId) {
		int index = isExist(memberId);
		if(index >= 0) {			
				return members.get(index); 
			}
		System.out.println("Error : ȸ�������� �������� �ʽ��ϴ�. : " + memberId);
		return null;
		}
			
	
	// ����������
	/**
	 * ����������
	 * @param dto ���� ȸ����ü ����
	 * @return ������ ȸ����ü ����
	 */
	public Member updateMember(Member dto) {
		int index = isExist(dto.getMemberId());
		if(index >= 0) {
			Member tmp = members.get(index);
			members.set(index, dto);
			return tmp;
		}
		System.out.println("Error : ȸ�������� �������� �ʽ��ϴ�. : " + dto.getMemberId());
		return null; 
	}
	
	// ��ȣ����
	public void updateMemberPw(String memberId, String memberPw, String modifyMemberPw) {
		int index = isExist(memberId);
		Member tmp = new Member();
		tmp.setMemberId(memberId);
		tmp.setMemberPw(modifyMemberPw);
		
		if (isExist(memberId) >= 0 && memberPw.equals(members.get(index))) { 
			members.set(index, tmp);
			return;
		}
		System.out.println("Error : ȸ�������� �������� �ʽ��ϴ�. : " + memberId);
	}
	

	// ȸ��Ż��
	public void deleteMember(String memberId) {
		int index = isExist(memberId);
		if(index >= 0) {	
			members.remove(index);
			return;
		} else {
			System.out.println("Error : ȸ�������� �������� �ʽ��ϴ�. : " + memberId);
		}
	}
	
	// ��üȸ�� ��ȸ
	public ArrayList getMember() {
		
		ArrayList tmp = new ArrayList();
		for (int index = 0; index < members.size(); index++) {
			tmp.add(index, members.get(index));
		}
		
		return tmp;
	}
}









