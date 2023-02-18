package POO_Intermedio;

public class ConsolaVideojuego {

    // !atributos

    private String marca;
    private double espacioAlmacenamiento;
    private String tipoProcesador;
    private String color;

    // !constructores

    // *constructor por defecto.- inicializa todas mis variables a su valor por
    // defecto
    public ConsolaVideojuego() {

        this.marca = "";
        this.espacioAlmacenamiento = 0.0;
        this.tipoProcesador = "";
        this.color = "";
    }

    public ConsolaVideojuego(String marca, double espacioAlmacenamiento, String tipoProcesador, String color) {
        this.marca = marca;
        this.espacioAlmacenamiento = espacioAlmacenamiento;
        this.tipoProcesador = tipoProcesador;
        this.color = color;

    }

    // !metodos

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getEspacioAlmacenamiento() {
        return espacioAlmacenamiento;
    }

    public void setEspacioAlmacenamiento(double espacioAlmacenamiento) {
        this.espacioAlmacenamiento = espacioAlmacenamiento;
    }

    public String getTipoProcesador() {
        return tipoProcesador;
    }

    public void setTipoProcesador(String tipoProcesador) {
        this.tipoProcesador = tipoProcesador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public String mostrarInfo(){
        return "Marca: "+this.marca+"\n"+
                "Espacio Almacenamiento: "+this.espacioAlmacenamiento+"\n"+
                "Tipo Procesador: "+this.tipoProcesador+"\n"+
                "Color: "+this.color;
    }
  


}
