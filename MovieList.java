import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
/**
 * 
 * @author (I Brittanie Gonzalez am the author of this code) 
 * @date (3/17/16)
 */
public class MovieList extends JApplet implements ActionListener
{  
    private int x;
    private JButton one; 
    private String[ ] MovieName = {"HUNGER GAMES","THE REVENANT", "STAR WARS", "JURASSIC WORLD", "EX MACHINA", "ICE AGE", "DEADPOOL", 
    "X-MEN", "FINDING DORY", "DIVERGENT"};
    
    private String[ ] Director = {"DIRECTOR: FRANCIS LAWRENCE       YEAR: 2012","DIRECTOR: ALEJANDRO GONZALEZ INARRITU       YEAR: 2015", "DIRECTOR: GEORGE LUCAS       YEAR: 2015",
        "DIRECTOR: COLIN TREVORROW       YEAR: 2015", "DIRECTOR: ALEX GARLAND       YEAR: 2015","DIRECTOR: CHRIS WEGDE       YEAR: 2016","DIRECTOR: TIM MILLER       YEAR: 2016",
        "DIRECTOR: BRYAN SINGER       YEAR: 2016", "DIRECTOR: ANDREW STANTON       YEAR: 2016","DIRECTOR: NEIL BURGER       YEAR: 2016"};
        
    private boolean clickone = false; 
    
    Image img,img1,img2,img3,img4,img5,img6,img7,img8,img9;
    ImageIcon icon,Iimg;
    JLabel j,j2,Jimg,e,s,e2,s2;
    
        JTextField jt= new JTextField(10);
    ImageIcon[] image = {
            new ImageIcon ("hungergames.jpg"),
            new ImageIcon ("revenant.jpg"),
            new ImageIcon ("sstarwars.jpg"),
            new ImageIcon ("Jurassic.jpeg"), 
            new ImageIcon ("exmachina.jpeg"),
            new ImageIcon ("iceage.jpeg"),
            new ImageIcon ("deadpool.jpeg"),
            new ImageIcon ("xmen.jpeg"),
            new ImageIcon ("findingdory.jpeg"),
            new ImageIcon ("divergent.jpeg"),
           
        };
        JPanel jp,jp2;

    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void init()
    {
         setLayout( new BorderLayout( ) ); 
        this.setSize(1400,750);
        
        img=getImage(getDocumentBase(),"Vintbackground.jpg"); //sets background image 
        Iimg = new ImageIcon(img); 
        Jimg= new JLabel(Iimg);
        Jimg.setBounds(0,0,500,500);
        this.add(Jimg);

        img1 = getImage( getCodeBase( ), "hungergames.jpg");
        icon = new ImageIcon( img1 );
        jp= new JPanel();
        jp.setLayout(new FlowLayout());
        jp.setBackground(new Color(0,207,229));
        jp.setPreferredSize(new Dimension(150,100));
        jp.setVisible(true);
        Font jfont = new Font("Chalkboard", Font.ITALIC, 20);// sets font and font size
        one = new JButton();
        one.setLayout(new BorderLayout());
         e= new JLabel("Your");
         s= new JLabel("Movie");
        e.setFont(jfont);s.setFont(jfont);
        e.setForeground(Color.red);s.setForeground(Color.red); //Sets font color to red

        one.add(BorderLayout.NORTH,e);
        one.add(BorderLayout.SOUTH,s);

        one.setOpaque(true);//this line and the next line makes the button  black
        one.setBorderPainted(false);//
        one.setBackground(Color.black); // sets the background of button black
        one.setPreferredSize(new Dimension(100, 100));
        one.setForeground(Color.white); //sets color to white

        one.addActionListener( this );
        

        jp2=new JPanel();
        jp2.setLayout(new FlowLayout());
        jp2.setBackground(new Color(250,5,140));
        jp2.setPreferredSize(new Dimension(100,100));
        jp2.setVisible(true);

        j= new JLabel("Movie",JLabel.RIGHT);
        j.setVisible(true);
        j.setFont(new Font("Chalkboard", Font.ITALIC, 40));
        

        jp.add( one );
        jp.add(jt);
        jp2.add(j);
        this.add(jp,BorderLayout.WEST);
        this.add(jp2,BorderLayout.SOUTH);
        
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.white);
        g.drawString("Pick a movie", 20,170);
        g.drawString("Titles:",20,200);

        g.drawString("1. The Revenant ",20,230); 
        g.drawString("2. Hunger Games ",20,260);
        g.drawString("3. Star Wars ",20,290);
        g.drawString("4. Jurassic World",20,320);
        g.drawString("5. Ex Machina",20,350);
        g.drawString("6. Ice Age",20,380);
        g.drawString("7. Deadpool",20,410);
        g.drawString("8. X-Men",20,440);
        g.drawString("9. Finding Dory",20,470);
        g.drawString("10. Divergent",20,500);
        
        Image img=getImage(getDocumentBase(),"hungergames.jpg");
        //g.drawImage(img, 550, 40, this);
        Image img1=getImage(getDocumentBase(),"revenant.jpg");
        //g.drawImage(img1, 550, 40, this);
        Image img2=getImage(getDocumentBase(),"sstarwars.jpg");
        //g.drawImage(img2, 550, 40, this);
        Image img3=getImage(getDocumentBase(),"Jurassic.jpeg");
        //g.drawImage(img3, 550, 40, this);                             // I tried added these in to see if it would make my link work and I just couldn't figure it out
        Image img4=getImage(getDocumentBase(),"exmachina.jpeg");
        //g.drawImage(img4, 550, 40, this);
        Image img5=getImage(getDocumentBase(),"iceage.jpeg");
        //g.drawImage(img5, 550, 40, this);
        Image img6=getImage(getDocumentBase(),"deadpool.jpeg");
        //g.drawImage(img6, 550, 40, this);
        Image img7=getImage(getDocumentBase(),"xmen.jpeg");
        //g.drawImage(img7, 550, 40, this);
        Image img8=getImage(getDocumentBase(),"findingdory.jpeg");
        //g.drawImage(img8, 550, 40, this);
        Image img9=getImage(getDocumentBase(),"divergent.jpeg");
        //g.drawImage(img9, 550, 40, this);

        if(clickone==true){
            String newString = jt.getText().toUpperCase();
            if(newString.equals(MovieName[0])){
                j.setText(Director[0]);
                image[0].paintIcon(this, g, 550, 70);
            }else{
                j.setText("Movie is not found");  
            }     
            if(newString.equals(MovieName[1])){
                j.setText(Director[1]);
                image[1].paintIcon(this, g, 550, 40);
            }else    if(newString.equals(MovieName[2])){
                j.setText(Director[2]);
                image[2].paintIcon(this, g, 550, 40);
            }else    if(newString.equals(MovieName[3])){
                j.setText(Director[3]);
                image[3].paintIcon(this, g, 550, 40);
            }else    if(newString.equals(MovieName[4])){
                j.setText(Director[4]);
                image[4].paintIcon(this, g, 550, 40);
            }else    if(newString.equals(MovieName[5])){
                j.setText(Director[5]);
                image[5].paintIcon(this, g, 550, 40);
            }else    if(newString.equals(MovieName[6])){
                j.setText(Director[6]);
                image[6].paintIcon(this, g, 550, 40);
            }else    if(newString.equals(MovieName[7])){
                j.setText(Director[7]);
                image[7].paintIcon(this, g, 550, 40);
            }else    if(newString.equals(MovieName[8])){
                j.setText(Director[8]);
                image[8].paintIcon(this, g, 550, 40);
            }else    if(newString.equals(MovieName[9])){
                j.setText(Director[9]);
                image[9].paintIcon(this, g, 550, 40);
            }
           

        }

       
    }
    
    public void actionPerformed( ActionEvent ae) {
        Object obj=ae.getSource();
        if(ae.getSource()==one)
        {
            clickone = true;
            repaint();

        }

    }
}
