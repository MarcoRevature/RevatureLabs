package setUp;

import java.util.ArrayList;	

public class Group {
	//private String[] members = new String[5];
	
	public ArrayList<Member> member = new ArrayList<Member>();
	
	public Member getMember(int index) {
		return member.get(index);	
	}
	
	public void setMember(int index, Member person) {
		member.add(index,person);
	}
	
	public void printGroup() {
		for(Member m : member) {
			if(m!=null)	System.out.println(m.toString());
		}
	}
	
	public void setEvent(int index) {
		member[index].setEvent();
	}
	
}
