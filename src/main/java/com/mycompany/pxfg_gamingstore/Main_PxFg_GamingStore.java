/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pxfg_gamingstore;

import com.mycompany.pxfg_gamingstore.newpackage.vista.MenuPrincipal;

/**
 *
 * @author yisha
 */

public class Main_PxFg_GamingStore {

    public static void main(String[] args) {

    Conexion conexion = new Conexion();

    conexion.establecerConexion();
    //anda viendo si esto encuentra el menu que esta en vista.
    MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
  
}
}
