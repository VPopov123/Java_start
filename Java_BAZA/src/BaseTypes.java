public class BaseTypes {
    public void printBaseJavaTypes(){

        System.out.println("char " + "MAX:" + (int)Character.MAX_VALUE + " MIN:" + (int)Character.MIN_VALUE);
        System.out.println("boolean " + "MAX:" + Boolean.TRUE + " MIN:" + Boolean.FALSE);
        System.out.println("byte " + "MAX:" + Byte.MAX_VALUE + " MIN:" + Byte.MIN_VALUE);
        System.out.println("short " + "MAX:" + Short.MAX_VALUE + " MIN:" + Short.MIN_VALUE);
        System.out.println("int " + "MAX:" + Integer.MAX_VALUE + " MIN:" + Integer.MIN_VALUE);
        System.out.println("long " + "MAX:" + Long.MAX_VALUE + " MIN:" + Long.MIN_VALUE);
        System.out.println("float " + "MAX:" + Float.MAX_VALUE + " MIN:" + Float.MIN_VALUE);
        System.out.println("double " + "MAX:" + Double.MAX_VALUE + " MIN:" + Double.MIN_VALUE);

        String str = "Some string";
        System.out.println("String : " + str);

        System.out.print("Array : ");
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = i;
            System.out.print(Integer.toString(arr[i]) + " ");
        }
    }
}
