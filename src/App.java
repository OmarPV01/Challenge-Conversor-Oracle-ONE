import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Object[] options = {"Convertidor Divisas", "Convertir Temperatura", "Salir"};
        int elige = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?","Conversor",JOptionPane.DEFAULT_OPTION, 
        JOptionPane.PLAIN_MESSAGE,null,options,options[0]);

        if(elige == 2){
            JOptionPane.showMessageDialog(null, "Programa cerrado");
            System.exit(0);
        }
        if(elige == 0){
            DecimalFormat formatearDivisa = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while(continuarPrograma){
                String [] opciones = {"Soles a Euros", "Soles a Dolares", "Soles a Libras Esterlinas",
                 "Soles a Yen", "Soles a Won"};
                String cambio = (String) JOptionPane.showInputDialog(null, "Eliga una Opcion:",
                 "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                 String input = JOptionPane.showInputDialog(null, "Ingrese Cantidad de Soles");
                 double soles = 0.00;
                 try{
                    soles = Double.parseDouble(input);
                 }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Valor no valido");
                 }

                 if(cambio.equals("Soles a Euros")){
                    double euros = soles / 3.95;
                    JOptionPane.showMessageDialog(null, soles + " Soles peruanos son: " + formatearDivisa.format(euros) + " Euros.");
                 }else if(cambio.equals("Soles a Dolares")){
                    double dolares = soles / 3.66;
                    JOptionPane.showMessageDialog(null, soles + " Soles peruanos son: " + formatearDivisa.format(dolares) + " Dolares.");
                 }else if(cambio.equals("Soles a Libras Esterlinas")){
                    double libras = soles / 4.60;
                    JOptionPane.showMessageDialog(null, soles + " Soles peruanos son: " + formatearDivisa.format(libras) + " Libras Esterlinas.");
                 } else if(cambio.equals("Soles a Euros")){
                    double yen = soles / 0.026;
                    JOptionPane.showMessageDialog(null, soles + " Soles peruanos son: " + formatearDivisa.format(yen) + " Yen.");
                 } else if(cambio.equals("Soles a Won")){
                    double won = soles / 0.0028;
                    JOptionPane.showMessageDialog(null, soles + " Soles peruanos son: " + formatearDivisa.format(won) + " Won.");
                 }     

                 int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar", JOptionPane.YES_NO_OPTION);
                 if(confirma == JOptionPane.NO_OPTION){
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                 }
            }
        }
        if(elige == 1){
            boolean seguirPrograma = true;
            while(seguirPrograma){
                String[] opciones = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};
                int opcion = JOptionPane.showOptionDialog(null, "Elige una opcion", "Conversor de Temperatura", JOptionPane.DEFAULT_OPTION,
                 JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

                String valorNominal = JOptionPane.showInputDialog(null, "Ingresar valor a convertir");
                double valor = 0.0;
                try{
                    valor = Double.parseDouble(valorNominal);
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    System.exit(0);
                }
                
                double resultado = 0;
                if(opcion == 0){
                    resultado = (valor * 9/5) + 32;
                    JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: " + Math.round(resultado*100.0)/100.0 + " Grados Fahrenheit");
                } else if(opcion == 1){
                    resultado = (valor - 32) * 5/9;
                    JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit son: " + Math.round(resultado*100.0)/100.0 + " Grados Celsius");
                }
                int continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "", JOptionPane.YES_NO_OPTION);
                if (continuar == JOptionPane.NO_OPTION){
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
            }
        }
    }
}
