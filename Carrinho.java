void main() {
    String linha; 
    linha = IO.readln("Entre com o número de itens: ");
    int itens = Integer.parseInt(linha);
    int[] quantidades = new int[itens];
    double[] precos = new double[itens];
    for (int i = 0; i < itens; i++) {
        linha = IO.readln("Quantidade do item " + (i+1) + ": ");
        quantidades[i] = Integer.parseInt(linha);
        linha = IO.readln("Preço unitário do item " + (i+1) + ": ");
        precos[i] = Double.parseDouble(linha);
    }
    linha = IO.readln("Desconto (%): ");
    double desconto = Double.parseDouble(linha);
    double[] subtotais = calculaSubtotais(quantidades, precos);
    double total = obtemTotalAposDesconto(subtotais, desconto);
    IO.println("Total: R$ " + String.format("%.2f", total));
}

double[] calculaSubtotais(int[] quantidades, double[] precos) {
    double[] subtotais = new double[quantidades.length];
    for (int i = 0; i < subtotais.length; i++) {
        subtotais[i] = quantidades[i] * precos[i]; 
    }
    return subtotais;
}

double obtemTotalAposDesconto(double[] subtotais, double desconto) {
    double total = 0.0;
    for (int i = 0; i < subtotais.length; i++) {
        total += subtotais[i];
    }
    total *= (1.0 - desconto / 100.0);
    return total;
}