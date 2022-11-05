package classesRPG;

public class Personagem {

    private int idPersonagem;
    private String nomePersonagem;
    private int danoPersonagem;
    private int defesaPersonagem;
    private int hpPersonagem;

    public Personagem(int idPersonagem, String nomePersonagem, int danoPersonagem, int defesaPersonagem, int hpPersonagem) {
        this.idPersonagem = idPersonagem;
        this.nomePersonagem = nomePersonagem;
        this.danoPersonagem = danoPersonagem;
        this.defesaPersonagem = defesaPersonagem;
        this.hpPersonagem = hpPersonagem;
    }

    public Personagem() {

    }

    public void seApresentar(){
        System.out.println("Olá, meu nome é " + this.nomePersonagem);
    }



    public int getIdPersonagem() {
        return idPersonagem;
    }

    public void setIdPersonagem(int idPersonagem) {
        this.idPersonagem = idPersonagem;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public int getDanoPersonagem() {
        return danoPersonagem;
    }

    public void setDanoPersonagem(int danoPersonagem) {
        this.danoPersonagem = danoPersonagem;
    }

    public int getDefesaPersonagem() {
        return defesaPersonagem;
    }

    public void setDefesaPersonagem(int defesaPersonagem) {
        this.defesaPersonagem = defesaPersonagem;
    }

    public int getHpPersonagem() {
        return hpPersonagem;
    }

    public void setHpPersonagem(int hpPersonagem) {
        this.hpPersonagem = hpPersonagem;
    }


}
