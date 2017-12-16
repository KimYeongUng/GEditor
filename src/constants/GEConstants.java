package constants;

/**
 * KimYeongUng.
 * Created by prof. Sung woon Choi Ph.D
 * MyungJi University
 */
public class GEConstants {

    // GEMainFrame
    public static final int WIDTH_MAINFRAME = 400;
    public static final int HEIGHT_MAINFRAME = 600;
    public static final String TITLE_MAINFRAME = "Graphic Editor";

    // GEMenu
    public static final String TITLE_FILEMENU = "File";
    public static final String TITLE_EDITMENU = "Edit";
    public static final String TITLE_COLORMENU = "Color";

    //GEMenuItems
    public static enum EFileMenuItems {New,Open,Save,SaveAs,Exit};
    public static enum EEditMenuItems {Redo,Undo,Delete,Cut,Copy,Paste,Group,UnGroup};
    public static enum EColorMenuItems {SetLineColor,ClearLineColor,SetFillColor,ClearFillColor};

}
