void main() {
    String linha = IO.readln("Entre com o plano (C/P/PF), consumo (GB) e fidelidade (0/12/24): ");
    String[] partes = linha.split(" ");
    String plano = partes[0];
    double consumo = Double.parseDouble(partes[1]);
    int fidelidade = Integer.parseInt(partes[2]);

    if (!(plano.equals("C") || plano.equals("P") || plano.equals("PF"))) {
        IO.println("Erro: Plano inválido");
    } else if (consumo < 0) {
        IO.println("Erro: Consumo inválido");
    } else if (fidelidade != 0 && fidelidade != 12 && fidelidade != 24) {
        IO.println("Erro: Fidelidade inválida");
    } else {
        IO.println("Valor da conta: R$ " + calculaConta(plano, consumo, fidelidade));
    }
}

Double obtemMensalidadeBase(String plano) {
    double mensalidadeBase = 0.0;
    switch (plano) {
        case "C": mensalidadeBase = 40.0;
        break;
        case "P": mensalidadeBase = 70.0;
        break;
        case "PF": mensalidadeBase = 120.0;
        break;
        default: mensalidadeBase = 0.0;
    }   
    return mensalidadeBase;
}

Double calculaAdicional(double consumo) {
    consumo *= 1000.0;
    double adicional = 0.0;
    if (consumo > 250.0 && consumo <= 5000.0) {
        adicional = 12.0;
    } else if (consumo > 5000.0 && consumo <= 20000.0) {
        adicional = 30.0;
    } else if (consumo > 20000.0) {
        adicional = 50.0 + 0.01 * (consumo - 20000.0);
    }
    return adicional;
}

Double aplicaFidelidade(double conta, int fidelidade) {
    double desconto = 0.0;
    switch (fidelidade) {
        case 0: desconto = conta + (conta * 0.20);
        break;
        case 12: desconto = conta;
        break;
        case 24: desconto = conta - (conta * 0.10);
        break;
        default: desconto = 0.0;
    }
    return desconto;
}

Double calculaConta(String plano, double consumo, int fidelidade) {
    double totalConta = aplicaFidelidade(obtemMensalidadeBase(plano) + calculaAdicional(consumo), fidelidade);
    return totalConta;
}