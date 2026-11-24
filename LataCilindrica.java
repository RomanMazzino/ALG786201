void main() {
double diametro = Double.parseDouble(IO.readln("Entre com o diâmetro (cm): "));
double altura = Double.parseDouble(IO.readln("Entre com a altura (cm): "));
double espessura = Double.parseDouble(IO.readln("Entre com a espessura da chapa (cm): "));
double densidade = Double.parseDouble(IO.readln("Entre com a densidade (g/cm³) "));
double numeroLatas = Double.parseDouble(IO.readln("Entre com o número de latas: "));

IO.println("Massa total: " + String.format("%.2f", calculaMassaLata(diametro, altura, espessura, densidade) * numeroLatas) + " g");
}

double calculaAreaCirculo(double raio) {
    double area = Math.PI * (raio * raio);
    return area;
}

double calculaAreaSuperficie(double raio, double altura) {
    double areaSuperficie = (calculaAreaCirculo(raio) * 2) + (2 * Math.PI * raio * altura);
    return areaSuperficie;
}

double calculaMassaLata(double diametro, double altura, double espessura, double densidade) {
    double area = calculaAreaSuperficie((diametro / 2), altura);
    double massaTotal = area * densidade * espessura;
    return massaTotal;
}