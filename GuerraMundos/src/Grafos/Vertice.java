/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Grafos;

import java.util.ArrayList;
/**
 *
 * @author Nicolas
 */
public class Vertice {
    public int dato;
    boolean visitado;
    ArrayList<Vertice> aristas;
    

    // cosntructor
    
    public Vertice(int dato)
    {
        aristas = new ArrayList<Vertice>();
        this.dato = dato;
        this.visitado = false;
    }
    
    public Vertice(int dato, boolean mund)
    {
        aristas = new ArrayList<Vertice>();
        this.dato = dato;
        this.visitado = false;
    }

    public Vertice(int dato, int peso)
    {
        aristas = new ArrayList<Vertice>();
        this.dato = dato;
        this.visitado = false;
    }

    public void agregarArista (Vertice arista)
    {
        // si no está la arista para no repetir
        if (buscarArista(arista) == -1)
            aristas.add(new Vertice(arista.dato));
    }
    
    public void agregarArista (Vertice arista, int peso)
    {
        // si no está la arista para no repetir
        if (buscarArista(arista) == -1)
            aristas.add(new Vertice(arista.dato, peso));
    }

    public int buscarArista(Vertice v)
    {
        for (int i = 0; i < aristas.size(); i++) {
            if (v.dato == aristas.get(i).dato)
                return i;
        }
        return -1;
    }
}