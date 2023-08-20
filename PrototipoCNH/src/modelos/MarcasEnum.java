/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelos;

/**
 *
 * @author Aluno
 */
public enum MarcasEnum {
   AUDI("AUDI"),
   BMW("BMW"),
   CHEVROLET("CHEVROLET"),
   FIAT("FIAT"),
   FORD("FORD"),
   HONDA("HONDA"),
   HYUNDAI("HYUNDAI"),
   JEEP("JEEP"),
   LANDROVER("LANDROVER"),
   MITSUBISHI("MITSUBISHI"),
   NISSAN("NISSAN"),
   PEUGEOT("PEUGEOT"),
   RENAULT("RENAULT"),
   TOYOTA("TOYOTA"),
   VOLKSWAGEN("VOLKSWAGEM");
   
   private final String mostrar;
   

    private MarcasEnum(String valorMarcas) {
        this.mostrar = valorMarcas;
            
    }

    @Override
    public String toString() {
        return mostrar;  
   }
  
}

