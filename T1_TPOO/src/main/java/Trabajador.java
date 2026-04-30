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
    private String tipoDoc;
    private String numDoc;
    private String regimen;
    private String pension;
    private double sueldoBase;
    private boolean tieneHijos;
    private boolean esNocturno;
    
    public Trabajador(String nombre, String tipoDoc, String numDoc, String regimen, String pension, double sueldoBase, boolean tieneHijos, boolean esNocturno) {
        this.nombre = nombre;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.regimen = regimen;
        this.pension = pension;
        this.sueldoBase = sueldoBase;
        this.tieneHijos = tieneHijos;
        this.esNocturno = esNocturno;
    }
   
    private void validarDocumento() throws Exception {
        if (tipoDoc.equalsIgnoreCase("DNI") && numDoc.length() != 8) {
            throw new Exception("DNI debe tener 8 dígitos");
        }
        if (tipoDoc.equalsIgnoreCase("CE") && numDoc.length() != 11) {
            throw new Exception("CE debe tener 11 dígitos");
        }
    }
    
  
}
