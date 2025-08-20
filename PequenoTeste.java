import java.util.Scanner;

public class PequenoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op, op2;

        System.out.println("┌───────────────────────────────────────┐");
        System.out.println("│           🍔 iFood Console            │");
        System.out.println("├───────────────────────────────────────┤");
        System.out.println("│ Quem é você?                          │");
        System.out.println("│ 1️⃣  Cliente 👤                         │");
        System.out.println("│ 2️⃣  Restaurante 🍽️                    │");
        System.out.println("│ 3️⃣  Entregador 🚴                     │");
        System.out.println("│ 4️⃣  Sair 🔙                           │");
        System.out.println("└───────────────────────────────────────┘");
        System.out.print("Escolha uma opção: ");
        op = sc.nextLine();
        System.out.println();


        if (op.equals("1")) {
            System.out.println("┌───────────────────────────────────────┐");
            System.out.println("│           🍔 Teste                    │");
            System.out.println("├───────────────────────────────────────┤");
            System.out.println("│ Quem é você?                          │");
            System.out.println("│ 1️⃣  Ver restaurante 👤                │");
            System.out.println("│ 2️⃣  Fazer pedido 🍽️                   │");
            System.out.println("│ 3️⃣  Acompanhar pedido 🚴              │");
            System.out.println("│ 4️⃣  Sair 🔙                           │");
            System.out.println("└───────────────────────────────────────┘");
            System.out.print("Escolha uma opção: ");
            op2 = sc.nextLine();
        }
    }
}
