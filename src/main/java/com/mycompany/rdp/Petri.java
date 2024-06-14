/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rdp;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 *
 * @author julian
 */
public class Petri {
    
        public static void hacerEstado(Graphics g, int posisionX, int posisionY, int x1, int y1){  // estado1
            Graphics2D g2D=(Graphics2D)g;     // para el grosor de liena
            g.setColor(Color.BLACK);
            g2D.setStroke (new BasicStroke(2.2f)); //grasor de liena
            // la formula interna dibuja el estado justo donde se da click
            g.drawOval(posisionX-x1/2, posisionY-y1/2, x1, y1);  // dibuja un estado
            // gBuffer.fillOval(x-diameter/2,y-diameter/2,diameter,diameter);
        }
        
        public static void hacerTransicion(Graphics g, int x, int y, int x1, int y1){ // es hacerArco
               Graphics2D g2D=(Graphics2D)g;
               g.setColor(Color.BLACK); 
               g2D.setStroke (new BasicStroke(2.2f));
               //g.drawLine(x, y, x1, y1);
               g.drawRect(x-x1/2, y-y1/2, x1, y1);  // dibuja una Transicion
       }
     
        // esta seccion esta descontinuada  
     /* public static void hacerLinea(Graphics g, int x, int y, int x1, int y1){
         g.setColor(Color.BLACK);
        // g.drawRect(100, 100, x, y);  // dibuja una Transicion
         g.drawLine(x, y, x1, y1);
       }  */ // esta seccion esta descontinuada
    
    
       public static void hacerLinea2(Graphics g, int xa, int ya, int xb, int yb, int x1, int y1){
            //http://mexiconotas2.blogspot.mx/2010/08/tutorial-como-dibujar-una-flecha.html 
          
            int uno=0;
            int dos=0;
            int x2=0, y2=0;
            
            double ang=0.0, angSep=0.0;
            double tx,ty;
            int dist=0;
            Point punto1=null,punto2=null;

            //defino dos puntos extremos
            punto1=new Point(xa,ya); //
            punto2=new Point(xb,yb); //
          
            //tamaño de la punta de la flecha
            dist=10;

            /* (la coordenadas de la ventana es al revez)
                calculo de la variacion de "x" y "y" para hallar el angulo
            **/
   
     //if(dibuja==1){
            ty=-(punto1.y-punto2.y)*1.0;
            tx=(punto1.x-punto2.x)*1.0;
            //angulo
            ang=Math.atan (ty/tx);
            // System.out.println("yoo");

            if(tx<0)
            {// si tx es negativo aumentar 180 grados
                ang+=Math.PI;
            }

            //puntos de control para la punta
            //p1 y p2 son los puntos de salida
            Point p1=new Point(),p2=new Point(),punto=punto2;

            //angulo de separacion
            angSep=25.0;
    
            p1.x=(int)(punto.x+dist*Math.cos (ang-Math.toRadians (angSep)));
            p1.y=(int)(punto.y-dist*Math.sin (ang-Math.toRadians (angSep)));
            p2.x=(int)(punto.x+dist*Math.cos (ang+Math.toRadians (angSep)));
            p2.y=(int)(punto.y-dist*Math.sin (ang+Math.toRadians (angSep)));

            Graphics2D g2D=(Graphics2D)g;

            //dale color a la linea
            //g.setColor (Color.BLUE);   // la linea se comento 7 jun 2024
            // grosor de la linea
            g2D.setStroke (new BasicStroke(2.2f));
            //dibuja la linea de extremo a extremo
            g.drawLine (punto1.x,punto1.y,punto.x,punto.y);
            //dibujar la punta
            g.drawLine (p1.x,p1.y,punto.x,punto.y);
            g.drawLine (p2.x,p2.y,punto.x,punto.y); 
          
        //    } // if uno dos
      }   
      
      
      
       public static void hacerToken(Graphics g, int x, int y, int x1, int y1){
               g.setColor(Color.BLACK);
               g.fillOval(x-x1/2, y-y1/2, x1, y1);
               //gBuffer.fillOval(x-diameter/2,y-diameter/2,diameter,diameter);
               // ftp://ftp.sdu.edu.tr/pub/java/javatutor/j_tutor13.html   esplica como poner en el centro el token
       }
       //    ftp://ftp.sdu.edu.tr/pub/java/javatutor/j_tutor17.html        /// esplica la interseccion
      
      
    
    
}
