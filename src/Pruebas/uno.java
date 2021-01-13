package Pruebas;

public class uno {
    /**
     * @author CarlosBouzas
     * @version 1.0.0
     * @since 1.0
     *
     * @param no se que poner aqui
     * @return fgdf
     * @exception 4
     */
    private String nombre;
    private int edad;
    private int altura;


    //Uso this para saber que uno el el atributo
    //Y el otro el parámetro
    public void setNombre(String nombre){
        /**
         * aqui viene el nombre del alumno, un String.
         * @param:
         * @return:
         * @exception
         */
        this.nombre = nombre;
    }

    public uno(String nombre, int edad){
        /**
         * aqui le da a un valor nombre (String) una edad (Int)
         * @param:
         * @return:
         * @exception
         */
        this.nombre = nombre;
        this.edad = edad;
    }

    //Pero tambien lo puedo usar para llamar a un constructor ya definido
    public <altura> uno(String nombre, int edad, altura){
        /**
         * parametro de altura
         * @param:
         * @return:
         * @exception
         */
        this(nombre,edad);
        this.altura = altura;
    }
}
