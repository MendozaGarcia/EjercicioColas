package sample;

/**
 * Created by uriel on 15/11/2017.
 */
public class Cola {
    private Nodo frente; //inicio de la cola

    //constroctur simple
    public Cola(){
        this.frente=null;
    }

    public void insertar (int valor)
    {
        Nodo nuevo = new Nodo(valor);
        if (frente == null){
            frente = nuevo;
        }else{
            Nodo temp = frente;
            while (temp.getProximo()!=null){
                temp=temp.getProximo();
            }
            temp.setProximo(nuevo);
        }
    }


    // metodo para mstrar los elementos de la cola
    public void mostrar()
    {
        if (frente!=null){
            Nodo temp = frente;
            System.out.println("los valores de la cola son: ");
            while (temp != null){
                System.out.println(temp.getValor());
                temp = temp.getProximo();
            }
        }else {
            System.out.println("la cola está vacía ");
        }
    }

    public int extraer (){
        if (frente == null){
            return 0;
        }else {
            int valorExtraer = frente.getValor();
            frente = frente.getProximo();//cambia el frente
            System.out.println("valor extraído: "+valorExtraer);
            return valorExtraer;// devolver el valor extraido
        }
    }
}
