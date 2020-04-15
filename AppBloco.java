import javax.swing.JOptionPane;
public class AppBloco {
   public static void main (String [] args) {
      BlocoDeNotas bloco = new BlocoDeNotas();
      String nota;
      int indice;
      int menu;
      for (int i = 0; i != 1; i++) {
         menu = Integer.parseInt(JOptionPane.showInputDialog("1-Inserir nota\n2-Remover nota\n3-Alterar nota\n4-Listar todas as notas\n5-Sair do sistema"));
         if (menu == 1) {
            nota = JOptionPane.showInputDialog("Digite o que deseja inserir:");
            bloco.inserirNota(nota);
            i = -1;
         } else if (menu == 2) {
            indice = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota que deseja remover:"));
            if (indice >= bloco.getSize()) {
               JOptionPane.showMessageDialog(null, "Esse indice nao existe!");
               i = -1;
            } else {
               bloco.removerNota(indice);
               i = -1;
            }
         } else if (menu == 3) {
            indice = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota que deseja alterar:"));
            if (indice >= bloco.getSize()) {
               JOptionPane.showMessageDialog(null, "Esse indice nao existe!");
               i = -1;
            } else {
               bloco.removerNota(indice);
               String alteracao = JOptionPane.showInputDialog("Digite a nova nota:");
               bloco.inserirNota(alteracao);
               i = -1;
            }
         } else if (menu == 4) {
            bloco.imprimirNotas();
            i = -1;
         } else if (menu == 5) {
            JOptionPane.showMessageDialog(null, "Tchau");
            i = 0;
         } else {
            JOptionPane.showMessageDialog(null, "Opcao invalida!");
            i = -1;
         }
      }
   }
}