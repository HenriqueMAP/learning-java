import java.util.Arrays;
import java.util.Vector;

public class RegisterMain {

    public static void main (String[] args) {

        // 01 0A 02 03 09 0C 07 E5 08 0C 04 10 0B 3A 00 80 00 00 11 00 11 3E
        //       02 03 09 0C 07 E5 08 0D 05 10 03 26 00 80 00 00 11 00 11 3E
        //       02 03 09 0C 07 E5 08 0D 05 10 04 06 00 80 00 00 11 00 11 3E
        //       02 03 09 0C 07 E5 08 0D 05 10 04 27 00 80 00 00 11 00 11 3E
        //       02 03 09 0C 07 E5 08 0D 05 10 05 27 00 80 00 00 11 00 11 3E
        //       02 03 09 0C 07 E5 08 0D 05 10 06 07 00 80 00 00 11 00 11 3E
        //       02 03 09 0C 07 E5 08 0D 05 10 06 25 00 80 00 00 11 00 11 3E
        //       02 03 09 0C 07 E5 08 0D 05 10 07 0B 00 80 00 00 11 00 11 3E
        //       02 03 09 0C 07 E5 08 0D 05 10 07 24 00 80 00 00 11 00 11 3E
        //       02 03 09 0C 07 E5 08 0D 05 10 08 07 00 80 00 00 11 00 11 3E
        RegisterTwo register = new RegisterTwo();

        byte[] data = {
                0x01, 0x0A, 0x02, 0x03, 0x09, (byte) 0x0C, 0x07, (byte) 0xE5, 0x08, 0x0C, 0x04, 0x10, 0x0B, (byte) 0x3A, 0x00, (byte) 0x80, 0x00, 0x00, 0x11, 0x00, 0x11, 0x3E,
                            0x02, 0x03, 0x09, 0x0C, 0x07, (byte) 0xE5, 0x08, (byte) 0x0D, 0x05, 0x10, 0x03, 0x26, 0x00, (byte) 0x80, 0x00, (byte) 0x00, 0x11, 0x00, 0x11, 0x3E,
                            0x02, 0x03, 0x09, 0x0C, 0x07, (byte) 0xE5, 0x08, (byte) 0x0D, 0x05, 0x10, 0x04, 0x06, 0x00, (byte) 0x80, 0x00, (byte) 0x00, 0x11, 0x00, 0x11, 0x3E,
                            0x02, 0x03, 0x09, 0x0C, 0x07, (byte) 0xE5, 0x08, (byte) 0x0D, 0x05, 0x10, 0x04, 0x27, 0x00, (byte) 0x80, 0x00, (byte) 0x00, 0x11, 0x00, 0x11, 0x3E,
                            0x02, 0x03, 0x09, 0x0C, 0x07, (byte) 0xE5, 0x08, (byte) 0x0D, 0x05, 0x10, 0x05, 0x27, 0x00, (byte) 0x80, 0x00, (byte) 0x00, 0x11, 0x00, 0x11, 0x3E,
                            0x02, 0x03, 0x09, 0x0C, 0x07, (byte) 0xE5, 0x08, (byte) 0x0D, 0x05, 0x10, 0x06, 0x07, 0x00, (byte) 0x80, 0x00, (byte) 0x00, 0x11, 0x00, 0x11, 0x3E,
                            0x02, 0x03, 0x09, 0x0C, 0x07, (byte) 0xE5, 0x08, (byte) 0x0D, 0x05, 0x10, 0x06, 0x25, 0x00, (byte) 0x80, 0x00, (byte) 0x00, 0x11, 0x00, 0x11, 0x3E,
                            0x02, 0x03, 0x09, 0x0C, 0x07, (byte) 0xE5, 0x08, (byte) 0x0D, 0x05, 0x10, 0x07, 0x0B, 0x00, (byte) 0x80, 0x00, (byte) 0x00, 0x11, 0x00, 0x11, 0x3E,
                            0x02, 0x03, 0x09, 0x0C, 0x07, (byte) 0xE5, 0x08, (byte) 0x0D, 0x05, 0x10, 0x07, 0x24, 0x00, (byte) 0x80, 0x00, (byte) 0x00, 0x11, 0x00, 0x11, 0x3E,
                            0x02, 0x03, 0x09, 0x0C, 0x07, (byte) 0xE5, 0x08, (byte) 0x0D, 0x05, 0x10, 0x08, 0x07, 0x00, (byte) 0x80, 0x00, (byte) 0x00, 0x11, 0x00, 0x11, 0x3E,
        };
//        register.complexDateStruct(data);
        System.out.println(data.length);

        Vector result = register.complexDateStructure(data);

        for (int index = 0; 10 > index; index++) {

            String[] registerOne = new String[80];
            registerOne = (String[]) result.get(0);
            System.out.println(registerOne[index]);
        }

    }
}
