import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class ReverseString {
    public static void main(String[] args) {
        String name = "jay sharma";
        String reverse = "";
        for (int i = name.length() -1; i >= 0; i --){
            reverse = reverse + name.charAt(i);
        }
        System.out.println("Reverse strig :"+ reverse );
    }
}
