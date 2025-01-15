package Modulos.POO.Composicao.Curso;

import java.util.ArrayList;

public class Aluno {

    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<Curso>();
    // No caso acima é mostrado como é feito quando um Array ou uma Lista esta como "final"/constante, no caso isso não á impede de ter seu valor alterado, mas sim impede que o local que esta armazenando o local no qual onde ela aponta onde seu dados estão armazenados, assim impedindo que seja criada uma nova lista, e ainda sim permitindo alterar o valor que está dentro dos dados que ela faz referencia!

    Aluno(String nome){
        this.nome = nome;
    }

    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        // Um aluno esta referenciando seu curso
        curso.alunos.add(this);
    }

    Curso obterCursoPoNome(String nome){
        Curso procurado = null;
        for(Curso c : cursos){
            if(c.nome.equalsIgnoreCase(nome)){
                return c;
            }
        }
        return null;
    }

    public String toString(){
      return nome;
    };
}
