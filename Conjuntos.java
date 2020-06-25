
package Negocio;

public class Conjuntos {

    //ATRIBUTOS
    private String [] _elemento;
    private int _cardinalidad;
    
    //CONSTRUCTORES
    public Conjuntos(int _card){
        this._cardinalidad=_card;
        _elemento=new String[this._cardinalidad];
    }
    public Conjuntos(String [] conjunto){
        _cardinalidad=conjunto.length;
        _elemento=conjunto;
    }
    public Conjuntos(Conjuntos p){
        _cardinalidad=p._cardinalidad;
        _elemento=p._elemento;
    }
    public Conjuntos(String [] e, int numelem){
        _cardinalidad=numelem;
        _elemento=e;
    }
    //METODOS
    
    
    
}
