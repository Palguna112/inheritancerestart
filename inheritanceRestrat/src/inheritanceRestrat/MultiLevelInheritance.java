package inheritanceRestrat;
class GrandParent{
	float height=5.7f;
	void excercise() {
		System.out.println("I will excercise Daily");
	}
}
class Parent1 extends GrandParent{
	
}
class Child1 extends Parent1{
	
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Parent1 p1=new Parent1();
		Child1 c1=new Child1();
		System.out.println(p1.height);
		p1.excercise();
		System.out.println(c1.height);
		c1.excercise();
	}

}
