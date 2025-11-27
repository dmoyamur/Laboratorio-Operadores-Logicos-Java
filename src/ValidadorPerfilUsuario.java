import java.util.Scanner;

public class ValidadorPerfilUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombreUsuario =scanner.next();
        scanner.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresa tu Saldo: ");
        int saldoCuenta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Eres Premium? (Ingresa true o false): ");
        boolean esPremium = scanner.nextBoolean();
        scanner.nextLine();

        scanner.close();

        boolean accesoExclusivo = (edad>=18) && esPremium;
        boolean calificaPromocion = (saldoCuenta>1000) || (edad<25);
        boolean perfilIncompleto = (!nombreUsuario.equals("invitado") || (saldoCuenta==0));
        boolean perfilActivoTotal = !perfilIncompleto && (accesoExclusivo || calificaPromocion);

        System.out.println("Acceso Exclusivo: "+accesoExclusivo);
        System.out.println("Califica Promoción: "+calificaPromocion);
        System.out.println("Perfil Incompleto: "+perfilIncompleto);
        System.out.println("perfilActivoTotal: "+perfilActivoTotal);
    }
}
