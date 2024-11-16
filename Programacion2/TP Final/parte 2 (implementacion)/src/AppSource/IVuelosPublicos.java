package AppSource;

public interface IVuelosPublicos {

    public void obtenerAsientosDisponibles();
    
    public Seccion getSeccion(int numeroDeseccion);
    
    public double getValorDelPasaje(int numeroDeSeccion);
    
}
