package Manejadores;

public class Dispenser50k implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler next) {
        this.next = next;
    }

    @Override
    public void dispense(int amount) {
        if (amount >= 50000) {
            int num = amount / 50000;
            int resto = amount % 50000;
            System.out.println("Entregar " + num + " billete(s) de 50000");
            if (resto > 0 && next != null) {
                next.dispense(resto);
            }
        } else if (next != null) {
            next.dispense(amount);
        }
    }
}
