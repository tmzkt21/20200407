package com.jse.member;

public class MemberServiceImpl implements MemberService {
	
	private Member[] members;
	private int count;
	
	public MemberServiceImpl() {
		members = new Member[5]; 
		count = 0;
	}
	
	
	@Override
	public void setMember(Member[] members) {
		
		this.members = members;
	}
	@Override
	public Member[] getMember() {
		
		return members;
	}
	@Override
	public void setCount(int count) {
		
		
	}
	@Override
	public int getCount() {
		
		return 0;
	}
	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}
	@Override
	public Member login(Member member) {
		Member returnMember = null;
		for (int i = 0; i < members.length; i++) {
			if (member.getUserid().equals(members[i].getUserid()) &&
					member.getPasswd().equals(members[i].getPasswd())) {
				returnMember = new Member();
				returnMember = members[i];
				break;
				
			}
		}
	
		return returnMember;
	}
	
	

	

}
