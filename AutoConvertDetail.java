public class AutoConvertDetail {
    
    public static void main(String[] args) {
       String s1 = "123";
       byte num1 = Byte.parseByte(s1);
       short num2 = Short.parseShort(s1);
       int num3 = Integer.parseInt(s1);
       boolean num4 =Boolean.parseBoolean("false");
       System.out.println(num1);
       System.out.println(num2);
       System.out.println(num3);
       System.out.println(num4);
    }
    
}
