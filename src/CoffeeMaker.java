public class CoffeeMaker {
    Coffee makeCoffee() {
        System.out.println("Aparatul de cafea s-a pornit");
        int t = (int) (Math.random() * 100);  // 70
        int c = (int) (Math.random() * 100); //   0.87   - 87
        Coffee coffee = new Coffee(t, c);

        return coffee;

    }
}
