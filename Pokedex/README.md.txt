# Projeto: Galeria de Pokémon com Java Swing

Este projeto é um exemplo básico de aplicação gráfica em Java Swing, utilizando:

* Classes Java para representar dados (Pokémon)
* Interface gráfica (GUI) com botões e janelas
* Manipulação de imagens (incluindo redimensionamento)
* Organização em múltiplas classes
* Carregamento de recursos (imagens) usando o classpath

## Estrutura do Projeto

```
GaleriaPokemon/
├── src/
    ├── MainApp.java // Tela inicial com botões dos Pokémons
    ├── Pokemon.java // Classe representando um Pokémon
    ├── Pokedex.java // Tela com imagem e descrição do Pokémon
    └── imagens/ // Pasta com as imagens dos Pokémons
        ├── pikachu.jpg
        ├── bulbasaur.jpg
        ├── charmander.jpg
        └── squirtle.jpg
```

## Conceitos Utilizados

* Programação orientada a objetos `(POO)`
* Interface gráfica com Java Swing `(JFrame, JButton, JLabel, JTextArea)`
* Organização de código em múltiplas classes
* Manipulação e redimensionamento de imagens
* Uso de recursos do classpath `(getClass().getResource())`

## Instruções para adicionar imagens

1. Coloque suas imagens em src/imagens/
2. Use o caminho /imagens/nome.jpg ao criar um Pokemon
3. Certifique-se de que a pasta imagens está sendo reconhecida como parte do classpath (configurado automaticamente na maioria das IDEs)

## Requisitos

* Java JDK 8 ou superior
* IDE Java (IntelliJ, Eclipse, NetBeans) ou compilador de terminal
* Imagens .jpg ou .png na pasta /imagens

## Tema de Casa

* Adicionar mais Pokémons na galeria
* Exibir o tipo (elétrico, fogo, etc.)