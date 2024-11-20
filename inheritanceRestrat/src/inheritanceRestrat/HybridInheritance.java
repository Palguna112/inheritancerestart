package inheritanceRestrat;
class GrandParent1{
	float height=5.7f;
	void drinkingMoreWater() {
		System.out.println("I will drink 4 liters of water daily");
	}
}
class Parent2 extends GrandParent1{
	
}
class Child01 extends Parent2{
	
}
class Child02 extends  Parent2{
	
}
class Child03 extends Parent2{
	
}
public class HybridInheritance {

	public static void main(String[] args) {
		Parent2 p2=new Parent2();
		Child01 c01=new Child01();
		Child02 c02=new Child02();
		Child03 c03=new Child03();
		System.out.println(p2.height);
		p2.drinkingMoreWater();
		System.out.println(".......................................");
		System.out.println(c01.height);
		c01.drinkingMoreWater();
		System.out.println(".......................................");
		System.out.println(c02.height);
		c02.drinkingMoreWater();System.out.println(".......................................");
		System.out.println(c03.height);
		c03.drinkingMoreWater();

	}

}
