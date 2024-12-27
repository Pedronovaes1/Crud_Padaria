package org.api.salao;

import org.api.salao.model.Item;
import org.api.salao.service.DonoService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DonoService pedro = new DonoService();

        pedro.cadastrarItem("Pão Francês", 10);
        pedro.cadastrarItem("Pão de Forma", 6.55);
        pedro.cadastrarItem("Pão Doce", 4.5);

        pedro.mostrarValores();

        pedro.removerItem("Pão Francês");

        System.out.println("*********");
        pedro.mostrarValores();
    }
}