package org.jhonatan.app.Datos;

/**
 *
 * @author Jhonatan
 */
public class Habitacion {

    private int idHabitacion;
    private String numero;
    private String piso;
    private String caracteristicas;
    private double precioDiario;
    private String estado;
    private String tipoHabitacion;

    public Habitacion(int idHabitacion, String numero, String piso, String caracteristicas, double precioDiario, String estado, String tipoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.numero = numero;
        this.piso = piso;
        this.caracteristicas = caracteristicas;
        this.precioDiario = precioDiario;
        this.estado = estado;
        this.tipoHabitacion = tipoHabitacion;
    }

    public Habitacion() {
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getPrecioDiario() {
        return precioDiario;
    }

    public void setPrecioDiario(double precioDiario) {
        this.precioDiario = precioDiario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    
}