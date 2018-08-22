/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
 *
 * @author Manohar
 */
import java.awt.*;
import java.util.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageArt extends JFrame implements ActionListener {

    Scanner s = new Scanner(System.in);
    //FileFilter Section
    FileNameExtensionFilter zero = new FileNameExtensionFilter("All Images", "jpeg", "jpg", "jfif", "jpe", "png", "ico", "bmp", "dib");
    FileNameExtensionFilter one = new FileNameExtensionFilter("JPEG Files(*.jpg,*.jpeg,*.jfif,*.jpe)", "jpeg", "jpg");
    FileNameExtensionFilter two = new FileNameExtensionFilter("Icon(*.ico)", "ico");
    FileNameExtensionFilter three = new FileNameExtensionFilter("Portable Images(*.png)", "png");
    FileNameExtensionFilter four = new FileNameExtensionFilter("Bitmap File(*.bmp,*dib)", "bmp");
    String path;
    JPanel top, center, bottom;
    BufferedImage img;
    File f;
    int r, g, b, height, width;
    Color conCol;
    JLabel ftitle, otitle, filters, alert;
    JButton selectImg, opImg, save;
    ButtonGroup filterGroup = new ButtonGroup();
    JRadioButton fil1, fil2, fil3, fil4, fil5, fil6, fil7, fil8, fil9, fil10, fil11, fil12, fil13, fil14, fil15, fil16;
    JTextField inptf, optf;
    FileDialog fd, sd;
    JFileChooser inpCh;

    public static void main(String[] args) throws IOException {
        try {
            new ImageArt("ImageArt");
        } catch (Exception e) {

        }
    }

    ImageArt(String title) {
        super(title);
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(600, 700);

        //Top Panel
        top = new JPanel();
        add(top, BorderLayout.NORTH);

        //Center Panel
        center = new JPanel();
        add(center, BorderLayout.CENTER);

        //Bottom Panel
        bottom = new JPanel();
        add(bottom, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ftitle = new JLabel("Source");
        top.add(ftitle);
        inptf = new JTextField(20);
        inptf.setEnabled(false);
        top.add(inptf);
        selectImg = new JButton("Select", new ImageIcon("D:/Project/ImageArt/upload.png"));
        selectImg.addActionListener(this);
        top.add(selectImg);
        alert = new JLabel("");
        top.add(alert);
        filters = new JLabel("Choose a Filter ");
        center.add(filters);
        setSize(605, 700);
        fil1 = new JRadioButton("GreyScale");
        fil1.setActionCommand("0");
        fil1.setSelected(true);
        fil2 = new JRadioButton("Enhance");
        fil2.setActionCommand("1");
        fil3 = new JRadioButton("Filter 3");
        fil3.setActionCommand("2");
        fil4 = new JRadioButton("Filter 4");
        fil4.setActionCommand("3");
        fil5 = new JRadioButton("Filter 5");
        fil5.setActionCommand("4");
        fil6 = new JRadioButton("Filter 6");
        fil6.setActionCommand("5");
        fil7 = new JRadioButton("Filter 7");
        fil7.setActionCommand("6");
        fil8 = new JRadioButton("Filter 8");
        fil8.setActionCommand("7");
        fil9 = new JRadioButton("Filter 9");
        fil9.setActionCommand("8");
        fil10 = new JRadioButton("Filter 10");
        fil10.setActionCommand("9");
        fil11 = new JRadioButton("Filter 11");
        fil11.setActionCommand("10");
        fil12 = new JRadioButton("Filter 12");
        fil12.setActionCommand("11");
        fil13 = new JRadioButton("Filter 13");
        fil13.setActionCommand("12");
        fil14 = new JRadioButton("Filter 14");
        fil14.setActionCommand("13");
        fil15 = new JRadioButton("Filter 15");
        fil15.setActionCommand("14");
        fil16 = new JRadioButton("Filter 16");
        fil16.setActionCommand("15");
        center.add(fil1);
        center.add(fil2);
        center.add(fil3);
        center.add(fil4);
        center.add(fil5);
        center.add(fil6);
        center.add(fil7);
        center.add(fil8);
        center.add(fil9);
        center.add(fil10);
        center.add(fil11);
        center.add(fil12);
        center.add(fil13);
        center.add(fil14);
        center.add(fil15);
        center.add(fil16);
        filterGroup.add(fil1);
        filterGroup.add(fil2);
        filterGroup.add(fil3);
        filterGroup.add(fil4);
        filterGroup.add(fil5);
        filterGroup.add(fil6);
        filterGroup.add(fil7);
        filterGroup.add(fil8);
        filterGroup.add(fil9);
        filterGroup.add(fil10);
        filterGroup.add(fil11);
        filterGroup.add(fil12);
        filterGroup.add(fil13);
        filterGroup.add(fil14);
        filterGroup.add(fil15);
        filterGroup.add(fil16);
        otitle = new JLabel("Output");
        bottom.add(otitle);
        optf = new JTextField(20);
        optf.setEnabled(false);
        bottom.add(optf);

        opImg = new JButton("Output");
        bottom.add(opImg);
        setSize(503, 469);
        opImg.addActionListener(this);
        try {
            fd = new FileDialog(this, "Choose Input", FileDialog.LOAD);
            fd.setVisible(false);
            optf.setText(fd.getDirectory());
        } catch (Exception e) {
        }
        try {
            sd = new FileDialog(this, "Choose Input", FileDialog.SAVE);
            sd.setVisible(false);
        } catch (Exception e) {
        }
        save.addActionListener(this);
        save.setPreferredSize(new Dimension(80, 30));
        bottom.add(sd);
        top.add(fd);
    }

    public void output() {
        try {
            f = new File(sd.getDirectory() + sd.getFile().toString() + ".jpg");
            optf.setText("Saved : "+ sd.getFile().toString() + ".jpg");
            ImageIO.write(img, "jpg", f);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
########################################################################
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
##############################################################################
  
  
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Select")) {
            inpCh = new JFileChooser();
            inpCh.setCurrentDirectory(new File(System.getProperty("user.home")));
            inpCh.setAcceptAllFileFilterUsed(false);
            inpCh.addChoosableFileFilter(zero);
            inpCh.addChoosableFileFilter(one);
            inpCh.addChoosableFileFilter(two);
            inpCh.addChoosableFileFilter(three);
            inpCh.addChoosableFileFilter(four);
            int result = inpCh.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                try {
                    f = inpCh.getSelectedFile();
                    path = f.getAbsolutePath();
                    System.out.println("Image is read From : " + path);
                    inptf.setText(path);
                    img = ImageIO.read(f);
                    height = img.getHeight();
                    width = img.getWidth();
                    top.remove(alert);
                } catch (Exception e) {
                }
            } else if (result == JFileChooser.CANCEL_OPTION) {
                alert = new JLabel("Please select a File", FlowLayout.LEFT);
                System.out.println("Please select a File");
                top.add(alert);
                setSize(595, 625);
            }
        } else if (ae.getActionCommand().equals("Output")) {
            sd.setVisible(true);
            getImage();
        } else if (ae.getActionCommand().equals("Save")) {
        }
    }

    public void starter() {
        System.out.println(filterGroup.getSelection().getActionCommand());
        int op = Integer.parseInt(filterGroup.getSelection().getActionCommand());
      ########################################################################
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
##############################################################################

    }

    public void getImage() {
        try {
            starter();
        } catch (Exception e) {
            System.exit(0);
        }
    }

    public void selected(int op) {
        int p;
     
     
     
     $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     $$$$$$$$$$$$$$$$$$$$$$$ IMAGE PROCESSING ALGORITHM  $$$$$$$$$$$$$$$$$$$$$$$$$$
     $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
      
      
      
      
      
      
      
       ########################################################################
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
#########################################################################
##########################################################################
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
##############################################################################
                        break;

                }
            }
        }

    }

    public void turnBW(int i, int j) {
        int grey = (r + g + b) / 3;
        conCol = new Color(grey, grey, grey);
        int rgb = conCol.getRGB();
        img.setRGB(i, j, rgb);
    }

    public void enhance(int i, int j) {
        redMaker();
        greenMaker();
        blueMaker();
        setter(i, j);
    }

    public void turnRed(int i, int j) {
        redMaker();
        setter(i, j);
    }

    public void turnGreen(int i, int j) {
        greenMaker();
        setter(i, j);
    }

    public void turnBlue(int i, int j) {
        blueMaker();
        setter(i, j);
    }

    public void turnYellow(int i, int j) {
        redMaker();
        greenMaker();
        setter(i, j);
    }

    public void turnPink(int i, int j) {
        blueMaker();
        redMaker();
        setter(i, j);
    }

    public void turnSky(int i, int j) {
        blueMaker();
        greenMaker();
        setter(i, j);
    }

    public void turnTemp(int i, int j) {
        turnPink(i, j);
        turnRed(i, j);
    }

    public void setter(int i, int j) {
        conCol = new Color(r, g, b);
        int rgb = conCol.getRGB();
        img.setRGB(i, j, rgb);
    }
##########################################################################
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
##############################################################################

     $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     $$$$$$$$$$$$$$$$$$$$$$$ IMAGE PROCESSING ALGORITHM  $$$$$$$$$$$$$$$$$$$$$$$$$$
     $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     
     ##########################################################################
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
	Logic is Hidden for Security purposes
	
	
	
	
##############################################################################
    }
}
