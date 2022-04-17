package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        nakresliPrasatko(zofka);
    }

    public void nakresliPrasatko(Turtle zofka){
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
        // tělo
        zofka.turnLeft(30);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(100);
        //přední nožičky
        zofka.turnRight(30);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(120);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(120);
        zofka.move(200);
        //zadní nožičky
        zofka.turnRight(120);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(120);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(120);
    }
}
