import javax.swing.text.View;

public class Main {
    public static void main(String[] args) {

        Viewer g[] = new Viewer[2];
        g[0] = new Viewer("Vinicius", 21, "Masculino", "vinifermo");
        g[1] = new Viewer("Paula", 49, "Feminino", "paula123");


        Video v[] = new Video[3];
        v[0] = new Video("Como programar em POO");
        v[1] = new Video("Aprenda JAVA Basico!");
        v[2] = new Video("Aprenda a diferenca de framework e bibliotecas");

        Visualizacao visu[] = new Visualizacao[5];
        visu[0] = new Visualizacao(g[0], v[1]);
        visu[1]= new Visualizacao(g[1],v[1]);
        visu[0].avaliar(87.0f);



        System.out.println("----------- VIDEO -----------");
        System.out.println(v[0].toString());
        System.out.println("-------- VISUALZIACAO--------");
        System.out.println(visu[0].toString());
        System.out.println(visu[1].toString());



    }


}
