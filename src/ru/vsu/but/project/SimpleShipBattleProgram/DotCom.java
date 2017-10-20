package ru.vsu.but.project.SimpleShipBattleProgram;import java.util.ArrayList;/*/Игра потопи СайтЕсть 7 ячеек(клеток). На них случайно размещается сайт(3 ячейки).Пользователю необходимо потопить сайт, угадав, в каких ячейках он находитсяУ пользователя имеется неограниченное количество попытокВ конце игры выводится результат: потопил или нет.Если потопил, количество затраченных попыток(выстрелов по сайту) в игре.Исправить: не защитывать повторное попадание в ячейку, если пользовательуже поразил ее */public class DotCom {    private ArrayList<String> locationCells;    private String name;    // ///целочисленный массив для хранения адреса ячеек    //int numOfHits=0; // переменная для хранения кол-ва попаданий    //сеттер setLocationCells   //сеттер, который обновляет местоположение сайта   //случ адресс, представл методом placeDotCom() из класса GameHelper   public void setLocationCells(ArrayList<String> loc) {       locationCells = loc;   }   public void setName(String n) {       name = n;   }   /*Метод checkYourself(), который принимает на ход пользователя   в качестве параметра String(1,3 и т.д),   проверяет его и возвращает результат: "Попал", "Мимо" или "Потопил"   */    public String checkYourself(String userInput) {        String result = "мимо";        int index = locationCells.indexOf(userInput);        if (index >= 0) {            locationCells.remove(index);            if (locationCells.isEmpty()) {                result = "Потопил";                System.out.println("Ты потопил " + name + " : ( ");            } else {                result = "Попал";            }        }        return result; // возвращаем мимо, попал или потопил    }}