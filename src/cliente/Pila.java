/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author Willam
 */
public class Pila {
    int Max=10, Tope=0;
    int Pila[]= new int[Max];
    String Dato;
    boolean Res1=false, Res2=false;
    
    public static void main(String arg[]){
    Pila Acceso=new Pila();}
    public Pila()
    {
        int op=0;
            while(op!=4){
            op=Integer.parseInt(JOptionPane.showInputDialog(
            "Opciones de Registro de clientes"+
            "\n[1] AGREGARE DATO"+
            "\n[2] ELIMINAR DATO"+
            "\n[3] MOSTRAR PILA"+
            "\n[4] TERMINAR"
            ));
            switch(op){
            case 1:{AgregarPila(); break;}
            case 2:{BorrarPila(); break;}
            case 3:{MostrarPila(); break;}}
        }
    }
            
     public void AgregarPila(){
            PilaLleno();
            if (Res1==true){
            JOptionPane.showMessageDialog(null, "Pila Llena");
            } else{
            Dato=JOptionPane.showInputDialog("Codigo:");
            Pila[Tope]=Integer.parseInt(Dato);
            Tope++;
            }
     }
     public void PilaLleno(){
        if (Tope==Max) Res1=true;
        else Res1=false;
     }
      public void MostrarPila(){
        String Cadena="";
        for (int i=0;i<Max;i++){Cadena+="Posicion "+ i +" ---> "+Pila[i]+"\n";}
        JOptionPane.showMessageDialog(null, Cadena);}
     
      public void BorrarPila(){
            PilaVacia();
            if (Res2==true){
            JOptionPane.showMessageDialog(null, "Pila Vacia");
            } else{
            Tope-=1;
            JOptionPane.showMessageDialog(null, "Dato eliminado "+Pila[Tope]);
            Pila[Tope]=0;
            }
      }
      public void PilaVacia(){
        if (Tope==0) Res2=true;
        else Res2=false;
        }


 

}
