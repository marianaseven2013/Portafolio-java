package Colegio;

public class Estudiantes {
    private String Nombre;
    private String correo;
    private String Carrera;
    private String Edad;
    private boolean Solvencia;

    public Estudiantes (String Nombre, String correo, String Carrera, String Edad, boolean Solvencia){
        this.Nombre = Nombre ;
        this.correo = correo;
        this.Carrera = Carrera;
        this.Edad = Edad;
        this.Solvencia = Solvencia;

    }
    public String getNombre(){return Nombre;}

    public String getCorreo(){return correo;}

    public String getCarrera(){return Carrera;}

    public String getEdad(){return Edad;}

    public boolean getSolvencia(){return Solvencia;}

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public void setSolvencia(boolean Solvencia) {
        this.Solvencia = Solvencia;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Correo: " + correo + ", Carrera: " + Carrera + ", Edad: " + Edad + ", Solvencia: " + Solvencia;
    }
    public String atoString() {
        return "Nombre: " + Nombre + ", Correo: " + correo + ", Carrera: " + Carrera + ", Edad: " + Edad + ", Solvencia: " + Solvencia;
    }
    public String btoString() {
        return "Nombre: " + Nombre + ", Correo: " + correo + ", Carrera: " + Carrera + ", Edad: " + Edad + ", Solvencia: " + Solvencia;
    }
    public String jtoString() {
        return "Nombre: " + Nombre + ", Correo: " + correo + ", Carrera: " + Carrera + ", Edad: " + Edad + ", Solvencia: " + Solvencia;
    }
    public String ytoString() {
        return "Nombre: " + Nombre + ", Correo: " + correo + ", Carrera: " + Carrera + ", Edad: " + Edad + ", Solvencia: " + Solvencia;
    }

}
