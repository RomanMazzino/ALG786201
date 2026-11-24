void main() {
    int ovos = Integer.parseInt(IO.readln("Entre com a quantidade de ovos: "));
    int caixas = ovos / 360;
    int bandeijas = (ovos % 360) / 30;
    ovos = ovos % 30;
    String resultado = "";
    String separador = "";
    
    if (caixas > 0) {
        resultado = caixas + (caixas == 1 ? " caixa" : " caixas"); 
        separador = ", ";
    }

    if (bandeijas > 0) {
        resultado += separador + bandeijas + (bandeijas == 1 ? " bandeija" : " bandeijas");
        separador = ", ";
    }

    if (ovos > 0) {
    resultado += separador + ovos + (ovos == 1 ? " ovo" : " ovos");         
    }

    IO.println(resultado);
}
