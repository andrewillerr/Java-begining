public class Variable2 {
    public static void main(String[] args) {
        final int num1 = 10; //ห้ามเปลี่ยนค่า num1
        int num2 = 5;  
                       //ยังสามารถเปลี่ยนค่า num2 ได้
        num2 = 15;
        System.out.println("ค่าตัวเลขที่ 1 = "+num1);  //แสดงผล num1
        System.out.println("ค่าตัวเลขที่ 2 = "+num2);  //แสดงผล num2 
    }
}
