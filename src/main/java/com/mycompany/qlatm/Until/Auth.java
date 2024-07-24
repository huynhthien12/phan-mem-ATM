/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlatm.Until;

import com.mycompany.qlatm.Entify.TaiKhoan;

/**
 *
 * @author admin
 */
public class Auth {
    public static TaiKhoan user = null ;
    
    public static void clear(){
        Auth.user = null ;
                
    }
      public static boolean isLogin() {
        return Auth.user != null;
    }
      
      public static int getstk(){
        return user.getSoTaiKhoan();
    }
}
