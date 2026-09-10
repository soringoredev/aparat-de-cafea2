public class CoffeeTest {
    public static void main(String[] args) {
        CoffeeMaker mk = new CoffeeMaker();
        DrinkCoffee d = new DrinkCoffee();

        for (int i = 0; i < 3; i++) {
            Coffee coffee = mk.makeCoffee();
            System.out.println("------CAFEAUA NUMARUL " + (i + 1) + "--------");
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");

            try{
                d.drinkCoffee(coffee);
            } catch (TemperatureException e) {
                System.out.println("Temperatura prea mare. O aruncam!");
            } catch (ConcentrationException e) {
                System.out.println("Concentratie prea mare. O aruncam!");
            }
            finally {
                System.out.println("O zi buna!");
                System.out.println("");
            }

        }
    }
}
