import java.util.ArrayList;
import javax.swing.JOptionPane;
public class BlocoDeNotas {
   private ArrayList<String> notas;
   
   public BlocoDeNotas() {
      notas = new ArrayList<String>();
   }
   public void inserirNota(String nota) {
      notas.add(nota);
      JOptionPane.showMessageDialog(null, "Nota adicionada com sucesso!");
   }
   public void removerNota(int indice) {
      notas.remove(indice);
      JOptionPane.showMessageDialog(null, "Nota removida com sucesso!");
   }
   public String buscarNota(int indice) {
      return buscar(indice);
   }
   
   private String buscar(int indice){
      String nota = notas.get(indice);
      return nota;
   }
   
   public void imprimirNotas() {
      String resultado = "";
      for (int i = 0; i < notas.size(); i++) {
         resultado = resultado + notas.get(i) + "\n";
      }
      JOptionPane.showMessageDialog(null, resultado);
   }
   
   public int getSize() {
      return notas.size();
   }
}