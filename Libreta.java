public class Libreta
{
    //Atributos 
    protected int numeroHojasTotales;
    protected int numeroHojasLimpias;
    protected int numeroHojasUtilizadas;

    //Métodos
    public Libreta(int hojasTotales, int hojasLimpias, int hojasUtilizadas)
    {
        numeroHojasTotales = hojasTotales;
        numeroHojasLimpias = hojasLimpias;
        numeroHojasUtilizadas = hojasUtilizadas;
    }

    public void cantidadHojas()
    {
        if(numeroHojasTotales < 10 || numeroHojasTotales >150)
        {
            numeroHojasTotales = 50;
        }
    }

    public String toString()
    {
        return "El número total de hojas de la libreta es: " + numeroHojasTotales;
    }

}