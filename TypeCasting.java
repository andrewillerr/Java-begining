public class TypeCasting {
    public static void main(String[] args) {
        int numint = 10;
        double numdouble = numint;
        System.out.println(numint);        // int ---> Double
        System.out.println(numdouble);    //แปลงแบบ Auto จากข้อมูลขนาดเล็ก --> ใหญ่
        


        {
            double numDouble = 20.0;           // double ---> int
            int numInt = (int)numDouble;       //แปลงแบบ manual จากข้อมูลขนาดใหญ่ --> เล็ก
            System.out.println(numInt);        //ด้วยการระบุชนิดตัวแปรไว้ข้างหน้า
            System.out.println(numDouble);    
            
        }
    
    }

}
