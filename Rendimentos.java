final double VALOR_INICIAL = 10000.0;
final double TAXA_INICIAL = 6.0;
final double PASSO_TAXA = 0.5;
final int NUM_TAXAS = 5;
final int NUM_ANOS = 4;

void main() {
    double taxa[] = new double[NUM_TAXAS];
    double valor[] = new double[NUM_TAXAS];
    IO.print("Ano\t");
    for (int i = 0; i < NUM_TAXAS; i++) {
        taxa[i] = TAXA_INICIAL + PASSO_TAXA * i;
        valor[i] = VALOR_INICIAL;
        IO.print(taxa[i] + "%\t\t");
    }
    IO.println();
    for (int ano = 1; ano <= 4; ano++) {
        IO.print(ano + "\t");
        for (int i = 0; i < NUM_TAXAS; i++) {
            double rendimento = (taxa[i] / 100.0) * valor[i];
            valor[i] += rendimento;
            IO.print(String.format("%.2f", valor[i]) + "\t");
        }
    IO.println();
    }
}
