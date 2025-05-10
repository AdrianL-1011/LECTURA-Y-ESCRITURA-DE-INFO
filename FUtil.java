package es.mdc;
import java.io.File;
/**
 * @author Adrián
 * @param filename  es la  ruta del archivo que se va a validar.
 * @return  si la ruta es correcta
 * @throws para comprobar si la ruta esta vacía o solo contiene espacios.
 */
public class FUtil {
public static boolean existe(String filename) {
if (filename == null || filename.trim().isEmpty()) {
    throw new IllegalArgumentException("La ruta del archivo no puede estar vacía ni contener solo espacios.");
}
return true;
}
}