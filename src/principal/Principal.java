/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import multivalorAbsoluto.Nodo1;
import multivalorTipoMatriz.Nodo2;
import multivalorTipoVector.Nodo3;
import java.util.Scanner;

/**
 *
 * @author Torrev_101
 */
public class Principal {
    public static void main (String []args){
        //multivalorAbsoluto();
        multivalorTipoVector();
    }
    
    public static void multivalorAbsoluto(){
        Scanner sc=new Scanner(System.in);
        Nodo1 p = null;
        Nodo1 q=new Nodo1();
        Nodo1 cab=new Nodo1();
        for(int i=0;i<2;i++){
            p=new Nodo1();
            System.out.println("DATOS");                  
            p.dato1=sc.nextInt();
            p.dato2=sc.nextInt();
            p.dato3=sc.nextInt();
            if(i==0){
                cab=p;
                q=p;
            }else{
                q.enlace=p;
                q=p;
            }                       
        }
        p=cab;
        for(int i=0;i<2;i++){
            System.out.println("nodo");
            System.out.print(" valor 1: "+p.dato1+"|");
            System.out.print(" valor 2: "+p.dato2+"|");
            System.out.println(" valor 3: "+p.dato3);
            p=p.enlace;
        }
            
    }
    
    public static void multivalorTipoVector(){
        Scanner sc=new Scanner(System.in);
        Nodo3 p=null;
        Nodo3 q=new Nodo3();
        Nodo3 cab=new Nodo3();
        for(int i=0;i<2;i++){
            p=new Nodo3();
            System.out.println("digite datos del vector "+(i+1));
            for(int j=0;j<3;j++){                
                p.dato[j]=sc.nextInt();                
            }
            if(i==0){
                cab=p;
                q=p;
            }else{
                q.enlace=p;
                q=p;
            }           
        }
        p=cab;
        for(int i=0;i<3;i++){
                System.out.print("valor"+(i+1)+": "+p.dato[i]+"");
                p=p.enlace;
        }
        
    }
    
    public static void multiValorTipoMatriz(){
        Scanner sc=new Scanner(System.in);
        Nodo2 p=null;
        Nodo2 q=new Nodo2();
        Nodo2 cab=new Nodo2();
        for(int n=0;n<2;n++){
            p=new Nodo2();
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){                    
                    p.dato[i][j]=sc.nextInt();
                }
            }
            if(n==0){
                cab=p;
                q=p;
            }else{
                q.enlace=p;
                q=p;
            }
        }
        p=cab;
        for(int n=0;n<2;n++){
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.println("Dato: "+p.dato[i][j]);
                }
            }
            p=p.enlace;
        }
            
    }
}
