package com.company.memento;

 

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class ScheduleGUI2 extends JFrame {  
    private ArrayList<ScheduleTableModel.TableMemento> memento;
    private ScheduleTableModel tableModel;

    private Object[][] data = {
            {"08.00-09.00", "----", "Math", "", "", ""},
            {"09.00-10.00", "", "Math", "", "", ""},
            {"10.00-11.00", "", "", "SE 2", "", "Math"},
            {"11.00-12.00", "", "", "SE 2", "", "Math"},
            {"12.00-13.00", "----", "----", "----", "----", "----"},
            {"13.00-14.00", "SE 2", "OpSys", "", "", ""},
            {"14.00-15.00", "SE 2", "OpSys", "", "Project", ""},
            {"15.00-16.00", "", "OpSys", "", "Project", ""},
            {"16.00-17.00", "", "OpSys", "", "Project", ""},
            {"17.00-18.00", "", "", "", "Project", ""}
        };

    private String[] columnNames = {
	"Time", 
	"Monday",
	"Tuesday",
	"Wednesday",
	"Thursday",
	"Friday"
    };

    public ScheduleGUI2() {
	super("Schedule GUI with Memento");
        this.memento = new ArrayList<ScheduleTableModel.TableMemento>();
	initComponents();
	pack();
    }

    protected void initComponents() {
        addWindowListener (new WindowAdapter () {
            public void windowClosing (WindowEvent evt) {
                exitForm (evt);
            }
        });

	JMenuBar mb = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
        
        JMenuItem loadMenuItem = new JMenuItem("Load");
        loadMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileInputStream fileIn = new FileInputStream("data.txt");
                    ObjectInputStream input = new ObjectInputStream(fileIn);
                    tableModel.setMemento((ScheduleTableModel.TableMemento)input.readObject());
                    input.close();
                    fileIn.close();
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ScheduleGUI2.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ScheduleGUI2.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ScheduleGUI2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        JMenuItem saveAsMenuItem = new JMenuItem("Save as..");
        saveAsMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ScheduleTableModel.TableMemento t = tableModel.getMemento();
                OutputStream file;
                try {
                    file = new FileOutputStream("data.txt");
                    System.out.println("opened");
                    OutputStream buffer = new BufferedOutputStream(file);
                    System.out.println("buffered");
                    ObjectOutput output = new ObjectOutputStream(buffer);
                    System.out.println("streamed");
                    output.writeObject(t);
                    System.out.println("writed");
                    output.close();
                    buffer.close();
                    file.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ScheduleGUI2.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ScheduleGUI2.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });



	JMenuItem exitMenuItem = new JMenuItem("Exit");
	exitMenuItem.addActionListener( new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                exitMenuItemActionPerformed (e);
            }
        });

	fileMenu.add(exitMenuItem);
        fileMenu.add(saveAsMenuItem);
	mb.add(fileMenu);
	setJMenuBar(mb);

	tableModel = new ScheduleTableModel(data, columnNames);
        final JTable table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

	JButton newButton = new JButton("Snapshot");
	newButton.setPreferredSize(new Dimension(125, 27));
        newButton.addActionListener (new ActionListener () {
            public void actionPerformed (ActionEvent evt) {
		memento.add(tableModel.createMemento());
            }
        });
	JButton revertButton = new JButton("Revert");
	revertButton.setPreferredSize(new Dimension(125, 27));
        revertButton.addActionListener (new ActionListener () {
            public void actionPerformed (ActionEvent evt) {
                memento.remove(memento.size()-1);
		tableModel.setMemento(memento.get(memento.size()-1));
            }
        });
	JPanel panel = new JPanel();
	panel.add(newButton);
	panel.add(revertButton);
	getContentPane().add(panel, BorderLayout.SOUTH);

	memento.add(this.tableModel.getMemento());



    }

    protected void exitMenuItemActionPerformed (ActionEvent evt) {
        System.exit(0);
    }

    protected void exitForm(WindowEvent e) {
        System.exit (0);
    }

    public static void main (String[] args) {
        new ScheduleGUI2().setVisible (true);
    } // end of main ()
    
}
