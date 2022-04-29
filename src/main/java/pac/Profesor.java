package pac;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

public class Profesor implements Serializable {

    Long id;
    String nombre;
    String sexo;

    public Profesor(Long id, String nombre, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Profesor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}