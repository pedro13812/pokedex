import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainApp extends JFrame {

    public MainApp() {
        setTitle("Pokedex");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 2, 10, 10));

        // Instanciando os Pokémons
        Pokemon pikachu = new Pokemon("Pikachu", "Um Pokémon elétrico temperamental.", "/imagens/pikachu.jpg", "Pokemon tipo dinossauro rex");
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Um Pokémon planta/veneno muito destemido.", "/imagens/bulbasaur.jpg", "Pokemon tipo dinossauro");
        Pokemon charmander = new Pokemon("Charmander", "Um Pokémon de fogo bastante imponente.", "/imagens/charmander.jpg", "Pokemon tipo mulher");
        Pokemon squirtle = new Pokemon("Squirtle", "Um Pokémon aquático que lança água com muita potência.", "/imagens/squirtle.jpg" , "Pokemon tipo bosta");
        Pokemon koffing = new Pokemon("Koffing", "Um Pokémon mutcho loko.", "/imagens/koffing.png", "Pokemon tipo homem");
        Pokemon jigglypuff = new Pokemon("Jigglypuff", "Um Pokémon borderline.", "/imagens/jigglypuff.png", "Pokemon tipo branco");
        Pokemon mew = new Pokemon ("mew","Pokemon estranho", "/imagens/mew.png", "pokemon estilo feijão");
        Pokemon garchomp = new Pokemon("garchomp", "Pokemon cabeça de martelo krakudo","/imagens/garchomp.png","Pokemon tipo limpol");
        Pokemon cachorro = new  Pokemon ("cachorro", "Ele late de vez enquando e brilha no escuro e sofre racismo de vez enquando", "/imagens/cachorro.png", "Pokemon tipo masarico");



        // Criando botões
        add(createButton(pikachu));
        add(createButton(bulbasaur));
        add(createButton(charmander));
        add(createButton(squirtle));
        add(createButton(koffing));
        add(createButton(jigglypuff));
        add(createButton(mew));
        add(createButton(garchomp));
        add(createButton(cachorro));
    }

    private JButton createButton(Pokemon pokemon) {
        JButton button = new JButton(pokemon.getNome());
        button.addActionListener(e -> new Pokedex(pokemon));
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainApp().setVisible(true));
    }
}