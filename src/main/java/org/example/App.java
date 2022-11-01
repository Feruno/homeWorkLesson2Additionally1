package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        class Primitives {
            boolean varBoolean = true;
            byte varByte = 10;
            short varShort = 10000;
            int varInt = 100000000;
            long varLong = 9223372036854775805l;
            char varChar = 'c';
            float varFloat = 2.5f;
            double varDouble = 14.5;

        }
        class Wrappers {
            Boolean varBoolean = new Boolean(false);
            Byte varByte = new Byte((byte) 10);
            Short varShort = new Short((short) 10000);
            Integer varInt = new Integer(682);
            Long varLong = new Long(9223372036854775805l);
            Character varChar = new Character('c');
            Float varFloat = new Float(2.5);
            Double varDouble = new Double(14.5);
        }
    }
}
