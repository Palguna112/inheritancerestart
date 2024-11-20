package inheritanceRestrat;
class Parent{
	float height=5.7f;
	void noAlcohol() {
		System.out.println("I will not drink");
	}
}
class Child extends Parent{
	
}
public class singleLevelInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.height);
		c.noAlcohol();
	}

}
