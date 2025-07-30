/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lin Let Shwe Ye Khin
 */
public class load {
    public static void main(String[] args)
      {
          loading l =new loading();
          l.setVisible(true);
          FirstPage m= new FirstPage();
          m.setVisible(false);
    
                try 
                  {
                for(int x=0;x<=100;x++)
                      {
              Thread.sleep(50);
              l.jLabel1.setText(Integer.toString(x)+"%");
              l.jProgressBar1.setValue(x);
            
                 if(x==100)
                     {
                   l.setVisible(false);
                   m.setVisible(true);
            
                     }
                     }
                   } 
                 catch (Exception e) 
                 {
                 }
      }
    
}
