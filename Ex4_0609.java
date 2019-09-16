import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex4_0609 extends JFrame {
    String livros[] = {"O Alquimista", "Capitães da Areia", "Memórias Póstumas de Brás Cubas", "A Hora da Estrela", "O cortiço"};
    Integer op = 0;
    public Ex4_0609() {
        super("Emprestimo");
        Container tela = getContentPane();
        setLayout(null);

        JLabel emp = new JLabel("Empréstimo");
        emp.setForeground(new Color(155, 0, 11));
        emp.setBounds(160,20,160,20);
        emp.setFont(new Font("Arial",Font.PLAIN,16));
        tela.add(emp);

        JComboBox lista = new JComboBox(livros);
        lista.setBounds(300,90,150,20);
        lista.setMaximumRowCount(7);
        lista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lista.getSelectedItem().toString() == "O Alquimista")
                    op = 1;
                if (lista.getSelectedItem().toString() == "Capitães da Areia")
                    op = 2;
                if (lista.getSelectedItem().toString() == "Memórias Póstumas de Brás Cubas")
                    op = 3;
                if (lista.getSelectedItem().toString() == "A Hora da Estrela")
                    op = 4;
                if (lista.getSelectedItem().toString() == "O cortiço")
                    op = 5;
            }
        });
        tela.add(lista);

        JLabel aluno = new JLabel("Aluno:");
        aluno.setBounds(20,60,90,20);
        aluno.setFont(new Font("Arial",Font.BOLD,18));
        tela.add(aluno);

        JLabel nome = new JLabel("Nome");
        nome.setBounds(20,100,90,20);
        nome.setFont(new Font("Arial",Font.BOLD,14));
        tela.add(nome);

        JTextField vnome = new JTextField("");
        vnome.setBounds(70,100,150,30);
        tela.add(vnome);

        JLabel classe = new JLabel("Classe");
        classe.setBounds(20,150,90,20);
        classe.setFont(new Font("Arial",Font.BOLD,14));
        tela.add(classe);

        JTextField vclasse = new JTextField("");
        vclasse.setBounds(70,150,150,30);
        tela.add(vclasse);

        JButton emprestar = new JButton("Emprestar");
        emprestar.setBounds(150,220,150,40);
        emprestar.setBackground(new Color(156, 250, 132));
        tela.add(emprestar);
        emprestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String vtnome = vnome.getText();
                String vtclasse = vclasse.getText();
                JOptionPane.showMessageDialog(null,"Emprestimo realizado com sucesso.\nNome: " + vtnome + "\nClasse: " + vtclasse + "\nLivro: "+ lista.getSelectedItem().toString() );
            }
        });

        tela.setBackground(new Color(255, 255, 255));
        setSize(500,350);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String args[]) {
        Ex4_0609 app = new Ex4_0609();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
