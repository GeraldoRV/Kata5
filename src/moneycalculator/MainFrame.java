package moneycalculator;

import java.awt.FlowLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import moneycalculator.ui.swing.SwingMoneyDisplay;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setMenuBar(menubar());
        setLayout(new FlowLayout());
        add(moneyDisplay());
        setVisible(true);
                
        
    }

    private MenuBar menubar() {
        MenuBar menuBar = new MenuBar();
        menuBar.add(operationMenu());
        return menuBar;
    }

    private Menu operationMenu() {
        Menu menu = new Menu("operations");
        menu.add(calculateMenuItem());
        return menu;
    }

    private ActionListener executeCalculate() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Execute...");
            }
        };
    }

    private MenuItem calculateMenuItem() {
        MenuItem menuItem = new MenuItem("Calculate");
        menuItem.addActionListener(executeCalculate());
        return menuItem;
    }

    private JPanel moneyDisplay() {
        SwingMoneyDisplay panel = new SwingMoneyDisplay();
        return panel;
    }
    
}
