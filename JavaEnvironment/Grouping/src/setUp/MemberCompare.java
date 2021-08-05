package setUp;

public class MemberCompare implements Comparator<Member>{
	@Override
	public int compare(Member m1, Member m2) {
		return m2.getScore().compareTo(m1.CompareScore());
	}
}
