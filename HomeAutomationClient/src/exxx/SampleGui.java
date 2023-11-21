package exxx;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SampleGui {

    private JFrame frame;
    private JPanel cardPanel;
    private CardLayout cardLayout;

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new SampleGui().createAndShowGUI();
        });
    }

    /**
     * @wbp.parser.entryPoint
     */
    private void createAndShowGUI() {
        frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Create panels to be added to the cardPanel
        JPanel panel1 = createPanel("Panel 1");
        JPanel panel2 = createPanel("Panel 2");
        JPanel panel3 = createPanel("Panel 3");

        cardPanel.add(panel1, "Panel 1");
        cardPanel.add(panel2, "Panel 2");
        cardPanel.add(panel3, "Panel 3");

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });

        frame.getContentPane().add(cardPanel);
        frame.getContentPane().add(nextButton, "South");

        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private JPanel createPanel(String text) {
        JPanel panel = new JPanel();
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        return panel;
    }
}
