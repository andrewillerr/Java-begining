public class GloandLo_Variable {
    public static void main(String[] args) {
        //Global Variable
        int a = 100;
        int b = 150;

        System.out.println(a);

        {
            //Local Variable
            int c = 200;
            System.out.println(c);
            System.out.println("A = "+a);  //เรียกใช้ a จาก Global Variable ได้
        }

        System.out.println(b);
        //System.out.println(c);  ใข้ c นอก Local ไม่ได้
    }
    
    
}
