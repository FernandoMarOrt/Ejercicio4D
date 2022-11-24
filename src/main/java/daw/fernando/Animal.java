package daw.fernando;

import clasesENum.EstadoAnimal;
import java.time.LocalDate;
import java.time.Month;

public class Animal {

    //ATRIBUTOS
    private LocalDate fechaNacimiento;
    private String nombre;
    private String tipo; //gato , perro , lagarto , cobaya , periquito
    private double peso; //en gramos
    private EstadoAnimal estado; //comiendo durmiendo despierto/reposo o jugando

    //CONSTRUCTORES 
    public Animal(LocalDate fechaNacimiento, String nombre, String tipo, double peso, EstadoAnimal estado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado;
    }

    public Animal() {
    }

    //METODOS SETTERS Y GETTERS
     public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    //Metodo que aumenta el peso del animal en funcion de la cantidad de gramos
    //de comida que coma
    public void comer(double cantidadGramos) {
        
        cantidadGramos = Math.abs(cantidadGramos);
        this.estado = EstadoAnimal.COMIENDO;
        this.peso = this.peso + cantidadGramos;

    }

    //Pone al animal a dormir
    public void dormir() {

        this.estado = this.estado.DURMIENDO;

    }

    //Despierta al animal
    public void despertar() {

       this.estado = this.estado.DESPIERTO;
    }

    //Pone el animal a reposar
    public void descansar() {

        this.estado = this.estado.DESPIERTO;

    }

    //METODO PARA JUGAR CON EL ANIMAL X MINUTOS
    public void jugar(int cantidadMinutos) {

        cantidadMinutos = Math.abs(cantidadMinutos);

        double gramosPerdidos;

        if (cantidadMinutos >= 30 && cantidadMinutos <= 180) {

            gramosPerdidos = cantidadMinutos / 30;

            this.peso = this.peso - (gramosPerdidos * 20);

        } else if (cantidadMinutos < 30) {

            this.peso = this.peso - 10;

        } else {
            //Si no se cumplen las condiciones anteriores lanzara la excepcion
            throw new IllegalArgumentException("Argumento Invalido"
                    + " el animal no puede jugar mas de 180 minutos");
        }

    }

    //Metodo para clonar a un animal 
    public static Animal clonar(Animal pet) {

        Animal clonar = new Animal();

        try {

            clonar.setNombre(pet.getNombre());
            clonar.setTipo(pet.getTipo());
            clonar.setEstado(pet.getEstado());
            clonar.setPeso(pet.getPeso());
            clonar.setFechaNacimiento(pet.getFechaNacimiento());

        } catch (NullPointerException npe) {
            //En caso de que la excepcion se de saltara el try catch y se
            //inicializara a este animal que he creado
            clonar = new Animal(LocalDate.of(2000,
                    Month.MARCH, 28), "Matilde",
                    "Lagarto", 1000.0, EstadoAnimal.DURMIENDO);
        }

        return clonar;

    }

    //Metodo to string
    @Override
    public String toString() {
        return "Animal{" + "FechaNacimiento=" + fechaNacimiento + ", nombre="
                + nombre + ", tipo=" + tipo + ", peso=" + peso + ", estado=" +
                estado + '}';
    }

    
   

}
