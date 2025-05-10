public class MainApp{
    public static void main(String[]args){
        String rutaArcivo = "C:\Users\Trending Pc\Desktop\DAM1\Archivos JAVA\LECTURA Y ESCRITURA DE INFO"
        
        if (FUtil.existe(rutaArcivo)){
            System.out.println("El archivo si existe");
        }else
            System.out.println("El archivo no existe");
    }
}