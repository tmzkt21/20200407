package com.jse.member;

public class MemberServiceImpl implements MemberService {

	private Member[] members;

	private int count;

	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}

	@Override
	public Member[] list() {
		return members;
	}

	@Override
	public Member[] searchByname(String name) {
		Member[] returnsearchByname = null;
		int searchcount = count(name);
		if (searchcount != 0) {
			returnsearchByname = new Member[searchcount];// 왜안안돌아가누
		}
		for (int i = 0; i < count; i++) {
			int j = 0;
			if(name.equals(members[i].getName())) {
				returnsearchByname[j] = members[i];
				j++;
				if(searchcount == j) {
					break;
				}
				
			}
		}
		
		return returnsearchByname;
	}

	@Override
	public Member[] searchBygender(String name) {
		return members;
	}

	@Override
	public Member detail(String userid) {
		Member returndetail = new Member();
		for (int i = 0; i < count; i++) {
			if(userid.equals(members[i].getUserid())) {
				returndetail = members[i];
				
			}
		}
		return returndetail;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public int count(String name) {
		int returncount = 0;
		for (int i = 0; i < count; i++) {
			if(name.equals(members[i].getName())) {
				returncount++;
			}
		}
		return returncount;
	}

	@Override
	public Member login(Member member) {
		Member returnlogin = null;
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid()) &&
					member.getPasswd().equals(members[i].getPasswd())) {
				returnlogin = members[i];
				break;
			}
		}
		return returnlogin;
	}

	@Override
	public void update(Member member) {
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())) {
				members[i].setPasswd(member.getPasswd());
			}
					
			break;
		}
	}

	@Override
	public void delete(Member member) {
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid()) && 
					member.getPasswd().equals(members[i].getPasswd())) {
				members[i] = members[count-1];
				members[count-1] = null;
				count--;
			}
		}
	}



	

}