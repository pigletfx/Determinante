package determinantes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author carlos
 */
public class Zeratul extends JFrame implements ActionListener {

    JTextField aUn = new JTextField();
    JTextField aDs = new JTextField();
    JTextField aTs = new JTextField();
    JTextField bUn = new JTextField();
    JTextField bDs = new JTextField();
    JTextField bTs = new JTextField();
    JTextField cUn = new JTextField();
    JTextField cDs = new JTextField();
    JTextField cTs = new JTextField();
    JLabel a = new JLabel("A=");
    JButton rs = new JButton("Resultado");
    JLabel rt=new JLabel("Recuerda presionar el boton para el resultado");
    public Zeratul() {
        init();
    }

    private void init() {
        setLayout(null);
        setSize(500, 500);
        setTitle("Determinantes");
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rt.setBounds(150, 350, 300, 50);
        add(rt);
        a.setBounds(40, 110, 70, 50);
        add(a);
        aUn.setBounds(110, 10, 70, 50);
        add(aUn);
        aDs.setBounds(210, 10, 70, 50);
        add(aDs);
        aTs.setBounds(310, 10, 70, 50);
        add(aTs);
        bUn.setBounds(110, 110, 70, 50);
        add(bUn);
        bDs.setBounds(210, 110, 70, 50);
        add(bDs);
        bTs.setBounds(310, 110, 70, 50);
        add(bTs);
        cUn.setBounds(110, 210, 70, 50);
        add(cUn);
        cDs.setBounds(210, 210, 70, 50);
        add(cDs);
        cTs.setBounds(310, 210, 70, 50);
        add(cTs);
        rs.setBounds(200, 270, 100, 50);
        add(rs);
        rs.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double a1 =Double.parseDouble(aUn.getText());
            double a2=Double.parseDouble(aDs.getText());
            double a3=Double.parseDouble(aTs.getText());
            double b1=Double.parseDouble(bUn.getText());
            double b2=Double.parseDouble(bDs.getText());
            double b3=Double.parseDouble(bTs.getText());
            double c1=Double.parseDouble(cUn.getText());
            double c2=Double.parseDouble(cDs.getText());
            double c3=Double.parseDouble(cTs.getText());
            ResultadoDetTres xx=new ResultadoDetTres(a1, a2, a3, b1, b2, b3, c1, c2, c3);
            rt.setText(xx.cr);
        }catch(NumberFormatException h){
            JOptionPane.showMessageDialog(null,"LLena los cuadros correctamente");
        }
    }
}
