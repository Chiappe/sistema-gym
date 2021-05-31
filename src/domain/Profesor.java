package domain;

public class Profesor extends Persona{

    private Disciplina disciplina;

    public Profesor(){
        super();
        disciplina = Disciplina.MUSCULACION;
    }

    public Profesor(String nombre, String apellido, int dni, char genero, int edad, int celular, Disciplina disciplina){
        super();
        this.disciplina = disciplina;
    }

    @Override
    public String toString(){
        return "Profesor[ " + super.toString() +
                ", disciplina: " + this.disciplina + "]";
    }

}