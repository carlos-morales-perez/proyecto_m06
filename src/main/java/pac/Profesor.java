package pac;

import java.io.Serializable;

public class Profesor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    private Long id;
    private String nombre;
    private String sexo;

    public Profesor(String nombre, String sexo) {
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
