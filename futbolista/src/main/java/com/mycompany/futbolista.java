
package com.mycompany;

/**
 *
 * @author PEREIRA
 */
public class futbolista {
        private  int  edad ;
        
        public String nombre ;
    
        private String equipoActual;
    
    public futbolista (String nombre, String eddad, String equipoActual){
        this.nombre=nombre;
            }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setequipoActual(String equipoActual){
        this.equipoActual=equipoActual;
    }
    public String getequipoActual(){
        return equipoActual;
        
    }

    public void imprimirnombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
