void main() {
    String linha = IO.readln("Entre com o número de rolagens: ");
    int n = Integer.parseInt(linha);
    Random gerador = new Random();
    int contagem[] = new int[13];
    for ( int i = 0; i < n; i++ ) {
        int d1 = gerador.nextInt(1, 7);
        int d2 = gerador.nextInt(1, 7);
        int soma = d1 + d2;
        contagem[soma]++;
    }
    for ( int soma = 2; soma <= 12; soma++ ) {
        double porcentagem = 100.0 * contagem[soma] / n;
        IO.println(String.format("%2d : %5.2f%%", soma, porcentagem));
    }
}