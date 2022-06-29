public class Viewer extends Pessoa{
    private String login;
    private int total0Assistido;

    public Viewer(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login= login;
        this.total0Assistido=0;
    }



    public void assistiuMaisUm(){
        this.total0Assistido ++;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotal0Assistido() {
        return total0Assistido;
    }

    public void setTotal0Assistido(int total0Assistido) {
        this.total0Assistido = total0Assistido;
    }

    @Override
    public String toString() {
        return "Viewer{" + super.toString() +
                "\nlogin='" + login + '\'' +
                ", total0Assistido=" + total0Assistido +
                '}';
    }
}
