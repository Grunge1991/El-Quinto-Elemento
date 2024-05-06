package pAqUeTeXpErImEnTaL;

public class UbicacionArticulo {
    private String estante;
    private int fila;
    private int columna;

    public UbicacionArticulo(String estante, int fila, int columna) {
        this.estante = estante;
        this.fila = fila;
        this.columna = columna;
    }

    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Estante: " + estante + ", Fila: " + fila + ", Columna: " + columna;
    }
}
