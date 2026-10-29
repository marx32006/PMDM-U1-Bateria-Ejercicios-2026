// Ej11 · Alumno.java · La versión en Java. NO hay que ejecutarla: compárala con tu Kotlin.
import java.util.Objects;

public class Alumno {
    private final String nombre;
    private final double nota;
    private final String email;   // puede ser null si no lo ha dado

    public Alumno(String nombre, double nota, String email) {
        this.nombre = nombre;
        this.nota = nota;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public double getNota() { return nota; }
    public String getEmail() { return email; }

    public boolean aprobado() {
        return nota >= 5;
    }

    public String emailOFalta() {
        if (email == null) {
            return "(sin email)";
        }
        return email;
    }

    public Alumno conNota(double nuevaNota) {
        return new Alumno(nombre, nuevaNota, email);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno a = (Alumno) o;
        return Double.compare(a.nota, nota) == 0
                && nombre.equals(a.nombre)
                && Objects.equals(email, a.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota, email);
    }

    @Override
    public String toString() {
        return "Alumno(nombre=" + nombre + ", nota=" + nota + ", email=" + email + ")";
    }
}
