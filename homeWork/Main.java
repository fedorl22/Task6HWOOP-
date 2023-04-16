public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persister persist = new Persister(user);
		Report report = new Report();
		report.report(user);
		persist.save();
		User user1 = new User("Pop");
		System.out.println();
		Persister persist1 = new Persister(user1);
		Report report1 = new Report();
		report1.report(user1);
		persist1.save();
	}
}