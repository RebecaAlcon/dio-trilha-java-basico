public class App {
    public static void main(String[] args)  {
       
        int a, b;

        a = 5;
        b = 6;
        String resultado = a==b ?"verdadeiro" : "falso"; 
        

            System.out.println(resultado);

    }
    public static void main(String[] args) {
        String nomeUm = "Gleyson";
        String nomeDois = new String ("Gleyson");
        System.out.println(nomeUm.equals(nomeDois)); 



    }

    public static void main(String[] args){
        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2){
            System.out.println("as duas condiçoes são verdadeiras");
        }
if(condicao1 || condicao2){
    System.out.println("Uma das condições é verdadeira");
}

System.out.println("fim");
    }
    
}
