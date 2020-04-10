package com.jse.member;

public class MemberServiceImpe implements MemberService {

	private Member[] members;
	private int count;
	
	public MemberServiceImpe() {
		members = new Member[5];
		
	}
	
	
	public Member[] getMembers() {
		return members;
	}
	
	
	public void add(Member member) {
		members[count] = member;
		count++;
	}

	@Override
	public void setMember(Member[] members) {
		this.members = members;
		
	}
	
}
