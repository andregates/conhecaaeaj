package br.com.infomind.knoweaj;

public class PontoInteresse {

    private int id, imagem;
    private double lat, longi;
    private String nome, descricao, responsavel, email, telefone, horario;

    public PontoInteresse(int id, int imagem, double lat, double longi, String nome, String descricao, String responsavel, String email, String telefone, String horario) {
        this.id = id;
        this.imagem = imagem;
        this.lat = lat;
        this.longi = longi;
        this.nome = nome;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.email = email;
        this.telefone = telefone;
        this.horario = horario;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}


/*
A aba 2 deverá ser usada para apresentar o fragment um nome,  foto, descrição textual,
responsáivel, email de contato, telefone de contato, horário de funcionamento, etc. do
ponto de interesse.
 */