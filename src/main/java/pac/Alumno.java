package pac;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Alumno implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
    private String nombre;
    private String nacionalidad;
    private int edad;
    private String sexo;
    Set<Modulo> modulos = new HashSet<>();

    

    public Alumno(Long id, String nombre, String nacionalidad, int edad, String sexo, Set<Modulo> modulos) {
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.sexo = sexo; 
		this.modulos = modulos;
	}

	public Alumno() {
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Set<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(Set<Modulo> modulos) {
        this.modulos = modulos;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", modulos=" + modulos +
                '}';
    }
}
