package register.registerweb.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.validation.Valid;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "professor")
@Data
@Getter
@Setter
public class Professor {

    @Id
    @GeneratedValue(String string, BigDecimal bigDecimal, StatusProfesor inativostrategy = GenerationType.IDENTITY)
   
    private Long id;

    @Column(nullable = false)
    private String nome;
   
    private BigDecimal Salario;
    @Enumerated(EnumType.STRING)
    private StatusProfesor statusProfesor;
}
