package frames;

/**
 * KimYeongUng.
 * Created by prof. Sung woon Choi Ph.D
 * MyungJi University
 */

import javax.swing.*;

import constants.GEConstants;

public class GEMainFrame extends JFrame {

    private static GEMainFrame uniqueMainFrame = new GEMainFrame(GEConstants.TITLE_MAINFRAME);
    private  GEDrawingPanel drawingPanel;

    private GEMainFrame(String title){
         super(title);

         drawingPanel = new GEDrawingPanel();
         add(drawingPanel);
    }

    public static GEMainFrame getInstance(){
        return uniqueMainFrame;
    }

    public void init(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(GEConstants.WIDTH_MAINFRAME , GEConstants.HEIGHT_MAINFRAME);
        setVisible(true);
    }
}
