package testdatatypes;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    private String nombre;
    private String apellido;
    private String dni;
    private DomicilioDeFacturaccion domicilioFacturaccion;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    }

    public DomicilioDeFacturaccion getDomicilioDeFacturaccion() {
        return domicilioFacturaccion;
    }

    public void setDomicilioFacturaccion(DomicilioDeFacturaccion domicilioDeFacturaccion) {
        this.domicilioFacturaccion = domicilioDeFacturaccion;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}