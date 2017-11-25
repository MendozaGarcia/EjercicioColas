package sample;

import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

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

    public boolean vacia (){
        return ( frente == null);
    }

    public void encontrar(int busqueda) {//busca


        try {
            Nodo temp = frente;
            int posicion = 1+1;


            if (temp.getValor() == busqueda) {
                System.out.println("El valor esta en la posición 0");
            } else {
                while (temp != null) {
                    if (temp.getProximo().getValor() == busqueda) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Extraer");
                        alert.setHeaderText("valor en la posicion: "+ posicion);
                        alert.showAndWait();

                        break;
                    }
                    posicion++;
                    temp = temp.getProximo();
                }}
        }
        catch (Exception ex)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Cola");
            alert.setHeaderText("El elemento no ha sido encontrado");
            alert.showAndWait();
        }
    }



    public int total (){//contar los elementos
        Nodo aux = null;
        int i=0;
        aux = frente;
        while(aux != null){
            aux = aux.getProximo();
            i++;
        }
        return i;
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
            //System.out.println("valor extraído: "+valorExtraer);
            return valorExtraer;// devolver el valor extraido
        }
    }
}
