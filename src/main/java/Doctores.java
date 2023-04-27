import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Doctores")


public class Doctores {
	
private static final long serialVersionUID = 1L;
	
	
	@Id
    @Column(name="id_doctor")
    private Long idDoctor;
    @Column(name="monbre_doctor")
    private String nombre;
    @Column(name="especialidad_doctor")
    private Long especialidad;
	public Long getIdDoctor() {
		return idDoctor;
	}
	public void setIdDoctor(Long idDoctor) {
		this.idDoctor = idDoctor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Long especialidad) {
		this.especialidad = especialidad;
	}
   
    
    
    
    
	}


