package testetecnico.questao5;

public class Questao5 {

    public static String reverterString(String texto){
        StringBuilder textoInvertido = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0 ; i--) {
            textoInvertido.append(texto.charAt(i));
        }
        return textoInvertido.toString();
    }

    public static void main(String[] args) {
        String texto =  "Target Sistemas";
        System.out.println(Questao5.reverterString(texto));
    }
}
