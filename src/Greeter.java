
public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();

		Greeting lambdaGreeting = () -> System.out.print("Hello lalan");

		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.print("Hello chandan");
			}
		};

		innerClassGreeting.perform();
		lambdaGreeting.perform();

		greeter.greet(() -> System.out.println("Hello world!"));
		greeter.greet(innerClassGreeting);

	}

}
