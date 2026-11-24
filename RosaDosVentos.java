void main() {
    int anguloLido = Integer.parseInt(IO.readln("Entre com o ângulo (graus): "));
    int posicao = (anguloLido % 360) / 45;
    int voltas = anguloLido / 360;

    String direcao = "";
    switch (posicao) {
        case 0: direcao = "Norte";
        break;
        case 1: direcao = "Nordeste";
        break;
        case 2: direcao = "Leste";
        break;
        case 3: direcao = "Sudeste";
        break;
        case 4: direcao = "Sul";
        break;
        case 5: direcao = "Sudoeste";
        break;
        case 6: direcao = "Oeste";
        break;
        case 7: direcao = "Noroeste";
        break;
    }

    if (voltas > 0) {
        IO.println(direcao + ", após " + voltas + (voltas > 1 ? " voltas completas" : " volta completa"));
    } else {
        IO.println(direcao);
    }       
}
