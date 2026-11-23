final String[] PARTIDAS = { "08:00", "09:43", "11:19", "12:47", "14:00", "15:45", "19:00", "21:45" };
final String[] CHEGADAS = { "10:16", "11:52", "13:31", "15:00", "16:08", "17:55", "21:20", "23:58"};
void main() {
    String linha = IO.readln("Entre com o horário atual (HH:MM): ");
    int minutos = horarioParaMinutos(linha);
    int i;
    for (i = 0; i < PARTIDAS.length; i++) {
        if (horarioParaMinutos(PARTIDAS[i]) >= minutos) {
            break;
        }
    }
    if (i < PARTIDAS.length) {
    IO.println("Próxima partida: " + PARTIDAS[i]);
    IO.println("Horário de chegada: " + CHEGADAS[i]);
    } else {
        IO.println("Não há mais voos disponíveis para hoje");
    }
}

int horarioParaMinutos(String horario) {
    String[] partes = horario.split(":");
    int hh = Integer.parseInt(partes[0]);
    int mm = Integer.parseInt(partes[1]);
    int minutos = 60 * hh + mm;
    return minutos;
}