package org.example.proyectohospitalpost.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="pacientes")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_paciente", unique = true, nullable = false)
    private long id;

    @Column(name="nombre", nullable = false, length = 50)
    private String name;

    @Column(name="apellido", nullable = false, length = 50)
    private String surname;

    @Column(name="Dianostico", nullable = false, length = 50)
    private String dianostic;

    @Column(name="fecha_nacimiento", nullable = false)
    private LocalDate birthDate;

    @Column(name="email", nullable = false, unique = true)
    private String email;

    public Patient(String name, String surname, String dianostic, LocalDate birthDate, String email) {
        this.name = name;
        this.surname = surname;
        this.dianostic = dianostic;
        this.birthDate = birthDate;
        this.email = email;
    }
}
