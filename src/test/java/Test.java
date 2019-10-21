
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TurkishIdNumber id = new TurkishIdNumber(args[0]);
        System.out.println(id.IsValid());
    }
    
}
