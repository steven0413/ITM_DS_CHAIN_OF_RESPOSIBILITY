import Manejadores.Dispenser100k;
import Manejadores.Dispenser10k;
import Manejadores.Dispenser20k;
import Manejadores.Dispenser50k;
import Manejadores.Dispenser5k;
import Manejadores.IHandler;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 1. Crear instancias
        IHandler dispenser100k = new Dispenser100k();
        IHandler dispenser50k  = new Dispenser50k();
        IHandler dispenser20k  = new Dispenser20k();
        IHandler dispenser10k  = new Dispenser10k();
        IHandler dispenser5k   = new Dispenser5k();

        // 2. Construir cadena
        dispenser100k.setNext(dispenser50k);
        dispenser50k.setNext(dispenser20k);
        dispenser20k.setNext(dispenser10k);
        dispenser10k.setNext(dispenser5k);

        // 3. Entrada dinámica desde el usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad a retirar: ");
        int cantidadSolicitada = sc.nextInt();
        sc.close();

        // 4. Validación y procesamiento
        if (cantidadSolicitada % 5000 != 0) {
            System.out.println("❌ Error: La cantidad debe ser múltiplo de 5.000.");
        } else if (cantidadSolicitada <= 0) {
            System.out.println("❌ Error: La cantidad debe ser mayor que 0.");
        } else {
            System.out.println("\nProcesando retiro de $" + cantidadSolicitada);
            dispenser100k.dispense(cantidadSolicitada);
        }
    }
}