import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Notepad extends JFrame implements ActionListener {

    JMenuBar menuBar = new JMenuBar();

    ImageIcon image = new ImageIcon("Notepad.png");

    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenu formatMenu = new JMenu("Format");
    JMenu viewMenu = new JMenu("View");
    JMenu helpMenu = new JMenu("Help") ;

    JMenuItem newItem = new JMenuItem("New");
    JMenuItem newWindowItem = new JMenuItem("New Window");
    JMenuItem openItem = new JMenuItem("Open...");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem saveAsItem = new JMenuItem("Save As...");
    JMenuItem pageSetupItem = new JMenuItem("Page Setup...");
    JMenuItem printItem = new JMenuItem("Print...");
    JMenuItem exitItem = new JMenuItem("Exit");

    JMenuItem undoitem = new JMenuItem("Undo");
    JMenuItem cutItem = new JMenuItem("Cut");
    JMenuItem copyItem = new JMenuItem("Copy");
    JMenuItem pasteItem = new JMenuItem("Paste");
    JMenuItem deleteItem = new JMenuItem("Delete");
    JMenuItem searchWithBingItem = new JMenuItem("Search with Bing...");
    JMenuItem findItem = new JMenuItem("Find...");
    JMenuItem findNextItem = new JMenuItem("Find Next");
    JMenuItem findPrevios = new JMenuItem("Find Previos");
    JMenuItem replaceItem = new JMenuItem("Replace...");
    JMenuItem goToItem = new JMenuItem("Go To...");
    JMenuItem selectAllItem = new JMenuItem("Select All");
    JMenuItem timeDateItem = new JMenuItem("Time/Date");

    JMenuItem wordWrapItem = new JMenuItem("Word Wrap");
    JMenuItem fontItem = new JMenuItem("Font...");

    JMenuItem zoomItem = new JMenuItem("Zoom");
    JMenuItem statusBarItem = new JMenuItem("Status Bar");

    JMenuItem viewHelpItem = new JMenuItem("View Help");
    JMenuItem sendFeedbackItem = new JMenuItem("Send Feedback");
    JMenuItem aboutNotePad = new JMenuItem("About Notepad");

    Notepad() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Untitled - Notepad");
        this.setLayout(new FlowLayout());
        this.setIconImage(image.getImage());

        newItem.addActionListener(this);
        newWindowItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        saveAsItem.addActionListener(this);
        pageSetupItem.addActionListener(this);
        printItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        formatMenu.setMnemonic(KeyEvent.VK_F);
        viewMenu.setMnemonic(KeyEvent.VK_V);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        fileMenu.add(newItem);
        fileMenu.add(newWindowItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.add(pageSetupItem);
        fileMenu.add(printItem);
        fileMenu.add(exitItem);

        editMenu.add(undoitem);
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.add(deleteItem);
        editMenu.add(searchWithBingItem);
        editMenu.add(findItem);
        editMenu.add(findNextItem);
        editMenu.add(findPrevios);
        editMenu.add(replaceItem);
        editMenu.add(goToItem);
        editMenu.add(selectAllItem);
        editMenu.add(timeDateItem);

        formatMenu.add(wordWrapItem);
        formatMenu.add(fontItem);

        viewMenu.add(zoomItem);
        viewMenu.add(statusBarItem);

        helpMenu.add(viewHelpItem);
        helpMenu.add(sendFeedbackItem);
        helpMenu.add(aboutNotePad);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(formatMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==newItem) {
            System.out.println("Beep boop you loaded a file");
        }
        if (e.getSource() == saveItem) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getName());
                System.out.println(file);
            }
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
}
