import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.*;

public class Pokedex extends JFrame {

    public Pokedex(Pokemon pokemon) {
        setTitle(pokemon.getNome());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        // Carrega a imagem como recurso
        java.net.URL imageURL = getClass().getResource(pokemon.getCaminhoImagem());
        if (imageURL == null) {
            JOptionPane.showMessageDialog(this, "Imagem não encontrada: " + pokemon.getCaminhoImagem());
            return;
        }

        ImageIcon originalIcon = new ImageIcon(imageURL);

        // Define as dimensões desejadas (ex: 350x250, ou ajuste como quiser)
        int desiredWidth = 350;
        int desiredHeight = 250;

        // Redimensiona a imagem
        Image resizedImage = originalIcon.getImage().getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        // Cria o JLabel com a imagem redimensionada
        JLabel imageLabel = new JLabel(resizedIcon);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        JTextArea description = new JTextArea(pokemon.getDescricao());
        description.setWrapStyleWord(true);
        description.setLineWrap(true);
        description.setEditable(false);
        description.setBackground(getBackground());

        panel.add(imageLabel, BorderLayout.CENTER);
        panel.add(description, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }
}