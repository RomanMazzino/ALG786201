void main() {
    String linha = IO.readln("Entre com o veículo (M/C/CE), tempo (h) e dia (1/2/3): ");
    String[] partes = linha.split(" ");
    String tipoVeiculo = partes[0];
    double tempoHoras = Double.parseDouble(partes[1]);
    int dia = Integer.parseInt(partes[2]);

    if (!(tipoVeiculo.equals("M") || tipoVeiculo.equals("C") || tipoVeiculo.equals("CE"))) {
        IO.println("Erro: Veículo inválido");
    } else if (tempoHoras < 0) {
        IO.println("Erro: Tempo inválido");
    } else if (!(dia == 1 || dia == 2 || dia == 3)) {
        IO.println("Erro: Dia inválido");
    } else {
        IO.println("Valor a pagar: " + String.format("%.2f", calculaTarifa(tipoVeiculo, tempoHoras, dia)));
    }

}

Double obtemTarifaBase(String tipo) {
    double tarifaBase;
    switch (tipo) {
        case "M": tarifaBase = 5.0;
        break;
        case "C": tarifaBase = 10.0;
        break;
        case "CE": tarifaBase = 20.0;
        break;
        default: tarifaBase = 0.0;
    }
    return tarifaBase;
}

Double calculaAdicional(double horas) {
    double adicional = 0.0;
    if (horas > 0.5 && horas <= 2.0) {
        adicional = 8.0;
    } else if (horas > 2.0 && horas <= 6.0) {
        adicional = 20.0;
    } else if (horas > 6.0) {
        adicional = 30.0 + 0.05 * ((horas * 60.0) - 360.0);
    }
    return adicional;
}

Double aplicaDia(double conta, int dia) {
    double valor;
    switch (dia) {
        case 1: valor = conta;
        break;
        case 2: valor = conta - (conta * 0.2);
        break;
        case 3: valor = conta * 2.0;
        break;
        default: valor = 0.0;
    }
    return valor;
}

Double calculaTarifa(String tipo, double horas, int dia) {
    double totalTarifa = aplicaDia(obtemTarifaBase(tipo) + calculaAdicional(horas), dia);
    return totalTarifa;
}