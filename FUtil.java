package es.mdc;
import java.io.File;
public class FUtil {
public static boolean existe(String filename) {
if (filename == null || filename.trim().isEmpty()) {
    throw new IllegalArgumentException("La ruta del archivo no puede estar vacía ni contener solo espacios.");
}
return true;
}
}