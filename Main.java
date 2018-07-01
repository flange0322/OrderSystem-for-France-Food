import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.Date;
import java.util.TreeMap;
@SuppressWarnings("serial")
class PictureChangeJLabel extends JLabel
{
	public int count = 0;
	public ImageIcon[] imgs = {
	            new ImageIcon("Pictures/changepicture/changepicture1.png"),
	            new ImageIcon("Pictures/changepicture/changepicture2.png"),
	            new ImageIcon("Pictures/changepicture/changepicture3.jpg"),
	            new ImageIcon("Pictures/changepicture/changepicture4.jpg"),
	            new ImageIcon("Pictures/changepicture/changepicture5.jpg")
	            };
	public PictureChangeJLabel()
    {
        Timer timer = new Timer(4000,new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                repaint();
            }
        });
        timer.start();
    }
	public void paint(Graphics picture) 
    {
        super.paint(picture);
        picture.drawImage(imgs[count%imgs.length].getImage(),115, 0,this);
        count++;
    }
}

class CheckButtonCallWho_forMainfrm implements ActionListener
{
	public JButton button1;
	public JButton button2;
	public JButton button3;
	public JButton button4;
	public JButton button5;
	public JButton button6;
	public CheckButtonCallWho_forMainfrm(JButton b1,JButton b2,JButton b3,JButton b4,JButton b5,JButton b6)
	{
		button1 = b1;
		button2 = b2;
		button3 = b3;
		button4 = b4;
		button5 = b5;
		button6 = b6;
	}
	public void actionPerformed(ActionEvent e) 
	{ 
		JButton Checkbtn = (JButton) e.getSource();
		if(Checkbtn==button1)
		{
			JFrame main_introduction_frm1 = new JFrame("法式檸香鮭魚排");
			Container main_introduction_cp1 = main_introduction_frm1.getContentPane();
			ImageIcon MI_Food1 = new ImageIcon("Pictures/MainIntroduction/MI_Food1.jpg");
			JLabel MI_Label1 = new JLabel();
			JTextArea MI_TA1 = new JTextArea("   Steak de citron                                                                     "+"只用鹽、黑胡椒與迷迭香來輕輕提取魚肉的鮮美原味，而鮮檸檬汁的鮭魚肉，除了可以添加鮭魚的甜度之外，更可以把鮭魚的風味襯托的更美味喔！");
			MI_TA1.setFont(new Font("TimeRoman",Font.BOLD ,25)) ;
			main_introduction_cp1.setLayout(null);
			MI_Label1.setIcon(MI_Food1);
			MI_Label1.setBounds(10,20,800,600);
			main_introduction_cp1.add(MI_Label1);
			MI_TA1.setBounds(830,100,235,550);
			main_introduction_cp1.add(MI_TA1);
			MI_TA1.setLineWrap(true);
			MI_TA1.setEditable(false);
			main_introduction_cp1.setBackground(Color.white);
			main_introduction_frm1.setSize(1085,700);
			main_introduction_frm1.setLocationRelativeTo(null);
			main_introduction_frm1.setResizable(false);
			main_introduction_frm1.setVisible(true);
		}
		if(Checkbtn==button2)
		{
			JFrame main_introduction_frm2 = new JFrame("法式紅酒燉雞");
			Container main_introduction_cp2 = main_introduction_frm2.getContentPane();
			ImageIcon MI_Food2 = new ImageIcon("Pictures/MainIntroduction/MI_Food2.jpg");
			JLabel MI_Label2 = new JLabel();
			JTextArea MI_TA2 = new JTextArea("       Coq au vin                                                                    "+"      醬汁和雞肉糊在一起永不分離，而且燉到酥爛入味，在香氣四溢中興奮期待，入口倍覺溫暖感動！");
			MI_TA2.setFont(new Font("TimeRoman",Font.BOLD ,25)) ;
			main_introduction_cp2.setLayout(null);
			MI_Label2.setIcon(MI_Food2);
			MI_Label2.setBounds(10,20,800,600);
			main_introduction_cp2.add(MI_Label2);
			MI_TA2.setBounds(830,100,235,550);
			main_introduction_cp2.add(MI_TA2);
			MI_TA2.setLineWrap(true);
			MI_TA2.setEditable(false);
			main_introduction_cp2.setBackground(Color.white);
			main_introduction_frm2.setSize(1085,700);
			main_introduction_frm2.setLocationRelativeTo(null);
			main_introduction_frm2.setResizable(false);
			main_introduction_frm2.setVisible(true);
		}
		if(Checkbtn==button3)
		{
			JFrame main_introduction_frm3 = new JFrame("小牛胸腺");
			Container main_introduction_cp3 = main_introduction_frm3.getContentPane();
			ImageIcon MI_Food3 = new ImageIcon("Pictures/MainIntroduction/MI_Food3.jpg");
			JLabel MI_Label3 = new JLabel();
			JTextArea MI_TA3 = new JTextArea("       Ris de veau                                                                    "+" 自幼牛身上摘取下的小牛胸腺，肉質相當柔嫩甘甜，又帶有少許咬勁，其清淡的口味配上味道濃厚的醬汁。");
			MI_TA3.setFont(new Font("TimeRoman",Font.BOLD ,25)) ;
			main_introduction_cp3.setLayout(null);
			MI_Label3.setIcon(MI_Food3);
			MI_Label3.setBounds(10,20,800,600);
			main_introduction_cp3.add(MI_Label3);
			MI_TA3.setBounds(830,100,235,550);
			main_introduction_cp3.add(MI_TA3);
			MI_TA3.setLineWrap(true);
			MI_TA3.setEditable(false);
			main_introduction_cp3.setBackground(Color.white);
			main_introduction_frm3.setSize(1085,700);
			main_introduction_frm3.setLocationRelativeTo(null);
			main_introduction_frm3.setResizable(false);
			main_introduction_frm3.setVisible(true);
		}
		if(Checkbtn==button4)
		{
			JFrame main_introduction_frm4 = new JFrame("七時羊腿");
			Container main_introduction_cp4 = main_introduction_frm4.getContentPane();
			ImageIcon MI_Food4 = new ImageIcon("Pictures/MainIntroduction/MI_Food4.jpg");
			JLabel MI_Label4 = new JLabel();
			JTextArea MI_TA4 = new JTextArea("Gigot de sept heures                                                                    "+"這道菜是利用獨門香料將羔羊後腿醃過之後燉煮7小時讓羊腿燉煮熟透，所以味道非常深厚細膩，入口即化。");
			MI_TA4.setFont(new Font("TimeRoman",Font.BOLD ,25)) ;
			main_introduction_cp4.setLayout(null);
			MI_Label4.setIcon(MI_Food4);
			MI_Label4.setBounds(10,20,800,600);
			main_introduction_cp4.add(MI_Label4);
			MI_TA4.setBounds(820,100,250,550);
			main_introduction_cp4.add(MI_TA4);
			MI_TA4.setLineWrap(true);
			MI_TA4.setEditable(false);
			main_introduction_cp4.setBackground(Color.white);
			main_introduction_frm4.setSize(1085,700);
			main_introduction_frm4.setLocationRelativeTo(null);
			main_introduction_frm4.setResizable(false);
			main_introduction_frm4.setVisible(true);
		}
		if(Checkbtn==button5)
		{
			JFrame main_introduction_frm5 = new JFrame("油封鴨");
			Container main_introduction_cp5 = main_introduction_frm5.getContentPane();
			ImageIcon MI_Food5 = new ImageIcon("Pictures/MainIntroduction/MI_Food5.png");
			JLabel MI_Label5 = new JLabel();
			JTextArea MI_TA5 = new JTextArea("  Confit de canard                                                                     "+"用鴨油將鴨腿完全浸泡，小火燉煮2小時之後稍微煎過就會達到皮脆肉嫩的效果。");
			MI_TA5.setFont(new Font("TimeRoman",Font.BOLD ,25)) ;
			main_introduction_cp5.setLayout(null);
			MI_Label5.setIcon(MI_Food5);
			MI_Label5.setBounds(10,20,800,600);
			main_introduction_cp5.add(MI_Label5);
			MI_TA5.setBounds(830,100,235,550);
			main_introduction_cp5.add(MI_TA5);
			MI_TA5.setLineWrap(true);
			MI_TA5.setEditable(false);
			main_introduction_cp5.setBackground(Color.white);
			main_introduction_frm5.setSize(1085,700);
			main_introduction_frm5.setLocationRelativeTo(null);
			main_introduction_frm5.setResizable(false);
			main_introduction_frm5.setVisible(true);
		}
		if(Checkbtn==button6)
		{
			JFrame main_introduction_frm6 = new JFrame("醃白菜馬鈴薯豬肉");
			Container main_introduction_cp6 = main_introduction_frm6.getContentPane();
			ImageIcon MI_Food6 = new ImageIcon("Pictures/MainIntroduction/MI_Food6.jpg");
			JLabel MI_Label6 = new JLabel();
			JTextArea MI_TA6 = new JTextArea("Choucroute garnie                                                                    "+"法國東北邊阿爾薩斯的菜色。通常配上香腸或是醃製調理過的豬肉，並且配著馬鈴薯吃。");
			MI_TA6.setFont(new Font("TimeRoman",Font.BOLD ,25)) ;
			main_introduction_cp6.setLayout(null);
			MI_Label6.setIcon(MI_Food6);
			MI_Label6.setBounds(10,20,800,600);
			main_introduction_cp6.add(MI_Label6);
			MI_TA6.setBounds(830,100,235,550);
			main_introduction_cp6.add(MI_TA6);
			MI_TA6.setLineWrap(true);
			MI_TA6.setEditable(false);
			main_introduction_cp6.setBackground(Color.white);
			main_introduction_frm6.setSize(1085,700);
			main_introduction_frm6.setResizable(false); 
			main_introduction_frm6.setLocationRelativeTo(null);
			main_introduction_frm6.setResizable(false);
			main_introduction_frm6.setVisible(true);
		}
	} 
}

class Countsum implements ActionListener
{
	public int foodsum;
	public JLabel quantitylab;
	public JButton addbtn;
	public JButton subtractbtn;
	public int people;
	public Countsum(int sum, JLabel lab,JButton ab,JButton st,int po) 
	{
		foodsum = sum;
		quantitylab = lab;
		addbtn = ab;
		subtractbtn = st;
		people = po;
	}
	public int getsum()
	{
		return foodsum;
	}
	public void actionPerformed(ActionEvent e) 
	{ 
		JButton Checkbtn = (JButton) e.getSource();
		if(Checkbtn == addbtn)
		{
			if(people>foodsum)
			{
				foodsum+=1;
				quantitylab.setText(Integer.toString(foodsum));
			}
		}			
		else if(Checkbtn == subtractbtn)
		{
			if(foodsum>0)
			{
				foodsum-=1;
				quantitylab.setText(Integer.toString(foodsum));
			}
		}
	}
}

class HelpChangestatus implements ActionListener
{
	public ImageIcon HelpPictures[] = {
            new ImageIcon("Pictures/Orderpage/teaching01.jpg"),
            new ImageIcon("Pictures/Orderpage/teaching02.jpg"),
            new ImageIcon("Pictures/Orderpage/teaching03.jpg")
            };
	public ImageIcon statuspicture[] = {
			new ImageIcon("Pictures/Orderpage/picture1.png"),
			new ImageIcon("Pictures/Orderpage/picture2.png"),
			new ImageIcon("Pictures/Orderpage/picture3.png"),
			};
	public JLabel helppic;
	public JLabel status;
	public JButton left;
	public JButton right;
	public int index;
	public HelpChangestatus(JLabel he,JLabel st,JButton le,JButton ri,int i) 
	{
		helppic = he;
		status = st;
		left = le;
		right = ri;
		index = i;
	}
	public void picturesetting()
	{
		status.setIcon(statuspicture[0]);
		helppic.setIcon(HelpPictures[0]);
	}
	public void actionPerformed(ActionEvent e) 
	{ 
		JButton Checkbtn = (JButton) e.getSource();
		int num = HelpPictures.length;
		if(Checkbtn == left && index>0)
		{
			index--;
		}
		else if(Checkbtn == right && index<num-1)
		{
			index++;
		}
		helppic.setIcon(HelpPictures[index%num]);
		status.setIcon(statuspicture[index%num]);
	}
}
public class Main
{
	static JFrame peoplefrm = new JFrame();
	static Container peoplecp = peoplefrm.getContentPane();
	static int people = 0;
	static JTextField peopleTF = new JTextField("");
	static JButton peoplebtn = new JButton();
	static JLabel peoplebackground = new JLabel();
	
    static JFrame mainfrm = new JFrame();
    static Container maincp = mainfrm.getContentPane();
	static JLabel Mainfrmlab = new JLabel();
	static JLabel Mainfrmlab2 = new JLabel();
	static JButton btn1 = new JButton();
	static JButton btn2 = new JButton();
	static JButton btn3 = new JButton();
	static JButton btn4 = new JButton();
	static JButton btn5 = new JButton();
	static JButton btn6 = new JButton();
	static JButton End_btn = new JButton();
	static JButton Address_btn = new JButton();
	
	static PictureChangeJLabel pcj = new PictureChangeJLabel();
	static CheckButtonCallWho_forMainfrm MI_FoodPage = new CheckButtonCallWho_forMainfrm(btn1,btn2,btn3,btn4,btn5,btn6);
	
	static JFrame appraisefrm = new JFrame();
	static JButton appraisebtn = new JButton();
	static JLabel appraiselab = new JLabel();
	static Container appraisecp = appraisefrm.getContentPane();
	static int appraisestar;
	
	static ImageIcon Logo = new ImageIcon("Pictures/Homepage/golden_pig.png");
	static ImageIcon Logodown = new ImageIcon("Pictures/Homepage/logodown.png");
	static ImageIcon imforEnd_btn = new ImageIcon("Pictures/Homepage/EndButton.png");
	static ImageIcon Address = new ImageIcon("Pictures/Homepage/Address.png");
	
	static ImageIcon imforbtn1 = new ImageIcon("Pictures/MainFood/MainFood1.jpg");
	static ImageIcon imforbtn2 = new ImageIcon("Pictures/MainFood/MainFood2.jpg");
	static ImageIcon imforbtn3 = new ImageIcon("Pictures/MainFood/MainFood3.jpg");
	static ImageIcon imforbtn4 = new ImageIcon("Pictures/MainFood/MainFood4.jpg");
	static ImageIcon imforbtn5 = new ImageIcon("Pictures/MainFood/MainFood5.png");
	static ImageIcon imforbtn6 = new ImageIcon("Pictures/MainFood/MainFood6.jpg");
	static ImageIcon imforbtn1changebig = new ImageIcon("Pictures/MainFood/MainFood1_change.jpg");
	static ImageIcon imforbtn2changebig = new ImageIcon("Pictures/MainFood/MainFood2_change.jpg");
	static ImageIcon imforbtn3changebig = new ImageIcon("Pictures/MainFood/MainFood3_change.jpg");
	static ImageIcon imforbtn4changebig = new ImageIcon("Pictures/MainFood/MainFood4_change.jpg");
	static ImageIcon imforbtn5changebig = new ImageIcon("Pictures/MainFood/MainFood5_change.png");
	static ImageIcon imforbtn6changebig = new ImageIcon("Pictures/MainFood/MainFood6_change.jpg");
	
	static ImageIcon Peoplebtn = new ImageIcon("Pictures/Peoplepage/peopleButtonpicture.jpg");
	static ImageIcon People_back = new ImageIcon("Pictures/Peoplepage/peopleBackground.png"); 
	
	static ImageIcon Orderstep1 = new ImageIcon("Pictures/Orderpage/Orderpage_1.png");
	static ImageIcon Orderstep2 = new ImageIcon("Pictures/Orderpage/Orderpage_2.png");
	static ImageIcon Orderstep3 = new ImageIcon("Pictures/Orderpage/Orderpage_3.png");
	static ImageIcon Orderstep4 = new ImageIcon("Pictures/Orderpage/Orderpage_4.png");
	static ImageIcon Orderstep5 = new ImageIcon("Pictures/Orderpage/Orderpage_5.png");
	static ImageIcon Orderstep6 = new ImageIcon("Pictures/Orderpage/Orderpage_6.png");
	static ImageIcon Ordertop1 = new ImageIcon("Pictures/Orderpage/Ordertop1.jpg");
	static ImageIcon Ordertop2 = new ImageIcon("Pictures/Orderpage/Ordertop2.png");
	static ImageIcon Ordertop3= new ImageIcon("Pictures/Orderpage/Ordertop3.png");
	static ImageIcon Ordertop4 = new ImageIcon("Pictures/Orderpage/Ordertop4.png");
	static ImageIcon Ordertop5 = new ImageIcon("Pictures/Orderpage/Ordertop5.png");
	static ImageIcon Ordertop6 = new ImageIcon("Pictures/Orderpage/Ordertop6.png");
	static ImageIcon OrderMenu_addButton = new ImageIcon("Pictures/Orderpage/AddButton.png");
	static ImageIcon OrderMenu_subtractButton = new ImageIcon("Pictures/Orderpage/SubtractButton.png");
	static ImageIcon OrderMenu_checkButton = new ImageIcon("Pictures/Orderpage/OrderCheckButton.png");
	static ImageIcon Help = new ImageIcon("Pictures/Orderpage/Questionmark.png");
	static ImageIcon Helpwhite = new ImageIcon("Pictures/Orderpage/white.jpg"); 
	static ImageIcon Helpleft = new ImageIcon("Pictures/Orderpage/leftpic.png"); 
	static ImageIcon Helpright = new ImageIcon("Pictures/Orderpage/rightpic.png"); 
	
	static ImageIcon star1 = new ImageIcon("Pictures/Appraisepage/star1.png");
	static ImageIcon star2 = new ImageIcon("Pictures/Appraisepage/star2.png");
	static ImageIcon star3 = new ImageIcon("Pictures/Appraisepage/star3.png");
	static ImageIcon star4 = new ImageIcon("Pictures/Appraisepage/star4.png");
	static ImageIcon star5 = new ImageIcon("Pictures/Appraisepage/star5.png");
	static ImageIcon star6 = new ImageIcon("Pictures/Appraisepage/star6.png");
	
	static int sum_forAppetizer1 = 0;
	static int sum_forAppetizer2 = 0;
	static int sum_forAppetizer3 = 0;
	static int allsum_forAppetizer = 0;
	
	static int sum_forStarter1 = 0;
	static int sum_forStarter2 = 0;
	static int sum_forStarter3 = 0;
	static int allsum_forStarter = 0;
	
	static int sum_forSoup1 = 0;
	static int sum_forSoup2 = 0;
	static int sum_forSoup3 = 0;
	static int sum_forSoup4 = 0;
	static int sum_forSoup5 = 0;
	static int sum_forSoup6 = 0;
	static int allsum_forSoup = 0;
	
	static int sum_forMainCourse1 = 0;
	static int sum_forMainCourse2 = 0;
	static int sum_forMainCourse3 = 0;
	static int sum_forMainCourse4 = 0;
	static int sum_forMainCourse5 = 0;
	static int sum_forMainCourse6 = 0;
	static int allsum_forMainCourse = 0;
	
	static int sum_forDessert1 = 0;
	static int sum_forDessert2 = 0;
	static int sum_forDessert3 = 0;
	static int sum_forDessert4 = 0;
	static int sum_forDessert5 = 0;
	static int allsum_forDessert = 0;
	
	static int sum_forBeverage1 = 0;
	static int sum_forBeverage2 = 0;
	static int sum_forBeverage3 = 0;
	static int sum_forBeverage4 = 0;
	static int sum_forBeverage5 = 0;
	static int allsum_forBeverage = 0;
	
	static int second = 5;
	
	static boolean capoouser = false;
	
	static TreeMap<String,Integer> OrderMenu = new TreeMap<String,Integer>();
	
	static void setMainFrm_Buttons() 
    {
    	btn1.setIcon(imforbtn1);
    	btn2.setIcon(imforbtn2);
    	btn3.setIcon(imforbtn3);
    	btn4.setIcon(imforbtn4);
    	btn5.setIcon(imforbtn5);
    	btn6.setIcon(imforbtn6);
    	End_btn.setIcon(imforEnd_btn);
    	Address_btn.setIcon(Address);
    	
    	btn1.setBounds(45,430,190,150);
    	btn2.setBounds(325,430,190,150);
    	btn3.setBounds(605,430,190,150);
    	btn4.setBounds(45,630,190,150);
    	btn5.setBounds(325,630,190,150);
    	btn6.setBounds(605,630,190,150);	
    	End_btn.setBounds(345,805,150,60);
    	Address_btn.setBounds(750,25,50,50);
    	
    	maincp.add(btn1);
    	maincp.add(btn2);
    	maincp.add(btn3);
    	maincp.add(btn4);
    	maincp.add(btn5);
    	maincp.add(btn6);
    	maincp.add(End_btn);
    	maincp.add(Address_btn);
    	
    	btn1.setRolloverEnabled(true);
    	btn1.setRolloverIcon(imforbtn1changebig);
    	btn2.setRolloverEnabled(true);
    	btn2.setRolloverIcon(imforbtn2changebig);
    	btn3.setRolloverEnabled(true);
    	btn3.setRolloverIcon(imforbtn3changebig);
    	btn4.setRolloverEnabled(true);
    	btn4.setRolloverIcon(imforbtn4changebig);
    	btn5.setRolloverEnabled(true);
    	btn5.setRolloverIcon(imforbtn5changebig);
    	btn6.setRolloverEnabled(true);
    	btn6.setRolloverIcon(imforbtn6changebig);
    	
    	btn1.addActionListener(MI_FoodPage);
    	btn2.addActionListener(MI_FoodPage);
    	btn3.addActionListener(MI_FoodPage);
    	btn4.addActionListener(MI_FoodPage);
    	btn5.addActionListener(MI_FoodPage);
    	btn6.addActionListener(MI_FoodPage);
    }
    static void logosetting() 
    {
    	Mainfrmlab.setIcon(Logo);
    	Mainfrmlab.setBounds(350,-130,200,350);
    	Mainfrmlab2.setIcon(Logodown);
    	Mainfrmlab2.setBounds(0,805,850,350);
    	maincp.add(Mainfrmlab);
    	maincp.add(Mainfrmlab2);
    }
    static void Picturechangefix()
    {
    	pcj.setBounds(-120,100,1000,1000);
    	maincp.add(pcj);
    }
    static void dataSetting_forOrder()
    {
    	File CreateOrderDir = new File(".\\OrderMenuDir");
		if(!CreateOrderDir.exists()) 
			CreateOrderDir.mkdirs();
		
		File CreateFile1 = new File(CreateOrderDir,"OrderList");
		if(!CreateFile1.exists())
		{
			try
			{
				CreateFile1.createNewFile();
				System.out.println("Create OK");
			}
			catch (IOException e)
			{
				System.out.println("Exception(your file_order).");
			}
		}
		
		try
		{
			FileWriter fiwr = new FileWriter(".\\OrderMenuDir\\OrderList");
			BufferedWriter biwr = new BufferedWriter(fiwr);
			Date date_OrderMenuDir = new Date();
			
			for(String name : OrderMenu.keySet())
			{
				if(OrderMenu.get(name)!=0)
				{
					biwr.write(name+" "+Integer.toString(OrderMenu.get(name)));	
					biwr.newLine();
				}
			}
			
			biwr.write(date_OrderMenuDir.toString());
			
			biwr.flush();
			biwr.close();
			fiwr.close();
		}
		catch (Exception e)
		{
			System.out.println("Exception(your orderList).");
		}
    }
    static void dataSetting_forAppraiseDir()
    {
    	File CreateAppraiseDir = new File(".\\AppraiseDir");
		if(!CreateAppraiseDir.exists()) 
			CreateAppraiseDir.mkdirs();
		
		File CreateFile2 = new File(CreateAppraiseDir,"AllAppraise");
		if(!CreateFile2.exists())
		{
			try
			{
				CreateFile2.createNewFile();
				System.out.println("Create OK");
			}
			catch (IOException e)
			{
				System.out.println("Exception(your file_appraise).");
			}
		}
		
		try
		{
			FileWriter fiwr2 = new FileWriter(".\\AppraiseDir\\AllAppraise",true);
			BufferedWriter biwr2 = new BufferedWriter(fiwr2);
			Date date_AppraiseDir = new Date();
			
			biwr2.write(Integer.toString(appraisestar)+" Star");
			biwr2.newLine();
			biwr2.write(date_AppraiseDir.toString());
			biwr2.newLine();
			
			biwr2.flush();
			biwr2.close();
			fiwr2.close();
		}
		catch (Exception e)
		{
			System.out.println("Exception(your appraise).");
		}
    }
    static void QuestionHelp(Container cp)
    {
    	JButton Helpbtn = new JButton();
    	
    	Helpbtn.setIcon(Help);
		Helpbtn.setBounds(780,10,50,50);
		cp.add(Helpbtn);
    	
		Helpbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				QuestionHelpwindows();
			}
		});
    }
    static void QuestionHelpwindows()
    {
    	JFrame helpfrm = new JFrame("help");
    	Container helpcp = helpfrm.getContentPane();
    	JButton leftbtn = new JButton();
    	JButton rightbtn = new JButton();
    	JLabel helppictures = new JLabel();
    	JLabel nowstatus = new JLabel();
    	
    	int index = 0;
    	
    	HelpChangestatus help = new HelpChangestatus(helppictures,nowstatus,leftbtn,rightbtn,index);
    			
    	helpcp.setLayout(null);
    	
    	leftbtn.setRolloverEnabled(true);
    	leftbtn.setIcon(Helpwhite);
    	leftbtn.setRolloverIcon(Helpleft);
    	leftbtn.setPressedIcon(Helpleft);
    	leftbtn.setBorder(null);
    	leftbtn.setBounds(70, 60, 50, 400);
    	helpcp.add(leftbtn);
    	
    	rightbtn.setRolloverEnabled(true);
    	rightbtn.setIcon(Helpwhite);
    	rightbtn.setRolloverIcon(Helpright);
    	rightbtn.setPressedIcon(Helpright);
    	rightbtn.setBorder(null);
    	rightbtn.setBounds(710, 60, 50, 400);
    	helpcp.add(rightbtn);
    	
    	help.picturesetting();
    	nowstatus.setBounds(340,480,150,40);
    	helpcp.add(nowstatus);
    	helppictures.setBounds(120,60,590,400);
    	helpcp.add(helppictures);
    	
    	leftbtn.addActionListener(help);
    	rightbtn.addActionListener(help);
    	
    	helpcp.setBackground(Color.WHITE);
    	helpfrm.setSize(830,600);
    	helpfrm.setResizable(false); 
        helpfrm.setLocationRelativeTo(null);
        helpfrm.setVisible(true);
    }
    
    static void PeopleFirstPage()
    {
    	peoplecp.setLayout(null);
    	
    	peopleTF.setBounds(160, 180, 80, 30);
    	peopleTF.setFont(new Font("TimeRoman",Font.BOLD ,25)) ;
    	peopleTF.setHorizontalAlignment(SwingConstants.CENTER);
    	peopleTF.setBorder(null);
    	peoplecp.add(peopleTF);
    	
    	peoplebtn.setIcon(Peoplebtn);
    	peoplebtn.setBounds(140, 30, 120, 120);
    	peoplebtn.setBorder(null); 
    	peoplecp.add(peoplebtn);
    	
    	peoplebtn.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e)
    		{
    			if(peopleTF.getText().equals("")||peopleTF.getText().equals("0"))
    			{
    				JFrame warningfrm = new JFrame();
    				Container wcp = warningfrm.getContentPane();
    				JLabel wordtowarning = new JLabel("請輸入正確人數");
    				JButton clicktook = new JButton("OK");
    				
    				wcp.setLayout(null);
    				
    				wordtowarning.setFont(new Font("TimeRoman",Font.BOLD ,27));
    				wordtowarning.setBounds(95,1,500,200);
    				
    				clicktook.setFont(new Font("TimeRoman",Font.BOLD ,20));
    				clicktook.setBounds(145,180,100,40);
    				clicktook.addActionListener(new ActionListener() {
    					public void actionPerformed(ActionEvent e)
    					{
    						warningfrm.dispose();
    					}
    				});
    				
    				wcp.add(clicktook);
    				wcp.add(wordtowarning);
    				warningfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    				warningfrm.setTitle("Check");
    				warningfrm.setSize(400,300);
    				warningfrm.setResizable(false); 
    				warningfrm.setLocationRelativeTo(null);
    				warningfrm.setVisible(true);
    			}
    			else
    			{
    				people = Integer.valueOf(peopleTF.getText());
	    			MainHomePage();
	    			peoplefrm.dispose();
	    			QuestionHelpwindows();
    			}
    		}
    	});
    	
    	peoplebackground.setIcon(People_back);
    	peoplebackground.setBounds(0,0,400,300);
    	peoplecp.add(peoplebackground);
    	
    	peoplefrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	peoplefrm.setTitle("How many people?");
        peoplefrm.setSize(400,300);
        peoplefrm.setResizable(false); 
        peoplefrm.setLocationRelativeTo(null);
        peoplefrm.setVisible(true);
    }
    static void MainHomePage()
    {
    	maincp.setLayout(null);
    	setMainFrm_Buttons();
    	
    	logosetting();
    	
    	Picturechangefix();
    	
    	End_btn.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) 
			{ 
				OrderPage1();
				mainfrm.dispose();
			} 
		}); 
    	if(capoouser == true)
    	{
	    	Address_btn.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e) 
				{ 
					String url = "https://goldenpigfrancefood.wordpress.com/";
					try 
					{
						Runtime.getRuntime().exec("cmd /c start " + url);
					} 
					catch (IOException e1) 
					{
						System.out.println("null address");
					}
				} 
			}); 
    	}
    	maincp.setBackground(Color.white);
    	mainfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainfrm.setTitle("Golden Pig HomePage");
        mainfrm.setSize(850,1090);
        mainfrm.setResizable(false); 
        mainfrm.setLocationRelativeTo(null);
        mainfrm.setVisible(true);
    }
    static void OrderPage1()
    {
    	JFrame frm1 = new JFrame("Order Menu Step1");
    	Container Ordercp1 = frm1.getContentPane();
    	JLabel Ordersteppic1 = new JLabel();
    	JButton Decisionbtn1 = new JButton();
    	
    	JButton SubtractButton_forAppetizer1 = new JButton();
    	JButton AddButton_forAppetizer1 = new JButton();
    	JLabel Quantity_forAppetizer1 = new JLabel();
    	
    	JButton SubtractButton_forAppetizer2 = new JButton();
    	JButton AddButton_forAppetizer2 = new JButton();
    	JLabel Quantity_forAppetizer2 = new JLabel();
    	
    	JButton SubtractButton_forAppetizer3 = new JButton();
    	JButton AddButton_forAppetizer3 = new JButton();
    	JLabel Quantity_forAppetizer3 = new JLabel();
    	
    	JLabel OrderTopPicture1 = new JLabel();
    	
    	Countsum countsum1_forAppetizer = new Countsum(sum_forAppetizer1,Quantity_forAppetizer1,AddButton_forAppetizer1,SubtractButton_forAppetizer1,people);
    	Countsum countsum2_forAppetizer = new Countsum(sum_forAppetizer2,Quantity_forAppetizer2,AddButton_forAppetizer2,SubtractButton_forAppetizer2,people);
    	Countsum countsum3_forAppetizer = new Countsum(sum_forAppetizer3,Quantity_forAppetizer3,AddButton_forAppetizer3,SubtractButton_forAppetizer3,people);
		Ordercp1.setLayout(null);
		
		Quantity_forAppetizer1.setText(Integer.toString(sum_forAppetizer1));
		Quantity_forAppetizer1.setFont(new Font("TimeRoman",Font.BOLD ,30));
		Quantity_forAppetizer1.setBounds(120,530,100,100);
		Ordercp1.add(Quantity_forAppetizer1);
		
		AddButton_forAppetizer1.setIcon(OrderMenu_addButton);
		AddButton_forAppetizer1.setBounds(40,550,50,50);
		AddButton_forAppetizer1.setBorder(null);
		Ordercp1.add(AddButton_forAppetizer1);
		
		SubtractButton_forAppetizer1.setIcon(OrderMenu_subtractButton);
		SubtractButton_forAppetizer1.setBounds(170,550,50,50);
		SubtractButton_forAppetizer1.setBorder(null);
		Ordercp1.add(SubtractButton_forAppetizer1);
		
		SubtractButton_forAppetizer1.addActionListener(countsum1_forAppetizer);
		AddButton_forAppetizer1.addActionListener(countsum1_forAppetizer);
		
		Quantity_forAppetizer2.setText(Integer.toString(sum_forAppetizer2));
		Quantity_forAppetizer2.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forAppetizer2.setBounds(410,530,100,100);
		Ordercp1.add(Quantity_forAppetizer2);
		
		AddButton_forAppetizer2.setIcon(OrderMenu_addButton);
		AddButton_forAppetizer2.setBounds(330,550,50,50);
		AddButton_forAppetizer2.setBorder(null);
		Ordercp1.add(AddButton_forAppetizer2);
		
		SubtractButton_forAppetizer2.setIcon(OrderMenu_subtractButton);
		SubtractButton_forAppetizer2.setBounds(460,550,50,50);
		SubtractButton_forAppetizer2.setBorder(null);
		Ordercp1.add(SubtractButton_forAppetizer2);
		
		SubtractButton_forAppetizer2.addActionListener(countsum2_forAppetizer);
		AddButton_forAppetizer2.addActionListener(countsum2_forAppetizer);
		
		Quantity_forAppetizer3.setText(Integer.toString(sum_forAppetizer3));
		Quantity_forAppetizer3.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forAppetizer3.setBounds(705,530,100,100);
		Ordercp1.add(Quantity_forAppetizer3);
		
		AddButton_forAppetizer3.setIcon(OrderMenu_addButton);
		AddButton_forAppetizer3.setBounds(625,550,50,50); 
		AddButton_forAppetizer3.setBorder(null);
		Ordercp1.add(AddButton_forAppetizer3);
		
		SubtractButton_forAppetizer3.setIcon(OrderMenu_subtractButton);
		SubtractButton_forAppetizer3.setBounds(755,550,50,50);
		SubtractButton_forAppetizer3.setBorder(null);
		Ordercp1.add(SubtractButton_forAppetizer3);
		
		SubtractButton_forAppetizer3.addActionListener(countsum3_forAppetizer);
		AddButton_forAppetizer3.addActionListener(countsum3_forAppetizer);
		
		Decisionbtn1.setIcon(OrderMenu_checkButton);
		Decisionbtn1.setBounds(345,800,150,60);
		Ordercp1.add(Decisionbtn1);
		Decisionbtn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JFrame Decisionmessage_check = new JFrame("Check");
				Container Decisionmessage_checkcp = Decisionmessage_check.getContentPane();
				JLabel Decisionmessage_checklab1 = new JLabel();
				JLabel Decisionmessage_checklab2 = new JLabel();
				JLabel Decisionmessage_checklab3 = new JLabel();
				JLabel Decisionmessage_checklabwarning = new JLabel();
				JButton Decisionmessage_YESbtn = new JButton("YES");
				JButton Decisionmessage_NObtn = new JButton("NO");
				JButton Decisionmessage_OKbtn = new JButton("OK");
				
				sum_forAppetizer1 = countsum1_forAppetizer.getsum();
				sum_forAppetizer2 = countsum2_forAppetizer.getsum();
				sum_forAppetizer3 = countsum3_forAppetizer.getsum();
				
				allsum_forAppetizer = sum_forAppetizer1+sum_forAppetizer2+sum_forAppetizer3;
				
				Decisionmessage_checkcp.setLayout(null);
				if(allsum_forAppetizer == people)
				{
					int pos_y = 40;
					int pos_count = 1;
					int pos_countmaxsize = 4;
					if(sum_forAppetizer1>0)
					{
						Decisionmessage_checklab1.setText("含羞草蛋沙拉 x "+Integer.toString(sum_forAppetizer1));
						Decisionmessage_checklab1.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab1.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab1);
						pos_count++;
					}
					
					if(sum_forAppetizer2>0)
					{
						Decisionmessage_checklab2.setText("赤裸煙花女 x "+Integer.toString(sum_forAppetizer2));
						Decisionmessage_checklab2.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab2.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab2);
						pos_count++;
					}
					
					if(sum_forAppetizer3>0)
					{
						Decisionmessage_checklab3.setText("法式蔬菜凍 x "+Integer.toString(sum_forAppetizer3));
						Decisionmessage_checklab3.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab3.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab3);
						pos_count++;
					}
					
					Decisionmessage_YESbtn.setBounds(50,200-(pos_countmaxsize-pos_count)*pos_y,80,40);
					Decisionmessage_checkcp.add(Decisionmessage_YESbtn);
					Decisionmessage_YESbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							OrderMenu.put("sum_forAppetizer1", sum_forAppetizer1);
							OrderMenu.put("sum_forAppetizer2", sum_forAppetizer2);
							OrderMenu.put("sum_forAppetizer3", sum_forAppetizer3);
							
							Decisionmessage_check.dispose();
							OrderPage2();
							frm1.dispose();
						}
					});
					
					Decisionmessage_NObtn.setBounds(270,200-(pos_countmaxsize-pos_count)*pos_y,80,40);
					Decisionmessage_checkcp.add(Decisionmessage_NObtn);
					Decisionmessage_NObtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Decisionmessage_check.dispose();
						}
					});
					
					Decisionmessage_check.setSize(400,300-(pos_countmaxsize-pos_count)*pos_y);
				}
				else
				{
					Decisionmessage_checklabwarning.setText("請選擇與總人數相同之數量!");
					Decisionmessage_checklabwarning.setFont(new Font("TimeRoman",Font.BOLD ,30) );
					Decisionmessage_checklabwarning.setBounds(50,100,400,30);
					Decisionmessage_checkcp.add(Decisionmessage_checklabwarning);
					
					Decisionmessage_OKbtn.setBounds(190,200,100,40);
					Decisionmessage_checkcp.add(Decisionmessage_OKbtn);
					Decisionmessage_OKbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Decisionmessage_check.dispose();
						}
					});
					
					Decisionmessage_check.setSize(500,300);
				}
				Decisionmessage_checkcp.setBackground(Color.white);
				Decisionmessage_check.setLocationRelativeTo(null);
				Decisionmessage_check.setResizable(false);
				Decisionmessage_check.setVisible(true);
			}
		});
		
		QuestionHelp(Ordercp1);
		
		OrderTopPicture1.setIcon(Ordertop1);
		OrderTopPicture1.setBounds(0,70,850,250);
		Ordercp1.add(OrderTopPicture1);
		
		Ordersteppic1.setIcon(Orderstep1);
		Ordersteppic1.setBounds(10,-30,850,1090);
		Ordercp1.add(Ordersteppic1);
		Ordercp1.setBackground(Color.white);
		frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm1.setSize(850,1090);
	    frm1.setLocationRelativeTo(null);
	    frm1.setResizable(false); 
	    frm1.setVisible(true);
    }
    static void OrderPage2()
    {
    	JFrame frm2 = new JFrame("Order Menu Step2");
    	Container Ordercp2 = frm2.getContentPane();
    	JLabel Ordersteppic2 = new JLabel();
    	JButton Decisionbtn2 = new JButton();
    	
    	JButton SubtractButton_forStarter1 = new JButton();
    	JButton AddButton_forStarter1 = new JButton();
    	JLabel Quantity_forStarter1 = new JLabel();
    	
    	JButton SubtractButton_forStarter2 = new JButton();
    	JButton AddButton_forStarter2 = new JButton();
    	JLabel Quantity_forStarter2 = new JLabel();	
    	
    	JButton SubtractButton_forStarter3 = new JButton();
    	JButton AddButton_forStarter3 = new JButton();
    	JLabel Quantity_forStarter3 = new JLabel();
    	
    	JLabel OrderTopPicture2 = new JLabel();
    	
		Countsum countsum1_forStarter = new Countsum(sum_forStarter1,Quantity_forStarter1,AddButton_forStarter1,SubtractButton_forStarter1,people);
		Countsum countsum2_forStarter = new Countsum(sum_forStarter2,Quantity_forStarter2,AddButton_forStarter2,SubtractButton_forStarter2,people);
		Countsum countsum3_forStarter = new Countsum(sum_forStarter3,Quantity_forStarter3,AddButton_forStarter3,SubtractButton_forStarter3,people);
		
		Ordercp2.setLayout(null);
		
		Quantity_forStarter1.setText(Integer.toString(sum_forStarter1));
		Quantity_forStarter1.setFont(new Font("TimeRoman",Font.BOLD ,30));
		Quantity_forStarter1.setBounds(120,530,100,100);
		Ordercp2.add(Quantity_forStarter1);
		
		AddButton_forStarter1.setIcon(OrderMenu_addButton);
		AddButton_forStarter1.setBounds(40,550,50,50);
		AddButton_forStarter1.setBorder(null);
		Ordercp2.add(AddButton_forStarter1);
		
		SubtractButton_forStarter1.setIcon(OrderMenu_subtractButton);
		SubtractButton_forStarter1.setBounds(170,550,50,50);
		SubtractButton_forStarter1.setBorder(null);
		Ordercp2.add(SubtractButton_forStarter1);
		
		SubtractButton_forStarter1.addActionListener(countsum1_forStarter);
		AddButton_forStarter1.addActionListener(countsum1_forStarter);
		
		Quantity_forStarter2.setText(Integer.toString(sum_forStarter2));
		Quantity_forStarter2.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forStarter2.setBounds(410,530,100,100);
		Ordercp2.add(Quantity_forStarter2);
		
		AddButton_forStarter2.setIcon(OrderMenu_addButton);
		AddButton_forStarter2.setBounds(330,550,50,50); 
		AddButton_forStarter2.setBorder(null);
		Ordercp2.add(AddButton_forStarter2);
		
		SubtractButton_forStarter2.setIcon(OrderMenu_subtractButton);
		SubtractButton_forStarter2.setBounds(460,550,50,50);
		SubtractButton_forStarter2.setBorder(null);
		Ordercp2.add(SubtractButton_forStarter2);
		
		SubtractButton_forStarter2.addActionListener(countsum2_forStarter);
		AddButton_forStarter2.addActionListener(countsum2_forStarter);
		
		Quantity_forStarter3.setText(Integer.toString(sum_forStarter3));
		Quantity_forStarter3.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forStarter3.setBounds(705,530,100,100);
		Ordercp2.add(Quantity_forStarter3);
		
		AddButton_forStarter3.setIcon(OrderMenu_addButton);
		AddButton_forStarter3.setBounds(625,550,50,50); 
		AddButton_forStarter3.setBorder(null);
		Ordercp2.add(AddButton_forStarter3);
		
		SubtractButton_forStarter3.setIcon(OrderMenu_subtractButton);
		SubtractButton_forStarter3.setBounds(755,550,50,50);
		SubtractButton_forStarter3.setBorder(null);
		Ordercp2.add(SubtractButton_forStarter3);
		
		SubtractButton_forStarter3.addActionListener(countsum3_forStarter);
		AddButton_forStarter3.addActionListener(countsum3_forStarter);
		
		Decisionbtn2.setIcon(OrderMenu_checkButton);
		Decisionbtn2.setBounds(345,800,150,60);
		Ordercp2.add(Decisionbtn2);
		Decisionbtn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JFrame Decisionmessage_check = new JFrame("Check");
				Container Decisionmessage_checkcp = Decisionmessage_check.getContentPane();
				JLabel Decisionmessage_checklab1 = new JLabel();
				JLabel Decisionmessage_checklab2 = new JLabel();
				JLabel Decisionmessage_checklab3 = new JLabel();
				JLabel Decisionmessage_checklabwarning = new JLabel();
				JButton Decisionmessage_YESbtn = new JButton("YES");
				JButton Decisionmessage_NObtn = new JButton("NO");
				JButton Decisionmessage_OKbtn = new JButton("OK");
				
				sum_forStarter1 = countsum1_forStarter.getsum();
				sum_forStarter2 = countsum2_forStarter.getsum();
				sum_forStarter3 = countsum3_forStarter.getsum();
				
				allsum_forStarter = sum_forStarter1+sum_forStarter2+sum_forStarter3;
				
				Decisionmessage_checkcp.setLayout(null);
				if(allsum_forStarter == people)
				{
					int pos_y = 40;
					int pos_count = 1;
					int pos_countmaxsize = 4;
					if(sum_forStarter1>0)
					{
						Decisionmessage_checklab1.setText("法式奶油冰霜燉菜 x "+Integer.toString(sum_forStarter1));
						Decisionmessage_checklab1.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab1.setBounds(50,pos_y*pos_count,400,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab1);
						pos_count++;
					}
					
					if(sum_forStarter2>0)
					{
						Decisionmessage_checklab2.setText("普羅旺斯雜菜堡 x "+Integer.toString(sum_forStarter2));
						Decisionmessage_checklab2.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab2.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab2);
						pos_count++;
					}
					
					if(sum_forStarter3>0)
					{
						Decisionmessage_checklab3.setText("炸米飯糰 x "+Integer.toString(sum_forStarter3));
						Decisionmessage_checklab3.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab3.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab3);
						pos_count++;
					}
					
					Decisionmessage_YESbtn.setBounds(50,200-(pos_countmaxsize-pos_count)*pos_y,80,40);
					Decisionmessage_checkcp.add(Decisionmessage_YESbtn);
					Decisionmessage_YESbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							OrderMenu.put("sum_forStarter1", sum_forStarter1);
							OrderMenu.put("sum_forStarter2", sum_forStarter2);
							OrderMenu.put("sum_forStarter3", sum_forStarter3);
							
							Decisionmessage_check.dispose();
							OrderPage3();
							frm2.dispose();						
						}
					});
					
					Decisionmessage_NObtn.setBounds(270,200-(pos_countmaxsize-pos_count)*pos_y,80,40);
					Decisionmessage_checkcp.add(Decisionmessage_NObtn);
					Decisionmessage_NObtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Decisionmessage_check.dispose();
						}
					});
					
					Decisionmessage_check.setSize(400,300-(pos_countmaxsize-pos_count)*pos_y);
				}
				else
				{
					Decisionmessage_checklabwarning.setText("請選擇與總人數相同之數量!");
					Decisionmessage_checklabwarning.setFont(new Font("TimeRoman",Font.BOLD ,30) );
					Decisionmessage_checklabwarning.setBounds(50,100,400,30);
					Decisionmessage_checkcp.add(Decisionmessage_checklabwarning);
					
					Decisionmessage_OKbtn.setBounds(190,200,100,40);
					Decisionmessage_checkcp.add(Decisionmessage_OKbtn);
					Decisionmessage_OKbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Decisionmessage_check.dispose();
						}
					});
					
					Decisionmessage_check.setSize(500,300);
				}
				Decisionmessage_checkcp.setBackground(Color.white);
				Decisionmessage_check.setLocationRelativeTo(null);
				Decisionmessage_check.setResizable(false);
				Decisionmessage_check.setVisible(true);
			}
		});
		
		QuestionHelp(Ordercp2);
		
		OrderTopPicture2.setIcon(Ordertop2);
		OrderTopPicture2.setBounds(0,70,850,250);
		Ordercp2.add(OrderTopPicture2);
		
		Ordersteppic2.setIcon(Orderstep2);
		Ordersteppic2.setBounds(10,-30,850,1090);
		Ordercp2.add(Ordersteppic2);
		Ordercp2.setBackground(Color.white);
		frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm2.setSize(850,1090);
	    frm2.setLocationRelativeTo(null);
	    frm2.setResizable(false); 
	    frm2.setVisible(true);
    }
    static void OrderPage3()
    {
    	JFrame frm3 = new JFrame("Order Menu Step3");
    	Container Ordercp3 = frm3.getContentPane();
    	JLabel Ordersteppic3 = new JLabel();
    	JButton Decisionbtn3 = new JButton();		
    	
    	JButton SubtractButton_forSoup1 = new JButton();
    	JButton AddButton_forSoup1 = new JButton();
    	JLabel Quantity_forSoup1 = new JLabel();
    	
    	JButton SubtractButton_forSoup2 = new JButton();
    	JButton AddButton_forSoup2 = new JButton();
    	JLabel Quantity_forSoup2 = new JLabel();
    	
    	JButton SubtractButton_forSoup3 = new JButton();
    	JButton AddButton_forSoup3 = new JButton();
    	JLabel Quantity_forSoup3 = new JLabel();
    	
    	JButton SubtractButton_forSoup4 = new JButton();
    	JButton AddButton_forSoup4 = new JButton();
    	JLabel Quantity_forSoup4 = new JLabel();
    	
    	JButton SubtractButton_forSoup5 = new JButton();
    	JButton AddButton_forSoup5 = new JButton();
    	JLabel Quantity_forSoup5 = new JLabel();
    	
    	JButton SubtractButton_forSoup6 = new JButton();
    	JButton AddButton_forSoup6 = new JButton();
    	JLabel Quantity_forSoup6 = new JLabel();
    	
    	JLabel OrderTopPicture3 = new JLabel();
    	
		Countsum countsum1_forSoup = new Countsum(sum_forSoup1,Quantity_forSoup1,AddButton_forSoup1,SubtractButton_forSoup1,people);
		Countsum countsum2_forSoup = new Countsum(sum_forSoup2,Quantity_forSoup2,AddButton_forSoup2,SubtractButton_forSoup2,people);
		Countsum countsum3_forSoup = new Countsum(sum_forSoup3,Quantity_forSoup3,AddButton_forSoup3,SubtractButton_forSoup3,people);
		Countsum countsum4_forSoup = new Countsum(sum_forSoup4,Quantity_forSoup4,AddButton_forSoup4,SubtractButton_forSoup4,people);
		Countsum countsum5_forSoup = new Countsum(sum_forSoup5,Quantity_forSoup5,AddButton_forSoup5,SubtractButton_forSoup5,people);
		Countsum countsum6_forSoup = new Countsum(sum_forSoup6,Quantity_forSoup6,AddButton_forSoup6,SubtractButton_forSoup6,people);
		
		Ordercp3.setLayout(null);
		
		Quantity_forSoup1.setText(Integer.toString(sum_forSoup1));
		Quantity_forSoup1.setFont(new Font("TimeRoman",Font.BOLD ,30));
		Quantity_forSoup1.setBounds(120,530,100,100);
		Ordercp3.add(Quantity_forSoup1);
		
		AddButton_forSoup1.setIcon(OrderMenu_addButton);
		AddButton_forSoup1.setBounds(40,550,50,50);
		AddButton_forSoup1.setBorder(null);
		Ordercp3.add(AddButton_forSoup1);
		
		SubtractButton_forSoup1.setIcon(OrderMenu_subtractButton);
		SubtractButton_forSoup1.setBounds(170,550,50,50);
		SubtractButton_forSoup1.setBorder(null);
		Ordercp3.add(SubtractButton_forSoup1);
		
		SubtractButton_forSoup1.addActionListener(countsum1_forSoup);
		AddButton_forSoup1.addActionListener(countsum1_forSoup);
		
		Quantity_forSoup2.setText(Integer.toString(sum_forSoup2));
		Quantity_forSoup2.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forSoup2.setBounds(410,530,100,100);
		Ordercp3.add(Quantity_forSoup2);
		
		AddButton_forSoup2.setIcon(OrderMenu_addButton);
		AddButton_forSoup2.setBounds(330,550,50,50);
		AddButton_forSoup2.setBorder(null);
		Ordercp3.add(AddButton_forSoup2);
		
		SubtractButton_forSoup2.setIcon(OrderMenu_subtractButton);
		SubtractButton_forSoup2.setBounds(460,550,50,50);
		SubtractButton_forSoup2.setBorder(null);
		Ordercp3.add(SubtractButton_forSoup2);
		
		SubtractButton_forSoup2.addActionListener(countsum2_forSoup);
		AddButton_forSoup2.addActionListener(countsum2_forSoup);
		
		Quantity_forSoup3.setText(Integer.toString(sum_forSoup3));
		Quantity_forSoup3.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forSoup3.setBounds(705,530,100,100);
		Ordercp3.add(Quantity_forSoup3);
		
		AddButton_forSoup3.setIcon(OrderMenu_addButton);
		AddButton_forSoup3.setBounds(625,550,50,50); 
		AddButton_forSoup3.setBorder(null);
		Ordercp3.add(AddButton_forSoup3);
		
		SubtractButton_forSoup3.setIcon(OrderMenu_subtractButton);
		SubtractButton_forSoup3.setBounds(755,550,50,50);
		SubtractButton_forSoup3.setBorder(null);
		Ordercp3.add(SubtractButton_forSoup3);
		
		SubtractButton_forSoup3.addActionListener(countsum3_forSoup);
		AddButton_forSoup3.addActionListener(countsum3_forSoup);
		
		Quantity_forSoup4.setText(Integer.toString(sum_forSoup4));
		Quantity_forSoup4.setFont(new Font("TimeRoman",Font.BOLD ,30));
		Quantity_forSoup4.setBounds(120,840,100,100);
		Ordercp3.add(Quantity_forSoup4);
		
		AddButton_forSoup4.setIcon(OrderMenu_addButton);
		AddButton_forSoup4.setBounds(40,860,50,50);
		AddButton_forSoup4.setBorder(null);
		Ordercp3.add(AddButton_forSoup4);
		
		SubtractButton_forSoup4.setIcon(OrderMenu_subtractButton);
		SubtractButton_forSoup4.setBounds(170,860,50,50);
		SubtractButton_forSoup4.setBorder(null);
		Ordercp3.add(SubtractButton_forSoup4);
		
		SubtractButton_forSoup4.addActionListener(countsum4_forSoup);
		AddButton_forSoup4.addActionListener(countsum4_forSoup);
		
		Quantity_forSoup5.setText(Integer.toString(sum_forSoup5));
		Quantity_forSoup5.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forSoup5.setBounds(410,840,100,100);
		Ordercp3.add(Quantity_forSoup5);
		
		AddButton_forSoup5.setIcon(OrderMenu_addButton);
		AddButton_forSoup5.setBounds(330,860,50,50); 
		AddButton_forSoup5.setBorder(null);
		Ordercp3.add(AddButton_forSoup5);
		
		SubtractButton_forSoup5.setIcon(OrderMenu_subtractButton);
		SubtractButton_forSoup5.setBounds(460,860,50,50);
		SubtractButton_forSoup5.setBorder(null);
		Ordercp3.add(SubtractButton_forSoup5);
		
		SubtractButton_forSoup5.addActionListener(countsum5_forSoup);
		AddButton_forSoup5.addActionListener(countsum5_forSoup);
		
		Quantity_forSoup6.setText(Integer.toString(sum_forSoup6));
		Quantity_forSoup6.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forSoup6.setBounds(705,840,100,100);
		Ordercp3.add(Quantity_forSoup6);
		
		AddButton_forSoup6.setIcon(OrderMenu_addButton);
		AddButton_forSoup6.setBounds(625,860,50,50); 
		AddButton_forSoup6.setBorder(null);
		Ordercp3.add(AddButton_forSoup6);
		
		SubtractButton_forSoup6.setIcon(OrderMenu_subtractButton);
		SubtractButton_forSoup6.setBounds(755,860,50,50);
		SubtractButton_forSoup6.setBorder(null);
		Ordercp3.add(SubtractButton_forSoup6);
		
		SubtractButton_forSoup6.addActionListener(countsum6_forSoup);
		AddButton_forSoup6.addActionListener(countsum6_forSoup);
		
		Decisionbtn3.setIcon(OrderMenu_checkButton);
		Decisionbtn3.setBounds(345,950,150,60);
		Ordercp3.add(Decisionbtn3);
		Decisionbtn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JFrame Decisionmessage_check = new JFrame("Check");
				Container Decisionmessage_checkcp = Decisionmessage_check.getContentPane();
				JLabel Decisionmessage_checklab1 = new JLabel();
				JLabel Decisionmessage_checklab2 = new JLabel();
				JLabel Decisionmessage_checklab3 = new JLabel();
				JLabel Decisionmessage_checklab4 = new JLabel();
				JLabel Decisionmessage_checklab5 = new JLabel();
				JLabel Decisionmessage_checklab6 = new JLabel();
				JLabel Decisionmessage_checklabwarning = new JLabel();
				JButton Decisionmessage_YESbtn = new JButton("YES");
				JButton Decisionmessage_NObtn = new JButton("NO");
				JButton Decisionmessage_OKbtn = new JButton("OK");
				
				sum_forSoup1 = countsum1_forSoup.getsum();
				sum_forSoup2 = countsum2_forSoup.getsum();
				sum_forSoup3 = countsum3_forSoup.getsum();
				sum_forSoup4 = countsum4_forSoup.getsum();
				sum_forSoup5 = countsum5_forSoup.getsum();
				sum_forSoup6 = countsum6_forSoup.getsum();
				
				allsum_forSoup = sum_forSoup1+sum_forSoup2+sum_forSoup3+sum_forSoup4+sum_forSoup5+sum_forSoup6;
				
				Decisionmessage_checkcp.setLayout(null);
				if(allsum_forSoup == people)
				{
					int pos_y = 40;
					int pos_count = 1;
					int pos_countmaxsize = 7;
					if(sum_forSoup1>0)
					{
						Decisionmessage_checklab1.setText("法式牛肝蕈蘑菇濃湯 x "+Integer.toString(sum_forSoup1));
						Decisionmessage_checklab1.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab1.setBounds(50,pos_y*pos_count,400,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab1);
						pos_count++;
					}
					
					if(sum_forSoup2>0)
					{
						Decisionmessage_checklab2.setText("法式龍蝦濃湯 x "+Integer.toString(sum_forSoup2));
						Decisionmessage_checklab2.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab2.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab2);
						pos_count++;
					}
					
					if(sum_forSoup3>0)
					{
						Decisionmessage_checklab3.setText("法式牛肉番茄 x "+Integer.toString(sum_forSoup3));
						Decisionmessage_checklab3.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab3.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab3);
						pos_count++;
					}
					
					if(sum_forSoup4>0)
					{
						Decisionmessage_checklab4.setText("法式乳香野蕈濃湯 x "+Integer.toString(sum_forSoup4));
						Decisionmessage_checklab4.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab4.setBounds(50,pos_y*pos_count,400,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab4);
						pos_count++;
					}
					
					if(sum_forSoup5>0)
					{
						Decisionmessage_checklab5.setText("義式海鮮濃湯 x "+Integer.toString(sum_forSoup5));
						Decisionmessage_checklab5.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab5.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab5);
						pos_count++;
					}
					
					if(sum_forSoup6>0)
					{
						Decisionmessage_checklab6.setText("法式清燉牛肉湯 x "+Integer.toString(sum_forSoup6));
						Decisionmessage_checklab6.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab6.setBounds(50,pos_y*pos_count,400,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab6);
						pos_count++;
					}
					
					Decisionmessage_YESbtn.setBounds(50,300-(pos_countmaxsize-pos_count)*pos_y,80,40);
					Decisionmessage_checkcp.add(Decisionmessage_YESbtn);
					Decisionmessage_YESbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							OrderMenu.put("sum_forSoup1", sum_forSoup1);
							OrderMenu.put("sum_forSoup2", sum_forSoup2);
							OrderMenu.put("sum_forSoup3", sum_forSoup3);
							OrderMenu.put("sum_forSoup4", sum_forSoup4);
							OrderMenu.put("sum_forSoup5", sum_forSoup5);
							OrderMenu.put("sum_forSoup6", sum_forSoup6);
							
							Decisionmessage_check.dispose();
							OrderPage4();
							frm3.dispose();
						}
					});
					
					Decisionmessage_NObtn.setBounds(270,300-(pos_countmaxsize-pos_count)*pos_y,80,40);
					Decisionmessage_checkcp.add(Decisionmessage_NObtn);
					Decisionmessage_NObtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Decisionmessage_check.dispose();
						}
					});
					
					Decisionmessage_check.setSize(400,400-(pos_countmaxsize-pos_count)*pos_y);
				}
				else
				{
					Decisionmessage_checklabwarning.setText("請選擇與總人數相同之數量!");
					Decisionmessage_checklabwarning.setFont(new Font("TimeRoman",Font.BOLD ,30) );
					Decisionmessage_checklabwarning.setBounds(50,100,400,30);
					Decisionmessage_checkcp.add(Decisionmessage_checklabwarning);
					
					Decisionmessage_OKbtn.setBounds(190,200,100,40);
					Decisionmessage_checkcp.add(Decisionmessage_OKbtn);
					Decisionmessage_OKbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Decisionmessage_check.dispose();
						}
					});
					
					Decisionmessage_check.setSize(500,300);
				}
				Decisionmessage_checkcp.setBackground(Color.white);
				Decisionmessage_check.setLocationRelativeTo(null);
				Decisionmessage_check.setResizable(false);
				Decisionmessage_check.setVisible(true);
			}
		});
		
		QuestionHelp(Ordercp3);
		
		OrderTopPicture3.setIcon(Ordertop3);
		OrderTopPicture3.setBounds(0,70,850,250);
		Ordercp3.add(OrderTopPicture3);
		
		Ordersteppic3.setIcon(Orderstep3);
		Ordersteppic3.setBounds(10,-30,850,1090);
		Ordercp3.add(Ordersteppic3);
		Ordercp3.setBackground(Color.white);
		frm3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm3.setSize(850,1090);
	    frm3.setLocationRelativeTo(null);
	    frm3.setResizable(false); 
	    frm3.setVisible(true);
    }
    static void OrderPage4()
    {
    	JFrame frm4 = new JFrame("Order Menu Step4");
    	Container Ordercp4 = frm4.getContentPane();
    	JLabel Ordersteppic4 = new JLabel();
    	JButton Decisionbtn4 = new JButton();	
    	
    	JButton SubtractButton_forMainCourse1 = new JButton();
    	JButton AddButton_forMainCourse1 = new JButton();
    	JLabel Quantity_forMainCourse1 = new JLabel();
    	
    	JButton SubtractButton_forMainCourse2 = new JButton();
    	JButton AddButton_forMainCourse2 = new JButton();
    	JLabel Quantity_forMainCourse2 = new JLabel();
    	
    	JButton SubtractButton_forMainCourse3 = new JButton();
    	JButton AddButton_forMainCourse3 = new JButton();
    	JLabel Quantity_forMainCourse3 = new JLabel();
    	
    	JButton SubtractButton_forMainCourse4 = new JButton();
    	JButton AddButton_forMainCourse4 = new JButton();
    	JLabel Quantity_forMainCourse4 = new JLabel();
    	
    	JButton SubtractButton_forMainCourse5 = new JButton();
    	JButton AddButton_forMainCourse5 = new JButton();
    	JLabel Quantity_forMainCourse5 = new JLabel();
    	
    	JButton SubtractButton_forMainCourse6 = new JButton();
    	JButton AddButton_forMainCourse6 = new JButton();
    	JLabel Quantity_forMainCourse6 = new JLabel();
    	
    	JLabel OrderTopPicture4 = new JLabel();
    	
		Countsum countsum1_forMainCourse = new Countsum(sum_forMainCourse1,Quantity_forMainCourse1,AddButton_forMainCourse1,SubtractButton_forMainCourse1,people);
		Countsum countsum2_forMainCourse = new Countsum(sum_forMainCourse2,Quantity_forMainCourse2,AddButton_forMainCourse2,SubtractButton_forMainCourse2,people);
		Countsum countsum3_forMainCourse = new Countsum(sum_forMainCourse3,Quantity_forMainCourse3,AddButton_forMainCourse3,SubtractButton_forMainCourse3,people);
		Countsum countsum4_forMainCourse = new Countsum(sum_forMainCourse4,Quantity_forMainCourse4,AddButton_forMainCourse4,SubtractButton_forMainCourse4,people);
		Countsum countsum5_forMainCourse = new Countsum(sum_forMainCourse5,Quantity_forMainCourse5,AddButton_forMainCourse5,SubtractButton_forMainCourse5,people);
		Countsum countsum6_forMainCourse = new Countsum(sum_forMainCourse6,Quantity_forMainCourse6,AddButton_forMainCourse6,SubtractButton_forMainCourse6,people);
		
		Ordercp4.setLayout(null);
		
		Quantity_forMainCourse1.setText(Integer.toString(sum_forMainCourse1));
		Quantity_forMainCourse1.setFont(new Font("TimeRoman",Font.BOLD ,30));
		Quantity_forMainCourse1.setBounds(120,530,100,100);
		Ordercp4.add(Quantity_forMainCourse1);
		
		AddButton_forMainCourse1.setIcon(OrderMenu_addButton);
		AddButton_forMainCourse1.setBounds(40,550,50,50);
		AddButton_forMainCourse1.setBorder(null);
		Ordercp4.add(AddButton_forMainCourse1);
		
		SubtractButton_forMainCourse1.setIcon(OrderMenu_subtractButton);
		SubtractButton_forMainCourse1.setBounds(170,550,50,50);
		SubtractButton_forMainCourse1.setBorder(null);
		Ordercp4.add(SubtractButton_forMainCourse1);
		
		SubtractButton_forMainCourse1.addActionListener(countsum1_forMainCourse);
		AddButton_forMainCourse1.addActionListener(countsum1_forMainCourse);
		
		Quantity_forMainCourse2.setText(Integer.toString(sum_forMainCourse2));
		Quantity_forMainCourse2.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forMainCourse2.setBounds(410,530,100,100);
		Ordercp4.add(Quantity_forMainCourse2);
		
		AddButton_forMainCourse2.setIcon(OrderMenu_addButton);
		AddButton_forMainCourse2.setBounds(330,550,50,50); 
		AddButton_forMainCourse2.setBorder(null);
		Ordercp4.add(AddButton_forMainCourse2);
		
		SubtractButton_forMainCourse2.setIcon(OrderMenu_subtractButton);
		SubtractButton_forMainCourse2.setBounds(460,550,50,50);
		SubtractButton_forMainCourse2.setBorder(null);
		Ordercp4.add(SubtractButton_forMainCourse2);
		
		SubtractButton_forMainCourse2.addActionListener(countsum2_forMainCourse);
		AddButton_forMainCourse2.addActionListener(countsum2_forMainCourse);
		
		Quantity_forMainCourse3.setText(Integer.toString(sum_forMainCourse3));
		Quantity_forMainCourse3.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forMainCourse3.setBounds(705,530,100,100);
		Ordercp4.add(Quantity_forMainCourse3);
		
		AddButton_forMainCourse3.setIcon(OrderMenu_addButton);
		AddButton_forMainCourse3.setBounds(625,550,50,50); 
		AddButton_forMainCourse3.setBorder(null);
		Ordercp4.add(AddButton_forMainCourse3);
		
		SubtractButton_forMainCourse3.setIcon(OrderMenu_subtractButton);
		SubtractButton_forMainCourse3.setBounds(755,550,50,50);
		SubtractButton_forMainCourse3.setBorder(null);
		Ordercp4.add(SubtractButton_forMainCourse3);
		
		SubtractButton_forMainCourse3.addActionListener(countsum3_forMainCourse);
		AddButton_forMainCourse3.addActionListener(countsum3_forMainCourse);
		
		Quantity_forMainCourse4.setText(Integer.toString(sum_forMainCourse4));
		Quantity_forMainCourse4.setFont(new Font("TimeRoman",Font.BOLD ,30));
		Quantity_forMainCourse4.setBounds(120,840,100,100);
		Ordercp4.add(Quantity_forMainCourse4);
		
		AddButton_forMainCourse4.setIcon(OrderMenu_addButton);
		AddButton_forMainCourse4.setBounds(40,860,50,50);
		AddButton_forMainCourse4.setBorder(null);
		Ordercp4.add(AddButton_forMainCourse4);
		
		SubtractButton_forMainCourse4.setIcon(OrderMenu_subtractButton);
		SubtractButton_forMainCourse4.setBounds(170,860,50,50);
		SubtractButton_forMainCourse4.setBorder(null);
		Ordercp4.add(SubtractButton_forMainCourse4);
		
		SubtractButton_forMainCourse4.addActionListener(countsum4_forMainCourse);
		AddButton_forMainCourse4.addActionListener(countsum4_forMainCourse);
		
		Quantity_forMainCourse5.setText(Integer.toString(sum_forMainCourse5));
		Quantity_forMainCourse5.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forMainCourse5.setBounds(410,840,100,100);
		Ordercp4.add(Quantity_forMainCourse5);
		
		AddButton_forMainCourse5.setIcon(OrderMenu_addButton);
		AddButton_forMainCourse5.setBounds(330,860,50,50); 
		AddButton_forMainCourse5.setBorder(null);
		Ordercp4.add(AddButton_forMainCourse5);
		
		SubtractButton_forMainCourse5.setIcon(OrderMenu_subtractButton);
		SubtractButton_forMainCourse5.setBounds(460,860,50,50);
		SubtractButton_forMainCourse5.setBorder(null);
		Ordercp4.add(SubtractButton_forMainCourse5);
		
		SubtractButton_forMainCourse5.addActionListener(countsum5_forMainCourse);
		AddButton_forMainCourse5.addActionListener(countsum5_forMainCourse);
		
		Quantity_forMainCourse6.setText(Integer.toString(sum_forMainCourse6));
		Quantity_forMainCourse6.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forMainCourse6.setBounds(705,840,100,100);
		Ordercp4.add(Quantity_forMainCourse6);
		
		AddButton_forMainCourse6.setIcon(OrderMenu_addButton);
		AddButton_forMainCourse6.setBounds(625,860,50,50); 
		AddButton_forMainCourse6.setBorder(null);
		Ordercp4.add(AddButton_forMainCourse6);
		
		SubtractButton_forMainCourse6.setIcon(OrderMenu_subtractButton);
		SubtractButton_forMainCourse6.setBounds(755,860,50,50);
		SubtractButton_forMainCourse6.setBorder(null);
		Ordercp4.add(SubtractButton_forMainCourse6);
		
		SubtractButton_forMainCourse6.addActionListener(countsum6_forMainCourse);
		AddButton_forMainCourse6.addActionListener(countsum6_forMainCourse);
		
		Decisionbtn4.setIcon(OrderMenu_checkButton);
		Decisionbtn4.setBounds(345,950,150,60);
		Ordercp4.add(Decisionbtn4);
		Decisionbtn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JFrame Decisionmessage_check = new JFrame("Check");
				Container Decisionmessage_checkcp = Decisionmessage_check.getContentPane();
				JLabel Decisionmessage_checklab1 = new JLabel();
				JLabel Decisionmessage_checklab2 = new JLabel();
				JLabel Decisionmessage_checklab3 = new JLabel();
				JLabel Decisionmessage_checklab4 = new JLabel();
				JLabel Decisionmessage_checklab5 = new JLabel();
				JLabel Decisionmessage_checklab6 = new JLabel();
				JLabel Decisionmessage_checklabwarning = new JLabel();
				JButton Decisionmessage_YESbtn = new JButton("YES");
				JButton Decisionmessage_NObtn = new JButton("NO");
				JButton Decisionmessage_OKbtn = new JButton("OK");
				
				sum_forMainCourse1 = countsum1_forMainCourse.getsum();
				sum_forMainCourse2 = countsum2_forMainCourse.getsum();
				sum_forMainCourse3 = countsum3_forMainCourse.getsum();
				sum_forMainCourse4 = countsum4_forMainCourse.getsum();
				sum_forMainCourse5 = countsum5_forMainCourse.getsum();
				sum_forMainCourse6 = countsum6_forMainCourse.getsum();
				
				allsum_forMainCourse = sum_forMainCourse1+sum_forMainCourse2+sum_forMainCourse3+sum_forMainCourse4+sum_forMainCourse5+sum_forMainCourse6;
				
				Decisionmessage_checkcp.setLayout(null);
				if(allsum_forMainCourse == people)
				{
					int pos_y = 40;
					int pos_count = 1;
					int pos_countmaxsize = 7;
					if(sum_forMainCourse1>0)
					{
						Decisionmessage_checklab1.setText("法式檸香鮭魚排 x "+Integer.toString(sum_forMainCourse1));
						Decisionmessage_checklab1.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab1.setBounds(50,pos_y*pos_count,400,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab1);
						pos_count++;
					}
					
					if(sum_forMainCourse2>0)
					{
						Decisionmessage_checklab2.setText("法式紅酒燉雞 x "+Integer.toString(sum_forMainCourse2));
						Decisionmessage_checklab2.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab2.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab2);
						pos_count++;
					}
					
					if(sum_forMainCourse3>0)
					{
						Decisionmessage_checklab3.setText("小牛胸腺 x "+Integer.toString(sum_forMainCourse3));
						Decisionmessage_checklab3.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab3.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab3);
						pos_count++;
					}
					
					if(sum_forMainCourse4>0)
					{
						Decisionmessage_checklab4.setText("七時羊腿 x "+Integer.toString(sum_forMainCourse4));
						Decisionmessage_checklab4.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab4.setBounds(50,pos_y*pos_count,400,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab4);
						pos_count++;
					}
					
					if(sum_forMainCourse5>0)
					{
						Decisionmessage_checklab5.setText("油封鴨 x "+Integer.toString(sum_forMainCourse5));
						Decisionmessage_checklab5.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab5.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab5);
						pos_count++;
					}
					
					if(sum_forMainCourse6>0)
					{
						Decisionmessage_checklab6.setText("燉白菜馬鈴薯豬肉 x "+Integer.toString(sum_forMainCourse6));
						Decisionmessage_checklab6.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab6.setBounds(50,pos_y*pos_count,400,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab6);
						pos_count++;
					}
					
					Decisionmessage_YESbtn.setBounds(50,300-(pos_countmaxsize-pos_count)*pos_y,80,40);
					Decisionmessage_checkcp.add(Decisionmessage_YESbtn);
					Decisionmessage_YESbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {						
							OrderMenu.put("sum_forMainCourse1", sum_forMainCourse1);
							OrderMenu.put("sum_forMainCourse2", sum_forMainCourse2);
							OrderMenu.put("sum_forMainCourse3", sum_forMainCourse3);
							OrderMenu.put("sum_forMainCourse4", sum_forMainCourse4);
							OrderMenu.put("sum_forMainCourse5", sum_forMainCourse5);
							OrderMenu.put("sum_forMainCourse6", sum_forMainCourse6);
							
							Decisionmessage_check.dispose();
							OrderPage5();
							frm4.dispose();
						}
					});
					
					Decisionmessage_NObtn.setBounds(270,300-(pos_countmaxsize-pos_count)*pos_y,80,40);
					Decisionmessage_checkcp.add(Decisionmessage_NObtn);
					Decisionmessage_NObtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Decisionmessage_check.dispose();
						}
					});
					
					Decisionmessage_check.setSize(400,400-(pos_countmaxsize-pos_count)*pos_y);
				}
				else
				{
					Decisionmessage_checklabwarning.setText("請選擇與總人數相同之數量!");
					Decisionmessage_checklabwarning.setFont(new Font("TimeRoman",Font.BOLD ,30) );
					Decisionmessage_checklabwarning.setBounds(50,100,400,30);
					Decisionmessage_checkcp.add(Decisionmessage_checklabwarning);
					
					Decisionmessage_OKbtn.setBounds(190,200,100,40);
					Decisionmessage_checkcp.add(Decisionmessage_OKbtn);
					Decisionmessage_OKbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Decisionmessage_check.dispose();
						}
					});
					
					Decisionmessage_check.setSize(500,300);
				}
				Decisionmessage_checkcp.setBackground(Color.white);
				Decisionmessage_check.setLocationRelativeTo(null);
				Decisionmessage_check.setResizable(false);
				Decisionmessage_check.setVisible(true);
			}
		});
		
		QuestionHelp(Ordercp4);
		
		OrderTopPicture4.setIcon(Ordertop4);
		OrderTopPicture4.setBounds(0,70,850,250);
		Ordercp4.add(OrderTopPicture4);
		
		Ordersteppic4.setIcon(Orderstep4);
		Ordersteppic4.setBounds(10,-30,850,1090);
		Ordercp4.add(Ordersteppic4);
		Ordercp4.setBackground(Color.white);
		frm4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm4.setSize(850,1090);
	    frm4.setLocationRelativeTo(null);
	    frm4.setResizable(false); 
	    frm4.setVisible(true);
    }
    static void OrderPage5()
    {
    	JFrame frm5 = new JFrame("Order Menu Step5");
    	Container Ordercp5 = frm5.getContentPane();
    	JLabel Ordersteppic5 = new JLabel();
    	JButton Decisionbtn5 = new JButton();
    	
    	JButton SubtractButton_forDessert1 = new JButton();
    	JButton AddButton_forDessert1 = new JButton();
    	JLabel Quantity_forDessert1 = new JLabel();
    	
    	JButton SubtractButton_forDessert2 = new JButton();
    	JButton AddButton_forDessert2 = new JButton();
    	JLabel Quantity_forDessert2 = new JLabel();
    	
    	JButton SubtractButton_forDessert3 = new JButton();
    	JButton AddButton_forDessert3 = new JButton();
    	JLabel Quantity_forDessert3 = new JLabel();
    	
    	JButton SubtractButton_forDessert4 = new JButton();
    	JButton AddButton_forDessert4 = new JButton();
    	JLabel Quantity_forDessert4 = new JLabel();
    	
    	JButton SubtractButton_forDessert5 = new JButton();
    	JButton AddButton_forDessert5 = new JButton();
    	JLabel Quantity_forDessert5 = new JLabel();
    	
    	JLabel OrderTopPicture5 = new JLabel();
    	
		Countsum countsum1_forDessert = new Countsum(sum_forDessert1,Quantity_forDessert1,AddButton_forDessert1,SubtractButton_forDessert1,people);
		Countsum countsum2_forDessert = new Countsum(sum_forDessert2,Quantity_forDessert2,AddButton_forDessert2,SubtractButton_forDessert2,people);
		Countsum countsum3_forDessert = new Countsum(sum_forDessert3,Quantity_forDessert3,AddButton_forDessert3,SubtractButton_forDessert3,people);
		Countsum countsum4_forDessert = new Countsum(sum_forDessert4,Quantity_forDessert4,AddButton_forDessert4,SubtractButton_forDessert4,people);
		Countsum countsum5_forDessert = new Countsum(sum_forDessert5,Quantity_forDessert5,AddButton_forDessert5,SubtractButton_forDessert5,people);
		
		Ordercp5.setLayout(null);
		
		Quantity_forDessert1.setText(Integer.toString(sum_forDessert1));
		Quantity_forDessert1.setFont(new Font("TimeRoman",Font.BOLD ,30));
		Quantity_forDessert1.setBounds(120,530,100,100);
		Ordercp5.add(Quantity_forDessert1);
		
		AddButton_forDessert1.setIcon(OrderMenu_addButton);
		AddButton_forDessert1.setBounds(40,550,50,50);
		AddButton_forDessert1.setBorder(null);
		Ordercp5.add(AddButton_forDessert1);
		
		SubtractButton_forDessert1.setIcon(OrderMenu_subtractButton);
		SubtractButton_forDessert1.setBounds(170,550,50,50);
		SubtractButton_forDessert1.setBorder(null);
		Ordercp5.add(SubtractButton_forDessert1);
		
		SubtractButton_forDessert1.addActionListener(countsum1_forDessert);
		AddButton_forDessert1.addActionListener(countsum1_forDessert);
		
		Quantity_forDessert2.setText(Integer.toString(sum_forDessert2));
		Quantity_forDessert2.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forDessert2.setBounds(410,530,100,100);
		Ordercp5.add(Quantity_forDessert2);
		
		AddButton_forDessert2.setIcon(OrderMenu_addButton);
		AddButton_forDessert2.setBounds(330,550,50,50); 
		AddButton_forDessert2.setBorder(null);
		Ordercp5.add(AddButton_forDessert2);
		
		SubtractButton_forDessert2.setIcon(OrderMenu_subtractButton);
		SubtractButton_forDessert2.setBounds(460,550,50,50);
		SubtractButton_forDessert2.setBorder(null);
		Ordercp5.add(SubtractButton_forDessert2);
		
		SubtractButton_forDessert2.addActionListener(countsum2_forDessert);
		AddButton_forDessert2.addActionListener(countsum2_forDessert);
		
		Quantity_forDessert3.setText(Integer.toString(sum_forDessert3));
		Quantity_forDessert3.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forDessert3.setBounds(705,530,100,100);
		Ordercp5.add(Quantity_forDessert3);
		
		AddButton_forDessert3.setIcon(OrderMenu_addButton);
		AddButton_forDessert3.setBounds(625,550,50,50); 
		AddButton_forDessert3.setBorder(null);
		Ordercp5.add(AddButton_forDessert3);
		
		SubtractButton_forDessert3.setIcon(OrderMenu_subtractButton);
		SubtractButton_forDessert3.setBounds(755,550,50,50);
		SubtractButton_forDessert3.setBorder(null);
		Ordercp5.add(SubtractButton_forDessert3);
		
		SubtractButton_forDessert3.addActionListener(countsum3_forDessert);
		AddButton_forDessert3.addActionListener(countsum3_forDessert);
		
		Quantity_forDessert4.setText(Integer.toString(sum_forDessert4));
		Quantity_forDessert4.setFont(new Font("TimeRoman",Font.BOLD ,30));
		Quantity_forDessert4.setBounds(120,840,100,100);
		Ordercp5.add(Quantity_forDessert4);
		
		AddButton_forDessert4.setIcon(OrderMenu_addButton);
		AddButton_forDessert4.setBounds(40,860,50,50);
		AddButton_forDessert4.setBorder(null);
		Ordercp5.add(AddButton_forDessert4);
		
		SubtractButton_forDessert4.setIcon(OrderMenu_subtractButton);
		SubtractButton_forDessert4.setBounds(170,860,50,50);
		SubtractButton_forDessert4.setBorder(null);
		Ordercp5.add(SubtractButton_forDessert4);
		
		SubtractButton_forDessert4.addActionListener(countsum4_forDessert);
		AddButton_forDessert4.addActionListener(countsum4_forDessert);
		
		Quantity_forDessert5.setText(Integer.toString(sum_forDessert5));
		Quantity_forDessert5.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forDessert5.setBounds(410,840,100,100);
		Ordercp5.add(Quantity_forDessert5);
		
		AddButton_forDessert5.setIcon(OrderMenu_addButton);
		AddButton_forDessert5.setBounds(330,860,50,50); 
		AddButton_forDessert5.setBorder(null);
		Ordercp5.add(AddButton_forDessert5);
		
		SubtractButton_forDessert5.setIcon(OrderMenu_subtractButton);
		SubtractButton_forDessert5.setBounds(460,860,50,50);
		SubtractButton_forDessert5.setBorder(null);
		Ordercp5.add(SubtractButton_forDessert5);
		
		SubtractButton_forDessert5.addActionListener(countsum5_forDessert);
		AddButton_forDessert5.addActionListener(countsum5_forDessert);
		
		Decisionbtn5.setIcon(OrderMenu_checkButton);
		Decisionbtn5.setBounds(345,950,150,60);
		Ordercp5.add(Decisionbtn5);
		Decisionbtn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JFrame Decisionmessage_check = new JFrame("Check");
				Container Decisionmessage_checkcp = Decisionmessage_check.getContentPane();
				JLabel Decisionmessage_checklab1 = new JLabel();
				JLabel Decisionmessage_checklab2 = new JLabel();
				JLabel Decisionmessage_checklab3 = new JLabel();
				JLabel Decisionmessage_checklab4 = new JLabel();
				JLabel Decisionmessage_checklab5 = new JLabel();
				JLabel Decisionmessage_checklabwarning = new JLabel();
				JButton Decisionmessage_YESbtn = new JButton("YES");
				JButton Decisionmessage_NObtn = new JButton("NO");
				JButton Decisionmessage_OKbtn = new JButton("OK");
				
				sum_forDessert1 = countsum1_forDessert.getsum();
				sum_forDessert2 = countsum2_forDessert.getsum();
				sum_forDessert3 = countsum3_forDessert.getsum();
				sum_forDessert4 = countsum4_forDessert.getsum();
				sum_forDessert5 = countsum5_forDessert.getsum();
				
				allsum_forDessert = sum_forDessert1+sum_forDessert2+sum_forDessert3+sum_forDessert4+sum_forDessert5;
				
				Decisionmessage_checkcp.setLayout(null);
				if(allsum_forDessert == people)
				{
					int pos_y = 40;
					int pos_count = 1;
					int pos_countmaxsize = 7;
					if(sum_forDessert1>0)
					{
						Decisionmessage_checklab1.setText("提拉米蘇 x "+Integer.toString(sum_forDessert1));
						Decisionmessage_checklab1.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab1.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab1);
						pos_count++;
					}
					
					if(sum_forDessert2>0)
					{
						Decisionmessage_checklab2.setText("香草瑪德蓮 x "+Integer.toString(sum_forDessert2));
						Decisionmessage_checklab2.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab2.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab2);
						pos_count++;
					}
					
					if(sum_forDessert3>0)
					{
						Decisionmessage_checklab3.setText("法式焦糖烤布蕾 x "+Integer.toString(sum_forDessert3));
						Decisionmessage_checklab3.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab3.setBounds(50,pos_y*pos_count,400,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab3);
						pos_count++;
					}
					
					if(sum_forDessert4>0)
					{
						Decisionmessage_checklab4.setText("法式草莓起司蛋餅 x "+Integer.toString(sum_forDessert4));
						Decisionmessage_checklab4.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab4.setBounds(50,pos_y*pos_count,400,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab4);
						pos_count++;
					}
					
					if(sum_forDessert5>0)
					{
						Decisionmessage_checklab5.setText("天使之鈴 可麗露 x "+Integer.toString(sum_forDessert5));
						Decisionmessage_checklab5.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab5.setBounds(50,pos_y*pos_count,400,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab5);
						pos_count++;
					}
					
					Decisionmessage_YESbtn.setBounds(50,300-(pos_countmaxsize-pos_count)*pos_y,80,40);
					Decisionmessage_checkcp.add(Decisionmessage_YESbtn);
					Decisionmessage_YESbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {	
							OrderMenu.put("sum_forDessert1", sum_forDessert1);
							OrderMenu.put("sum_forDessert2", sum_forDessert2);
							OrderMenu.put("sum_forDessert3", sum_forDessert3);
							OrderMenu.put("sum_forDessert4", sum_forDessert4);
							OrderMenu.put("sum_forDessert5", sum_forDessert5);
							
							Decisionmessage_check.dispose();
							OrderPage6();
							frm5.dispose();
						}
					});
					
					Decisionmessage_NObtn.setBounds(270,300-(pos_countmaxsize-pos_count)*pos_y,80,40);
					Decisionmessage_checkcp.add(Decisionmessage_NObtn);
					Decisionmessage_NObtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Decisionmessage_check.dispose();
						}
					});
					
					Decisionmessage_check.setSize(400,400-(pos_countmaxsize-pos_count)*pos_y);
				}
				else
				{
					Decisionmessage_checklabwarning.setText("請選擇與總人數相同之數量!");
					Decisionmessage_checklabwarning.setFont(new Font("TimeRoman",Font.BOLD ,30) );
					Decisionmessage_checklabwarning.setBounds(50,100,400,30);
					Decisionmessage_checkcp.add(Decisionmessage_checklabwarning);
					
					Decisionmessage_OKbtn.setBounds(190,200,100,40);
					Decisionmessage_checkcp.add(Decisionmessage_OKbtn);
					Decisionmessage_OKbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Decisionmessage_check.dispose();
						}
					});
					
					Decisionmessage_check.setSize(500,300);
				}
				Decisionmessage_checkcp.setBackground(Color.white);
				Decisionmessage_check.setLocationRelativeTo(null);
				Decisionmessage_check.setResizable(false);
				Decisionmessage_check.setVisible(true);
			}
		});
		
		QuestionHelp(Ordercp5);
		
		OrderTopPicture5.setIcon(Ordertop5);
		OrderTopPicture5.setBounds(0,70,850,250);
		Ordercp5.add(OrderTopPicture5);
		
		Ordersteppic5.setIcon(Orderstep5);
		Ordersteppic5.setBounds(10,-30,850,1090);
		Ordercp5.add(Ordersteppic5);
		Ordercp5.setBackground(Color.white);
		frm5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm5.setSize(850,1090);
	    frm5.setLocationRelativeTo(null);
	    frm5.setResizable(false); 
	    frm5.setVisible(true);
    } 
    static void OrderPage6()
    {
    	JFrame frm6 = new JFrame("Order Menu Step6");
    	Container Ordercp6 = frm6.getContentPane();
    	JLabel Ordersteppic6 = new JLabel();
    	JButton Decisionbtn6 = new JButton();	
    	
    	JButton SubtractButton_forBeverage1 = new JButton();
    	JButton AddButton_forBeverage1 = new JButton();
    	JLabel Quantity_forBeverage1 = new JLabel();
    	
    	JButton SubtractButton_forBeverage2 = new JButton();
    	JButton AddButton_forBeverage2 = new JButton();
    	JLabel Quantity_forBeverage2 = new JLabel();
    	
    	JButton SubtractButton_forBeverage3 = new JButton();
    	JButton AddButton_forBeverage3 = new JButton();
    	JLabel Quantity_forBeverage3 = new JLabel();
    	
    	JButton SubtractButton_forBeverage4 = new JButton();
    	JButton AddButton_forBeverage4 = new JButton();
    	JLabel Quantity_forBeverage4 = new JLabel();
    	
    	JButton SubtractButton_forBeverage5 = new JButton();
    	JButton AddButton_forBeverage5 = new JButton();
    	JLabel Quantity_forBeverage5 = new JLabel();
    	
    	JLabel OrderTopPicture6 = new JLabel();
    	
		Countsum countsum1_forBeverage = new Countsum(sum_forBeverage1,Quantity_forBeverage1,AddButton_forBeverage1,SubtractButton_forBeverage1,people);
		Countsum countsum2_forBeverage = new Countsum(sum_forBeverage2,Quantity_forBeverage2,AddButton_forBeverage2,SubtractButton_forBeverage2,people);
		Countsum countsum3_forBeverage = new Countsum(sum_forBeverage3,Quantity_forBeverage3,AddButton_forBeverage3,SubtractButton_forBeverage3,people);
		Countsum countsum4_forBeverage = new Countsum(sum_forBeverage4,Quantity_forBeverage4,AddButton_forBeverage4,SubtractButton_forBeverage4,people);
		Countsum countsum5_forBeverage = new Countsum(sum_forBeverage5,Quantity_forBeverage5,AddButton_forBeverage5,SubtractButton_forBeverage5,people);
		
		Ordercp6.setLayout(null);
		
		Quantity_forBeverage1.setText(Integer.toString(sum_forBeverage1));
		Quantity_forBeverage1.setFont(new Font("TimeRoman",Font.BOLD ,30));
		Quantity_forBeverage1.setBounds(120,530,100,100);
		Ordercp6.add(Quantity_forBeverage1);
		
		AddButton_forBeverage1.setIcon(OrderMenu_addButton);
		AddButton_forBeverage1.setBounds(40,550,50,50);
		AddButton_forBeverage1.setBorder(null);
		Ordercp6.add(AddButton_forBeverage1);
		
		SubtractButton_forBeverage1.setIcon(OrderMenu_subtractButton);
		SubtractButton_forBeverage1.setBounds(170,550,50,50);
		SubtractButton_forBeverage1.setBorder(null);
		Ordercp6.add(SubtractButton_forBeverage1);
		
		SubtractButton_forBeverage1.addActionListener(countsum1_forBeverage);
		AddButton_forBeverage1.addActionListener(countsum1_forBeverage);
		
		Quantity_forBeverage2.setText(Integer.toString(sum_forBeverage2));
		Quantity_forBeverage2.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forBeverage2.setBounds(410,530,100,100);
		Ordercp6.add(Quantity_forBeverage2);
		
		AddButton_forBeverage2.setIcon(OrderMenu_addButton);
		AddButton_forBeverage2.setBounds(330,550,50,50); 
		AddButton_forBeverage2.setBorder(null);
		Ordercp6.add(AddButton_forBeverage2);
		
		SubtractButton_forBeverage2.setIcon(OrderMenu_subtractButton);
		SubtractButton_forBeverage2.setBounds(460,550,50,50);
		SubtractButton_forBeverage2.setBorder(null);
		Ordercp6.add(SubtractButton_forBeverage2);
		
		SubtractButton_forBeverage2.addActionListener(countsum2_forBeverage);
		AddButton_forBeverage2.addActionListener(countsum2_forBeverage);
		
		Quantity_forBeverage3.setText(Integer.toString(sum_forBeverage3));
		Quantity_forBeverage3.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forBeverage3.setBounds(705,530,100,100);
		Ordercp6.add(Quantity_forBeverage3);
		
		AddButton_forBeverage3.setIcon(OrderMenu_addButton);
		AddButton_forBeverage3.setBounds(625,550,50,50); 
		AddButton_forBeverage3.setBorder(null);
		Ordercp6.add(AddButton_forBeverage3);
		
		SubtractButton_forBeverage3.setIcon(OrderMenu_subtractButton);
		SubtractButton_forBeverage3.setBounds(755,550,50,50);
		SubtractButton_forBeverage3.setBorder(null);
		Ordercp6.add(SubtractButton_forBeverage3);
		
		SubtractButton_forBeverage3.addActionListener(countsum3_forBeverage);
		AddButton_forBeverage3.addActionListener(countsum3_forBeverage);
		
		Quantity_forBeverage4.setText(Integer.toString(sum_forBeverage4));
		Quantity_forBeverage4.setFont(new Font("TimeRoman",Font.BOLD ,30));
		Quantity_forBeverage4.setBounds(120,840,100,100);
		Ordercp6.add(Quantity_forBeverage4);
		
		AddButton_forBeverage4.setIcon(OrderMenu_addButton);
		AddButton_forBeverage4.setBounds(40,860,50,50);
		AddButton_forBeverage4.setBorder(null);
		Ordercp6.add(AddButton_forBeverage4);
		
		SubtractButton_forBeverage4.setIcon(OrderMenu_subtractButton);
		SubtractButton_forBeverage4.setBounds(170,860,50,50);
		SubtractButton_forBeverage4.setBorder(null);
		Ordercp6.add(SubtractButton_forBeverage4);
		
		SubtractButton_forBeverage4.addActionListener(countsum4_forBeverage);
		AddButton_forBeverage4.addActionListener(countsum4_forBeverage);
		
		Quantity_forBeverage5.setText(Integer.toString(sum_forBeverage5));
		Quantity_forBeverage5.setFont(new Font("TimeRoman",Font.BOLD ,30) );
		Quantity_forBeverage5.setBounds(410,840,100,100);
		Ordercp6.add(Quantity_forBeverage5);
		
		AddButton_forBeverage5.setIcon(OrderMenu_addButton);
		AddButton_forBeverage5.setBounds(330,860,50,50); 
		AddButton_forBeverage5.setBorder(null);
		Ordercp6.add(AddButton_forBeverage5);
		
		SubtractButton_forBeverage5.setIcon(OrderMenu_subtractButton);
		SubtractButton_forBeverage5.setBounds(460,860,50,50);
		SubtractButton_forBeverage5.setBorder(null);
		Ordercp6.add(SubtractButton_forBeverage5);
		
		SubtractButton_forBeverage5.addActionListener(countsum5_forBeverage);
		AddButton_forBeverage5.addActionListener(countsum5_forBeverage);
		
		Decisionbtn6.setIcon(OrderMenu_checkButton);
		Decisionbtn6.setBounds(345,950,150,60);
		Ordercp6.add(Decisionbtn6);
		Decisionbtn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JFrame Decisionmessage_check = new JFrame("Check");
				Container Decisionmessage_checkcp = Decisionmessage_check.getContentPane();
				JLabel Decisionmessage_checklab1 = new JLabel();
				JLabel Decisionmessage_checklab2 = new JLabel();
				JLabel Decisionmessage_checklab3 = new JLabel();
				JLabel Decisionmessage_checklab4 = new JLabel();
				JLabel Decisionmessage_checklab5 = new JLabel();
				JLabel Decisionmessage_checklabwarning = new JLabel();
				JButton Decisionmessage_YESbtn = new JButton("YES");
				JButton Decisionmessage_NObtn = new JButton("NO");
				JButton Decisionmessage_OKbtn = new JButton("OK");
				
				sum_forBeverage1 = countsum1_forBeverage.getsum();
				sum_forBeverage2 = countsum2_forBeverage.getsum();
				sum_forBeverage3 = countsum3_forBeverage.getsum();
				sum_forBeverage4 = countsum4_forBeverage.getsum();
				sum_forBeverage5 = countsum5_forBeverage.getsum();
				
				allsum_forBeverage = sum_forBeverage1+sum_forBeverage2+sum_forBeverage3+sum_forBeverage4+sum_forBeverage5;
				
				Decisionmessage_checkcp.setLayout(null);
				if(allsum_forBeverage == people)
				{
					int pos_y = 40;
					int pos_count = 1;
					int pos_countmaxsize = 7;
					if(sum_forBeverage1>0)
					{
						Decisionmessage_checklab1.setText("熱帶水果茶 x "+Integer.toString(sum_forBeverage1));
						Decisionmessage_checklab1.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab1.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab1);
						pos_count++;
					}
					
					if(sum_forBeverage2>0)
					{
						Decisionmessage_checklab2.setText("野莓奶昔 x "+Integer.toString(sum_forBeverage2));
						Decisionmessage_checklab2.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab2.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab2);
						pos_count++;
					}
					
					if(sum_forBeverage3>0)
					{
						Decisionmessage_checklab3.setText("藍色夏威夷 x "+Integer.toString(sum_forBeverage3));
						Decisionmessage_checklab3.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab3.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab3);
						pos_count++;
					}
					
					if(sum_forBeverage4>0)
					{
						Decisionmessage_checklab4.setText("諸神黃昏 x "+Integer.toString(sum_forBeverage4));
						Decisionmessage_checklab4.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab4.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab4);
						pos_count++;
					}
					
					if(sum_forBeverage5>0)
					{
						Decisionmessage_checklab5.setText("柯夢波丹 x "+Integer.toString(sum_forBeverage5));
						Decisionmessage_checklab5.setFont(new Font("TimeRoman",Font.BOLD ,30) );
						Decisionmessage_checklab5.setBounds(50,pos_y*pos_count,300,30);
						Decisionmessage_checkcp.add(Decisionmessage_checklab5);
						pos_count++;
					}
					
					Decisionmessage_YESbtn.setBounds(50,300-(pos_countmaxsize-pos_count)*pos_y,80,40);
					Decisionmessage_checkcp.add(Decisionmessage_YESbtn);
					Decisionmessage_YESbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							OrderMenu.put("sum_forBeverage1", sum_forBeverage1);
							OrderMenu.put("sum_forBeverage2", sum_forBeverage2);
							OrderMenu.put("sum_forBeverage3", sum_forBeverage3);
							OrderMenu.put("sum_forBeverage4", sum_forBeverage4);
							OrderMenu.put("sum_forBeverage5", sum_forBeverage5);
							
							dataSetting_forOrder();
							
							Decisionmessage_check.dispose();
							appraisePage();
							frm6.dispose();
						}
					});
					
					Decisionmessage_NObtn.setBounds(270,300-(pos_countmaxsize-pos_count)*pos_y,80,40);
					Decisionmessage_checkcp.add(Decisionmessage_NObtn);
					Decisionmessage_NObtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Decisionmessage_check.dispose();
						}
					});
					
					Decisionmessage_check.setSize(400,400-(pos_countmaxsize-pos_count)*pos_y);
				}
				else
				{
					Decisionmessage_checklabwarning.setText("請選擇與總人數相同之數量!");
					Decisionmessage_checklabwarning.setFont(new Font("TimeRoman",Font.BOLD ,30) );
					Decisionmessage_checklabwarning.setBounds(50,100,400,30);
					Decisionmessage_checkcp.add(Decisionmessage_checklabwarning);
					
					Decisionmessage_OKbtn.setBounds(190,200,100,40);
					Decisionmessage_checkcp.add(Decisionmessage_OKbtn);
					Decisionmessage_OKbtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Decisionmessage_check.dispose();
						}
					});
					
					Decisionmessage_check.setSize(500,300);
				}
				Decisionmessage_checkcp.setBackground(Color.white);
				Decisionmessage_check.setLocationRelativeTo(null);
				Decisionmessage_check.setResizable(false);
				Decisionmessage_check.setVisible(true);
			}
		});
		
		QuestionHelp(Ordercp6);
		
		OrderTopPicture6.setIcon(Ordertop6);
		OrderTopPicture6.setBounds(0,70,850,250);
		Ordercp6.add(OrderTopPicture6);
		
		Ordersteppic6.setIcon(Orderstep6);
		Ordersteppic6.setBounds(10,-30,850,1090);
		Ordercp6.add(Ordersteppic6);
		Ordercp6.setBackground(Color.white);
		frm6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm6.setSize(850,1090);
	    frm6.setLocationRelativeTo(null);
	    frm6.setResizable(false); 
	    frm6.setVisible(true);
    }
    static void appraisePage()
    {
    	appraisecp.setLayout(null);
    	
    	appraiselab.setText("整體用餐評分");
    	appraiselab.setFont(new Font("TimeRoman",Font.BOLD ,100));
    	appraiselab.setBounds(125,-50,800,330);
    	appraisecp.add(appraiselab);
    	appraisebtn.setBorder(null);
    	appraisebtn.setBounds(260,250,318,59);
    	appraisebtn.setIcon(star1);
    	appraisecp.add(appraisebtn);
		
    	appraisebtn.setRolloverEnabled(true);
    	appraisebtn.addMouseMotionListener(new MouseMotionListener(){ 
			public void mouseMoved(MouseEvent e)
			{
				if(3 <= e.getX() && e.getX() <= 59)
				{
					appraisebtn.setRolloverIcon(star2);
					appraisebtn.setPressedIcon(star2);
					appraisestar = 1;
				}
				else if(74 <= e.getX() && e.getX() <= 125)
				{
					appraisebtn.setRolloverIcon(star3);
					appraisebtn.setPressedIcon(star3);
					appraisestar = 2;
				}
				else if(136 <= e.getX() && e.getX() <= 187)
				{
					appraisebtn.setRolloverIcon(star4);
					appraisebtn.setPressedIcon(star4);
					appraisestar = 3;
				}
				else if(202 <= e.getX() && e.getX() <= 255)
				{
					appraisebtn.setRolloverIcon(star5);
					appraisebtn.setPressedIcon(star5);
					appraisestar = 4;
				}
				else if(262 <= e.getX() && e.getX() <= 314)
				{
					appraisebtn.setRolloverIcon(star6);
					appraisebtn.setPressedIcon(star6);
					appraisestar = 5;
				}
			}
			public void mouseDragged(MouseEvent e)
			{
			}	
		});
    	appraisebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JFrame starfrm = new JFrame("Check");
				JLabel starword = new JLabel();
				JButton starbtn_YES = new JButton("YES");
				JButton starbtn_NO = new JButton("NO");
				Container starcp = starfrm.getContentPane();
				
				starcp.setLayout(null);
				
				starword.setText("您確定要給予我們"+appraisestar+"顆星評價嗎?");
				starword.setFont(new Font("TimeRoman",Font.BOLD ,30));
				starword.setBounds(30,100,460,30);
				starcp.add(starword);
				
				starbtn_YES.setBounds(50,180,100,50);
				starcp.add(starbtn_YES);
				starbtn_YES.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dataSetting_forAppraiseDir();
						
						starfrm.dispose();
						JFrame Endingfrm = new JFrame("Have a good night");
						Container Endingcp = Endingfrm.getContentPane();
						JLabel SecondEnd = new JLabel();	
						
						Endingcp.setLayout(null);
						
						SecondEnd.setText("感謝評價，系統將於"+second+"秒後自動關閉");
						Timer timer2 = new Timer(1000,new ActionListener() {
							public void actionPerformed(ActionEvent e) 
							{
								second--;
					            SecondEnd.setText("感謝評價，系統將於"+second+"秒後自動關閉");
					            if(second == -1)
								{         		
					            	appraisefrm.dispose();
						            Endingfrm.dispose();
						            System.exit(0);
								}
							}
					    });
					    timer2.start();
					    
					    SecondEnd.setFont(new Font("TimeRoman",Font.BOLD ,30));
						SecondEnd.setBounds(10,110,500,30);
						Endingcp.add(SecondEnd);
						
						Endingcp.setBackground(Color.WHITE);
					    Endingfrm.setSize(520,300);
					    Endingfrm.setLocationRelativeTo(null);
					    Endingfrm.setResizable(false); 
					    Endingfrm.setVisible(true);
					}
				});
				
				starbtn_NO.setBounds(360,180,100,50);
				starcp.add(starbtn_NO);
				starbtn_NO.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						starfrm.dispose();
					}
				});
				starcp.setBackground(Color.WHITE);
				starfrm.setSize(520,300);
				starfrm.setLocationRelativeTo(null);
				starfrm.setResizable(false); 
				starfrm.setVisible(true);
			}
		});
    	appraisecp.setBackground(Color.WHITE);
    	appraisefrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	appraisefrm.setTitle("Appraise");
    	appraisefrm.setSize(850, 545);
    	appraisefrm.setResizable(false); 
    	appraisefrm.setLocationRelativeTo(null);
    	appraisefrm.setVisible(true);
    }
    public static void main(String args[]) //coding by Capoo Huang
    {	
    	PeopleFirstPage();
    }
}