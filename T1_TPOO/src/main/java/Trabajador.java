/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UCC20305
 */
public class Trabajador {

    private String nombre;
    private String tipoDocumento;
    private String numeroDocumento;
    private String regimen;
    private String pension;
    private double sueldo;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
 
    
    public Trabajador(String nombre, String tipoDocumento, String numeroDocumento,
                      String regimen, String pension, double sueldo) throws Exception {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.regimen = regimen;
        this.pension = pension;
        this.sueldo = sueldo;

        validarDocumento();
    
 
    }
    private void validarDocumento() throws Exception {
        if (tipoDocumento.equalsIgnoreCase("DNI") && numeroDocumento.length() != 8) {
            throw new Exception("DNI debe tener 8 dígitos");
        }
        if (tipoDocumento.equalsIgnoreCase("CE") && numeroDocumento.length() != 11) {
            throw new Exception("CE debe tener 11 dígitos");
        }
    }

    
}

   

