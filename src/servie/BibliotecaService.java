package servie;

import modelos.Livro;
import modelos.Membro;

public interface BibliotecaService {

    void caastrarLivro(Livro livro);
    void cadastrarMembro(Membro membro);
    void emprestarLivro(Livro livro, Membro membro);
    void receberLivro(Livro livro, Membro membro);
    void removerLivro(Livro livro);
    void removerMembro(Membro membro);
    Livro consultarLivro(String nome);
    Livro consultarLivro(Livro nome);
    Membro consultaMembro(String cpf);
    Membro consultaMembro(Membro membro);

}
