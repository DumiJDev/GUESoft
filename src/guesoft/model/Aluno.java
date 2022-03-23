package guesoft.model;

public class Aluno {
    private String nome;
    private Curso curso;
    private String contacto;
    private String turma;
    private String senha;
    private String sexo;

    public Aluno() {
        nome = "";
        contacto = "";
        turma = "";
        senha = "";
    }

    public Aluno(String nome, Curso curso, String contacto, String turma, String senha, String sexo) {
        this.nome = nome;
        this.curso = curso;
        this.contacto = contacto;
        this.turma = turma;
        this.senha = senha;
        this.sexo = sexo;
    }

    /**
     * get field
     *
     * @return nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * set field
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * get field
     *
     * @return curso
     */
    public Curso getCurso() {
        return this.curso;
    }

    /**
     * set field
     *
     * @param curso
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * get field
     *
     * @return contacto
     */
    public String getContacto() {
        return this.contacto;
    }

    /**
     * set field
     *
     * @param contacto
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * get field
     *
     * @return turma
     */
    public String getTurma() {
        return this.turma;
    }

    /**
     * set field
     *
     * @param turma
     */
    public void setTurma(String turma) {
        this.turma = turma;
    }

    /**
     * get field
     *
     * @return senha
     */
    public String getSenha() {
        return this.senha;
    }

    /**
     * set field
     *
     * @param senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", contacto='" + contacto + '\'' +
                ", turma='" + turma + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    /**
     * get field
     *
     * @return sexo
     */
    public String getSexo() {
        return this.sexo;
    }

    /**
     * set field
     *
     * @param sexo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
