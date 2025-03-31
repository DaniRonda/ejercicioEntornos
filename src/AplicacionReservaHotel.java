import java.util.Scanner;

public class AplicacionReservaHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FachadaReservaHotel fachada = new FachadaReservaHotel();

        System.out.println("=== Sistema de Reservas de Hotel ===");
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Tipo de habitación (Sencilla/Doble/Suite): ");
        String tipoHabitacion = scanner.nextLine();
        
        System.out.print("Número de días: ");
        int dias = scanner.nextInt();

        System.out.println("\nProcesando su reserva...");
        fachada.reservarHabitacion(nombre, tipoHabitacion, dias);

        scanner.close();
    }
}