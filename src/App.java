
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.Livros;
import Classes.Locacao;

public class App {
    public static void main(String[] args) throws Exception {

        List<Livros> listaLivros = new ArrayList<>();
        List<Locacao> alugar = new ArrayList<>();
        //SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        
        Livros livro = new Livros(); 
        Locacao locacao = new Locacao();

        Scanner ler = new Scanner(System.in);
        int op;
        String cod;
        String tit;
        
        do{
            System.out.println("------------------- MENU -------------------");
            System.out.println();
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Consultar Livro");
            System.out.println("3 - Listar todos os livros");
            System.out.println("4 - Realizar locação");
            System.out.println("5 - Realizar devolução");
            System.out.println("6 - Relatório de livros com devolução em aberto");
            System.out.println("7 - Relatório de livros alugados por período");
            System.out.println("0 - sair");
            System.out.println();
            System.out.printf("Digite a opção que deseja consultar: ");
            op = ler.nextInt();
            System.out.println();
            
            switch(op){

                case 1:

                    do{

                        

                        System.out.println("-------------- CADASTRAR LIVRO --------------");

                        System.out.println();                    
                        System.out.printf("Código: ");
                        livro.setCodigo(ler.next());

                        ler.nextLine();
                        System.out.printf("Titulo: ");
                        livro.setTitulo(ler.next());

                        ler.nextLine();
                        System.out.printf("Autor: ");
                        livro.setAutor(ler.next());

                        System.out.printf("Páginas: ");
                        livro.setPaginas(ler.nextInt());
                        ler.nextLine();

                        listaLivros.add(livro);

                        System.out.println("\nLivro Cadastrado!");
                        System.out.println();

                        System.out.println("Deseja continuar o cadastro?");
                        System.out.println("1 - Sim");
                        System.out.println("0 - Sair");

                        System.out.printf("Opção: ");
                        op = ler.nextInt();
                        System.out.println();

                    }while(op == 1);

                    break;

                case 2:

                    do{
                        System.out.println("-------------- CONSULTAR LIVRO --------------");
                        System.out.println();

                        System.out.printf("Digite o código do livro: ");
                        cod = (ler.next());

                        for (Livros livr : listaLivros) {

                            if(livr.getCodigo().equals(cod)){

                                System.out.println(livro);

                            }else{

                                System.out.println("O código digitado não corresponde a nenhum livro\n");
                                System.out.println("Deseja digitar o código novamente?\n");
                                
                                System.out.println("1 - Sim");
                                System.out.println("0 - Não");
                                System.out.printf("Opção: ");
                                op = ler.nextInt();
                            }
                        }
                    }while(op == 1);

                    break;
            
                case 3:

                    System.out.println("-------------- LISTAR LIVROS --------------");

                    System.out.println();
                    System.out.println(listaLivros);
                    break;

                case 4:

                    do{

                        System.out.println("-------------- REALIZAR LOCAÇÃO --------------");

                        System.out.println("Digite o titulo do livro que deseja fazer uma locação: ");
                        tit = (ler.next());
    
                        if(livro.getTitulo().equals(tit)){
    
                            ler.nextLine();
                            System.out.printf("CPF do locatário: ");
                            locacao.setCpf(ler.next());
    
                            ler.nextLine();
                            System.out.printf("Data da locação [DD/MM/AAAA]: ");
                            locacao.setDatalocacao(ler.next());
    
                            ler.nextLine();
                            System.out.printf("Data da devolução [DD/MM/AAAA]: ");
                            locacao.setDatadevolucao(ler.next());
    
                            ler.nextLine();
                            System.out.printf("Status [Devolvido/Alugado]: ");
                            locacao.setStatus(ler.next());
    
                            listaLivros.remove(livro);
    
                            alugar.add(locacao);
    
                            System.out.println("O livro foi alugado!\n");
    
                            System.out.println("Deseja realizar outra locação?");
                            System.out.println("1 - Sim");
                            System.out.println("0 - Sair");
    
                            System.out.printf("Opção: ");
                            op = ler.nextInt();
                            System.out.println();
                            
    
                        }else if(locacao.getStatus().equals("Alugado")){
    
                            System.out.println("Este livro já está alugado!");
                           
    
                        }else{
    
                            System.out.println("Não foi posssivel encontrar o livro no nosso cadastro\n");
                            System.out.println("Deseja pesquisar novamente?\n");
                            System.out.println("1 - Sim");
                            System.out.println("0 - Não");
                            System.out.println("Opção: ");
                            op = ler.nextInt();
    
                        }

                    }while(op == 1);


                    break;

                case 5:

                    System.out.println("-------------- REALIZAR DEVOLUÇÃO --------------");

                    System.out.println("Digite o código do livro que deseja devolver: ");
                    cod = (ler.next());

                    if(livro.getCodigo().equals(cod)){
                        
                        alugar.remove(locacao);
                       
                    }else{

                        System.out.println("Não foi posssivel encontrar o livro no nosso cadastro\n");
                        System.out.println("Deseja pesquisar novamente?\n");
                        System.out.println("1 - Sim");
                        System.out.println("0 - Não");
                        System.out.println("Opção: ");
                        op = ler.nextInt();

                    }
                    
                    break;

                case 6:
                    
                    System.out.println("-------------- RELATÓRIO - DEVOLUÇÃO --------------");

                    if(locacao.getStatus().equals("Alugado")){

                        System.out.println(alugar);

                    }else{

                        System.out.println("Não foi posssivel encontrar o livro no nosso cadastro\n");
                        System.out.println("Deseja pesquisar novamente?\n");
                        System.out.println("1 - Sim");
                        System.out.println("0 - Não");
                        System.out.println("Opção: ");
                        op = ler.nextInt();

                    }

                    break;

                case 7:
                    
                    System.out.println("-------------- RELÁTORIO - LOCAÇÃO --------------");

                    System.out.println(alugar);
                    break;

                case 0:
                return;

                default:
                    System.out.println("DIGITE UMA OPÇÃO VÁLIDA");
                    break;
            }

        }while(op == 0);

        ler.close();
    }
}
