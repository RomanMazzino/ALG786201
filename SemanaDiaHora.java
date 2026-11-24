void main() {
    int horas = Integer.parseInt(IO.readln("Entre com a quantidade de horas: "));
    int semanas = horas / 168;
    int dias = (horas % 168) / 24;
    horas %= 24;
    String resultado = "";
    String separador = "";

    if (semanas > 0) {
        resultado = semanas + (semanas == 1 ? " semana" : " semanas"); 
        separador = ", ";
    }

    if (dias > 0) {
        resultado += separador + dias + (dias == 1 ? " dia" : " dias");
        separador = ", ";
    }

    if (horas > 0) {
        resultado += separador + horas + (horas == 1 ? " hora" : " horas");
    }

    IO.println(resultado);
}
