package Modulos.POO.Composicao.Curso;

import java.util.ArrayList;

public class Curso {

    final String nome;
    final ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    Curso(String nome){
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        // Um curso esta referenciando seu aluno
        aluno.cursos.add(this);
    }
}
