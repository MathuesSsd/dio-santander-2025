package Area;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        GeometricForm geometricForm;
        while (true) {
            System.out.println("Escolha uma forma geométrica para calcular a área");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("4 - Sair");
            option = scanner.nextInt();
            if(option == 1){
                geometricForm = createSquare();
            }else if(option == 2){
                geometricForm = createReactangle(); 
            }else if(option == 3){
                geometricForm = createCircle();
            }else if (option == 4) {
                break;
            }else{
                System.out.println("Opção inválida");
                continue;
            }

            System.out.println("O resultado do cálculo da área foi de " + geometricForm.getArea());
        }
    }
    
    private static GeometricForm createSquare(){
        System.out.println("Informe o tamanho dos lados");
        var side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createReactangle(){
        System.out.println("Informe a base");
        var base = scanner.nextDouble();
        System.out.println("Informe a altura");
        var height = scanner.nextDouble();
        return new Reactangle(height, base);
    }
    
    private static GeometricForm createCircle(){
        System.out.println("Informe o tamanho do raio");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }

}
