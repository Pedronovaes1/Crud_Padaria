# Crud Na memória de uma aplicação para um Sistema de Padaria

Esse Crud usa um HashMap para guardar os itens da Padaria na memória, fazer as inserções e os controles.

## Métodos

- `CadastarItem` - Serve para cadastrar o Item no HashMap
- `removerItem` -  Serve para remover Item no HashMap, podendo remover tanto por UUID como também pelo nome, usando sobre-carga de método
- `mostrarValores` - Serve para mostrar valores na tela

## Classes

- `Item` - Model de itens cadastrados;
- `DonoService` - Classe do dono que possui os métodos e HashMap de itens;
- `Main` - onde ocorre a aplicação;
