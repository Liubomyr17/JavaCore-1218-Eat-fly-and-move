package com.company;

/*

1218 Есть, летать и двигаться
Есть public интерфейсы Fly(летать), Move(передвигаться), Eat(есть).
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).

Требования:
1. Класс Solution должен содержать интерфейс Fly с одним методом fly().
2. Класс Solution должен содержать интерфейс Move с одним методом move().
3. Класс Solution должен содержать интерфейс Eat с одним методом eat().
4. Собака должна уметь передвигаться и есть.
5. Автомобиль должен уметь передвигаться.
6. Самолет должен уметь передвигаться и летать.
7. Утка должна уметь передвигаться, летать и есть.



 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Move {
        public void move();
    }

    public interface Eat {
        public void eat();
    }

    public class Dog implements Move, Eat {
        @Override
        public void move() {

        }
        @Override
        public void eat() {

        }
    }

    public class Duck implements Fly, Move, Eat {
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Car implements Move {
        @Override
        public void move() {

        }
    }

    public class Airplane implements Move, Fly {
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }
}
