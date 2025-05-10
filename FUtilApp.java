package es.mdc;
import java.io.File;
public class MainApp{
    public static void main(String[]args){
        String rutaArcivo = "";
        
        if (FUtil.existe(rutaArcivo)){
            System.out.println("El archivo si existe");
        }else
            System.out.println("El archivo no existe");
    }
}