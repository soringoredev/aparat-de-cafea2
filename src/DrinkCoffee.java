public class DrinkCoffee {
    void drinkCoffee(Coffee coffee) throws TemperatureException, ConcentrationException {
        if(coffee.getTemp() > 65) {
            System.out.println("Temperatura: " + coffee.getTemp());
            throw new TemperatureException(coffee.getTemp(), "Cafea fierbinte");
        } else {
            System.out.println("Temperatura e buna. A trecut testul.");
            System.out.println("Temperatura: " + coffee.getTemp());
        }

        if(coffee.getConc() > 55) {
            System.out.println("Concentratia: " + coffee.getConc());
            throw new ConcentrationException(coffee.getConc(), "Cafea prea concentrata");
        } else {
            System.out.println("Concentratia e buna. A trecut testul.");
            System.out.println("Concentratia: " + coffee.getConc());
        }

    }
}
