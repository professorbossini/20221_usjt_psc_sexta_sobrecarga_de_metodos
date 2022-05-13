import static java.lang.Integer.parseInt;
public class Calculadora{
    //varargs: desde a versão 5
    public int somar (int... valores){
        int soma = 0;
        for (int i = 0; i < valores.length; i++){
            soma += valores[i];
        }
        return soma;
    }
    
    public int somar (int a, int b){
        return a + b;
    }

}


// public int somar (int primeiro, int segundo){
//     return primeiro + segundo;    
// }

// public float somar (int a, int b){
//     return a + b;
// }

// public int somar (int a, int b){
//     return a + b;    
// }

// public float somar (float f1, float f2){
//     return f1 + f2;
// }

// public int somar (int a, int b, int c){
//     return somar(somar(a, b), c);
// }

// public int somar(String s1, String s2){
//     return somar(parseInt(s1), parseInt(s2));
// }

// public int somar (String s1, int z){
//     return somar(parseInt(s1), z, 0);    
// }

// public int somar (int x, String s){
//     return somar(s, x);
// }