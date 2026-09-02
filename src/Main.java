import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("==================================================");
        System.out.println("         BEM-VINDO AO SIMULA URNA (BAHIA)         ");
        System.out.println("==================================================\n");

        System.out.print("Digite o número para Governador (2 dígitos): ");
        int gov = sc.nextInt();

        if (gov == 13) 
            System.out.println("Voto confirmado: Jerônimo Rodrigues(PT)\n");
         else if (gov == 44) {
            System.out.println("Voto confirmado: ACM Neto(União)\n");
        } else if (gov == 80) {
            System.out.println("Voto confirmado: Aroldo Félix(UP)\n");
        } else {
            System.out.println("Candidato não cadastrado.\n");
        }
        
        System.out.print("Digite o número para Presidente (2 dígitos): ");
        int pre = sc.nextInt();

        if (pre == 13) {
            System.out.println("Voto confirmado: Luiz Inácio Lula da Silva(PT)\n");
        } else if (pre == 22) {
            System.out.println("Voto confirmado: Flávio Bolsonaro(PL)\n");
        } else if (pre == 14) {
            System.out.println("Voto confirmado: Renan Santos(Missão).\n");
        } else {
            System.out.println("Candidato não cadastrado.\n");
        }

        System.out.println("==========================================");
        System.out.println("                 F I M                              ");
        System.out.println("==========================================");
        
        sc.close();
    }
}
