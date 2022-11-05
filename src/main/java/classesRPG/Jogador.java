package classesRPG;

public class Jogador extends Personagem {

    private int idJogador;
    private String classe;
    private int skill;
    private int idPC;




    public Jogador(int idPersonagem, String nomePersonagem, int danoPersonagem, int defesaPersonagem, int hpPersonagem, int idJogador, String classe, int skill, int idPC) {
        super(idPersonagem, nomePersonagem, danoPersonagem, defesaPersonagem, hpPersonagem);
        this.idJogador = idJogador;
        this.classe = classe;
        this.skill = skill;
        this.idPC = idPC;
    }

    public Jogador() {
        super();
    }

    public int getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getIdPC() {
        return idPC;
    }

    public void setIdPC(int idPC) {
        this.idPC = idPC;
    }

}
