/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaduplamenteencadeada;

public class Celula {

    private Celula proximo;
    private Celula anterior;
    private Object elemento;

    public Celula() {
    }

    public Celula(Object elemento) {
        this.elemento = elemento;
    }

    public Celula(Celula proximo, Object elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return this.proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
    
    public Celula getAnterior(){
        return this.anterior;
    }
    public void setAnterior(Celula anterior){
        this.anterior = anterior;
    }
    
    public Object getElemento() {
        return this.elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

}