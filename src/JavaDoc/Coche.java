package JavaDoc;
/*Esto es un comentario
 * de varias lines de java el siguiente es de javadoc
 * incluso se puede meter etiquetas html en la definicion de la clase*/
/**
 * La clase coche define un tipo de vehiculo.
 * @author  CarlosBouzas
 * @version 2.1
 * @since 1.0
 * @param
 * @return
 *
 * @exception
 */
//esto son ejemplos de lo que se puede poner en un comentarios de javadoc
public class Coche {
    //Atributos: definen el estado del objeto
    /**
     * Almacena la matricula, debe ser del tipo NNNN-SS.
     */
    String matricula;

    int numRuedas;
    /**
     *
     */
    String marca;
    float kilometros;

    //Métodos: operaciones del objeto
    /**
     *Arranca el coche.
     *
     */
    void arracar(){
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Acelera el coche
     * @param intensidad Intesidad de la aceleracion.
     * @return 1 si lo ha conseguido acelerar; 0 si no se ha movido.
     */
    int acelerar(int intensidad){
        return 1;
    }

    public void arrancar() {
    }
}
