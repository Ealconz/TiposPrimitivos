/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoprimitivo;

/**
 *
 * @author elias
 */
public class TipoPrimitivo {

    /**
     * Enteros:
         - byte: 8 bits | Byte.MIN_VALUE  -  Byte.MAX_VALUE
         - short: 16 bits | (-32768 a 32767) | Short.MIN_VALUE - Short.MAXVALUE
         - int: 
         - long:
         
     * Decimales: 
         - float: 
         - double:
         
     * Caracter:
         - char:
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Byte enteroByte = 5;
        System.out.println("enteroByte = " + enteroByte);
        System.out.println("Valor minimo del tipo Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del tipo Byte: " + Byte.MAX_VALUE);
        
        Short enteroshort = 5;
        System.out.println("enteroShort = " + enteroshort);
        System.out.println("Valor minimo del tipo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del tipo short: " + Short.MAX_VALUE);
        
        Integer enteroint = 5;
        System.out.println("enteroInt = " + enteroint);
        System.out.println("Valor minimo del tipo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del tipo int: " + Integer.MAX_VALUE);
        
        long enteroLong = 5;
        System.out.println("enteroLong = " + enteroLong);
        System.out.println("Valor minimo del tipo Long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo del tipo Long: " + Long.MAX_VALUE);
        
        float decimalFloat = 5;
        System.out.println("decimalFloat = " + decimalFloat);
        System.out.println("Valor minimo del tipo Float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo del tipo Float: " + Float.MAX_VALUE);
        
        double decimalDouble = 5;
        System.out.println("decimalDouble = " + decimalDouble);
        System.out.println("Valor minimo del tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo del tipo double: " + Double.MAX_VALUE);
        
        char caracterChar = 5;
        System.out.println("caracterChar = " + caracterChar);
        System.out.println("Valor minimo del tipo char: " + Character.MIN_VALUE);
        System.out.println("Valor maximo del tipo char: " + Character.MAX_VALUE);
    }
    
}
