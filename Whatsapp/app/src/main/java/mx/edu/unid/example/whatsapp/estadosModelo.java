package mx.edu.unid.example.whatsapp;

public class estadosModelo {

    private String contacto,mensaje;
    private int imgContacto;

    public estadosModelo() {
    }

    public estadosModelo(String contacto, String mensaje, int imgContacto) {
        this.contacto = contacto;
        this.mensaje = mensaje;
        this.imgContacto = imgContacto;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getImgContacto() {
        return imgContacto;
    }

    public void setImgContacto(int imgContacto) {
        this.imgContacto = imgContacto;
    }
}
