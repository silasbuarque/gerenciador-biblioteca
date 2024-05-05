package servie.impl;

import modelos.Livro;
import modelos.Membro;
import servie.BibliotecaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BibliotecaServiceImpl implements BibliotecaService {

    private final List<Livro> livrosList = new ArrayList<>();
    private final List<Membro> membroList = new ArrayList<>();


    @Override
    public void caastrarLivro(Livro livro) {
        Objects.requireNonNull(livro);
        livrosList.add(livro);
    }

    @Override
    public void cadastrarMembro(Membro membro) {
        Objects.requireNonNull(membro);
        membroList.add(membro);
    }

    @Override
    public void emprestarLivro(Livro livro, Membro membro) {
        // 1. Validar se o membro e o livro não são nulos
        // 2. Verificar se o livro está disponível
        // 3. Valida se o membro existe
        // 4. Se estiver tudo ok, eu empresto o livro

        Livro consultaLivro = consultarLivro(livro);
        Membro consultaMembro = null;

        for (Livro livro1 : livrosList) {
            if (livro1.equals(livro)) {
                consultaLivro = livro1;
            }
        }

        Objects.requireNonNull(consultaLivro, "O livro não foi encontrado.");

        for (Membro membro1 : membroList) {
            if (membro1.equals(membro)) {
                consultaMembro = membro1;
            }
        }

        Objects.requireNonNull(consultaMembro, "O membro informado não foi encontrado.");




    }

    @Override
    public void receberLivro(Livro livro, Membro membro) {

    }

    @Override
    public void removerLivro(Livro livro) {
        Objects.requireNonNull(livro);
        livrosList.remove(livro);
    }

    @Override
    public void removerMembro(Membro membro) {
        Objects.requireNonNull(membro);
        membroList.remove(membro);
    }

    @Override
    public Livro consultarLivro(String nome) {
        Objects.requireNonNull(nome);

        for (Livro livro : livrosList) {
            if (livro.getTitulo().equals(nome)) {
                return livro;
            }
        }

        throw new IllegalArgumentException("Livro não encontrado");

    }

    @Override
    public Livro consultarLivro(Livro nome) {
        return null;
    }

    @Override
    public Membro consultaMembro(String cpf) {
        return null;
    }

    @Override
    public Membro consultaMembro(Membro membro) {
        return null;
    }
}
