package Claseobjeto;

public class Rectangulo implements Cloneable {
    private int ancho = 0, alto = 0;
    private String nombre;
    
    public Object clone() {
        Object objeto = null;
        try {
            objeto = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clonado no soportado");
        }
        return objeto;
    }

    Rectangulo (int anc, int alt){
        ancho = anc;
        this.alto = alt;
    }

    public int getAncho() {
        return this.ancho;
    }
    public int getAlto() {
        return alto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public int incrementaAnacho(){
        ancho++; return this.ancho;
    }
    public Rectangulo incrementarAlto(){
        alto++; return this;
    }

    public static void main(String [] args){
        Rectangulo r = new Rectangulo(2,5);
        Rectangulo r2 = (Rectangulo)r.clone();
        r.incrementaAnacho();
        r.incrementarAlto();
        r.setNombre("Chiquita");
        r2.setNombre("Grande");
        System.out.println("Ancho " + r.getAncho());
        System.out.println("Alto " + r.getAlto());
        System.out.println("Alto " + r2.getAlto());
        System.out.println("Ancho " + r2.getAncho());
        System.out.println("Nombre " + r.getNombre());
        System.out.println("Nombre " + r2.getNombre());
        System.out.println(r.toString());
        System.out.println(r2.toString());

    }
}






