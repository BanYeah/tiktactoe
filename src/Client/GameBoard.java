package Client;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameBoard extends JFrame {
    private CardLayout cardLayout = new CardLayout();
    private JPanel cardPanel = new JPanel(cardLayout);
    private JPanel waitPanel = new JPanel(new GridBagLayout());

    GameBoard() {
        setTitle("Tik tac toe!");
        setPreferredSize(new Dimension(500,600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /* wait panel */
        waitPanel.setPreferredSize(new Dimension(500, 600));

        JLabel waitText = new JLabel("Please wait until all players connect");
        waitText.setFont(new Font("ArialBlack", Font.BOLD, 25));

        GridBagConstraints gbc = new GridBagConstraints();
        // 가로 및 세로 중앙 정렬 설정
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0; // 가로 크기 조정 비율
        gbc.weighty = 1.0; // 세로 크기 조정 비율
        gbc.anchor = GridBagConstraints.CENTER; // 컴포넌트를 그리드 셀 내에서 중앙에 위치시킵니다.
        gbc.fill = GridBagConstraints.NONE; // 크기 조정을 수행하지 않습니다.

        waitPanel.add(waitText, gbc);

        cardPanel.add(waitPanel, "Wait");

        add(cardPanel);
        cardLayout.show(cardPanel, "Wait");

        pack();
        setVisible(true);
    }
}
