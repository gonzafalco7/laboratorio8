package com.logicbig.example;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ManagedBean(name = "bean")
@SessionScoped

public class bean {
    @Autowired
    ConfigurationService configurationService;

    private int number;
    private int numGuesses;
    private int totalPrize;
    private String estado;
    private int penalizacionFalla;
    private boolean first = true;
    private ArrayList<Integer> listaIntentos = new ArrayList<>();

    public bean() {
        restart();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumGuesses() {
        return numGuesses;
    }

    public void setNumGuesses(int numGuesses) {
        this.numGuesses = numGuesses;
    }

    public int getTotalPrize() {
        return totalPrize;
    }

    public void setTotalPrize(int totalPrize) {
        this.totalPrize = totalPrize;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPenalizacionFalla() {
        return penalizacionFalla;
    }

    public void setPenalizacionFalla(int penalizacionFalla) {
        this.penalizacionFalla = penalizacionFalla;
    }

    public ArrayList<Integer> getListaIntentos() {
        return listaIntentos;
    }

    public void setListaIntentos(ArrayList<Integer> listaIntentos) {
        this.listaIntentos = listaIntentos;
    }

    public void guess(int guessedNumber) {
        listaIntentos.add(guessedNumber);
        numGuesses++;
        if (guessedNumber != number) {
            if (totalPrize > penalizacionFalla) {
                setTotalPrize(totalPrize - penalizacionFalla);
            } else {
                setEstado("You lost");
                totalPrize -= penalizacionFalla;
                System.out.println(getEstado() + " $" + totalPrize);
            }
        } else {
            setEstado("You won");
            System.out.println(getEstado() + " $" + getTotalPrize());
        }
    }

    public void restart() {
        setNumber((int) (Math.random() * (10 + 1)));
        setTotalPrize(100000);
        setPenalizacionFalla(10000);
        setEstado("Game in progress");
        setNumGuesses(0);
        listaIntentos.clear();
    }

    public void useDataBase() {
        if (first) {
            setTotalPrize(Integer.parseInt(configurationService.getPremio()));
            setNumber((int) (Math.random() * (10 + 1)));
            setPenalizacionFalla(10000);
            setNumGuesses(0);
            first = false;
        }
    }

}
