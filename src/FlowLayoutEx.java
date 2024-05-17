import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
  public FlowLayoutEx() {
    setTitle("FlowLayout 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = getContentPane();

    contentPane.setLayout(new FlowLayout(30, 20));

    contentPane.add(new JButton("Calculate"), BorderLayout.CENTER);
    contentPane.add(new JButton("NORTH"), BorderLayout.NORTH);
    contentPane.add(new JButton("SOUTH"), BorderLayout.SOUTH);
    contentPane.add(new JButton("EAST"), BorderLayout.EAST);
  }
}
