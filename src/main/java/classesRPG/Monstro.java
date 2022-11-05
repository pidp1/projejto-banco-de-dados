package classesRPG;

public class Monstro extends Personagem{
    private int idMonstro;
    private String classe;
    private int skill;
    private int idNPC;

    public Monstro(int idPersonagem, String nomePersonagem, int danoPersonagem, int defesaPersonagem, int hpPersonagem, int idMonstro, String classe, int skill, int idNPC) {
        super(idPersonagem, nomePersonagem, danoPersonagem, defesaPersonagem, hpPersonagem);
        this.idMonstro = idMonstro;
        this.classe = classe;
        this.skill = skill;
        this.idNPC = idNPC;
    }



    public int getIdMonstro() {
        return idMonstro;
    }

    public void setIdMonstro(int idMonstro) {
        this.idMonstro = idMonstro;
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

    public int getIdNPC() {
        return idNPC;
    }

    public void setIdNPC(int idNPC) {
        this.idNPC = idNPC;
    }

}
