
package Logica;

import java.awt.Color;
import javax.swing.JOptionPane;


public class LogicaJuego {
   private int turno;
   private int pX;
   private int pO;

    public LogicaJuego(int turno, int pX, int pO) {
        this.turno = turno;
        this.pX = pX;
        this.pO = pO;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getpX() {
        return pX;
    }

    public void setpX(int pX) {
        this.pX = pX;
    }

    public int getpO() {
        return pO;
    }

    public void setpO(int pO) {
        this.pO = pO;
    }
   
   public void intercambiar()
   {
       if(getTurno()==0)
       {
           setTurno(1);
       }
       else
       {
           setTurno(0);
       }
   }
   
   public int Juego(int matriz[][])
   {
       //Validacion en horizontal
       if(matriz[0][0]==matriz[0][1] && matriz[0][0]==matriz[0][2])
       {
           return 1;
       }
       if(matriz[1][0]==matriz[1][1] && matriz[1][0]==matriz[1][2])
       {
           return 2;
       }
       if(matriz[2][0]==matriz[2][1] && matriz[2][0]==matriz[2][2])
       {
           return 3;
       }
       
       //Validacion en vertical
       if(matriz[0][0]==matriz[1][0] && matriz[0][0]==matriz[2][0])
       {
           return 4;
       }
       if(matriz[0][1]==matriz[1][1] && matriz[0][1]==matriz[2][1])
       {
           return 5;
       }
       if(matriz[0][2]==matriz[1][2] && matriz[0][2]==matriz[2][2])
       {
           return 6;
       }
       
       //Validacion en diagonal
       if(matriz[0][0]==matriz[1][1] && matriz[0][0]==matriz[2][2])
       {
           return 7;
       }
       if(matriz[0][2]==matriz[1][1] && matriz[0][2]==matriz[2][0])
       {
           return 8;
       }
       return 0;
   }
   
   public int Ejecutar(javax.swing.JButton bt,int i,int j,int matriz[][],javax.swing.JLabel jx,javax.swing.JLabel jo)
   {
       matriz[i][j]=getTurno();
       String n = new String();
       if(getTurno()==0)
       {
           n = "X";
           bt.setForeground(Color.red);
       }
       else
       {
           n = "O";
           bt.setForeground(Color.blue);
       }
       
       intercambiar();
       bt.setText(n);
       bt.setEnabled(false);
       
       if(Juego(matriz)!=0)
       {
           JOptionPane.showMessageDialog(null, "Ganaste!! "+n);
           if(getTurno()==1)
           {
               setpX(getpX()+1);
               jx.setText(String.valueOf(getpX()));
           }
           
           if(getTurno()==0)
           {
               setpO(getpO()+1);
               jo.setText(String.valueOf(getpO()));
           }
           return 1;
       }
       
       return 0;
   }
   
   public void rayar(int matriz[][],javax.swing.JPanel p,int n,int i,int j)
   {
       matriz[i][j]=getTurno();
       if(Juego(matriz)==n)
       {
           p.setVisible(true);
       }
   }
   
   public void rayar(int matriz[][],javax.swing.JLabel p,int n,int i,int j)
   {
       matriz[i][j]=getTurno();
       if(Juego(matriz)==n)
       {
           p.setVisible(true);
       }
   }
}
