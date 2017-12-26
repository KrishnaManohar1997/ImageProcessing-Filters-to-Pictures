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
public class ImageArt extends JFrame implements ActionListener{
    Scanner s =new Scanner(System.in);
	//FileFilter Section
	FileNameExtensionFilter  zero = new FileNameExtensionFilter("All Images","jpeg","jpg","jfif","jpe","png","ico","bmp","dib");
	FileNameExtensionFilter  one = new FileNameExtensionFilter("JPEG Files(*.jpg,*.jpeg,*.jfif,*.jpe)","jpeg","jpg");
	FileNameExtensionFilter  two = new FileNameExtensionFilter("Icon(*.ico)","ico");
	FileNameExtensionFilter  three = new FileNameExtensionFilter("Portable Images(*.png)","png");
	FileNameExtensionFilter  four = new FileNameExtensionFilter("Bitmap File(*.bmp,*dib)","bmp");
	String path;
	JPanel top,center,bottom;
    BufferedImage img;
    File f;
    int r,g,b,height,width;
    Color conCol;
    JLabel ftitle,otitle,filters,alert;
	JButton selectImg,opImg,save;
	ButtonGroup filterGroup = new ButtonGroup();
	JRadioButton fil1,fil2,fil3,fil4,fil5,fil6,fil7,fil8,fil9,fil10,fil11,fil12,fil13,fil14,fil15,fil16,fil17,fil18;
	// JLabel fil1,fil2,fil3,fil4,fil5,fil6,fil7,fil8,fil9,fil10,fil11,fil12,fil13,fil14,fil15,fil16,fil17,fil18;
	JTextField inptf,optf;
	FileDialog fd,sd;
	JFileChooser inpCh;
    public static void main(String[] args) throws IOException {
		try{
			new ImageArt("ImageArt");
		}catch(Exception e)
		{
			
		}
    }
    ImageArt(String title){
		super(title);
		setLayout(new BorderLayout());
		setVisible(true);
		setSize(600,600);
		
		//Top Panel
		top = new JPanel();
		add(top,BorderLayout.NORTH);
		
		//Center Panel
		center = new JPanel();
		add(center,BorderLayout.CENTER);
		
		//Bottom Panel
		bottom = new JPanel();
		add(bottom,BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ftitle = new JLabel("Source");
        top.add(ftitle);
		inptf = new JTextField(20);
		inptf.setEnabled(false);
		top.add(inptf);
		selectImg =  new JButton("Select",new ImageIcon("D:/Project/ImageArt/upload.png"));
		selectImg.addActionListener(this);
		top.add(selectImg);
		alert = new JLabel("");
		top.add(alert);
                // img = null;
                // f = null;
		//Contents of Center Panel
		filters = new JLabel("Choose a Filter ");
		center.add(filters);
		setSize(605,620);
		fil1 = new JRadioButton("GreyScale");
		fil1.setSelected(true);
		fil2 = new JRadioButton("Enhance");
		fil3 = new JRadioButton("Filter 3");
		fil4 = new JRadioButton("Filter 4");
		fil5 = new JRadioButton("Filter 5");
		fil6 = new JRadioButton("Filter 6");
		fil7 = new JRadioButton("Filter 7");
		fil8 = new JRadioButton("Filter 8");
		fil9 = new JRadioButton("Filter 9");
		fil10 = new JRadioButton("Filter 10");
		fil11 = new JRadioButton("Filter 11");
		fil12 = new JRadioButton("Filter 12");
		fil13 = new JRadioButton("Filter 13");
		fil14 = new JRadioButton("Filter 14");
		fil15 = new JRadioButton("Filter 15");
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
		fil1.setIcon(new ImageIcon("D:/Project/ImageArt/icoBW.png"));
		fil2.setIcon(new ImageIcon("D:/Project/ImageArt/icoEn.png"));
		fil3.setIcon(new ImageIcon("D:/Project/ImageArt/icoRed.png"));
		fil4.setIcon(new ImageIcon("D:/Project/ImageArt/icoBW.png"));
		fil5.setIcon(new ImageIcon("D:/Project/ImageArt/icoBW.png"));
		fil6.setIcon(new ImageIcon("D:/Project/ImageArt/icoBW.png"));
		fil7.setIcon(new ImageIcon("D:/Project/ImageArt/icoBW.png"));
		fil8.setIcon(new ImageIcon("D:/Project/ImageArt/icoBW.png"));
		fil9.setIcon(new ImageIcon("D:/Project/ImageArt/icoBW.png"));
		fil10.setIcon(new ImageIcon("D:/Project/ImageArt/icoBW.png"));
		fil11.setIcon(new ImageIcon("D:/Project/ImageArt/icoBW.png"));
		fil12.setIcon(new ImageIcon("D:/Project/ImageArt/icoBW.png"));
		fil13.setIcon(new ImageIcon("D:/Project/ImageArt/icoBW.png"));
		fil14.setIcon(new ImageIcon("D:/Project/ImageArt/icoBW.png"));
		fil15.setIcon(new ImageIcon("D:/Project/ImageArt/icoBW.png"));
		
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
		//filterGroup.add(fil1);
		
		//Contents of Bottom Panel
		otitle = new JLabel("Output");
        bottom.add(otitle);
		optf = new JTextField(20);
		optf.setEnabled(false);
		bottom.add(optf);
		
		opImg =  new JButton("Output",new ImageIcon("D:/Project/ImageArt/upload.png"));
        bottom.add(opImg);
		setSize(601,622);
		opImg.addActionListener(this);
		try{
			fd = new FileDialog(this,"Choose Input",FileDialog.LOAD);
			fd.setVisible(false);
		}catch(Exception e){}
		try{
			sd = new FileDialog(this,"Choose Input",FileDialog.SAVE);
			sd.setVisible(false);
		}catch(Exception e){}
		save = new JButton("Save");
		bottom.add(save);
		save.addActionListener(this);
		save.setPreferredSize(new Dimension(80,30));
		bottom.add(sd);
		top.add(fd);
	}
	
	public void output()
	{
		try{
			f = new File("D:/Project/ImageArt/Filter8.jpg");
			ImageIO.write(img,"jpg",f);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Select"))
		{
			//fd.setVisible(true);
			
			inpCh = new JFileChooser();
			inpCh.setCurrentDirectory(new File(System.getProperty("user.home")));
			inpCh.setAcceptAllFileFilterUsed(false);
			inpCh.addChoosableFileFilter(zero);
			inpCh.addChoosableFileFilter(one);
			inpCh.addChoosableFileFilter(two);
			inpCh.addChoosableFileFilter(three);
			inpCh.addChoosableFileFilter(four);
			int result = inpCh.showOpenDialog(null);
			if(result == JFileChooser.APPROVE_OPTION){
				try{
					top.remove(alert);
				}catch(Exception e){}
				getImage();
			}
			else if(result == JFileChooser.CANCEL_OPTION)
			{
				alert=new JLabel("Please select a File",FlowLayout.LEFT);
				System.out.println("Please select a File");
				top.add(alert);
				setSize(595,625);
			}
		}
		else if(ae.getActionCommand().equals("Output"))
		{
			sd.setVisible(true);
			getImage();
		}
		else if(ae.getActionCommand().equals("Save"))
		{
			if(path=="" || path=="nullnull"){
				//top.remove(alert);
				//alert=new JLabel("Please select a File");
			}
		}
	}
    public void starter(){
		System.out.println("Select your Option:");
		int op = s.nextInt();
		switch(op)
		{
			case 0:
				selected(0);
				output();
				break;
			case 1:
				selected(1);
				output();
				break;
			case 2:
				selected(2);
				output();
				break;
			case 3:
				selected(3);
				output();
				break;
			case 4:
				selected(4);
				output();
				break;
			case 5:
				selected(5);
				output();
				break;
			case 6:
				selected(6);
				output();
				break;
			case 7:
				selected(7);
				output();
				break;
			case 8:
				selected(8);
				output();
				break;
			case 9:
				selected(0);
				selected(1);
				selected(2);
				output();
				break;
			case 10:
				selected(0);
				selected(1);
				selected(3);
				output();
				break;
			case 11:
				selected(0);
				selected(1);
				selected(4);
				output();
				break;
			case 12:
				selected(0);
				selected(1);
				selected(5);
				output();
				break;
			case 13:
				selected(0);
				selected(1);
				selected(6);
				output();
				break;
			case 14:
				selected(0);
				selected(1);
				selected(7);
				output();
				break;
			case 15:
				selected(0);
				selected(1);
				selected(8);
				output();
				break;
			default:
				System.out.println("Moosukoni options lodi kottu");
				//selected();
				break;
		}
               
	}
    public void getImage()
    {
        try
                {
					// path =fd.getDirectory()+""+fd.getFile();
                    // f = new File(path);
                    // System.out.println(path);
					//path = inpCh.getDirectory()+""+inpCh.getFile();
					f = inpCh.getSelectedFile();
					path=f.getAbsolutePath();
					System.out.println(""+path);
					inptf.setText(path);
                    img = ImageIO.read(f);
					height = img.getHeight();
					width = img.getWidth();
					starter();
                }
                catch(IOException e){
                    System.exit(0);
                }
    }
	
    public void selected(int op)
    {
        int p;
        for(int i=0;i<width;i++)
        {
            for(int j=0;j<height;j++)
            {
                p = img.getRGB(i,j);
                r = (p>>16) & 0xff;
                g = (p>>8) & 0xff;
                b = p & 0xff;
				
                switch(op)
				{
					case 0:
						turnBW(i,j);
						break;
					case 1:
						enhance(i,j);
						break;
					case 2:
						turnRed(i,j);
						break;
					case 3:
						turnGreen(i,j);
						break;
					case 4:
						turnBlue(i,j);
						break;
					case 5:
						turnYellow(i,j);
						break;
					case 6:
						turnPink(i,j);
						break;
					case 7:
						turnSky(i,j);
						break;
					case 8:
						turnTemp(i,j);
						break;
					default:
						System.out.println("Moosukoni options lodi kottu");
						//selected();
						break;
							
				}
			}
		}
		
    }
    public void turnBW(int i, int j)
    {
        int grey=(r+g+b)/3;
        conCol = new Color(grey, grey, grey); 
		int rgb = conCol.getRGB();
		img.setRGB(i, j, rgb);
    }
	public void enhance(int i, int j)
	{
		redMaker();
		greenMaker();
		blueMaker();
		setter(i,j);
	}
	public void turnRed(int i, int j)
	{
		redMaker();
		setter(i,j);
	}
	public void turnGreen(int i, int j)
	{
		greenMaker();
		setter(i,j);
	}
	public void turnBlue(int i, int j)
	{
		blueMaker();
		setter(i,j);
	}
	public void turnYellow(int i, int j)
	{
		redMaker();
		greenMaker();
		setter(i,j);
	}
	public void turnPink(int i, int j)
	{
		blueMaker();
		redMaker();
		setter(i,j);
	}
	public void turnSky(int i, int j)
	{
		blueMaker();
		greenMaker();
		setter(i,j);
	}
	public void turnTemp(int i, int j)
	{
		turnPink(i,j);
		turnRed(i,j);
	}
	public void setter(int i, int j)
	{
		conCol = new Color(r, g, b); 
		int rgb = conCol.getRGB();
		img.setRGB(i, j, rgb);
	}
	public void blueMaker()
	{
		int diff=0;
		diff= 255-b;
		if(b<=255 && diff!=0 )
		{
			if(diff>=10){
				b+=10;
			}
			else if(diff>=4)
			{
				b+=4;
			}
		}
	}
	public void greenMaker()
	{
		int diff=0;
		diff= 255-g;
		if(g<=255 && diff!=0 )
		{
			if(diff>=10){
				g+=10;
			}
			else if(diff>=4)
			{
				g+=4;
			}
		}
	}
	public void redMaker()
	{
		int diff=0;
		diff= 255-r;
		if(r<=255 && diff!=0 )
		{
			if(diff>=10){
				r+=10;
			}
			else if(diff>=4)
			{
				r+=4;
			}
		}
	}
 }