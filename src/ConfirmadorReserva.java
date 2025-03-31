public class ConfirmadorReserva {
    public void enviarConfirmacion(String nombre, String tipoHabitacion, int dias, double precio) {
        System.out.println("\n--- Confirmación de Reserva ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Habitación: " + tipoHabitacion);
        System.out.println("Días: " + dias);
        System.out.println("Precio total: $" + precio);
        System.out.println("Reserva confirmada. ¡Gracias por su preferencia!");
    }
}