package prueba;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertirFecha {

    public static void main(String[] args) {
        
        Date fecha = new Date();      
        System.out.println("Formato Original: "+ fecha);
        
               
        String pattern = "dd/MM/yyyy";
        DateFormat df = new SimpleDateFormat(pattern);
        
        String fechaPattern = df.format(fecha);
        
        System.out.println("Nuevo Formato:" + fechaPattern);
        
    }
    
}
