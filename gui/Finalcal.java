package gui;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
//class extending JFrame
public class Finalcal extends JFrame{
    
    //set panel, Container, textArea, label
    JPanel[] panel = new JPanel[4];
    Container cont = new Container();
    JTextArea jarea = new JTextArea("0",2,20);
    JLabel label = new JLabel(" ");

    //set some variables
    String currCal="";
    String currCom;
    String currNum="0";
    String preNum="0";

	// constructor of finalcal
	public Finalcal(){

        //make panels
        for (int i=0;i<4;i++){
            panel[i]=new JPanel();
        }

        //make button array
        JButton[] btn = new JButton[20];

        //make buttons(Integer)
        int[] btnnum = {7,8,9,4,5,6,1,2,3,0};
        for (int i=0;i<10;i++){
            btn[i] = new JButton(Integer.toString(btnnum[i]));
        }

        //make buttons(String)
        String[] btncal = {"sin", "cos", "tan", "←", "C", "÷", "×", "-", "+", "="};
        for (int i=10;i<20;i++){
            btn[i] = new JButton(btncal[i-10]);
        }

        //SET CONTAINERS

        //make container to be boxlayout with y_axis
        cont.setLayout(new BoxLayout(cont,BoxLayout.Y_AXIS));
        //set container to frame
        getContentPane().add(cont);
        //set label where the computation will be showed
        cont.add(label);
        //set panel where textArea and buttons will be located
        cont.add(panel[0]);
        cont.add(panel[1]);
        //make panel[1] border layout and set panel 2,3 to east, center
        panel[1].setLayout(new BorderLayout());
        panel[1].add(panel[2],"East");
        panel[1].add(panel[3],"Center");
        //each panel 2,3 will be gridlayout
        panel[2].setLayout(new GridLayout(5,1));//operator
        panel[3].setLayout(new GridLayout(5,3));//others
        //add textarea to panel 0
        panel[0].add(jarea);

        //set buttons to panel and make action listener
        //sin,cos,tan buttons using math function
        //for convenience, click trigonometric button after insert numbers 
        for (int i=10;i<13;i++){
            panel[3].add(btn[i]);
            int j = i;
            btn[i].addActionListener(e -> {
                String tgl = btn[j].getActionCommand();
                currCal = tgl+"("+currCal+")";
                label.setText(currCal);
                if (tgl == "sin"){
                    currNum = String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(currNum))));
                    jarea.setText(currNum);
                }if (tgl == "cos"){
                    currNum = String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(currNum))));
                    jarea.setText(currNum);
                }if (tgl == "tan"){
                    currNum = String.valueOf(Math.tan(Math.toRadians(Double.parseDouble(currNum))));
                    jarea.setText(currNum);
                }
            });
        }
        //integer buttons as String
        for (int i=0;i<10;i++){
            panel[3].add(btn[i]);
            int j = i;
            btn[i].addActionListener(e -> {
                if (currNum == "0"){
                    currNum = btn[j].getActionCommand();
                    jarea.setText(currNum);
                    currCal=currCal+currNum;
                    label.setText(currCal);
                }else{
                    currNum = currNum + btn[j].getActionCommand();
                    jarea.setText(currNum);
                    currCal=currCal+btn[j].getActionCommand();
                    label.setText(currCal);
                }
                
            });
        }

        //Backspace button
        //Maybe some limitations
        panel[3].add(btn[13]);
        btn[13].addActionListener(e -> {
            currCal=currCal.substring(0, currCal.length()-1)
            ;label.setText(currCal);currNum=currNum.substring(0,currNum.length()-1)
            ;jarea.setText(currNum);});

        //Clear button
        panel[3].add(btn[14]);
        btn[14].addActionListener(e -> {jarea.setText("0");currNum ="0";preNum="0";currCom=null;
        currCal=" ";label.setText(" ");});

        //Operator buttons
        for (int i=15;i<20;i++){
            panel[2].add(btn[i]);
            int j =i;
            if (j != 19){
                btn[j].addActionListener(e -> {
                    //for continuous calculation
                    if (currCom ==null){
                        preNum = currNum;
                        currNum ="0";
                        currCom = btn[j].getActionCommand();
                        currCal = currCal+currCom;
                        label.setText(currCal);
                    }else{
                        Double Num = Double.parseDouble(preNum);
                        Double cNum = Double.parseDouble(currNum);
                        if (currCom =="÷"){
                            preNum = String.valueOf(Num/cNum);
                            jarea.setText(preNum);
                        }if (currCom == "×"){
                            preNum = String.valueOf(Num*cNum);
                            jarea.setText(preNum);
                        }if (currCom == "-"){
                            preNum = String.valueOf(Num-cNum);
                            jarea.setText(preNum);
                        }if (currCom == "+"){
                            preNum = String.valueOf(Num+cNum);
                            jarea.setText(preNum);
                        }
                        currCom = btn[j].getActionCommand();
                        currCal = currCal+currCom;
                    }
                    currNum ="0";
                });
            }if (j==19){
                btn[j].addActionListener(e -> {
                    Double Num = Double.parseDouble(preNum);
                    Double cNum = Double.parseDouble(currNum);
                    if (currCom =="÷"){
                        currNum = String.valueOf(Num/cNum);
                        jarea.setText(currNum);
                    }if (currCom == "×"){
                        currNum = String.valueOf(Num*cNum);
                        jarea.setText(currNum);
                    }if (currCom == "-"){
                        currNum = String.valueOf(Num-cNum);
                        jarea.setText(currNum);
                    }if (currCom == "+"){
                        currNum = String.valueOf(Num+cNum);
                        jarea.setText(currNum);
                    }
                });    
            }
            
            //make operator buttons to be colored as orange
            btn[i].setForeground(new Color(255,128,0));
        }

        //make button shape round
        for (int i=0;i<20;i++){
            btn[i].setBorder(new RoundedBorder(25));
        }
        
        // set size of frame
        setSize(300, 500);
		
		//exit when click x button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args)
	{
		//launcher
        JFrame cal = new Finalcal();
        cal.setVisible(true);
	}
    //Making border round inner class
    private static class RoundedBorder implements Border {

        private int radius;
    
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
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }
}
