package LopalEx;

import java.util.*;

class Heroi {
    String nome;
    int forca;
    int inteligencia;
    int velocidade;

    Heroi(String nome, int forca, int inteligencia, int velocidade) {
        this.nome = nome;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.velocidade = velocidade;
    }

    int poderTotal() {
        // Fórmula personalizável
        return (forca * 2) + (inteligencia * 3) + (velocidade * 1);
    }

    @Override
    public String toString() {
        return nome + " (Poder: " + poderTotal() + ")";
    }
}

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Heroi> herois = new ArrayList<>();

        // Heróis iniciais
        herois.add(new Heroi("Megaton", 8, 5, 6));
        herois.add(new Heroi("Cérebro", 3, 10, 4));
        herois.add(new Heroi("Raio Veloz", 4, 4, 10));

        boolean executando = true;

        while (executando) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar herói");
            System.out.println("2 - Mostrar ranking");
            System.out.println("3 - Comparar dois heróis");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do herói: ");
                    String nome = scanner.nextLine();
                    System.out.print("Força: ");
                    int forca = scanner.nextInt();
                    System.out.print("Inteligência: ");
                    int inteligencia = scanner.nextInt();
                    System.out.print("Velocidade: ");
                    int velocidade = scanner.nextInt();
                    scanner.nextLine(); // limpar buffer

                    herois.add(new Heroi(nome, forca, inteligencia, velocidade));
                    System.out.println("Herói adicionado.");
                    break;

                case 2:
                    herois.sort((a, b) -> Integer.compare(b.poderTotal(), a.poderTotal()));
                    System.out.println("\nRanking de Heróis:");
                    for (int i = 0; i < herois.size(); i++) {
                        System.out.println((i + 1) + " - " + herois.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Nome do primeiro herói: ");
                    String nome1 = scanner.nextLine();
                    System.out.print("Nome do segundo herói: ");
                    String nome2 = scanner.nextLine();

                    Heroi h1 = buscarHeroiPorNome(herois, nome1);
                    Heroi h2 = buscarHeroiPorNome(herois, nome2);

                    if (h1 == null || h2 == null) {
                        System.out.println("Um ou ambos os heróis não foram encontrados.");
                    } else {
                        System.out.println("\n" + h1.nome + " (Poder: " + h1.poderTotal() + ")");
                        System.out.println(h2.nome + " (Poder: " + h2.poderTotal() + ")");
                        if (h1.poderTotal() > h2.poderTotal()) {
                            System.out.println(h1.nome + " é mais poderoso.");
                        } else if (h1.poderTotal() < h2.poderTotal()) {
                            System.out.println(h2.nome + " é mais poderoso.");
                        } else {
                            System.out.println("Ambos têm o mesmo poder.");
                        }
                    }
                    break;

                case 4:
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    static Heroi buscarHeroiPorNome(List<Heroi> herois, String nome) {
        for (Heroi h : herois) {
            if (h.nome.equalsIgnoreCase(nome)) {
                return h;
            }
        }
        return null;
    }
}
