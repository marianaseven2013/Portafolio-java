package libros;

public class Libro {

    private String titulo;
    private String autor;
    private String fecha;

    public Libro (String titulo, String autor, String fecha){
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }
//public private state se aplican a variables y si yo le coloco private no se podra ver en otra clase
    //get ontener la información o extraer la información
    public String getTitulo(){return titulo;}

    public String getAutor(){return autor;}

    public String getFecha(){return fecha;}

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //ser es configuración o cambio de información, establecer valores en las propiedades de una clase.

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Fecha: " + fecha;
    }

    public String otoString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Fecha: " + fecha;
    }

    public String serString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Fecha: " + fecha;
    }
    public String seraString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Fecha: " + fecha;
    }
    public String sereString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Fecha: " + fecha;
    }
    public String siriString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Fecha: " + fecha;
    }
    public String soroString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Fecha: " + fecha;
    }
    public String suruString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Fecha: " + fecha;
    }
    public String saraString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Fecha: " + fecha;
    }
    public String otosString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Fecha: " + fecha;
    }
    public String rotoString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Fecha: " + fecha;
    }

}

