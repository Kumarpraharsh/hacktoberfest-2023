import java.awt.*;  
import java.awt.event.*;  
import javax.swing.JOptionPane;  
public class Puzzle extends Frame implements ActionListener{  
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;  
Puzzle(){  
    super("Puzzle - JavaTpoint");  
    b1=new Button("1");  
    b1.setBounds(50,100,40,40);  
    b2=new Button("2");  
    b2.setBounds(100,100,40,40);  
    b3=new Button("3");  
    b3.setBounds(150,100,40,40);  
    b4=new Button("4");  
    b4.setBounds(50,150,40,40);  
    b5=new Button("5");  
    b5.setBounds(100,150,40,40);  
    b6=new Button("6");  
    b6.setBounds(150,150,40,40);  
    b7=new Button("7");  
    b7.setBounds(50,200,40,40);  
    b8=new Button("");  
    b8.setBounds(100,200,40,40);  
    b9=new Button("8");  
    b9.setBounds(150,200,40,40);  
      
    b1.addActionListener(this);  
    b2.addActionListener(this);  
    b3.addActionListener(this);  
    b4.addActionListener(this);  
    b5.addActionListener(this);  
    b6.addActionListener(this);  
    b7.addActionListener(this);  
    b8.addActionListener(this);  
    b9.addActionListener(this);  
      
    add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);  
    setSize(400,400);  
    setLayout(null);  
    setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
    if(e.getSource()==b1){  
        String label=b1.getLabel();  
        if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b1.setLabel("");  
        }  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b1.setLabel("");  
        }  
    }  
    if(e.getSource()==b2){  
        String label=b2.getLabel();  
        if(b1.getLabel().equals("")){  
            b1.setLabel(label);  
            b2.setLabel("");  
        }  
        if(b3.getLabel().equals("")){  
            b3.setLabel(label);  
            b2.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b2.setLabel("");  
        }  
    }  
    if(e.getSource()==b3){  
        String label=b3.getLabel();  
        if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b3.setLabel("");  
        }  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b3.setLabel("");  
        }  
    }  
    if(e.getSource()==b4){  
        String label=b4.getLabel();  
        if(b1.getLabel().equals("")){  
            b1.setLabel(label);  
            b4.setLabel("");  
        }  
        if(b7.getLabel().equals("")){  
            b7.setLabel(label);  
            b4.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b4.setLabel("");  
        }  
    }  
    if(e.getSource()==b5){  
        String label=b5.getLabel();  
        if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b5.setLabel("");  
        }  
    }  
    if(e.getSource()==b6){  
        String label=b6.getLabel();  
        if(b9.getLabel().equals("")){  
            b9.setLabel(label);  
            b6.setLabel("");  
        }  
        if(b3.getLabel().equals("")){  
            b3.setLabel(label);  
            b6.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b6.setLabel("");  
        }  
    }  
    if(e.getSource()==b7){  
        String label=b7.getLabel();  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b7.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b7.setLabel("");  
        }  
    }  
    if(e.getSource()==b8){  
        String label=b8.getLabel();  
        if(b9.getLabel().equals("")){  
            b9.setLabel(label);  
            b8.setLabel("");  
        }  
        if(b7.getLabel().equals("")){  
            b7.setLabel(label);  
            b8.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b8.setLabel("");  
        }  
    }  
    if(e.getSource()==b9){  
        String label=b9.getLabel();  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b9.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b9.setLabel("");  
        }  
    }  
      
    //congrats code  
    if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()    
            .equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")    
            &&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()    
            .equals("8")&&b9.getLabel().equals("")){     
            JOptionPane.showMessageDialog(this,"Congratulations! You won.");    
    }    
}  
public static void main(String[] args) {  
    new Puzzle();  
}  
}  
Puzzle Game using Swing
Puzzle game in swing
import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
public class puzzle extends JFrame implements ActionListener{  
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next;  
puzzle(){  
super("Puzzle Game - JavaTpoint");  
 b1=new JButton("1");  
 b2=new JButton(" ");  
 b3=new JButton("3");  
 b4=new JButton("4");  
 b5=new JButton("5");  
 b6=new JButton("6");  
 b7=new JButton("7");  
 b8=new JButton("8");  
 b9=new JButton("2");  
 next=new JButton("next");  
  
b1.setBounds(10,30,50,40);  
b2.setBounds(70,30,50,40);  
b3.setBounds(130,30,50,40);  
b4.setBounds(10,80,50,40);  
b5.setBounds(70,80,50,40);  
b6.setBounds(130,80,50,40);  
b7.setBounds(10,130,50,40);  
b8.setBounds(70,130,50,40);  
b9.setBounds(130,130,50,40);  
next.setBounds(70,200,100,40);  
    
add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9); add(next);  
b1.addActionListener(this);  
b2.addActionListener(this);  
b3.addActionListener(this);  
b4.addActionListener(this);  
b5.addActionListener(this);  
b6.addActionListener(this);  
b7.addActionListener(this);  
b8.addActionListener(this);  
b9.addActionListener(this);  
next.addActionListener(this);  
  
next.setBackground(Color.black);  
next.setForeground(Color.green);  
setSize(250,300);  
setLayout(null);  
setVisible(true);  
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
}//end of constructor  
  
public void actionPerformed(ActionEvent e){  
if(e.getSource()==next){  
String s=b4.getLabel();  
b4.setLabel(b9.getLabel());  
b9.setLabel(s);  
s=b1.getLabel();  
b1.setLabel(b5.getLabel());  
b5.setLabel(s);  
s=b2.getLabel();  
b2.setLabel(b7.getLabel());  
b7.setLabel(s);  
}  
if(e.getSource()==b1){  
String s=b1.getLabel();  
if(b2.getLabel().equals(" ")){ b2.setLabel(s); b1.setLabel(" ");}  
else if(b4.getLabel().equals(" ")){ b4.setLabel(s); b1.setLabel(" ");}  
 }//end of if  
  
if(e.getSource()==b3){  
String s=b3.getLabel();  
if(b2.getLabel().equals(" ")){ b2.setLabel(s); b3.setLabel(" ");}  
else if(b6.getLabel().equals(" ")){ b6.setLabel(s); b3.setLabel(" ");}  
 }//end of if  
  
if(e.getSource()==b2){  
String s=b2.getLabel();  
if(b1.getLabel().equals(" ")){ b1.setLabel(s); b2.setLabel(" ");}  
else if(b3.getLabel().equals(" ")){ b3.setLabel(s); b2.setLabel(" ");}  
else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b2.setLabel(" ");}  
 }//end of if  
  
if(e.getSource()==b4){  
String s=b4.getLabel();  
if(b1.getLabel().equals(" ")){ b1.setLabel(s); b4.setLabel(" ");}  
else if(b7.getLabel().equals(" ")){ b7.setLabel(s); b4.setLabel(" ");}  
else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b4.setLabel(" ");}  
 }//end of if  
  
if(e.getSource()==b5){  
String s=b5.getLabel();  
if(b2.getLabel().equals(" ")){ b2.setLabel(s); b5.setLabel(" ");}  
else if(b4.getLabel().equals(" ")){ b4.setLabel(s); b5.setLabel(" ");}  
else if(b6.getLabel().equals(" ")){ b6.setLabel(s); b5.setLabel(" ");}  
else if(b8.getLabel().equals(" ")){ b8.setLabel(s); b5.setLabel(" ");}  
 }//end of if  
  
if(e.getSource()==b6){  
  
String s=b6.getLabel();  
if(b9.getLabel().equals(" ")){ b9.setLabel(s); b6.setLabel(" ");}  
else if(b3.getLabel().equals(" ")){ b3.setLabel(s); b6.setLabel(" ");}  
else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b6.setLabel(" ");}  
  
 }//end of if  
  
if(e.getSource()==b7){  
String s=b7.getLabel();  
if(b4.getLabel().equals(" ")){ b4.setLabel(s); b7.setLabel(" ");}  
else if(b8.getLabel().equals(" ")){ b8.setLabel(s); b7.setLabel(" ");}  
  
 }//end of if  
  
if(e.getSource()==b8){  
String s=b8.getLabel();  
if(b7.getLabel().equals(" ")){ b7.setLabel(s); b8.setLabel(" ");}  
else if(b9.getLabel().equals(" ")){ b9.setLabel(s); b8.setLabel(" ");}  
else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b8.setLabel(" ");}  
  
 }//end of if  
  
if(e.getSource()==b9){  
String s=b9.getLabel();  
if(b6.getLabel().equals(" ")){ b6.setLabel(s); b9.setLabel(" ");}  
else if(b8.getLabel().equals(" ")){ b8.setLabel(s); b9.setLabel(" ");}  
  
if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()  
.equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")  
&&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()  
.equals("8")&&b9.getLabel().equals(" ")){   
JOptionPane.showMessageDialog(puzzle.this,"!!!you won!!!");  
}  
 }//end of if  
  
}//end of actionPerformed  
   
  
public static void main(String[] args){  
new puzzle();  
}//end of main  
  
}//end of class  
download this example


← PrevNext →


Youtube For Videos Join Our Youtube Channel: Join Now
Feedback
Send your Feedback to feedback@javatpoint.com
Help Others, Please Share
facebook twitter pinterest


Learn Latest Tutorials
Splunk tutorial
Splunk

SPSS tutorial
SPSS

Swagger tutorial
Swagger

T-SQL tutorial
Transact-SQL

Tumblr tutorial
Tumblr

React tutorial
ReactJS

Regex tutorial
Regex

Reinforcement learning tutorial
Reinforcement Learning

R Programming tutorial
R Programming

RxJS tutorial
RxJS

React Native tutorial
React Native

Python Design Patterns
Python Design Patterns

Python Pillow tutorial
Python Pillow

Python Turtle tutorial
Python Turtle

Keras tutorial
Keras


Preparation
Aptitude
Aptitude

Logical Reasoning
Reasoning

Verbal Ability
Verbal Ability

Interview Questions
Interview Questions

Company Interview Questions
Company Questions


Trending Technologies
Artificial Intelligence Tutorial
Artificial Intelligence

AWS Tutorial
AWS

Selenium tutorial
Selenium

Cloud Computing tutorial
Cloud Computing

Hadoop tutorial
Hadoop

ReactJS Tutorial
ReactJS

Data Science Tutorial
Data Science

Angular 7 Tutorial
Angular 7

Blockchain Tutorial
Blockchain

Git Tutorial
Git

Machine Learning Tutorial
Machine Learning

DevOps Tutorial
DevOps



B.Tech / MCA
DBMS tutorial
DBMS

Data Structures tutorial
Data Structures

DAA tutorial
DAA

Operating System tutorial
Operating System

Computer Network tutorial
Computer Network

Compiler Design tutorial
Compiler Design

Computer Organization and Architecture
Computer Organization

Discrete Mathematics Tutorial
Discrete Mathematics

Ethical Hacking Tutorial
Ethical Hacking

Computer Graphics Tutorial
Computer Graphics

Software Engineering Tutorial
Software Engineering

html tutorial
Web Technology

Cyber Security tutorial
Cyber Security

Automata Tutorial
Automata

C Language tutorial
C Programming

C++ tutorial
C++

Java tutorial
Java

.Net Framework tutorial
.Net

Python tutorial
Python

List of Programs
Programs

Control Systems tutorial
Control System

Data Mining Tutorial
Data Mining

Data Warehouse Tutorial
Data Warehouse




