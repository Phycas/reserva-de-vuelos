package pruebas;

import java.io.File;
import java.util.EnumSet;
 
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
 
// Hibernate 5.
public class SuperGeneradorDeTablas {
 
   public static final String SCRIPT_FILE = "exportaEsto.sql";
 
   private static SchemaExport getSchemaExport() {
 
       SchemaExport export = new SchemaExport();
       // directorio del script
       File outputFile = new File(SCRIPT_FILE);
       String outputFilePath = outputFile.getAbsolutePath();
 
       System.out.println("Export file: " + outputFilePath);
 
       export.setDelimiter(";");
       export.setOutputFile(outputFilePath);
        
  
       export.setHaltOnError(false);
      
       return export;
   }
 
   public static void dropDataBase(SchemaExport export, Metadata metadata) {
       EnumSet<TargetType> targetTypes = EnumSet.of(TargetType.DATABASE, TargetType.SCRIPT, TargetType.STDOUT);
       export.drop(targetTypes, metadata);
   }
 
   public static void createDataBase(SchemaExport export, Metadata metadata) {
       EnumSet<TargetType> targetTypes = EnumSet.of(TargetType.DATABASE, TargetType.SCRIPT, TargetType.STDOUT);
       SchemaExport.Action action = SchemaExport.Action.CREATE;
       export.execute(targetTypes, action, metadata);
       System.out.println("Archivo creado");
  }
 
   public static void main(String[] args) {
 
      
       String configFileName = "hibernate.cfg.xml";
 
       // cargar la configuración
       ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
               .configure(configFileName).build();
 
       // Cargar metadata
       Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
 
       
       SchemaExport export = getSchemaExport();
    
 
       System.out.println("Drop Database...");
       // Borrar la base de datos
       dropDataBase(export, metadata);
 
       System.out.println("Create Database...");
       // Crear las tablas
       createDataBase(export, metadata);
   }
    
}
