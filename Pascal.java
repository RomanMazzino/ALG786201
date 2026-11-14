void main() {
    int n = Integer.parseInt(IO.readln("Entre com n maximo: "));
    imprimePascal(n);;
}

int potenciaFatorial(int base, int expoente) {
    int resultado = 1;
    for (int i = 0; i < expoente; i++) {
    resultado = resultado * (base-i);
    }
    return resultado;
}

int coeficienteBinomial(int n, int k) {
    return potenciaFatorial(n, k) / potenciaFatorial(k, k);
}

void imprimePascal(int nMax) {
    for (int l = 0; l <= nMax; l++) {
        for (int c = 0; c <= l; c++) {
            IO.print(coeficienteBinomial(l, c) + " ");
        }
        IO.println(" ");
    }
}