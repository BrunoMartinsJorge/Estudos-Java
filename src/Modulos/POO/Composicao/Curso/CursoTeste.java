package Modulos.POO.Composicao.Curso;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Bruno");
        Aluno aluno2 = new Aluno("Caio");
        Aluno aluno3 = new Aluno("Ana");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("React Native");
        Curso curso3 = new Curso("Angular 13");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno3);
        curso2.adicionarAluno(aluno1);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno : curso3.alunos) {
            System.out.println("Estou matriculado no " + curso3.nome);
            System.out.println("E meu nome é " + aluno.nome + ".");
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos.toString());

        Curso cursoEncontrado = aluno2.obterCursoPoNome("React Native");
        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.alunos);
            System.out.println("O curso " + cursoEncontrado.nome + " foi encontrado neste aluno!");
        }else{
            System.out.println("Este curso não foi encontrado neste aluno!");
        }
    }
}
