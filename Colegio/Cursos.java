package Colegio;

public class Cursos {
    private String Nombre;
    private String Categoria;
    private String Periiodo;


    public Cursos(String Nombre, String Categoria, String Periiodo) {
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Periiodo = Periiodo;

    }

    public String getNombre() {
        return Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getPeriiodo() {
        return Periiodo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setPeriiodo(String Periiodo) {
        this.Periiodo = Periiodo;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Categoría: " + Categoria +  ", Periodo: " + Periiodo;
    }
    public String atoString() {
        return "Nombre: " + Nombre + ", Categoría: " + Categoria +  ", Periodo: " + Periiodo;
    }
    public String etoString() {
        return "Nombre: " + Nombre + ", Categoría: " + Categoria +  ", Periodo: " + Periiodo;
    }
    public String istoString() {
        return "Nombre: " + Nombre + ", Categoría: " + Categoria +  ", Periodo: " + Periiodo;
    }

}
