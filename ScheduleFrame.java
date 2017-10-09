
package schedulemaker;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

  

class ScheduleFrame extends JFrame{
   
    private Menupnl menu = new Menupnl();
    private Majorspnl majorsmenu = new Majorspnl();
    private csepnl csepnl=new csepnl();
    private mctpnl mctpnl=new mctpnl();  
    private ergypnl ergypnl=new ergypnl();
    private bldgpnl bldgpnl=new bldgpnl();
    private matalpnl matalpnl= new matalpnl();
    private informationspnl informationspnl=new informationspnl();
    Container c = this.getContentPane();
    
    public ScheduleFrame (){ //schedule frame constructor to intialize locations, size, which panel to display, ect.
        this.setSize(700, 600);
        this.setTitle("Schedule Maker");
        this.setLocation(300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        c.add(menu);//Intially show Menu panel
        c.setVisible(true);
     
        
        
     menu.start.addActionListener(new ActionListener() { //Move from Menu panel(create semester schedule button) to majorsmenu panel

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(menu);
                c.add(majorsmenu);
                c.revalidate();
                c.repaint();
                c.setVisible(true);
            }
        });
     
    
    majorsmenu.csebtn.addActionListener(new ActionListener() { //Move from majorsmenu panel to csepnl panel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(majorsmenu);
                c.add(csepnl);
                c.repaint();
                c.revalidate();
            }
        });
     majorsmenu.mctbtn.addActionListener(new ActionListener() { //Move from majorsmenu panel to mctpnl panel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(majorsmenu);
                c.add(mctpnl);
                c.repaint();
                c.revalidate();
            }
        });
     majorsmenu.ergybtn.addActionListener(new ActionListener() { //Move from majorsmenu panel to ergypnl panel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(majorsmenu);
                c.add(ergypnl);
                c.repaint();
                c.revalidate();
            }
        });
     majorsmenu.bldgbtn.addActionListener(new ActionListener() { //Move from majorsmenu panel to bldgpnl panel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(majorsmenu);
                c.add(bldgpnl);
                c.repaint();
                c.revalidate();
            }
        });
     
     majorsmenu.matalbtn.addActionListener(new ActionListener() { //Move from majorsmenu panel to matalpnl panel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(majorsmenu);
                c.add(matalpnl);
                c.repaint();
                c.revalidate();
            }
        });
      majorsmenu.backbtn.addActionListener(new ActionListener() { //Move from majorsmenu panel back to Menu panel

            @Override
            public void actionPerformed(ActionEvent e) {
                c.removeAll();
                c.add(menu);
                c.repaint();
                c.revalidate();
            }
        });
      csepnl.backbtn.addActionListener(new ActionListener() { //Move from cse panel back to majorsmenu panel

            @Override
            public void actionPerformed(ActionEvent e) {
                c.removeAll();
                c.add(majorsmenu);
                c.repaint();
                c.revalidate();
            }
        });
        mctpnl.backbtn.addActionListener(new ActionListener() { //Move from mct panel back to majorsmenu panel

            @Override
            public void actionPerformed(ActionEvent e) {
                c.removeAll();
                c.add(majorsmenu);
                c.repaint();
                c.revalidate();
            }
        });
          ergypnl.backbtn.addActionListener(new ActionListener() { //Move from ergy panel back to majorsmenu panel

            @Override
            public void actionPerformed(ActionEvent e) {
                c.removeAll();
                c.add(majorsmenu);
                c.repaint();
                c.revalidate();
            }
        });
            bldgpnl.backbtn.addActionListener(new ActionListener() { //Move from bldg panel back to majorsmenu panel

            @Override
            public void actionPerformed(ActionEvent e) {
                c.removeAll();
                c.add(majorsmenu);
                c.repaint();
                c.revalidate();
            }
        });
          matalpnl.backbtn.addActionListener(new ActionListener() { //Move from matal panel back to majorsmenu panel

            @Override
            public void actionPerformed(ActionEvent e) {
                c.removeAll();
                c.add(majorsmenu);
                c.repaint();
                c.revalidate();
            }
        });
           csepnl.sophomorebtn.addActionListener(new ActionListener() { //Move from csepnl(sophomore button) to infopnl 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(csepnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
             csepnl.juniorbtn.addActionListener(new ActionListener() { //Move from csepnl(junior button) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(csepnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
             csepnl.senior1btn.addActionListener(new ActionListener() { //Move from csepnl(senior1 button) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(csepnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
                 csepnl.senior2btn.addActionListener(new ActionListener() { //Move from csepnl (senior2 button) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(csepnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
                 
          
              mctpnl.sophomorebtn.addActionListener(new ActionListener() { //Move from mctpnl(sophomore button) to infopnl 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(mctpnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
             mctpnl.juniorbtn.addActionListener(new ActionListener() { //Move from mctpnl(junior button) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(mctpnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
             mctpnl.senior1btn.addActionListener(new ActionListener() { //Move from mctpnl(senior 1 button) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(mctpnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
                 mctpnl.senior2btn.addActionListener(new ActionListener() { //Move from mctpnl(senior 2 button) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(mctpnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
          ergypnl.sophomrebtn.addActionListener(new ActionListener() { //Move from ergypnl(sophomore button) to infopnl 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(ergypnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
             ergypnl.juniorbtn.addActionListener(new ActionListener() { //Move from ergypnl(junior button) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(ergypnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
             ergypnl.senior1btn.addActionListener(new ActionListener() { //Move from ergypnl(senior 1 button) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(ergypnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
                 ergypnl.senior2btn.addActionListener(new ActionListener() { //Move from ergypnl(senior 2 button) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(ergypnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
               bldgpnl.sophomrebtn.addActionListener(new ActionListener() { //Move from bldgpnl(sophomore button) to infopnl 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(bldgpnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
             bldgpnl.juniorbtn.addActionListener(new ActionListener() { //Move from bldgpnl(junior button) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(bldgpnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
             bldgpnl.senior1btn.addActionListener(new ActionListener() { //Move from bldgpnl(senior 1) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(bldgpnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
                 bldgpnl.senior2btn.addActionListener(new ActionListener() { //Move from bldgpnl(senior 2 button) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(bldgpnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
                 matalpnl.sophomrebtn.addActionListener(new ActionListener() { //Move from matalpnl(sophomore button) to infopnl 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(matalpnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
             matalpnl.juniorbtn.addActionListener(new ActionListener() { //Move from matalpnl(junior button) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(matalpnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
             matalpnl.senior1btn.addActionListener(new ActionListener() { //Move from matalpnl(senior 1) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(matalpnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
                 matalpnl.senior2btn.addActionListener(new ActionListener() { //Move from matalpnl(senior 2 button) to infopanel 

            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(matalpnl);
                c.add(informationspnl);
                c.repaint();
                c.revalidate();
            }
        });
         
            informationspnl.backbtn.addActionListener(new ActionListener() { //Move from information panel back to majorsmenu panel

            @Override
            public void actionPerformed(ActionEvent e) {
                c.removeAll();
                c.add(majorsmenu);
                c.repaint();
                c.revalidate();
            }
        });
}
    
    
class Menupnl extends JPanel{ //Start of Menu panel
    
     
             JButton start = new JButton(new ImageIcon("button1.png"));
              JButton start1 = new JButton(new ImageIcon("button2.png"));
             
     
    
      
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            try{
                BufferedImage img = ImageIO.read(new File("3.1.jpg"));
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight() , this);
            }
            catch(Exception e){}
    }
    
        public Menupnl(){
            
              start.setBorder(new RoundedBorder(40));
              start.setSize(270, 50);
              start.setLocation(50,275);
              Font gameFont = new Font("Serif",Font.ROMAN_BASELINE,30);
              start.setFont(gameFont);
              start.setBackground(Color.LIGHT_GRAY);
               start.setVisible(true);
                this.add(start);
             
                ///for button start 1
              start1.setBorder(new RoundedBorder(40));
              start1.setSize(270, 50);
              start1.setLocation(400,400);
              start1.setFont(gameFont);
              start1.setBackground(Color.LIGHT_GRAY);
              start1.setVisible(true);
                this.add(start1);
            
            this.setLayout(null);
        
        }
        
}
// starting of majors menu
class Majorspnl extends JPanel{
      private JButton csebtn=new JButton("CSE");
      private JButton mctbtn=new JButton("MCT");
      private JButton ergybtn=new JButton("ERGY");
      private JButton bldgbtn=new JButton("BLDG");
      private JButton matalbtn=new JButton("MATAL");
      private JButton backbtn=new JButton ("BACK");
      
       public void paintComponent(Graphics g){
            super.paintComponent(g);
            try{
                BufferedImage img = ImageIO.read(new File("3.jpg"));
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight() , this);
            }
            catch(Exception e){}
        }
     public Majorspnl(){
          JButton majorarr[] = {csebtn, mctbtn, ergybtn, bldgbtn,matalbtn,backbtn};
            for(int i = 0; i<majorarr.length; i++){
                majorarr[i].setSize(200,50);
                int j = 70;
                majorarr[i].setLocation(250, j*i+100);
                Font gameFont = new Font("Serif",Font.ITALIC,25);
                majorarr[i].setFont(gameFont);
                majorarr[i].setBackground(Color.ORANGE);
                this.add(majorarr[i]);
                
     
     }
             this.setLayout(null);



}
}
// starting of cse panel
class csepnl extends JPanel{
      private JButton sophomorebtn=new JButton("SOPHOMORE");
      private JButton juniorbtn=new JButton("JUNIOR");
      private JButton senior1btn=new JButton("SENIOR1");
      private JButton senior2btn=new JButton("SENIOR2");
      private JButton backbtn=new JButton("Back");
      
       public void paintComponent(Graphics g){
            super.paintComponent(g);
            try{
                BufferedImage img = ImageIO.read(new File("3.jpg"));
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight() , this);
            }
            catch(Exception e){}
        }
        public csepnl(){
          JButton majorarr[] = {sophomorebtn, juniorbtn, senior1btn, senior2btn,backbtn};
            for(int i = 0; i<majorarr.length; i++){
                majorarr[i].setSize(200,50);
                int j = 70;
                majorarr[i].setLocation(250, j*i+100);
                Font gameFont = new Font("Serif",Font.ITALIC,25);
                majorarr[i].setFont(gameFont);
                majorarr[i].setBackground(Color.ORANGE);
                this.add(majorarr[i]);
                
     
     }
             this.setLayout(null);

      

}
}
//starting of mct panel

class mctpnl extends JPanel{
        private JButton sophomorebtn=new JButton("SOPHOMORE");
      private JButton juniorbtn=new JButton("JUNIOR");
      private JButton senior1btn=new JButton("SENIOR1");
      private JButton senior2btn=new JButton("SENIOR2");
      private JButton backbtn=new JButton("Back");
      
       public void paintComponent(Graphics g){
            super.paintComponent(g);
            try{
                BufferedImage img = ImageIO.read(new File("3.jpg"));
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight() , this);
            }
            catch(Exception e){}
        }
        public mctpnl(){
          JButton majorarr[] = {sophomorebtn, juniorbtn, senior1btn, senior2btn,backbtn};
            for(int i = 0; i<majorarr.length; i++){
                majorarr[i].setSize(200,50);
                int j = 70;
                majorarr[i].setLocation(250, j*i+100);
                Font gameFont = new Font("Serif",Font.ITALIC,25);
                majorarr[i].setFont(gameFont);
                majorarr[i].setBackground(Color.ORANGE);
                this.add(majorarr[i]);
                
     
     }
             this.setLayout(null);

      

}  

}
//starting of ergy panel
class ergypnl extends JPanel{
      private JButton sophomrebtn=new JButton("SOPHOMORE");
      private JButton juniorbtn=new JButton("JUNIOR");
      private JButton senior1btn=new JButton("SENIOR1");
      private JButton senior2btn=new JButton("SENIOR2");
      private JButton backbtn=new JButton("Back");
       public void paintComponent(Graphics g){
            super.paintComponent(g);
            try{
                BufferedImage img = ImageIO.read(new File("3.jpg"));
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight() , this);
            }
            catch(Exception e){}
        }
        public ergypnl(){
          JButton majorarr[] = {sophomrebtn, juniorbtn, senior1btn, senior2btn,backbtn};
            for(int i = 0; i<majorarr.length; i++){
                majorarr[i].setSize(200,50);
                int j = 70;
                majorarr[i].setLocation(250, j*i+100);
                Font gameFont = new Font("Serif",Font.ITALIC,25);
                majorarr[i].setFont(gameFont);
                majorarr[i].setBackground(Color.ORANGE);
                this.add(majorarr[i]);
                
     
     }
             this.setLayout(null);

      

}  

}
//starting of bldg panel
class bldgpnl extends JPanel{
      private JButton sophomrebtn=new JButton("SOPHOMORE");
      private JButton juniorbtn=new JButton("JUNIOR");
      private JButton senior1btn=new JButton("SENIOR1");
      private JButton senior2btn=new JButton("SENIOR2");
      private JButton backbtn=new JButton("Back");
      
       public void paintComponent(Graphics g){
            super.paintComponent(g);
            try{
                BufferedImage img = ImageIO.read(new File("3.jpg"));
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight() , this);
            }
            catch(Exception e){}
        }
        public bldgpnl(){
          JButton majorarr[] = {sophomrebtn, juniorbtn, senior1btn, senior2btn,backbtn};
            for(int i = 0; i<majorarr.length; i++){
                majorarr[i].setSize(200,50);
                int j = 70;
                majorarr[i].setLocation(250, j*i+100);
                Font gameFont = new Font("Serif",Font.ITALIC,25);
                majorarr[i].setFont(gameFont);
                majorarr[i].setBackground(Color.ORANGE);
                this.add(majorarr[i]);
                
     
     }
             this.setLayout(null);

      

}
}
//starting of matal panel
class matalpnl extends JPanel{
      private JButton sophomrebtn=new JButton("SOPHOMORE");
      private JButton juniorbtn=new JButton("JUNIOR");
      private JButton senior1btn=new JButton("SENIOR1");
      private JButton senior2btn=new JButton("SENIOR2");
      private JButton backbtn=new JButton("Back");
      
       public void paintComponent(Graphics g){
            super.paintComponent(g);
            try{
                BufferedImage img = ImageIO.read(new File("3.jpg"));
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight() , this);
            }
            catch(Exception e){}
        }
        public matalpnl(){
          JButton majorarr[] = {sophomrebtn, juniorbtn, senior1btn, senior2btn,backbtn};
            for(int i = 0; i<majorarr.length; i++){
                majorarr[i].setSize(200,50);
                int j = 70;
                majorarr[i].setLocation(250, j*i+100);
                Font gameFont = new Font("Serif",Font.ITALIC,25);
                majorarr[i].setFont(gameFont);
                majorarr[i].setBackground(Color.ORANGE);
                this.add(majorarr[i]);
                
     
     }
             this.setLayout(null);

      

}
}
   // starting of info panel
     class informationspnl extends JPanel{
           private JLabel doctors= new JLabel("Doctor's name:");
           private JTextField text1=new JTextField();
           private JLabel coursename= new JLabel("Course name:");
           private JTextField text2=new JTextField();
           private JLabel availabledays=new JLabel ("Available days:");
           private JTextField text3=new JTextField();
           private JLabel availableslots=new JLabel ("Available slots:");
           private JTextField text4=new JTextField();
           private JButton backbtn=new JButton("Back");
           private JButton savebtn=new JButton("Save");
           private JButton finishbtn = new JButton ("Finish");
          public void paintComponent(Graphics g){
            super.paintComponent(g);
            try{
                BufferedImage img = ImageIO.read(new File("3.jpg"));
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight() , this);
            }
            catch(Exception e){}
        }
       public informationspnl(){
           // handling the Jlabels
              JLabel []infoarr={doctors,coursename,availabledays,availableslots};
            for(int i = 0; i<infoarr.length; i++){
                infoarr[i].setSize(200,50);
                int j = 70;
                infoarr[i].setLocation(70, j*i+100);
                Font gameFont = new Font("Serif",Font.ITALIC,25);
                infoarr[i].setFont(gameFont);
              
                this.add(infoarr[i]);
            }  
            //Handling the textfields
             JTextField []textsarr={text1,text2,text3,text4};
              for(int i = 0; i<textsarr.length; i++){
                textsarr[i].setSize(200,50);
                int j = 70;
                textsarr[i].setLocation(300, i*j+100);
                Font game1Font = new Font("Serif",Font.ITALIC,25);
                textsarr[i].setFont(game1Font);
              
                this.add(textsarr[i]);
             
     
     }
              //save button
              savebtn.setSize(150, 50);
              savebtn.setLocation(100, 400);
              savebtn.setBackground(Color.ORANGE);
              this.add(savebtn);
              //finish button
              finishbtn.setSize(100, 50);
              finishbtn.setLocation(300, 400);
              finishbtn.setBackground(Color.ORANGE);
              this.add(finishbtn);
              
               //back button 
              backbtn.setSize(100, 50);
              backbtn.setLocation(450, 400);
              backbtn.setBackground(Color.ORANGE);
              this.add(backbtn);
              
              
             this.setLayout(null);

      
       
       }
     
     
     }
     
     // class to make buttons of the main menu in rounded shape 
  class RoundedBorder implements Border {
        int radius;
        RoundedBorder(int radius) {
            this.radius = radius;
        }
       public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }
       public boolean isBorderOpaque() {
            return true;
      }
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
          g.drawRoundRect(x,y,width-1,height-1,radius,radius);
       }
    }
}

