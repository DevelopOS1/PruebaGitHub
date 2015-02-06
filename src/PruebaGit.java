/**
 * Created by Edgar on 01/02/2015.
 */
public class PruebaGit {
    private int num1, num2, res;

    private void suma(){
        num1 = 1;
        num2 = 2;

        res = num1 + num2;

        System.out.println(res);
    }

    public void saludo(){
        System.out.print("Hola Mundo!!!");
        System.out.print("Prueba GitHub");
    }

    public static void main(String args[]){
        PruebaGit info = new PruebaGit();
        info.suma();
        info.saludo();
    }
}
