package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.file.Files;
import static java.nio.file.Files.lines;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Actualizar {

    String carpetaDownnload = new File(".").getAbsolutePath();
    int len = carpetaDownnload.length();
     boolean llaveVersion=false;
    public void descargar(String URLx, String nameArchivox) {
        carpetaDownnload = carpetaDownnload.substring(0, len - 1);
        String nameArchivo = nameArchivox;

        try {
            // Url con la foto
            URL url = new URL(URLx);

            // establecemos conexion
            URLConnection urlCon = url.openConnection();

            // Sacamos por pantalla el tipo de fichero
            System.out.println(urlCon.getContentType());

            // Se obtiene el inputStream de la foto web y se abre el fichero
            // local.
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(carpetaDownnload + nameArchivo);

            // Lectura de la foto de la web y escritura en fichero local
            byte[] array = new byte[1000]; // buffer temporal de lectura.
            int leido = is.read(array);
            while (leido > 0) {
                fos.write(array, 0, leido);
                leido = is.read(array);
            }

            // cierre de conexion y fichero.
            is.close();
            fos.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error descargando actualización \n" + e);
        }

    }

    public boolean verificarConexión(String urlx) {
        try {

            URL urlxx = new URL(urlx);
            URLConnection con = urlxx.openConnection();
            con.connect();
            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error descargando actualización \n" + e);
            return false;
        }
    }

    public String getVersion() {
        try {
            URL url = new URL("https://raw.githubusercontent.com/fParrax/InvKardexUpdater/main/Version.txt");

            URLConnection con = url.openConnection();
            con.connect();
            return obtenerContenidoURL(url);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error descargando actualización \n" + e);
            return "-";
        }
    }

    public String obtenerContenidoURL(URL url) {
        String a = "-";
        try {
            Scanner s = new Scanner(url.openStream()).useDelimiter("\\Z");
            a = s.next();
            return a;
        } catch (IOException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
            return a;
        }

    }

    public String getVersionActual() {
        carpetaDownnload = carpetaDownnload.substring(0, len - 1);
        String archivo = carpetaDownnload+"version.txt";
        FileReader f = null;
        String cadena = "";
        String valor = "";
        try {

            File temp = new File(archivo);
            if(!temp.exists()){
                crearVersion();
            }
            
            
            f = new FileReader(archivo);
            
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                valor = cadena;
            }
            b.close();

        } catch (FileNotFoundException ex) {
            
            if(llaveVersion == false){
                crearVersion();
                getVersionActual();
                llaveVersion=true;
            }else{
                Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(f!=null){
                    f.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }
   
    private void crearVersion(){
         try {
        carpetaDownnload = carpetaDownnload.substring(0, len - 1);
        String archivo = carpetaDownnload+"version.txt";
            String contenido = "0.1";
            File file = new File(archivo);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setNewVersion(String version){
        
        carpetaDownnload = carpetaDownnload.substring(0, len - 1);
        String archivo = carpetaDownnload+"version.txt";
        Path path = Paths.get("version.txt");
        try (BufferedWriter br = Files.newBufferedWriter(path,
            Charset.defaultCharset(), StandardOpenOption.CREATE)) {
            br.write(version);
      } catch (Exception e) {
         e.printStackTrace();
      }
        
        
    }

}
