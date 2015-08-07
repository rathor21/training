public class CompositionBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person bobby = new Person();
        System.out.println(bobby.getSalary());
        System.out.println(bobby.getJob());
        System.out.println(bobby.getEdu());
    }

}