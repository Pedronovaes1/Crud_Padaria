package org.api.salao.service;

import org.api.salao.model.Item;

import java.util.*;

public class DonoService {
    //Atributo
    Map<UUID, Item> itensEmEstoque;

    public DonoService(){
        this.itensEmEstoque = new HashMap<>();
    }

    public void cadastrarItem(String nome, double preco){
        UUID id = UUID.randomUUID();
        itensEmEstoque.put(id, new Item(nome, preco));
    }

    public void removerItem(String nome){
        if(!itensEmEstoque.isEmpty()){
            for(Map.Entry<UUID, Item> itens : itensEmEstoque.entrySet()){
                if(itens.getValue().getNome().equals(nome)){
                    itensEmEstoque.remove(itens.getKey());
                    //remover item
                }
            }
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public void removerItem(UUID id){
        if(!itensEmEstoque.isEmpty()){
            itensEmEstoque.remove(id);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public void mostrarValores(){
        if(!itensEmEstoque.isEmpty()){
            itensEmEstoque.values().stream()
                    .forEach(e -> System.out.println(e));
        }else{
            System.out.println("A lista esta vazia!");
        }
    }
}
