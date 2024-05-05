package modelos;

import enums.CargoEnum;
import java.util.Objects;

public class Membro {

    private long idMembro;
    private String nome;
    private String cpf;
    private CargoEnum cargo;

    public Membro(long idMembro, String nome, String cpf, Livro livroEmprestado, String dataLivroPego, String dataLivroEntrege, CargoEnum cargo) {
        this.idMembro = idMembro;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public long getIdMembro() {
        return idMembro;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public CargoEnum getCargo() {
        return cargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membro membro = (Membro) o;
        return Objects.equals(cpf, membro.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return "Membro{" +
                "idMembro=" + idMembro +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
