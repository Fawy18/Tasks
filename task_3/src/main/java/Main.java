public class Main {

    public static void main(String[] args) {

        String str = "Help";
        String result = "";
        char messChar[] = str.toCharArray();

        for (int i = 0; i < messChar.length; i++) {
            result += Integer.toBinaryString(messChar[i]) + " "; // записываем двоичный код в переменную result

        }
        System.out.println(result);

        char[] charArray = result.toCharArray();  // создаём массив типа char из переменной result(тип string)
        for(int j = 0; j < charArray.length; j++) {
            System.out.print(charArray[j]);
        }
        System.out.println();

        boolean mar1 = true, mar2 =  true;


        for(int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ')
            {
                System.out.print(" ");
                mar1 = true;
                mar2 = true;
                continue;
            }
            if (charArray[i]=='1' && mar1) {
                System.out.print(" 0 ");
                mar1 = false;
                mar2 = true;
            }
            if (charArray[i] == '0' && mar2) {
                System.out.print(" 00 ");
                mar2 = false;
                mar1 = true;
            }
            System.out.print("0");
        }
        mar1 = true;
        mar2 = true;
    }
}