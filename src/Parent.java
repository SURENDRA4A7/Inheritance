
public class Parent {
	void eat() {
		System.out.println("parent eats");
	}
	void sleep() {
		System.out.println("parent sleeps early");
	}
	void run() {
		System.out.println("parent runs");
	}
}
	class Child extends Parent{
		@Override
		void sleep() {
			System.out.println("child sleepss late");
		}
		void swims() {
			System.out.println("child swims");
		}
	}

