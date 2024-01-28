/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author Willam Ontaneda
 */
public class Cliente {
    /*DECLARACION DE VARIABLES GLOBALES*/
    int Max=20, Frente=-1,Final=0;
    int Cola[]= new int[Max];
    String Dato;
    public static void main(String[] args) { 
     Cliente Acceso= new Cliente();   // TODO code application logic here
    }
    /*DECLARACION DEL CONSTRUCTOR DE LA CLASE*/
    public Cliente(){
        int op=0;
        while(op!=4)
        {
            op=Integer.parseInt(JOptionPane.showInputDialog(
            "Opciones de Registro de clientes"+
            "\n[1] AGREGARE DATO"+
            "\n[2] ELIMINAR DATO"+
            "\n[3] MOSTRAR DATO"+
            "\n[4] TERMINAR"
            ));
            switch(op){
                case 1: {push();  break;} 
                case 2: {Pop();break;} 
                case 3: {imprimirCola(); break;} 
            }
        }
    }
    public void imprimirCola()
    {
        String Cadena="";
        int i=1;
        for(int datoCola: Cola)
        {Cadena+="Posicion: "+i+"-->"+datoCola+"\n";i++;}
        JOptionPane.showMessageDialog(null, Cadena);
    }
    public void push()
    {
        if(Final<Max)
        {
            Dato=JOptionPane.showInputDialog("Codigo");
            Cola[Final]=Integer.parseInt(Dato);
            Final++;
            if(Final==1)Frente=0;
        } else JOptionPane.showMessageDialog(null,"No hay elementos disponibles en Cola..");
    }
    public void Pop(){
        if(Frente!=-1){
            JOptionPane.showMessageDialog(null,"Dato Eliminado"+Cola[Frente]);
            Cola[Frente]=0;
            if(Frente==(Final-1))
            {
            System.out.print(Frente+"-"+Final);
            Frente=-1;
            Final=0;
            }else{
            Frente++;
            }
        }else JOptionPane.showMessageDialog(null,"Datos Vacios");   
    }
}
