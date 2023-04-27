import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name = "tbl_Citas")



public class Citas  {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
    @Column(name="id_citas")
    private Long idCitas;
    @Column(name="num_cita")
    private Long numero;
    @Column(name="fecha_cita")
    private Date fecha;
    @Column(name="nombre_paciente_cita")
    private String paciente;
    @Column(name="id_doctor")
    private Long idDoctor;
	public Long getIdCitas() {
		return idCitas;
	}
	public void setIdCitas(Long idCitas) {
		this.idCitas = idCitas;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	public Long getIdDoctor() {
		return idDoctor;
	}
	public void setIdDoctor(Long idDoctor) {
		this.idDoctor = idDoctor;
	}
    
	
	
	

	
}
