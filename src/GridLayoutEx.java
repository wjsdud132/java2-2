import java.awt.*;
import javax.swing.*;


public class GridLayoutEx extends JFrame {
  public GridLayoutEx() {
    super("GridLayout 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = getContentPane();

    contentPane.setLayout(new GridLayout(1, 10));

    for(int i=10; i<=0; i--) {
      String text = Integer.toString(i);
      contentPane.add(new JButton(text));
    }

    contentPane.add(new JButton("*"));
    contentPane.add(new JButton("0"));

    setSize(300, 200);
    setVisible(true);
}
}
