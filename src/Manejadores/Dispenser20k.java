package Manejadores;

public class Dispenser20k implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler next) {
        this.next = next;
    }

    @Override
    public void dispense(int amount) {
        if (amount >= 20000) {
            int num = amount / 20000;
            int resto = amount % 20000;
            System.out.println("Entregar " + num + " billete(s) de 20000");
            if (resto > 0 && next != null) {
                next.dispense(resto);
            }
        } else if (next != null) {
            next.dispense(amount);
        }
    }
}
