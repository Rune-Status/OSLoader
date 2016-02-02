package org.ui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.client.Config;
import org.client.Constants;
import org.client.loader.RSLoader;
import org.util.Utilities;

public class ClientFrame extends JFrame implements WindowListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5752868874839930988L;

    private final RSLoader loader;
    private final ButtonPanel buttonPanel;
    private Config configuration = Config.getInstance();
    private static String name = Constants.User.substring(0, 1).toUpperCase() + Constants.User.substring(1).toLowerCase();
    public ClientFrame() {

        super(Constants.CLIENT_TITLE + " - [" + Constants.Dev + " " + name + " ] Version: " + Constants.getCurrentVersion() + " Beta");

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        this.buttonPanel = new ButtonPanel();
        this.getContentPane().add(buttonPanel, BorderLayout.NORTH);;
        
        this.loader = new RSLoader(configuration);
        this.getContentPane().add(loader);

        //final Image iconImage = Utilities.getLocalImage("");

        this.addWindowListener(this);
        this.setLocationRelativeTo(getParent());
       // this.setIconImage(iconImage);
        this.pack();
        this.setLocationRelativeTo(getOwner());
    }


    public RSLoader loader() {
        return loader;
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

}
