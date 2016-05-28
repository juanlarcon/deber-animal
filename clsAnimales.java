/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author Pc01
 */
public class clsAnimales {

   
   public enum tipo {vertebrados,invertebrados};
    public enum clasificacion {oviparo,mamifero};
    private int _id;
    private String _nombre;
    private float _peso;
    private tipo  _tipo; 
    private clasificacion  _clasificacion;
    
    public clsAnimales() {
    }

    public clsAnimales(int _id, String _nombre, float _peso, tipo _tipo, clasificacion _clasificacion) {
        this._id = _id;
        this._nombre = _nombre;
        this._peso = _peso;
        this._tipo = _tipo;
        this._clasificacion = _clasificacion;
    }

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public float Peso() {
        return _peso;
    }

    public void Peso(float _peso) {
        this._peso = _peso;
    }

    public tipo Tipo() {
        return _tipo;
    }

    public void Tipo(tipo _tipo) {
        this._tipo = _tipo;
    }

    public clasificacion Clasificacion() {
        return _clasificacion;
    }

    public void Clasificacion(clasificacion _clasificacion) {
        this._clasificacion = _clasificacion;
    }

  
    
}