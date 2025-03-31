public class FachadaReservaHotel {
    private VerificadorDisponibilidad disponibilidad;
    private SistemaPrecios precios;
    private ConfirmadorReserva confirmacion;

    public FachadaReservaHotel() {
        this.disponibilidad = new VerificadorDisponibilidad();
        this.precios = new SistemaPrecios();
        this.confirmacion = new ConfirmadorReserva();
    }

    public void reservarHabitacion(String nombre, String tipoHabitacion, int dias) {
        if (!disponibilidad.estaDisponible(tipoHabitacion, dias)) {
            System.out.println("Lo sentimos, no hay disponibilidad.");
            return;
        }

        double precio = precios.calcularPrecio(tipoHabitacion, dias);
        confirmacion.enviarConfirmacion(nombre, tipoHabitacion, dias, precio);
    }
}