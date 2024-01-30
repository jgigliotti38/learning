/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *  Simple GUI program using AWT
 * @author jgigl16
 */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private static Frame mainFrame;
    private static Panel topPanel;
    private static Panel bottomPanel;
    private static Button button1;
    private static Button button2;
    private static Label instructionLabel;
    private static Label pushedButton1;
    private static Label pushedButton2;
    private static FlowLayout centeredText;
    private static Font labelFont;
           
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        setFrame();
        addPanel();
        addComponents();    //Fonts,Labels,Buttons,etc.
        eventHandlers();
        exitProgram();
    }
    
    public static void setFrame() {
        mainFrame = new Frame("Demo");
        
        //Set MainFrame Layout
        mainFrame.setLayout(new BorderLayout());
        
        //Set Layout Size
        mainFrame.setSize(700,500);
        
        //Set mainFrame as visible
        mainFrame.setVisible(true);
    }
    
    public static void exitProgram() {
        //Program EXIT
        mainFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }//Close windowClosing()
        });//Close addWindowListener
    } 
    
    public static void addPanel() {
        //Create top & bottom Panels
        centeredText = new FlowLayout(FlowLayout.CENTER,35,35);
        topPanel = new Panel(centeredText);
        bottomPanel = new Panel(centeredText);
        
        //Add Panels to mainFrame
        mainFrame.add(topPanel, BorderLayout.NORTH);
        mainFrame.add(bottomPanel, BorderLayout.SOUTH);
    }
    
    public static void addComponents() {
        //add Buttons to topPanel
        button1 = new Button("Button 1");
        button2 = new Button("Button 2");
        
        //add Buttons to topPanel
        topPanel.add(button1);
        topPanel.add(button2);
        
        //adjust Button size
        Dimension buttonSize = new Dimension(200,125);
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        
        //change font size of buttons
        Font buttonFont = new Font("",Font.PLAIN, 50);
        button1.setFont(buttonFont);
        button2.setFont(buttonFont);
        
        //create Labels
        instructionLabel = new Label("Push a Button");
        pushedButton1 = new Label("You pushed Button 1");
        pushedButton2 = new Label("You pushed Button 2");
        
        //add instructionLabel to bottomPanel
        bottomPanel.add(instructionLabel);
        
        //create and set Label Font
        labelFont = new Font("",Font.PLAIN,25);
        instructionLabel.setFont(labelFont);
        pushedButton1.setFont(labelFont);
        pushedButton2.setFont(labelFont);
        
        //change Label color
        pushedButton1.setForeground(Color.BLUE);
        pushedButton2.setForeground(Color.BLUE);
        
    }
    public static void eventHandlers() {
        //EventHandler Button 1
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bottomPanel.removeAll();
                bottomPanel.add(pushedButton1);
                mainFrame.setVisible(true);
            }//close actionPerformed
        });//close button1.addActionListener
        
        //EventHandler Button 2
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bottomPanel.removeAll();
                bottomPanel.add(pushedButton2);
                mainFrame.setVisible(true);
            }//close actionPerformed
        });//close button2.addActionListener
    }
    
    
        
        
}
