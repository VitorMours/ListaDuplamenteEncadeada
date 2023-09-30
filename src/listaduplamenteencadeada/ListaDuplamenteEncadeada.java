/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaduplamenteencadeada;

/**
 *
 * @author anton
 * @param <T>
 */
public class ListaDuplamenteEncadeada<T>{
    private Celula ultimo;
    private Celula primeiro;
    private int tamanho;
    
    // Feito !
    public ListaDuplamenteEncadeada(){
        this.ultimo = null;
        this.primeiro = null;
        this.tamanho = 0;
    }
   
    public void adicionaInicio(T elemento){
        Celula nova = new Celula(elemento);
        if(tamanho() == 0){
            tamanho++;
            nova.setAnterior(null);
            nova.setProximo(null);    
            this.ultimo = nova;
            this.primeiro = nova;
        }else{
            tamanho++;
            nova.setAnterior(null);
            nova.setProximo(this.primeiro);
            this.primeiro.setAnterior(nova);
            this.primeiro = nova;
        }
    }
    public void adicionaFim(T elemento){
        Celula nova = new Celula(elemento);
        if(tamanho() == 0){
            tamanho++;
            this.ultimo = nova;
            this.primeiro = nova;
            nova.setProximo(null);
            nova.setAnterior(null);
        }else{
            tamanho++;
            nova.setAnterior(this.ultimo);
            this.ultimo.setProximo(nova);
            this.ultimo = nova;
            nova.setProximo(null);
        }
    }
    
    public void adiciona(T elemento, int posicao){
        posicao--;
        Celula nova = new Celula(elemento);
        if(tamanho() == 0){
            if(posicao != 0){
                System.out.println("Você não pode adicionar nessa posição pois ela não existe");
            }else{
                tamanho++;
                this.ultimo = nova;
                this.primeiro = nova;
                nova.setAnterior(null);
                nova.setProximo(null);
            }
        }else{
            tamanho++;
            int index = 0;
            Celula varredura = this.primeiro;
            
            while(index != posicao){
                varredura = varredura.getProximo();
                index++;
            }
            Celula varredura_posterior = varredura.getProximo();
            varredura.setProximo(nova);
            nova.setAnterior(varredura);
            nova.setProximo(varredura_posterior);
            if(varredura_posterior != null){
                varredura_posterior.setAnterior(nova);
            }
        }
    }
    // Feito ! 
    public T recupera(int posicao){
        int index = 0;
        if(tamanho() < posicao){
            System.out.println("O elemento de posicao desejada não pode ser encontrado dentro da lista.\nPortanto será retornado nulo");
        }

        Iterador iterador = new Iterador(this.primeiro);
        while(iterador.hasNext()){
            iterador = new Iterador((Celula) iterador.getAtual().getProximo());
            index++;
            if(posicao == index){
                return (T) iterador.getAtual().getElemento();
            }
        }
        return null;
    }
    
    public boolean existeDado(T elemento){
        Celula procurado = new Celula(elemento);
        Iterador iterador = new Iterador(this.primeiro);
        while(iterador.hasNext()){
            
            if(iterador.getAtual().getElemento().equals(procurado.getElemento())){
                return true;
            }
            iterador = new Iterador(iterador.getAtual().getProximo());
        }
        return false;
    }
    
    
    
    
    
    
    
    
    
    // Feito !
    public int tamanho(){
        return this.tamanho;
    }
    
    
    
    
    
    @Override
    public String toString()throws NullPointerException{
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        Celula atual = this.primeiro;
        while(true){
            builder.append(atual.getElemento());
            builder.append(" <-> ");
            System.out.println(builder.toString());
            
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }else{
                atual = atual.getProximo();
                builder.append(atual.getElemento());
                break;}

        }
        builder.append("]");
        System.out.println(builder.toString());
        return builder.toString();
    }
    
    
    
    
}
