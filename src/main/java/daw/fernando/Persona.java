package daw.fernando;

public class Persona {

    //ATRIBUTOS
    private String Nombre;
    private int Edad;

    //CONSTRUCTORES
    public Persona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public Persona() {
    }

    //METODOS SETTERS Y GETTERS
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    //METODO TO STRING
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + '}';
    }

    //Metodo que llama al animal y lo despierta
    public void llamar(Animal pet) {

        pet.despertar();

    }

    //Metodo que llama al metodo comer de clase 
    public void alimentar(Animal pet, double cantidadGramos) {

        pet.comer(cantidadGramos);
    }

    //METODO PARA JUGAR CON UN ANIMAL X MINUTOS 
    public void jugar(Animal pet, int cantidadMinutos) {

        try {

            pet.jugar(cantidadMinutos);

        } catch (IllegalArgumentException iae) {
            
            cantidadMinutos = 180;

        }
    }

}
