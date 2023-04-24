// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Random;
// import java.util.Scanner;

// public class Aeroporto {
// private static final int MAX_PRATELEIRAS = 2;
// private static final int MAX_FILA_ATERRISSAGEM = 20;
// private static final int MAX_FILA_DECOLAGEM = 20;
// private static final int MAX_AVIOES_ATERRISSANDO_RESERVA = 2;

// private static Queue<Aeronave> filaAterrissagemPista1 = new LinkedList<>();
// private static Queue<Aeronave> filaAterrissagemPista2 = new LinkedList<>();
// private static Queue<Aeronave> filaDecolagemPista1 = new LinkedList<>();
// private static Queue<Aeronave> filaDecolagemPista2 = new LinkedList<>();
// private static ArrayList<Aeronave> aeronavesAterrissaram = new ArrayList<>();
// private static ArrayList<Aeronave> aeronavesDecolaram = new ArrayList<>();
// private static int tempoTotalEsperaAterrissagem = 0;
// private static int tempoTotalEsperaDecolagem = 0;
// private static int aeronavesAterrissandoReserva = 0;
// private static int tempoSimulacao = 0;

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Digite o tempo de simulação (em unidades de tempo): ");
// int tempoMaximo = sc.nextInt();

// Random gerador = new Random();

// while (tempoSimulacao < tempoMaximo) {
// // Chegam novas aeronaves para aterrissagem
// int numAeronavesAterrissagem = gerador.nextInt(3);
// for (int i = 0; i < numAeronavesAterrissagem; i++) {
// if (filaAterrissagemPista1.size() <= filaAterrissagemPista2.size()) {
// if (filaAterrissagemPista1.size() < MAX_PRATELEIRAS) {
// int combustivel = gerador.nextInt(20) + 1;
// Aeronave aeronave = new Aeronave(getProximoIdAterrissagem(), combustivel);
// filaAterrissagemPista1.add(aeronave);
// System.out.println("Avião " + aeronave.getId() + " entrou na fila de
// aterrissagem na pista 1 com " + aeronave.getCombustivel() + " unidades de
// combustível.");
// }
// } else {
// if (filaAterrissagemPista2.size() < MAX_PRATELEIRAS) {
// int combustivel = gerador.nextInt(20) + 1;
// Aeronave aeronave = new Aeronave(getProximoIdAterrissagem(), combustivel);
// filaAterrissagemPista2.add(aeronave);
// System.out.println("Avião " + aeronave.getId() + " entrou na fila de
// aterrissagem na pista 2 com " + aeronave.getCombustivel() + " unidades de
// combustível.");
// }
// }
// }

// // Chegam novas aeronaves para decolagem
// int numAeronavesDecolagem = gerador.nextInt(3); // Gera número aleatório de 0
// a 2
// for (int i = 0; i < numAeronavesDecolagem; i++) {
// if (totalAv < CAPACIDADE_MAXIMA_FILA * (NUMERO_FILAS_ATERRISSAGEM +
// NUMERO_FILAS_DECOLAGEM)) {
// Aeronave aeronave = new Aeronave(totalAv + 1, true,
// gerador.nextInt(MAX_RESERVA_COMBUSTIVEL) + 1);
// int filaMenor = 0;
// int tamanhoMenorFila = filasDecolagem[0].size();
// for (int j = 1; j < NUMERO_FILAS_DECOLAGEM; j++) {
// int tamanhoFila = filasDecolagem[j].size();
// if (tamanhoFila < tamanhoMenorFila) {
// filaMenor = j;
// tamanhoMenorFila = tamanhoFila;
// }
// }
// if (tamanhoMenorFila < CAPACIDADE_MAXIMA_FILA) {
// filasDecolagem[filaMenor].add(aeronave);
// totalAv++;
// }
// }
// }

// // Processa as pistas
// for (Pista pista : pistas) {
// if (!pista.estaOcupada()) {
// // Verifica se há aeronaves para aterrissar
// for (int i = 0; i < NUMERO_PRATELEIRAS_ATERRISSAGEM; i++) {
// if (!filasAterrissagem[i].isEmpty()) {
// Aeronave aeronave = filasAterrissagem[i].peek();
// if (aeronave.getReservaCombustivel() == 0 ||
// pista.podePousar(aeronave.getReservaCombustivel())) {
// filasAterrissagem[i].remove();
// aeronave.setTempoEspera(tempo - aeronave.getTempoChegada());
// tempoEsperaAterrissagem[aeronave.getId() % 2] += aeronave.getTempoEspera();
// pista.aterrissar(aeronave);
// }
// }
// }
// // Verifica se há aeronaves para decolar
// for (int i = 0; i < NUMERO_FILAS_DECOLAGEM; i++) {
// if (!filasDecolagem[i].isEmpty()) {
// Aeronave aeronave = filasDecolagem[i].peek();
// if (tempo - aeronave.getTempoChegada() >=
// tempoEsperaDecolagem[aeronave.getId() % 2]) {
// filasDecolagem[i].remove();
// pista.decolar(aeronave);
// }
// }
// }
// }
// }

// // Checa se alguma aeronave precisa pousar de reserva
// if (!pista1Ocupada && !pista2Ocupada && !filaAterrissagem1.isEmpty()) {
// Aeronave aeronave = filaAterrissagem1.poll();
// if (aeronave.getCombustivel() <= 0) {
// System.out.println("Aeronave " + aeronave.getId() + " pousando de reserva de
// combustível na pista 1.");
// pista1Ocupada = true;
// numAterrissagensReserva++;
// } else {
// filaAterrissagem2.offer(aeronave);
// }
// }

// if (!pista1Ocupada && !pista2Ocupada && !filaAterrissagem2.isEmpty()) {
// Aeronave aeronave = filaAterrissagem2.poll();
// if (aeronave.getCombustivel() <= 0) {
// System.out.println("Aeronave " + aeronave.getId() + " pousando de reserva de
// combustível na pista 2.");
// pista2Ocupada = true;
// numAterrissagensReserva++;
// } else {
// filaAterrissagem1.offer(aeronave);
// }
// }

// // Libera as pistas quando necessário
// if (pista1Ocupada && tempo - pista1Inicio >= TEMPO_ATERRISSAGEM) {
// System.out.println("Aeronave " + pista1Aeronave.getId() + " pousou na pista
// 1.");
// pista1Ocupada = false;
// pista1Inicio = -1;
// pista1Aeronave = null;
// }

// if (pista2Ocupada && tempo - pista2Inicio >= TEMPO_ATERRISSAGEM) {
// System.out.println("Aeronave " + pista2Aeronave.getId() + " pousou na pista
// 2.");
// pista2Ocupada = false;
// pista2Inicio = -1;
// pista2Aeronave = null;
// }

// if (pista1Ocupada && tempo - pista1Inicio >= TEMPO_DECOLAGEM) {
// System.out.println("Aeronave " + pista1Aeronave.getId() + " decolou da pista
// 1.");
// pista1Ocupada = false;
// pista1Inicio = -1;
// pista1Aeronave = null;
// }

// if (pista2Ocupada && tempo - pista2Inicio >= TEMPO_DECOLAGEM) {
// System.out.println("Aeronave " + pista2Aeronave.getId() + " decolou da pista
// 2.");
// pista2Ocupada = false;
// pista2Inicio = -1;
// pista2Aeronave = null;
// }

// // Calcula tempo médio de espera para decolagem e aterrissagem
// if (numAterrissagens > 0) {
// tempoEsperaAterrissagem = somaTemposAterrissagem / numAterrissagens;
// }
// if (numDecolagens > 0) {
// tempoEsperaDecolagem = somaTemposDecolagem / numDecolagens;
// }

// // Imprime estatísticas
// if (tempo % INTERVALO_IMPRESSAO == 0) {
// System.out.println("--- TEMPO " + tempo + " ---");
// System.out.println("Fila de espera para aterrissagem na pista 1: " +
// filaAterrissagem1
