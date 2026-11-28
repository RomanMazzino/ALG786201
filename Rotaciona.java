void main() {
    String linha = IO.readln("Entre com os elementos: ");
    String[] partes = linha.split(" ");

    double[] arranjo = new double[partes.length];
    for (int i = 0; i < partes.length; i++) {
        arranjo[i] = Double.parseDouble(partes[i]);
    }

    linha = IO.readln("Entre com a rotação: ");
    int r = Integer.parseInt(linha);

    rotaciona(arranjo, r);

    IO.print("Arranjo rotacionado:");
    for (int i = 0; i < arranjo.length; i++) {
        IO.print(" " + arranjo[i]);
    }
    IO.println();
}

void rotaciona(double[] arranjo, int r) {
    int n = arranjo.length;
    if (n <= 1) {
        return;
    }

    // Normaliza a rotação para um valor equivalente entre 0 e n-1 à direita
    int deslocamento = ((r % n) + n) % n;

    // Cria uma cópia do arranjo original conforme a dica
    double[] copia = new double[n];
    for (int i = 0; i < n; i++) {
        copia[i] = arranjo[i];
    }

    // Reposiciona os elementos no próprio arranjo original
    for (int i = 0; i < n; i++) {
        int novaPosicao = (i + deslocamento) % n;
        arranjo[novaPosicao] = copia[i];
    }
}
