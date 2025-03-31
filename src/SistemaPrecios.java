public class SistemaPrecios {
    public double calcularPrecio(String tipoHabitacion, int dias) {
        System.out.println("Calculando precio...");
        double precioBase = 0;
        
        switch(tipoHabitacion.toLowerCase()) {
            case "sencilla":
                precioBase = 50;
                break;
            case "doble":
                precioBase = 80;
                break;
            case "suite":
                precioBase = 120;
                break;
            default:
                precioBase = 60;
        }
        
        return precioBase * dias;
    }
}