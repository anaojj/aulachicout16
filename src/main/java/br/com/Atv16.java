package br.com;

import java.io.*;

public class Atv16{
    public static void main(String[] args) {
        String arquivo = "arquivo.bin";

        try (FileInputStream inputStream = new FileInputStream(arquivo)) {
            byte[] buffer = new byte[100]; // Buffer de 100 bytes
            int bytesRead = inputStream.read(buffer);

            if (bytesRead == -1) {
                System.err.println("O arquivo está vazio ou o tamanho do arquivo é menor que 100 bytes.");
                return;
            }

            System.out.println("Primeiros 100 bytes do arquivo:");
            for (int i = 0; i < bytesRead; i++) {
                System.out.printf("%02X ", buffer[i]);
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}