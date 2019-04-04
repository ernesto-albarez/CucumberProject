package testdatatypes;

import java.util.HashMap;
import java.util.Map;

public class DomicilioDeFacturaccion {

    private String nombreApellido;
    private String calle;
    private String numero;
    private String pisoDepartamento;
    private String codigoPostal;
    private String provincia;
    private String localidadBarrio;
    private String telefonoDeContacto;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPisoDepartamento() {
        return pisoDepartamento;
    }

    public void setPisoDepartamento(String pisoDepartamento) {
        this.pisoDepartamento = pisoDepartamento;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidadBarrio() {
        return localidadBarrio;
    }

    public void setLocalidadBarrio(String localidadBarrio) {
        this.localidadBarrio = localidadBarrio;
    }

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto; }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}