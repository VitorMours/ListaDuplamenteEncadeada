/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaduplamenteencadeada;

public class Main {

    public static void main(String[] args) {
    ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada<>();

    Aluno aluno1 = new Aluno("Manuel", 12);
    Aluno aluno2 = new Aluno("Lucas", 22);
    Aluno aluno3 = new Aluno("Pedro", 32);
    Aluno aluno4 = new Aluno("Raquel", 11);
    Aluno aluno5 = new Aluno("Antonio", 33);

    lista.adicionaInicio(aluno1);
    lista.adicionaInicio(aluno2);
    lista.adicionaInicio(aluno3);
    System.out.println(lista.tamanho());
    System.out.println("O elemento do aluno 4 é:"+aluno4);
    lista.adiciona(aluno4, 2);
    
    System.out.println(lista.tamanho());
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println(lista.recupera(2));
    System.out.println("Procurando o a existência de um elemento dentro da lista");
    System.out.println(lista.existeDado(aluno5));




    }
}
