package org.diegohuapaya.retobackend.models.entity;


import org.hibernate.annotations.NotFound;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoUnico")
    private Long codigoUnico;

    @Column(name = "nombres")
    @Nullable
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "tipoDocumento")
    private String tipoDocumento;

    @Column(name = "numeroDocumento")
    private String numeroDocumento;


    public Client( String nombres, String apellidos, String tipoDocumento, String numeroDocumento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public Client() {
    }

    public Long getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(Long codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
}
