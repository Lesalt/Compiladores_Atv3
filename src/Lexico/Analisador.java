package Lexico;

public class Analisador {
    Entrada entrada;
    public Analisador(String arq){
        entrada = new Entrada(arq);

    }

    public Token nextToken(){
        int caractereLido = -1;

        while((caractereLido = entrada.nextChar()) != -1){
            char c = (char)caractereLido;

            if(c == ' ' || c == '\n')
                continue;
            if(c == 'r'){
                c = (char)entrada.nextChar();
                if(c == 'e'){
                    c = (char)entrada.nextChar();
                    if(c == 'c'){
                        return new Token(TipoToken.Recebe, "rec");
                    }
                }
            } else if(c == '>') {
                c = (char) entrada.nextChar();
                if(c == '='){
                    return new Token(TipoToken.OpLogMaiorIgual, ">=");
                }else{
                    return new Token(TipoToken.OpLogMaiorq, ">");
                }
            }else if(c == '<'){
                c = (char) entrada.nextChar();
                if(c == '='){
                    return new Token(TipoToken.OpLogMenorIgual, "<=");
                }else{
                    return new Token(TipoToken.OpLogMenorq, ">");
                }
            }else if(c == '='){
                return new Token(TipoToken.OpLogIgual, "=");
            }else if(c == 'e'){
                c = (char) entrada.nextChar();
                if(c == 's'){
                    c = (char) entrada.nextChar();
                }else if(c == 'n'){
                    c = (char) entrada.nextChar();
                    if(c == 'q'){
                        return new Token(TipoToken.PCenq,"enq");
                    }
                }
                if(c == 'e'){
                    return new Token(TipoToken.PCese, "ese");
                }
            } else if (c == 's') {
                c = (char) entrada.nextChar();
                if (c == 'e') {
                    c = (char) entrada.nextChar();
                }if(c == 'n'){
                    return new Token(TipoToken.PCsen, "sen");
                }
            }


        }
        return null;
    }
}
